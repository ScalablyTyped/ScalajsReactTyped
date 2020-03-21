package typingsJapgolly.firebaseStorage

import typingsJapgolly.firebaseStorage.requestinfoMod.RequestInfo
import typingsJapgolly.firebaseStorage.xhrioMod.Headers
import typingsJapgolly.firebaseStorage.xhrioMod.XhrIo
import typingsJapgolly.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/src/implementation/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  @js.native
  trait Request[T] extends js.Object {
    /**
      * Cancels the request. IMPORTANT: the promise may still be resolved with an
      * appropriate value (if the request is finished before you call this method,
      * but the promise has not yet been resolved), so don't just assume it will be
      * rejected if you call this function.
      * @param appDelete True if the cancelation came from the app being deleted.
      */
    def cancel(): Unit = js.native
    def cancel(appDelete: Boolean): Unit = js.native
    def getPromise(): js.Promise[T] = js.native
  }
  
  @js.native
  class RequestEndStatus protected () extends js.Object {
    def this(wasSuccessCode: Boolean) = this()
    def this(wasSuccessCode: Boolean, xhr: XhrIo) = this()
    def this(wasSuccessCode: Boolean, xhr: Null, canceled: Boolean) = this()
    def this(wasSuccessCode: Boolean, xhr: XhrIo, canceled: Boolean) = this()
    /**
      * True if the request was canceled.
      */
    var canceled: Boolean = js.native
    var wasSuccessCode: Boolean = js.native
    var xhr: XhrIo | Null = js.native
  }
  
  @JSName("addAuthHeader_")
  def addAuthHeader(headers: Headers): Unit = js.native
  @JSName("addAuthHeader_")
  def addAuthHeader(headers: Headers, authToken: String): Unit = js.native
  @JSName("addVersionHeader_")
  def addVersionHeader(headers: Headers): Unit = js.native
  def makeRequest[T](requestInfo: RequestInfo[T], authToken: String, pool: XhrIoPool): Request[T] = js.native
  def makeRequest[T](requestInfo: RequestInfo[T], authToken: Null, pool: XhrIoPool): Request[T] = js.native
}

