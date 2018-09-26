package com.chencha.tbdetadetailsdemo;


import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chencha.tbdetadetailsdemo.utils.NestedScrollViewUtils;
import com.chencha.tbdetadetailsdemo.utils.UIUtils;

public class MainActivity extends AppCompatActivity implements NestedScrollViewUtils.ScrollViewListener, View.OnClickListener {

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private CoordinatorLayout rootLayout;
    private AppBarLayout appBarLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private LinearLayout headLayout;
    private LinearLayout auctionShopInfoRelative;
    private RelativeLayout nameOrderLayout;
    private TextView auctionShopNameTv;
    private ImageView shareIv;
    private TextView auctionShopNameContentTv;
    private LinearLayout auctionStartLinear;
    private TextView auctionStateTv;
    private TextView auctionPriceTv;
    private View lineSpec;
    private RelativeLayout addressLayout;
    private TextView addresTv;
    private Toolbar toolbar;
    private LinearLayout mToolbarHead;
    private ImageView backImg;
    private TextView nameTvToolbar;
    private ImageView msgImg;
    private ImageView remindingImg;
    private LinearLayout mTabLayoutLayout;
    private LinearLayout tabLayout;
    private RelativeLayout llCommodityTab;
    private TextView mCommodityTab;
    private TextView mIvCommodityTab;
    private RelativeLayout llDetailsTab;
    private TextView mShopDetailTab;
    private TextView mIvShopDetailTab;
    private RelativeLayout llCommentTab;
    private TextView mCommentTab;
    private TextView mIvCommentTab;
    private RelativeLayout llRecommendTab;
    private TextView mRecommendTab;
    private TextView mIvRecommendTab;
    private NestedScrollViewUtils scrollViewUtils;
    private LinearLayout mCommodityLayout;
    private TextView commodityStyleTv;
    private TextView producingTv;
    private TextView specificationsTv;
    private LinearLayout mShopDetailLayout;
    private RelativeLayout mCommentItemLayout;
    private RelativeLayout commodityMoreLayout;
    private TextView moreTv;
    private RelativeLayout commentLayout;
    private ImageView avatarIv;
    private TextView nameCommodityTv;
    private TextView commentContentTv;
    private RecyclerView commodityItemImg;
    private TextView commodityTit;
    private LinearLayout mRecommendLayout;
    private RecyclerView recommendList;
    private FrameLayout videoFullContainer;
    private LinearLayout btnDetailLayout;
    private LinearLayout followLayout;
    private ImageView followImg;
    private LinearLayout shopLayout;
    private RelativeLayout shopStoreLayout;
    private ImageView shopImgIcon;
    private LinearLayout chatLayout;
    private LinearLayout customLayout;
    private LinearLayout purchaseImmediatelyLayout;
    private TextView purchaseImmediatelyTv;
    private LinearLayout buttonPay;
    private TextView statusText;


