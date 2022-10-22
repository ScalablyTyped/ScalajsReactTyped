package typingsJapgolly.angularCommon.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpEventType extends StObject
@JSImport("@angular/common/http", "HttpEventType")
@js.native
object HttpEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpEventType & Double] = js.native
  
  /**
    * A download progress event was received.
    */
  @js.native
  sealed trait DownloadProgress
    extends StObject
       with HttpEventType
  /* 3 */ val DownloadProgress: typingsJapgolly.angularCommon.httpMod.HttpEventType.DownloadProgress & Double = js.native
  
  /**
    * The full response including the body was received.
    */
  @js.native
  sealed trait Response
    extends StObject
       with HttpEventType
  /* 4 */ val Response: typingsJapgolly.angularCommon.httpMod.HttpEventType.Response & Double = js.native
  
  /**
    * The response status code and headers were received.
    */
  @js.native
  sealed trait ResponseHeader
    extends StObject
       with HttpEventType
  /* 2 */ val ResponseHeader: typingsJapgolly.angularCommon.httpMod.HttpEventType.ResponseHeader & Double = js.native
  
  /**
    * The request was sent out over the wire.
    */
  @js.native
  sealed trait Sent
    extends StObject
       with HttpEventType
  /* 0 */ val Sent: typingsJapgolly.angularCommon.httpMod.HttpEventType.Sent & Double = js.native
  
  /**
    * An upload progress event was received.
    */
  @js.native
  sealed trait UploadProgress
    extends StObject
       with HttpEventType
  /* 1 */ val UploadProgress: typingsJapgolly.angularCommon.httpMod.HttpEventType.UploadProgress & Double = js.native
  
  /**
    * A custom event from an interceptor or a backend.
    */
  @js.native
  sealed trait User
    extends StObject
       with HttpEventType
  /* 5 */ val User: typingsJapgolly.angularCommon.httpMod.HttpEventType.User & Double = js.native
}
