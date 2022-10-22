package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  授权
/**
  * https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/authorize.html
  * 用户信息 wx.getUserInfo、
  * 地理位置 wx.getLocation,wx.chooseLocation、
  * 通讯地址 wx.chooseAddress、
  * 发票抬头 wx.chooseInvoiceTitle、
  * 获取发票 wx.chooseInvoice、
  * 微信运动步数 wx.getWeRunData、
  * 录音功能 wx.startRecord、
  * 保存到相册 wx.saveImageToPhotosAlbum, wx.saveVideoToPhotosAlbum、
  * 摄像头 <camera />组件
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weappApi.weappApiStrings.userInfo
  - typingsJapgolly.weappApi.weappApiStrings.userLocation
  - typingsJapgolly.weappApi.weappApiStrings.address
  - typingsJapgolly.weappApi.weappApiStrings.invoiceTitle
  - typingsJapgolly.weappApi.weappApiStrings.invoice
  - typingsJapgolly.weappApi.weappApiStrings.werun
  - typingsJapgolly.weappApi.weappApiStrings.record
  - typingsJapgolly.weappApi.weappApiStrings.writePhotosAlbum
  - typingsJapgolly.weappApi.weappApiStrings.camera
*/
trait Scope extends StObject
object Scope {
  
  inline def address: typingsJapgolly.weappApi.weappApiStrings.address = "address".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.address]
  
  inline def camera: typingsJapgolly.weappApi.weappApiStrings.camera = "camera".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.camera]
  
  inline def invoice: typingsJapgolly.weappApi.weappApiStrings.invoice = "invoice".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.invoice]
  
  inline def invoiceTitle: typingsJapgolly.weappApi.weappApiStrings.invoiceTitle = "invoiceTitle".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.invoiceTitle]
  
  inline def record: typingsJapgolly.weappApi.weappApiStrings.record = "record".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.record]
  
  inline def userInfo: typingsJapgolly.weappApi.weappApiStrings.userInfo = "userInfo".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.userInfo]
  
  inline def userLocation: typingsJapgolly.weappApi.weappApiStrings.userLocation = "userLocation".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.userLocation]
  
  inline def werun: typingsJapgolly.weappApi.weappApiStrings.werun = "werun".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.werun]
  
  inline def writePhotosAlbum: typingsJapgolly.weappApi.weappApiStrings.writePhotosAlbum = "writePhotosAlbum".asInstanceOf[typingsJapgolly.weappApi.weappApiStrings.writePhotosAlbum]
}
