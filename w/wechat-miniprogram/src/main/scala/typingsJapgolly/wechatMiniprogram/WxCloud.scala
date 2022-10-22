package typingsJapgolly.wechatMiniprogram

import typingsJapgolly.wechatMiniprogram.DB.Database
import typingsJapgolly.wechatMiniprogram.ICloud.CallFunctionParam
import typingsJapgolly.wechatMiniprogram.ICloud.CallFunctionResult
import typingsJapgolly.wechatMiniprogram.ICloud.DeleteFileParam
import typingsJapgolly.wechatMiniprogram.ICloud.DeleteFileResult
import typingsJapgolly.wechatMiniprogram.ICloud.DownloadFileParam
import typingsJapgolly.wechatMiniprogram.ICloud.DownloadFileResult
import typingsJapgolly.wechatMiniprogram.ICloud.GetTempFileURLParam
import typingsJapgolly.wechatMiniprogram.ICloud.GetTempFileURLResult
import typingsJapgolly.wechatMiniprogram.ICloud.ICDNConstructor
import typingsJapgolly.wechatMiniprogram.ICloud.ICDNFilePathSpec
import typingsJapgolly.wechatMiniprogram.ICloud.ICloudIDConstructor
import typingsJapgolly.wechatMiniprogram.ICloud.UploadFileParam
import typingsJapgolly.wechatMiniprogram.ICloud.UploadFileResult
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.DownloadTask
import typingsJapgolly.wechatMiniprogram.WechatMiniprogram.UploadTask
import typingsJapgolly.wechatMiniprogram.anon.RQCallFunctionParam
import typingsJapgolly.wechatMiniprogram.anon.RQDeleteFileParam
import typingsJapgolly.wechatMiniprogram.anon.RQDownloadFileParam
import typingsJapgolly.wechatMiniprogram.anon.RQGetTempFileURLParam
import typingsJapgolly.wechatMiniprogram.anon.RQUploadFileParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extend wx with cloud
  */
@js.native
trait WxCloud extends StObject {
  
  def CDN(options: String): typingsJapgolly.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: js.typedarray.ArrayBuffer): typingsJapgolly.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: ICDNFilePathSpec): typingsJapgolly.wechatMiniprogram.ICloud.CDN = js.native
  @JSName("CDN")
  var CDN_Original: ICDNConstructor = js.native
  
  def CloudID(cloudId: String): typingsJapgolly.wechatMiniprogram.ICloud.CloudID = js.native
  @JSName("CloudID")
  var CloudID_Original: ICloudIDConstructor = js.native
  
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): js.Promise[CallFunctionResult] = js.native
  
  def database(): Database = js.native
  def database(config: ICloudConfig): Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): js.Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): DownloadTask = js.native
  def downloadFile(param: RQDownloadFileParam): js.Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): js.Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): UploadTask = js.native
  def uploadFile(param: RQUploadFileParam): js.Promise[UploadFileResult] = js.native
}
