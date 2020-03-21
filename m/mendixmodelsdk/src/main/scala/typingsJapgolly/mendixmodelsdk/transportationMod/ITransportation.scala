package typingsJapgolly.mendixmodelsdk.transportationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.mendixmodelsdk.commonMod.common.ICallback
import typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportation extends js.Object {
  /**
    * Send a HTTP request, with specified method, url, data, success and failure callbacks.
    */
  def request[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  def requestFileDownload[T](options: IRequestFileDownloadOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
  def requestMultipartBinaryFileUpload[T](options: IRequestMultipartBinaryFileUploadOptions, success: ICallback[T], failure: IErrorCallback): Unit
  /**
    * Send a HTTP request that will be retried in case of network errors, with specified method, url, data, success and failure callbacks.
    */
  def retryableRequest[T](options: IRequestOptions, success: IResponseCallback[T], failure: IErrorCallback): Unit
}

object ITransportation {
  @scala.inline
  def apply(
    request: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Callback,
    requestFileDownload: (IRequestFileDownloadOptions, IResponseCallback[js.Any], IErrorCallback) => Callback,
    requestMultipartBinaryFileUpload: (IRequestMultipartBinaryFileUploadOptions, ICallback[js.Any], IErrorCallback) => Callback,
    retryableRequest: (IRequestOptions, IResponseCallback[js.Any], IErrorCallback) => Callback
  ): ITransportation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(js.Any.fromFunction3((t0: typingsJapgolly.mendixmodelsdk.transportationMod.IRequestOptions, t1: typingsJapgolly.mendixmodelsdk.transportationMod.IResponseCallback[js.Any], t2: typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback) => request(t0, t1, t2).runNow()))
    __obj.updateDynamic("requestFileDownload")(js.Any.fromFunction3((t0: typingsJapgolly.mendixmodelsdk.transportationMod.IRequestFileDownloadOptions, t1: typingsJapgolly.mendixmodelsdk.transportationMod.IResponseCallback[js.Any], t2: typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback) => requestFileDownload(t0, t1, t2).runNow()))
    __obj.updateDynamic("requestMultipartBinaryFileUpload")(js.Any.fromFunction3((t0: typingsJapgolly.mendixmodelsdk.transportationMod.IRequestMultipartBinaryFileUploadOptions, t1: typingsJapgolly.mendixmodelsdk.commonMod.common.ICallback[js.Any], t2: typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback) => requestMultipartBinaryFileUpload(t0, t1, t2).runNow()))
    __obj.updateDynamic("retryableRequest")(js.Any.fromFunction3((t0: typingsJapgolly.mendixmodelsdk.transportationMod.IRequestOptions, t1: typingsJapgolly.mendixmodelsdk.transportationMod.IResponseCallback[js.Any], t2: typingsJapgolly.mendixmodelsdk.commonMod.common.IErrorCallback) => retryableRequest(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ITransportation]
  }
}

