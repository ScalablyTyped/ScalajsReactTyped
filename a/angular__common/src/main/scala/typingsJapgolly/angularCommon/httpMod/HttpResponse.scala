package typingsJapgolly.angularCommon.httpMod

import typingsJapgolly.angularCommon.anon.Status
import typingsJapgolly.angularCommon.anon.StatusText
import typingsJapgolly.angularCommon.anon.Url
import typingsJapgolly.angularCommon.httpMod.HttpEventType.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http", "HttpResponse")
@js.native
/**
  * Construct a new `HttpResponse`.
  */
open class HttpResponse[T] ()
  extends HttpResponseBase
     with HttpEvent[T] {
  def this(init: StatusText[T]) = this()
  
  /**
    * The response body, or `null` if one was not returned.
    */
  val body: T | Null = js.native
  
  def clone(update: Status): HttpResponse[T] = js.native
  def clone[V](update: Url[V]): HttpResponse[V] = js.native
  
  @JSName("type")
  val type_HttpResponse: Response = js.native
}
