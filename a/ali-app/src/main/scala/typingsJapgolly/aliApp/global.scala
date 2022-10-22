package typingsJapgolly.aliApp

import typingsJapgolly.aliApp.anon.IsBuffer
import typingsJapgolly.aliApp.anon.IsConnected
import typingsJapgolly.aliApp.anon.Key
import typingsJapgolly.aliApp.anon.KeyString
import typingsJapgolly.aliApp.anon.PartialAlertOptions
import typingsJapgolly.aliApp.anon.PartialAppOptionsApp
import typingsJapgolly.aliApp.anon.PartialChooseCityOptions
import typingsJapgolly.aliApp.anon.PartialChooseImageOptions
import typingsJapgolly.aliApp.anon.PartialConfirmOptions
import typingsJapgolly.aliApp.anon.PartialCreateAnimationOpt
import typingsJapgolly.aliApp.anon.PartialDatePickerOptions
import typingsJapgolly.aliApp.anon.PartialGetLocationOptions
import typingsJapgolly.aliApp.anon.PartialOpenBluetoothAdapt
import typingsJapgolly.aliApp.anon.PartialPageOptionsPage
import typingsJapgolly.aliApp.anon.PartialSetNavigationBarOp
import typingsJapgolly.aliApp.anon.PartialToastOptions
import typingsJapgolly.aliApp.my.ActionSheetOptions
import typingsJapgolly.aliApp.my.AddCardAuthOptions
import typingsJapgolly.aliApp.my.Animation
import typingsJapgolly.aliApp.my.App
import typingsJapgolly.aliApp.my.BLEDeviceOptions
import typingsJapgolly.aliApp.my.BaseOptions
import typingsJapgolly.aliApp.my.BeaconServiceChangeOptions
import typingsJapgolly.aliApp.my.BeaconUpdateOptions
import typingsJapgolly.aliApp.my.BluetoothAdapterState
import typingsJapgolly.aliApp.my.ChooseAlipayContactOptions
import typingsJapgolly.aliApp.my.ChooseContactOptions
import typingsJapgolly.aliApp.my.ChooseLocationOptions
import typingsJapgolly.aliApp.my.ChoosePhoneContactOptions
import typingsJapgolly.aliApp.my.CloseBluetoothAdapterOptions
import typingsJapgolly.aliApp.my.CloseSocketOptions
import typingsJapgolly.aliApp.my.Component
import typingsJapgolly.aliApp.my.CompressImageOptions
import typingsJapgolly.aliApp.my.ConnectSocketOptions
import typingsJapgolly.aliApp.my.ConvasContext
import typingsJapgolly.aliApp.my.DownloadFileOptions
import typingsJapgolly.aliApp.my.GetAuthCodeOptions
import typingsJapgolly.aliApp.my.GetAuthUserInfoOptions
import typingsJapgolly.aliApp.my.GetBLEDeviceCharacteristicsOptions
import typingsJapgolly.aliApp.my.GetBLEDeviceServicesOptions
import typingsJapgolly.aliApp.my.GetBeaconsOptions
import typingsJapgolly.aliApp.my.GetBluetoothAdapterStateOptions
import typingsJapgolly.aliApp.my.GetBluetoothDevicesOptions
import typingsJapgolly.aliApp.my.GetClipboardOptions
import typingsJapgolly.aliApp.my.GetConnectedBluetoothDevicesOptions
import typingsJapgolly.aliApp.my.GetFileInfoOptions
import typingsJapgolly.aliApp.my.GetImageInfoOptions
import typingsJapgolly.aliApp.my.GetNetworkTypeOptions
import typingsJapgolly.aliApp.my.GetSavedFileInfoOptions
import typingsJapgolly.aliApp.my.GetSavedFileListOptions
import typingsJapgolly.aliApp.my.GetScreenBrightnessOptions
import typingsJapgolly.aliApp.my.GetServerTimeOptions
import typingsJapgolly.aliApp.my.GetStorageInfoOptions
import typingsJapgolly.aliApp.my.GetStorageOptions
import typingsJapgolly.aliApp.my.GetSystemInfoOptions
import typingsJapgolly.aliApp.my.HideLoadingOptions
import typingsJapgolly.aliApp.my.LoadingOptions
import typingsJapgolly.aliApp.my.MakePhoneCallOptions
import typingsJapgolly.aliApp.my.MapContext
import typingsJapgolly.aliApp.my.MultiLevelSelectOptions
import typingsJapgolly.aliApp.my.NavigateBackMiniProgramOptions
import typingsJapgolly.aliApp.my.NavigateBackOptions
import typingsJapgolly.aliApp.my.NavigateToMiniProgramOptions
import typingsJapgolly.aliApp.my.NavigateToOptions
import typingsJapgolly.aliApp.my.NotifyBLECharacteristicValueChangeOptions
import typingsJapgolly.aliApp.my.NotifyBLECharacteristicValueChangedOptions
import typingsJapgolly.aliApp.my.OnBLECharacteristicValueChangeOptions
import typingsJapgolly.aliApp.my.OnBLEConnectionStateChangedOptions
import typingsJapgolly.aliApp.my.OnBluetoothDeviceFoundOptions
import typingsJapgolly.aliApp.my.OpenCardDetailOptions
import typingsJapgolly.aliApp.my.OpenKBVoucherDetailOptions1
import typingsJapgolly.aliApp.my.OpenKBVoucherDetailOptions2
import typingsJapgolly.aliApp.my.OpenLocationOptions
import typingsJapgolly.aliApp.my.OpenMerchantCardList
import typingsJapgolly.aliApp.my.OpenMerchantTicketListOptions
import typingsJapgolly.aliApp.my.OpenMerchantVoucherListOptions
import typingsJapgolly.aliApp.my.OpenTicketDetailOptions1
import typingsJapgolly.aliApp.my.OpenTicketDetailOptions2
import typingsJapgolly.aliApp.my.OpenVoucherDetailOptions1
import typingsJapgolly.aliApp.my.OpenVoucherDetailOptions2
import typingsJapgolly.aliApp.my.Page
import typingsJapgolly.aliApp.my.PageScrollToOptions
import typingsJapgolly.aliApp.my.PaySignCenterOptions
import typingsJapgolly.aliApp.my.PreviewImageOptions
import typingsJapgolly.aliApp.my.PromptOptions
import typingsJapgolly.aliApp.my.ReLaunchOptions
import typingsJapgolly.aliApp.my.ReadBLECharacteristicValueOptions
import typingsJapgolly.aliApp.my.RedirectToOptions
import typingsJapgolly.aliApp.my.RemoveSavedFileOptions
import typingsJapgolly.aliApp.my.RemoveStorageOptions
import typingsJapgolly.aliApp.my.RequestOptions
import typingsJapgolly.aliApp.my.RsaOptions
import typingsJapgolly.aliApp.my.SaveFileOptions
import typingsJapgolly.aliApp.my.SaveImageOptions
import typingsJapgolly.aliApp.my.ScanOptions
import typingsJapgolly.aliApp.my.SelectorQuery
import typingsJapgolly.aliApp.my.SendSocketMessageOptions
import typingsJapgolly.aliApp.my.SetClipboardOptions
import typingsJapgolly.aliApp.my.SetKeepScreenOnOptions
import typingsJapgolly.aliApp.my.SetScreenBrightnessOptions
import typingsJapgolly.aliApp.my.SetStorageOptions
import typingsJapgolly.aliApp.my.StartBeaconDiscoveryOptions
import typingsJapgolly.aliApp.my.StartBluetoothDevicesDiscoveryOptions
import typingsJapgolly.aliApp.my.StartZMVerifyOptions
import typingsJapgolly.aliApp.my.StopBeaconDiscoveryOptions
import typingsJapgolly.aliApp.my.StopBluetoothDevicesDiscoveryOptions
import typingsJapgolly.aliApp.my.StorageInfo
import typingsJapgolly.aliApp.my.SwitchTabOptions
import typingsJapgolly.aliApp.my.SystemInfo
import typingsJapgolly.aliApp.my.TextRiskIdentificationOptions
import typingsJapgolly.aliApp.my.TradePayOptions
import typingsJapgolly.aliApp.my.UploadFileOptions
import typingsJapgolly.aliApp.my.WebViewContext
import typingsJapgolly.aliApp.my.WriteBLECharacteristicValueOptions
import typingsJapgolly.aliApp.my.ZMCreditBorrowOptions
import typingsJapgolly.aliApp.my.onMessageFun
import typingsJapgolly.aliApp.my.showAuthGuideOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def App(app: PartialAppOptionsApp): Unit = js.Dynamic.global.applyDynamic("App")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def Behavior(): Component = js.Dynamic.global.applyDynamic("Behavior")().asInstanceOf[Component]
  inline def Behavior(options: Any): Component = js.Dynamic.global.applyDynamic("Behavior")(options.asInstanceOf[js.Any]).asInstanceOf[Component]
  
  inline def Component(): typingsJapgolly.aliApp.my.Component = js.Dynamic.global.applyDynamic("Component")().asInstanceOf[typingsJapgolly.aliApp.my.Component]
  inline def Component(options: Any): typingsJapgolly.aliApp.my.Component = js.Dynamic.global.applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.aliApp.my.Component]
  
  inline def Page(options: PartialPageOptionsPage): Unit = js.Dynamic.global.applyDynamic("Page")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getApp(): App = js.Dynamic.global.applyDynamic("getApp")().asInstanceOf[App]
  
  inline def getCurrentPages(): js.Array[Page] = js.Dynamic.global.applyDynamic("getCurrentPages")().asInstanceOf[js.Array[Page]]
  
  // 界面
  // 开放接口
  // 多媒体
  // 缓存
  // 文件
  // 位置
  // 网络
  // 设备
  // 扫码
  // 蓝牙
  // iBeacon
  // 数据安全
  // 分享
  // 自定义分析
  object my {
    
    @JSGlobal("my")
    @js.native
    val ^ : js.Any = js.native
    
    //#endregion
    //#region 获取基础库版本号 https://docs.alipay.com/mini/api/sdk-version
    @JSGlobal("my.SDKVersion")
    @js.native
    val SDKVersion: String = js.native
    
    /**
      * 小程序唤起会员开卡授权页面，小程序接入会员卡[点此查看](https://docs.alipay.com/mini/introduce/card)
      */
    inline def addCardAuth(options: AddCardAuthOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCardAuth")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def alert(options: PartialAlertOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#region canIUse https://docs.alipay.com/mini/api/can-i-use
    /**
      * 判断当前小程序的 API、入参或返回值、组件、属性等在当前版本是否支持。
      * 参数使用 ${API}.${type}.${param}.${option} 或者 ${component}.${attribute}.${option} 方式来调用
      * - API 表示 api 名字
      * - type 取值 object/return/callback 表示 api 的判断类型
      * - param 表示参数的某一个属性名
      * - option 表示参数属性的具体属性值
      * - component 表示组件名称
      * - attribute 表示组件属性名
      * - option 表示组件属性值
      */
    inline def canIUse(api: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canIUse")(api.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * 唤起支付宝通讯录，选择一个或者多个支付宝联系人。
      */
    inline def chooseAlipayContact(options: ChooseAlipayContactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseAlipayContact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开城市选择列表
      *
      * 如果用户没有选择任何城市直接点击了返回，将不会触发回调函数。
      */
    inline def chooseCity(options: PartialChooseCityOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseCity")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 唤起选人组件，默认只包含支付宝联系人，可以通过修改参数包含手机通讯录联系人或者双向通讯录联系人。
      */
    inline def chooseContact(options: ChooseContactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseContact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 从本地相册选择图片或使用相机拍照。
      */
    inline def chooseImage(options: PartialChooseImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 使用支付宝内置地图选择地理位置。
      */
    inline def chooseLocation(options: ChooseLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 选择本地系统通信录中某个联系人的电话。
      */
    inline def choosePhoneContact(options: ChoosePhoneContactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("choosePhoneContact")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 清除本地数据缓存。
      * 这是异步接口。
      */
    inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
    
    /**
      * 同步清除本地数据缓存。
      * 这是同步接口。
      */
    inline def clearStorageSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorageSync")().asInstanceOf[Unit]
    
    /**
      * 关闭本机蓝牙模块
      */
    inline def closeBluetoothAdapter(options: CloseBluetoothAdapterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeBluetoothAdapter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket关闭。
      */
    inline def closeSocket(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")().asInstanceOf[Unit]
    inline def closeSocket(options: CloseSocketOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 压缩图片。扫码体验：
      */
    inline def compressImage(options: CompressImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compressImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def confirm(options: PartialConfirmOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 连接低功耗蓝牙设备。
      */
    inline def connectBLEDevice(options: BLEDeviceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectBLEDevice")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 创建一个 WebSocket 的连接；
      * 一个支付宝小程序同时只能保留一个 WebSocket 连接，如果当前已存在 WebSocket 连接，会自动关闭该连接，并重新创建一个新的 WebSocket 连接。
      */
    inline def connectSocket(options: ConnectSocketOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("connectSocket")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 创建动画实例 animation。调用实例的方法来描述动画，最后通过动画实例的export方法将动画数据导出并传递给组件的animation属性。
      *
      * 注意: export 方法每次调用后会清掉之前的动画操作
      */
    inline def createAnimation(options: PartialCreateAnimationOpt): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimation")(options.asInstanceOf[js.Any]).asInstanceOf[Animation]
    
    /**
      * 创建 canvas 绘图上下文
      *
      * 该绘图上下文只作用于对应 canvasId 的 <canvas/>
      */
    inline def createCanvasContext(canvasId: String): ConvasContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createCanvasContext")(canvasId.asInstanceOf[js.Any]).asInstanceOf[ConvasContext]
    
    /**
      * 创建并返回一个 map 上下文对象 mapContext。
      *
      * @param mapId
      * @returns
      */
    inline def createMapContext(mapId: String): MapContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createMapContext")(mapId.asInstanceOf[js.Any]).asInstanceOf[MapContext]
    
    /**
      * 获取一个节点查询对象 SelectorQuery。
      *
      * @param page 可以指定 page 属性，默认为当前页面
      * @returns
      */
    inline def createSelectorQuery(): SelectorQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorQuery")().asInstanceOf[SelectorQuery]
    inline def createSelectorQuery(page: Any): SelectorQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorQuery")(page.asInstanceOf[js.Any]).asInstanceOf[SelectorQuery]
    
    /**
      * 创建并返回 web-view 上下文 webViewContext 对象。
      *
      * @param webviewId 要创建的web-view所对应的id属性
      */
    inline def createWebViewContext(webviewId: String): WebViewContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebViewContext")(webviewId.asInstanceOf[js.Any]).asInstanceOf[WebViewContext]
    
    /**
      * 打开日期选择列表
      */
    inline def datePicker(optiosn: PartialDatePickerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("datePicker")(optiosn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 断开与低功耗蓝牙设备的连接。
      */
    inline def disconnectBLEDevice(options: BLEDeviceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectBLEDevice")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 下载文件资源到本地。
      */
    inline def downloadFile(options: DownloadFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取授权码。
      * 详细用户授权接入参考 [指引](https://docs.alipay.com/mini/introduce/auth)。
      */
    inline def getAuthCode(options: GetAuthCodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthCode")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 客户端获取会员信息
      * 获取会员信息首先需要获取用户授权，详细会员信息获取参考[指引](https://docs.alipay.com/mini/introduce/auth)，采用 jsapi 调用的方式。
      */
    inline def getAuthUserInfo(options: GetAuthUserInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthUserInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取蓝牙设备所有 characteristic（特征值）
      */
    inline def getBLEDeviceCharacteristics(options: GetBLEDeviceCharacteristicsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBLEDeviceCharacteristics")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取蓝牙设备所有 service（服务）
      */
    inline def getBLEDeviceServices(options: GetBLEDeviceServicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBLEDeviceServices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取所有已搜索到的iBeacon设备
      */
    inline def getBeacons(options: GetBeaconsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeacons")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取本机蓝牙适配器状态
      */
    inline def getBluetoothAdapterState(options: GetBluetoothAdapterStateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBluetoothAdapterState")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取所有已发现的蓝牙设备，包括已经和本机处于连接状态的设备。
      */
    inline def getBluetoothDevices(options: GetBluetoothDevicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getBluetoothDevices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getClipboard(options: GetClipboardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getClipboard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取处于已连接状态的设备。
      */
    inline def getConnectedBluetoothDevices(options: GetConnectedBluetoothDevicesOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectedBluetoothDevices")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      *  获取文件信息
      * 基础库版本 1.4.0 开始支持，低版本需做兼容处理
      */
    inline def getFileInfo(options: GetFileInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取图片信息
      */
    inline def getImageInfo(options: GetImageInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取用户当前的地理位置信息
      */
    inline def getLocation(options: PartialGetLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getNetworkType(options: GetNetworkTypeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetworkType")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取保存的文件信息
      */
    inline def getSavedFileInfo(options: GetSavedFileInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSavedFileInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getSavedFileList(options: GetSavedFileListOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSavedFileList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取屏幕亮度
      */
    inline def getScreenBrightness(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenBrightness")().asInstanceOf[Unit]
    inline def getScreenBrightness(options: GetScreenBrightnessOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getScreenBrightness")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getServerTime(options: GetServerTimeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getServerTime")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 获取缓存数据。
      * 这是异步接口。
      */
    inline def getStorage(options: GetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 异步获取当前storage的相关信息
      */
    inline def getStorageInfo(options: GetStorageInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getStorageInfoSync(): StorageInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageInfoSync")().asInstanceOf[StorageInfo]
    
    /**
      * 同步获取缓存数据。
      * 这是同步接口
      */
    inline def getStorageSync(options: KeyString): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorageSync")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getSystemInfo(options: GetSystemInfoOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getSystemInfoSync(): SystemInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemInfoSync")().asInstanceOf[SystemInfo]
    
    //#endregion
    //#region 键盘 https://docs.alipay.com/mini/api/ui-hidekeyboard
    /**
      * 隐藏键盘
      *
      */
    inline def hideKeyboard(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideKeyboard")().asInstanceOf[Unit]
    
    /**
      * 隐藏消息提示框
      */
    inline def hideLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")().asInstanceOf[Unit]
    inline def hideLoading(options: HideLoadingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** 隐藏导航栏 loading。 */
    inline def hideNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNavigationBarLoading")().asInstanceOf[Unit]
    
    /**
      * 隐藏分享按钮。
      */
    inline def hideShareMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideShareMenu")().asInstanceOf[Unit]
    inline def hideShareMenu(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideShareMenu")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def hideToast(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideToast")().asInstanceOf[Unit]
    
    inline def httpRequest(options: RequestOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 拨打电话
      */
    inline def makePhoneCall(options: MakePhoneCallOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makePhoneCall")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def multiLevelSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("multiLevelSelect")().asInstanceOf[Unit]
    inline def multiLevelSelect(options: MultiLevelSelectOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("multiLevelSelect")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭当前页面，返回上一级或多级页面。可通过 getCurrentPages 获取当前的页面栈信息，决定需要返回几层。
      */
    inline def navigateBack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")().asInstanceOf[Unit]
    inline def navigateBack(options: NavigateBackOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 跳转回上一个小程序，只有当另一个小程序跳转到当前小程序时才会能调用成功
      */
    inline def navigateBackMiniProgram(options: NavigateBackMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBackMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保留当前页面，跳转到应用内的某个页面，使用wx.navigateBack可以返回到原页面。
      *
      * 注意：为了不让用户在使用小程序时造成困扰，
      * 我们规定页面路径只能是五层，请尽量避免多层级的交互方式。
      */
    inline def navigateTo(options: NavigateToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 跳转到其他小程序。详细接入参考[指引](https://docs.alipay.com/mini/introduce/open-miniprogram)
      * @param options
      */
    inline def navigateToMiniProgram(options: NavigateToMiniProgramOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateToMiniProgram")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def notifyBLECharacteristicValueChange(optons: NotifyBLECharacteristicValueChangeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyBLECharacteristicValueChange")(optons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 启用低功耗蓝牙设备特征值变化时的 notify 功能。注意：设备的特征值必须支持 notify/indicate 才可以成功调用，具体参照 characteristic 的 properties 属性 另外，必须先启用 notify 才能监听到设备 characteristicValueChange 事件。
      */
    inline def notifyBLECharacteristicValueChanged(options: NotifyBLECharacteristicValueChangedOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyBLECharacteristicValueChanged")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 移除低功耗蓝牙设备的特征值变化事件的监听。
      */
    inline def offBLECharacteristicValueChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBLECharacteristicValueChange")().asInstanceOf[Unit]
    inline def offBLECharacteristicValueChange(callback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBLECharacteristicValueChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 移除低功耗蓝牙连接状态变化事件的监听。
      */
    inline def offBLEConnectionStateChanged(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBLEConnectionStateChanged")().asInstanceOf[Unit]
    
    /**
      * 移除本机蓝牙状态变化的事件的监听。
      */
    inline def offBluetoothAdapterStateChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBluetoothAdapterStateChange")().asInstanceOf[Unit]
    
    /**
      * 移除寻找到新的蓝牙设备事件的监听。
      */
    inline def offBluetoothDeviceFound(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBluetoothDeviceFound")().asInstanceOf[Unit]
    inline def offBluetoothDeviceFound(callback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBluetoothDeviceFound")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 取消网络状态变化的监听
      */
    inline def offNetworkStatusChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offNetworkStatusChange")().asInstanceOf[Unit]
    
    /**
      * 取消监听WebSocket关闭。
      */
    inline def offSocketClose(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offSocketClose")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 取消监听WebSocket错误。
      */
    inline def offSocketError(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offSocketError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def offSocketMessage(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offSocketMessage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 取消监听WebSocket连接打开事件。
      */
    inline def offSocketOpen(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offSocketOpen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 取消监听截屏事件。一般需要与 my.onUserCaptureScreen 成对出现。
      */
    inline def offUserCaptureScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offUserCaptureScreen")().asInstanceOf[Unit]
    
    /**
      * 监听低功耗蓝牙设备的特征值变化的事件。
      */
    inline def onBLECharacteristicValueChange(options: OnBLECharacteristicValueChangeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBLECharacteristicValueChange")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听低功耗蓝牙连接的错误事件，包括设备丢失，连接异常断开等。
      */
    inline def onBLEConnectionStateChanged(options: OnBLEConnectionStateChangedOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBLEConnectionStateChanged")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听 iBeacon 服务的状态变化
      */
    inline def onBeaconServiceChange(options: BeaconServiceChangeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconServiceChange")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听 iBeacon 设备的更新事件
      */
    inline def onBeaconUpdate(options: BeaconUpdateOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeaconUpdate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听本机蓝牙状态变化的事件。
      */
    inline def onBluetoothAdapterStateChange(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBluetoothAdapterStateChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 搜索到新的蓝牙设备时触发此事件。
      */
    inline def onBluetoothDeviceFound(options: OnBluetoothDeviceFoundOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBluetoothDeviceFound")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("my.onMessage")
    @js.native
    def onMessage: onMessageFun = js.native
    inline def onMessage_=(x: onMessageFun): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(x.asInstanceOf[js.Any])
    
    /**
      * 开始网络状态变化的监听
      */
    inline def onNetworkStatusChange(callback: js.Function1[/* res */ IsConnected, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNetworkStatusChange")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket关闭。
      */
    inline def onSocketClose(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketClose")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket错误。
      */
    inline def onSocketError(callback: js.Function1[/* error */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketError")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket接受到服务器的消息事件。
      */
    inline def onSocketMessage(callback: js.Function1[/* res */ IsBuffer, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketMessage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 监听WebSocket连接打开事件。
      */
    inline def onSocketOpen(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSocketOpen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region 用户截屏事件 https://docs.alipay.com/mini/api/user-capture-screen
    /**
      * 监听用户主动截屏事件，用户使用系统截屏按键截屏时触发此事件
      */
    inline def onUserCaptureScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUserCaptureScreen")().asInstanceOf[Unit]
    inline def onUserCaptureScreen(callback: js.Function1[/* res */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUserCaptureScreen")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 初始化小程序蓝牙模块，生效周期为调用 my.openBluetoothAdapter 至调用 my.closeBluetoothAdapter 或小程序被销毁为止。 在小程序蓝牙适配器模块生效期间，开发者可以正常调用下面的小程序API，并会收到蓝牙模块相关的 on 事件回调。
      */
    inline def openBluetoothAdapter(options: PartialOpenBluetoothAdapt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openBluetoothAdapter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开当前用户的某张卡的详情页
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      *
      * passId获取方式：
      * 1）通过alipass创建的卡
      * 调用alipay.pass.instance.add(支付宝pass新建卡券实例接口)接口，在出参“result”中可获取
      * 2）通过会员卡创建的卡
      * 调用alipay.marketing.card.query(会员卡查询)接口，在schema_url中可获取，具体参数为“p=xxx”，xxx即为passId。
      */
    inline def openCardDetail(options: OpenCardDetailOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openCardDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region 小程序二维码 https://docs.alipay.com/mini/api/openapi-qrcode
    // @see https://docs.alipay.com/mini/api/openapi-qrcode
    // @see https://docs.alipay.com/mini/introduce/qrcode
    //#endregion
    //#region 跳转支付宝卡包 https://docs.alipay.com/mini/api/card-voucher-ticket
    /**
      * 打开支付宝卡列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openCardList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openCardList")().asInstanceOf[Unit]
    
    /**
      * 打开当前用户的某张券的详情页（口碑）
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openKBVoucherDetail(options: OpenKBVoucherDetailOptions1): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openKBVoucherDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def openKBVoucherDetail(options: OpenKBVoucherDetailOptions2): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openKBVoucherDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 使用微信内置地图查看位置
      */
    inline def openLocation(options: OpenLocationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openLocation")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开支付宝卡列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      * @param options
      */
    inline def openMerchantCardList(options: OpenMerchantCardList): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openMerchantCardList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开某个商户的票列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openMerchantTicketList(options: OpenMerchantTicketListOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openMerchantTicketList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开当前用户的某个商户的券列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openMerchantVoucherList(options: OpenMerchantVoucherListOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openMerchantVoucherList")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开当前用户的某张票的详情页
      *
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openTicketDetail(options: OpenTicketDetailOptions1): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openTicketDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def openTicketDetail(options: OpenTicketDetailOptions2): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openTicketDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开支付宝票列表。
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openTicketList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openTicketList")().asInstanceOf[Unit]
    
    /**
      * 打开当前用户的某张券的详情页（非口碑）
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      */
    inline def openVoucherDetail(options: OpenVoucherDetailOptions1): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openVoucherDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def openVoucherDetail(options: OpenVoucherDetailOptions2): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openVoucherDetail")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 打开支付宝券列表
      * 有关支付宝卡包详细功能，见[支付宝卡包产品介绍](https://docs.alipay.com/mini/introduce/voucher)
      *
      * @param options
      */
    inline def openVoucherList(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openVoucherList")().asInstanceOf[Unit]
    
    /**
      * 滚动到页面的目标位置
      *
      * @param options
      */
    inline def pageScrollTo(options: PageScrollToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pageScrollTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 签约中心
      *
      * 返回码 | 含义
      * ------|------
      * 7000 | 协议签约成功
      * 7001 | 签约结果未知（有可能已经签约成功），请根据外部签约号查询签约状态
      * 7002 | 协议签约失败
      * 6001 | 用户中途取消
      * 6002 | 网络连接错误     * @param options
      */
    inline def paySignCenter(options: PaySignCenterOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("paySignCenter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def postMessage(param: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("postMessage")(param.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 预览图片。
      */
    inline def previewImage(options: PreviewImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("previewImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def prompt(options: PromptOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭所有页面，打开到应用内的某个页面。
      */
    inline def reLaunch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")().asInstanceOf[Unit]
    inline def reLaunch(options: ReLaunchOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reLaunch")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 读取低功耗蓝牙设备特征值中的数据。调用后在 my.onBLECharacteristicValueChange() 事件中接收数据返回。
      */
    inline def readBLECharacteristicValue(options: ReadBLECharacteristicValueOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readBLECharacteristicValue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 关闭当前页面，跳转到应用内的某个页面。
      */
    inline def redirectTo(options: RedirectToOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirectTo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除某个保存的文件
      */
    inline def removeSavedFile(options: RemoveSavedFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSavedFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 删除缓存数据。
      * 这是异步接口。
      */
    inline def removeStorage(options: RemoveStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 同步删除缓存数据。
      * 这是同步接口。
      * @param key 缓存数据的key
      */
    inline def removeStorageSync(options: KeyString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStorageSync")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#region 自定义分析 https://docs.alipay.com/mini/api/report
    /**
      * 自定义分析数据的上报接口。使用前需要在小程序管理后台的事件管理中新建事件，并配置好事件名和字段。
      *
      * @param eventName 自定义事件名，需申请
      * @param data 上报的数据
      */
    inline def reportAnalytics(eventName: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reportAnalytics")(eventName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 非对称加密。
      */
    inline def rsa(options: RsaOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rsa")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保存文件到本地（本地文件大小总容量限制：10M）
      */
    inline def saveFile(options: SaveFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 保存在线图片到手机相册。
      */
    inline def saveImage(options: SaveImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveImage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调起客户端扫码界面，扫码成功后返回对应的结果
      */
    inline def scan(options: ScanOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 通过 WebSocket 连接发送数据，需要先使用 my.connectSocket 发起建连，并在 my.onSocketOpen 回调之后再发送数据。
      */
    inline def sendSocketMessage(options: SendSocketMessageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendSocketMessage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setClipboard(options: SetClipboardOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setClipboard")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置是否保持常亮状态。
      * 仅在当前小程序生效，离开小程序后设置失效。
      */
    inline def setKeepScreenOn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeepScreenOn")().asInstanceOf[Unit]
    inline def setKeepScreenOn(options: SetKeepScreenOnOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setKeepScreenOn")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 动态设置当前页面的标题。
      */
    inline def setNavigationBar(options: PartialSetNavigationBarOp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNavigationBar")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 设置屏幕亮度
      */
    inline def setScreenBrightness(options: SetScreenBrightnessOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScreenBrightness")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 将数据存储在本地缓存中指定的 key 中，会覆盖掉原来该 key 对应的数据。
      * 这是异步接口。
      */
    inline def setStorage(options: SetStorageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStorage")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 同步将数据存储在本地缓存中指定的 key 中。
      * 这是同步接口。
      *
      * @param key 本地缓存中的指定的 key
      * @param data 需要存储的内容
      */
    inline def setStorageSync(options: Key): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setStorageSync")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示操作菜单
      */
    inline def showActionSheet(options: ActionSheetOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showActionSheet")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def showAuthGuide(options: showAuthGuideOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAuthGuide")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示加载提示
      */
    inline def showLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showLoading")().asInstanceOf[Unit]
    inline def showLoading(options: LoadingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showLoading")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 显示导航栏 loading
      */
    inline def showNavigationBarLoading(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showNavigationBarLoading")().asInstanceOf[Unit]
    
    /**
      * 显示消息提示框
      */
    inline def showToast(options: PartialToastOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showToast")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始搜索附近的iBeacon设备
      */
    inline def startBeaconDiscovery(options: StartBeaconDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBeaconDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 开始搜寻附近的蓝牙外围设备。搜索结果将在 my.onBluetoothDeviceFound 事件中返回。
      */
    inline def startBluetoothDevicesDiscovery(options: StartBluetoothDevicesDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBluetoothDevicesDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 芝麻认证接口，调用此接口可以唤起芝麻认证页面并进行人脸身份验证。
      * 有关芝麻认证的产品和接入介绍，详见 [芝麻认证](https://docs.alipay.com/mini/introduce/zm-verify)。
      * 需要通过蚂蚁开发平台，调用certification.initialize接口进行[认证初始化](https://docs.alipay.com/zmxy/271/105914)。获得biz_no 后，方能通过以下接口激活芝麻认证小程序。
      */
    inline def startZMVerify(options: StartZMVerifyOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startZMVerify")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止搜索附近的iBeacon设备
      */
    inline def stopBeaconDiscovery(options: StopBeaconDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBeaconDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止搜寻附近的蓝牙外围设备。请在确保找到需要连接的设备后调用该方法停止搜索。
      */
    inline def stopBluetoothDevicesDiscovery(options: StopBluetoothDevicesDiscoveryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopBluetoothDevicesDiscovery")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 停止当前页面的下拉刷新。
      */
    inline def stopPullDownRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopPullDownRefresh")().asInstanceOf[Unit]
    
    /**
      * 跳转到指定 tabBar 页面，并关闭其他所有非 tabBar 页面
      */
    inline def switchTab(options: SwitchTabOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("switchTab")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 文本风险识别， **支付宝客户端10.1.10及以上版本支持。**详细接入参考[指引](https://docs.alipay.com/mini/introduce/text-identification)
      */
    inline def textRiskIdentification(options: TextRiskIdentificationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("textRiskIdentification")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 发起支付。
      * 详细接入支付方式参考[指引](https://docs.alipay.com/mini/introduce/pay)。
      * @param options
      */
    inline def tradePay(options: TradePayOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tradePay")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 上传本地资源到开发者服务器。
      */
    inline def uploadFile(options: UploadFileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region 震动 https://docs.alipay.com/mini/api/vibrate
    /**
      * 调用震动功能。
      */
    inline def vibrate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrate")().asInstanceOf[Unit]
    inline def vibrate(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调用震动功能。
      */
    inline def vibrateLong(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateLong")().asInstanceOf[Unit]
    inline def vibrateLong(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateLong")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 调用震动功能。
      */
    inline def vibrateShort(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateShort")().asInstanceOf[Unit]
    inline def vibrateShort(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrateShort")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    //#endregion
    //#region 摇一摇 https://docs.alipay.com/mini/api/shake
    inline def watchShake(options: BaseOptions[Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("watchShake")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * 向低功耗蓝牙设备特征值中写入数据。
      */
    inline def writeBLECharacteristicValue(options: WriteBLECharacteristicValueOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeBLECharacteristicValue")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def zmCreditBorrow(options: ZMCreditBorrowOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zmCreditBorrow")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