    private int height;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        rootLayout = (CoordinatorLayout) findViewById(R.id.root_layout);
        appBarLayout = (AppBarLayout) findViewById(R.id.app_bar_layout);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        headLayout = (LinearLayout) findViewById(R.id.head_layout);
        auctionShopInfoRelative = (LinearLayout) findViewById(R.id.auction_shop_info_relative);
        nameOrderLayout = (RelativeLayout) findViewById(R.id.name_order_layout);
        auctionShopNameTv = (TextView) findViewById(R.id.auction_shop_name_tv);
        shareIv = (ImageView) findViewById(R.id.share_iv);
        auctionShopNameContentTv = (TextView) findViewById(R.id.auction_shop_name_content_tv);
        auctionStartLinear = (LinearLayout) findViewById(R.id.auction_start_linear);
        auctionStateTv = (TextView) findViewById(R.id.auction_state_tv);
        auctionPriceTv = (TextView) findViewById(R.id.auction_price_tv);
        lineSpec = (View) findViewById(R.id.line_spec);
        addressLayout = (RelativeLayout) findViewById(R.id.address_layout);
        addresTv = (TextView) findViewById(R.id.addres_tv);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbarHead = (LinearLayout) findViewById(R.id.head_toolbar);
        backImg = (ImageView) findViewById(R.id.back_img);
        nameTvToolbar = (TextView) findViewById(R.id.name_tv_toolbar);
        msgImg = (ImageView) findViewById(R.id.msg_img);
        remindingImg = (ImageView) findViewById(R.id.reminding_img);
        mTabLayoutLayout = (LinearLayout) findViewById(R.id.tablayout_layout);
        tabLayout = (LinearLayout) findViewById(R.id.tab_layout);
        llCommodityTab = (RelativeLayout) findViewById(R.id.ll_commodity_tab);
        mCommodityTab = (TextView) findViewById(R.id.tv_commodity_tab);
        mIvCommodityTab = (TextView) findViewById(R.id.iv_commodity_tab);
        llDetailsTab = (RelativeLayout) findViewById(R.id.ll_details_tab);
        mShopDetailTab = (TextView) findViewById(R.id.tv_details_tab);
        mIvShopDetailTab = (TextView) findViewById(R.id.iv_details_tab);
        llCommentTab = (RelativeLayout) findViewById(R.id.ll_comment_tab);
        mCommentTab = (TextView) findViewById(R.id.tv_comment_tab);
        mIvCommentTab = (TextView) findViewById(R.id.iv_comment_tab);
        llRecommendTab = (RelativeLayout) findViewById(R.id.ll_recommend_tab);
        mRecommendTab = (TextView) findViewById(R.id.tv_recommend_tab);
        mIvRecommendTab = (TextView) findViewById(R.id.iv_recommend_tab);
        scrollViewUtils = (NestedScrollViewUtils) findViewById(R.id.nsv);
        mCommodityLayout = (LinearLayout) findViewById(R.id.commodity_layout);
        commodityStyleTv = (TextView) findViewById(R.id.commodity_style_tv);
        producingTv = (TextView) findViewById(R.id.producing_tv);
        specificationsTv = (TextView) findViewById(R.id.specifications_tv);
        mShopDetailLayout = (LinearLayout) findViewById(R.id.shop_detail_layout);
        mCommentItemLayout = (RelativeLayout) findViewById(R.id.comment_item_layout);
        commodityMoreLayout = (RelativeLayout) findViewById(R.id.commodity_more_layout);
        moreTv = (TextView) findViewById(R.id.more_tv);
        commentLayout = (RelativeLayout) findViewById(R.id.comment_layout);
        avatarIv = (ImageView) findViewById(R.id.avatar_iv);
        nameCommodityTv = (TextView) findViewById(R.id.name_commodity_tv);
        commentContentTv = (TextView) findViewById(R.id.comment_content_tv);
        commodityItemImg = (RecyclerView) findViewById(R.id.commodity_item_img);
        commodityTit = (TextView) findViewById(R.id.commodity_tit);
        mRecommendLayout = (LinearLayout) findViewById(R.id.recommend_layout);
        recommendList = (RecyclerView) findViewById(R.id.recommend_list);
        videoFullContainer = (FrameLayout) findViewById(R.id.video_full_container);
        btnDetailLayout = (LinearLayout) findViewById(R.id.btn_detail_layout);
        followLayout = (LinearLayout) findViewById(R.id.follow_layout);
        followImg = (ImageView) findViewById(R.id.follow_img);
        shopLayout = (LinearLayout) findViewById(R.id.shop_layout);
        shopStoreLayout = (RelativeLayout) findViewById(R.id.shop_store_layout);
        shopImgIcon = (ImageView) findViewById(R.id.shop_img_icon);
        chatLayout = (LinearLayout) findViewById(R.id.chat_layout);
        customLayout = (LinearLayout) findViewById(R.id.custom_layout);
        purchaseImmediatelyLayout = (LinearLayout) findViewById(R.id.purchase_immediately_layout);
        purchaseImmediatelyTv = (TextView) findViewById(R.id.purchase_immediately_tv);
        buttonPay = (LinearLayout) findViewById(R.id.button_pay);
        statusText = (TextView) findViewById(R.id.status_text);


