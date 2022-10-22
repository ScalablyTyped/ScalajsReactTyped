package typingsJapgolly.minappEnv.anon

import typingsJapgolly.minappEnv.ICloud.CallFunctionParam
import typingsJapgolly.minappEnv.ICloud.CallFunctionResult
import typingsJapgolly.minappEnv.ICloud.DeleteFileParam
import typingsJapgolly.minappEnv.ICloud.DeleteFileResult
import typingsJapgolly.minappEnv.ICloud.DownloadFileParam
import typingsJapgolly.minappEnv.ICloud.DownloadFileResult
import typingsJapgolly.minappEnv.ICloud.GetTempFileURLParam
import typingsJapgolly.minappEnv.ICloud.GetTempFileURLResult
import typingsJapgolly.minappEnv.ICloud.UploadFileParam
import typingsJapgolly.minappEnv.ICloud.UploadFileResult
import typingsJapgolly.minappEnv.ICloudConfig
import typingsJapgolly.minappEnv.OQ
import typingsJapgolly.minappEnv.Promise
import typingsJapgolly.minappEnv.WXNS.IDownloadFileTask
import typingsJapgolly.minappEnv.WXNS.IUploadFileTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunction extends StObject {
  
  // callFunction: (param: ICloud.CallFunctionParam) => Promise<ICloud.CallFunctionResult> | void,
  // uploadFile: (param: ICloud.UploadFileParam) => Promise<ICloud.UploadFileResult> | WXNS.IUploadFileTask,
  // downloadFile: (param: ICloud.DownloadFileParam) => Promise<ICloud.DownloadFileResult> | WXNS.IDownloadFileTask,
  // getTempFileURL: (param: ICloud.GetTempFileURLParam) => Promise<ICloud.GetTempFileURLResult> | void,
  // deleteFile: (param: ICloud.DeleteFileParam) => Promise<ICloud.DeleteFileResult> | void,
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): Promise[CallFunctionResult] = js.native
  
  def database(): typingsJapgolly.minappEnv.DB.Database = js.native
  def database(config: ICloudConfig): typingsJapgolly.minappEnv.DB.Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): IDownloadFileTask = js.native
  def downloadFile(param: RQDownloadFileParam): Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): IUploadFileTask = js.native
  def uploadFile(param: RQUploadFileParam): Promise[UploadFileResult] = js.native
}
