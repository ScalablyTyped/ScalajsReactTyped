package typingsJapgolly.zwjsbridge

import typingsJapgolly.std.Record
import typingsJapgolly.zwjsbridge.anon.ActionName
import typingsJapgolly.zwjsbridge.anon.Api
import typingsJapgolly.zwjsbridge.anon.ButtonIndex
import typingsJapgolly.zwjsbridge.anon.ButtonLabels
import typingsJapgolly.zwjsbridge.anon.ButtonName
import typingsJapgolly.zwjsbridge.anon.CancelButton
import typingsJapgolly.zwjsbridge.anon.CertName
import typingsJapgolly.zwjsbridge.anon.Channel
import typingsJapgolly.zwjsbridge.anon.CityId
import typingsJapgolly.zwjsbridge.anon.CityName
import typingsJapgolly.zwjsbridge.anon.Content
import typingsJapgolly.zwjsbridge.anon.CorpId
import typingsJapgolly.zwjsbridge.anon.Credential
import typingsJapgolly.zwjsbridge.anon.Delay
import typingsJapgolly.zwjsbridge.anon.Duration
import typingsJapgolly.zwjsbridge.anon.Id
import typingsJapgolly.zwjsbridge.anon.Items
import typingsJapgolly.zwjsbridge.anon.Key
import typingsJapgolly.zwjsbridge.anon.KeyString
import typingsJapgolly.zwjsbridge.anon.Msg
import typingsJapgolly.zwjsbridge.anon.OrgCode
import typingsJapgolly.zwjsbridge.anon.OtherButtons
import typingsJapgolly.zwjsbridge.anon.PhoneNumber
import typingsJapgolly.zwjsbridge.anon.PicPath
import typingsJapgolly.zwjsbridge.anon.Result
import typingsJapgolly.zwjsbridge.anon.ResultString
import typingsJapgolly.zwjsbridge.anon.Text
import typingsJapgolly.zwjsbridge.anon.TicketId
import typingsJapgolly.zwjsbridge.anon.Title
import typingsJapgolly.zwjsbridge.anon.Type
import typingsJapgolly.zwjsbridge.anon.UiStyle
import typingsJapgolly.zwjsbridge.anon.Upload
import typingsJapgolly.zwjsbridge.anon.Url
import typingsJapgolly.zwjsbridge.anon.UserType
import typingsJapgolly.zwjsbridge.anon.Uuid
import typingsJapgolly.zwjsbridge.anon.Value
import typingsJapgolly.zwjsbridge.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZWJSBridge extends StObject {
  
  /**
    * 单选列表
    */
  def actionSheet(options: OtherButtons): js.Promise[Value] = js.native
  
  /**
    * 提示框
    */
  def alert(options: ButtonName): js.Promise[Any] = js.native
  
  /**
    * 选择图片
    *
    * 错误码
    * 1001 没有摄像头或摄像头不可用
    * 1002 没有拍照权限
    * 1003 没有图片库权限
    * 1004 图片上传失败
    */
  def chooseImage(options: Upload): js.Promise[PicPath] = js.native
  
  /**
    * 关闭当前页面
    */
  def close(): js.Promise[js.Object] = js.native
  
  /***********    UI界面类     ***********/
  /**
    * 确认框
    */
  def confirm(options: ButtonLabels): js.Promise[ButtonIndex] = js.native
  
  /**
    * 直接分享
    * 1001 分享至不支持的平台
    * 1002 分享失败
    * -1 用户取消
    * 5 未初始化
    */
  def directShare(options: Channel): js.Promise[Any] = js.native
  
  /***********    请求类     ***********/
  /**
    * 无线网关
    *
    * @deprecated 使用 import Mgop from '@aligov/jssdk-mgop' 代替
    */
  def egop(options: Api): js.Promise[Any] = js.native
  
  /**
    * 向剪贴板中获取数据。
    * @deprecated 涉及用户隐私问题，已下线
    */
  def getClipboardData(): js.Promise[Any] = js.native
  
  /**
    * 获取当前地区
    */
  def getCurrentLocationCity(): js.Promise[CityId] = js.native
  
  /**
    * 读取数据缓存
    */
  def getLocalStorage(): js.Promise[Record[String, Any]] = js.native
  def getLocalStorage(options: KeyString): js.Promise[Record[String, Any]] = js.native
  
  /**
    * 获取经纬度信息
    *
    * 错误码
    * 1001 未开启定位权限
    * 1002 定位失败
    */
  def getLocation(): js.Promise[CityName] = js.native
  
  /**
    * 获取网络类型
    */
  def getNetworkType(): js.Promise[ResultString] = js.native
  
  /**
    * 获取设备唯一标识
    */
  def getUUID(): js.Promise[Uuid] = js.native
  
  /**
    * 获取ui样式
    */
  def getUiStyle(): js.Promise[UiStyle] = js.native
  
  /***********    用户     ***********/
  /**
    * 获取用户类型
    */
  def getUserType(): js.Promise[UserType] = js.native
  
  /**
    * 等待蒙版隐藏
    */
  def hidePreloader(): js.Promise[Any] = js.native
  
  /***********    业务类     ***********/
  /**
    * 埋点
    */
  def monitorTrace(options: ActionName): js.Promise[Any] = js.native
  
  /**
    * 初始化jsapi，初始化完成即onReady之后再调用jsapi。
    * @param callBack 初始化成功回调
    */
  def onReady(callBack: js.Function0[Unit]): Unit = js.native
  
  /**
    * 新开窗口
    */
  def openLink(options: Type): js.Promise[TicketId] = js.native
  
  /**
    * 启用支付功能
    * 实际支付结果以后端查询接口为准，成功回调仅表示支付宝支付调用成功，相关数据可能不会同步至后端。若回调失败，可通过返回数字获取失败信息。
    *
    * error错误码
    * 8000
    * 支付正在处理中，支付结果未知，请查询商户订单列表中订单的支付状态。
    * 40000 订单支付失败。
    * 5000 重复请求。
    * 6001 用户中途取消支付。
    * 60002 网络连接出错。
    * 60004 支付结果未知，请查询商户订单列表中订单的支付状态。
    */
  def pay(options: Credential): js.Promise[Any] = js.native
  
  /***********    Device设备类     ***********/
  /**
    * 打电话
    */
  def phoneCall(options: CorpId): js.Promise[js.Object] = js.native
  
  /**
    * 文本输入框
    */
  def prompt(options: CancelButton): js.Promise[Value] = js.native
  
  /**
    * 读取数据缓存
    */
  def removeLocalStorage(options: KeyString): js.Promise[ResultString] = js.native
  
  /**
    * 图片保存到本地
    */
  def saveImage(options: Url): js.Promise[Any] = js.native
  
  /**
    * 扫一扫
    *
    * 错误码
    * 1001 没有摄像头或摄像头不可用
    * 1002 没有拍照权限
    * 1003 没有图片库权限
    * 5 未初始化
    */
  def scan(options: `0`): js.Promise[Text] = js.native
  
  /**
    * 选择城市
    */
  def selectCity(): js.Promise[OrgCode] = js.native
  
  /**
    * 向剪贴板中复制数据。
    */
  def setClipboardData(parasm: Text): js.Promise[js.Object] = js.native
  
  /***********    缓存     ***********/
  /**
    * 存储数据缓存
    */
  def setLocalStorage(options: Key): js.Promise[ResultString] = js.native
  
  /**
    * 设置菜单
    */
  def setMenu(options: Items): js.Promise[Id] = js.native
  
  /***********    Navigation窗口类     ***********/
  /**
    * 设置标题
    */
  def setTitle(options: Title): js.Promise[ResultString] = js.native
  
  /**
    * 分享
    * 1001 分享至不支持的平台
    * 1002 分享失败
    */
  def share(options: Content): js.Promise[Any] = js.native
  
  /**
    * 等待蒙版显示
    */
  def showPreloader(options: Delay): js.Promise[Any] = js.native
  
  /**
    * 发短信
    */
  def sms(): js.Promise[js.Object] = js.native
  def sms(options: PhoneNumber): js.Promise[js.Object] = js.native
  
  /**
    * 获取单点的路过的票据
    */
  def ssoTicket(): js.Promise[Result] = js.native
  
  /**
    * 弱提示
    */
  def toast(options: Duration): js.Promise[Any] = js.native
  
  /**
    * 支付宝扫脸认证
    * 该接口涉及业务签约，一旦服务到期后，将改变相应接口的调用方式，请及时按照本文档进行进行适配。
    *
    * 错误码
    * 1001 支付宝认证失败
    * 1003 姓名或身份证号错误
    */
  def zmAuthentication(parasm: CertName): js.Promise[Msg] = js.native
}