        llCommodityTab.setOnClickListener(this);
        llDetailsTab.setOnClickListener(this);
        llCommentTab.setOnClickListener(this);
        llRecommendTab.setOnClickListener(this);


        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset >= 0) {
                    mSwipeRefreshLayout.setEnabled(true);
                } else {
                    mSwipeRefreshLayout.setEnabled(false);
                }

                if (verticalOffset <= -headLayout.getHeight() / 2) {
                    backImg.setVisibility(View.VISIBLE);
                    msgImg.setVisibility(View.VISIBLE);
                    backImg.setImageResource(R.mipmap.back_icon);
                    msgImg.setImageResource(R.mipmap.actionbar_msg_icon);
                    //头部导航
                    mTabLayoutLayout.setVisibility(View.VISIBLE);
                    nameTvToolbar.setVisibility(View.VISIBLE);
                    nameTvToolbar.setText("坚果-500g");


                } else {
                    backImg.setVisibility(View.VISIBLE);
                    msgImg.setVisibility(View.VISIBLE);
                    nameTvToolbar.setVisibility(View.INVISIBLE);
                    mTabLayoutLayout.setVisibility(View.GONE);
                    backImg.setImageResource(R.mipmap.back_transparent);
                    msgImg.setImageResource(R.mipmap.msg_transparent);

                }

            }
        });


        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeRefreshLayout.setRefreshing(false);

            }
        });


        ViewTreeObserver vto = headLayout.getViewTreeObserver();

        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                mToolbarHead.getViewTreeObserver().removeGlobalOnLayoutListener(
                        this);
                height = headLayout.getHeight();
                scrollViewUtils.setScrollViewListener(MainActivity.this);
            }
        });


    }


    @Override
    public void onScrollChanged(NestedScrollViewUtils scrollView, int x, int y, int oldx, int oldy) {
        if (y < mCommodityLayout.getTop() && y <= mShopDetailLayout.getTop() - mToolbarHead.getHeight()) {
            //商品基础信息
            CommodityColor();
        } else if (y >= mShopDetailLayout.getTop() - mToolbarHead.getHeight() && y <= mCommentItemLayout.getTop() - mToolbarHead.getHeight()) {
            //商品详情
            ShopDetailColor();
        } else if (y >= mCommentItemLayout.getTop() - mToolbarHead.getHeight() && y <= mRecommendLayout.getTop() - mToolbarHead.getHeight()) {
            //评价
            CommentColor();
        } else if (y >= mRecommendLayout.getTop() - mToolbarHead.getHeight()) {
            //推荐
            RecommendColor();
        }

    }


    private void CommodityColor() {
        mCommodityTab.setTextColor(UIUtils.getColor(R.color.tab_true));
        mIvCommodityTab.setVisibility(View.VISIBLE);

        mShopDetailTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvShopDetailTab.setVisibility(View.INVISIBLE);

        mCommentTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommentTab.setVisibility(View.INVISIBLE);

        mRecommendTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvRecommendTab.setVisibility(View.INVISIBLE);
    }


    private void ShopDetailColor() {
        mShopDetailTab.setTextColor(UIUtils.getColor(R.color.tab_true));
        mIvShopDetailTab.setVisibility(View.VISIBLE);

        mCommodityTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommodityTab.setVisibility(View.INVISIBLE);

        mCommentTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommentTab.setVisibility(View.INVISIBLE);

        mRecommendTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvRecommendTab.setVisibility(View.INVISIBLE);
    }


    private void CommentColor() {
        mCommentTab.setTextColor(UIUtils.getColor(R.color.tab_true));
        mIvCommentTab.setVisibility(View.VISIBLE);

        mCommodityTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommodityTab.setVisibility(View.INVISIBLE);

        mShopDetailTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvShopDetailTab.setVisibility(View.INVISIBLE);

        mRecommendTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvRecommendTab.setVisibility(View.INVISIBLE);

    }


    private void RecommendColor() {
        mRecommendTab.setTextColor(UIUtils.getColor(R.color.tab_true));
        mIvRecommendTab.setVisibility(View.VISIBLE);

        mCommentTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommentTab.setVisibility(View.INVISIBLE);

        mCommodityTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvCommodityTab.setVisibility(View.INVISIBLE);

        mShopDetailTab.setTextColor(UIUtils.getColor(R.color.text_color));
        mIvShopDetailTab.setVisibility(View.INVISIBLE);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_commodity_tab:
                scrollViewUtils.scrollTo(0, 0);
                CommodityColor();
                break;
            case R.id.ll_details_tab:
                scrollViewUtils.scrollTo(0, mShopDetailLayout.getTop() - mToolbarHead.getHeight());
                ShopDetailColor();
                break;
            case R.id.ll_comment_tab:
                scrollViewUtils.scrollTo(0, mCommentItemLayout.getTop() - mToolbarHead.getHeight());
                CommentColor();
                break;
            case R.id.ll_recommend_tab:
                scrollViewUtils.scrollTo(0, mRecommendLayout.getTop() - mToolbarHead.getHeight());
                RecommendColor();
                break;
            default:
                break;
        }
    }
}
