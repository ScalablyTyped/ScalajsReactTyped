package typingsJapgolly.responseTime.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("response-time", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Response time header for node.js
    * Returns middleware that adds a X-Response-Time header to responses.
    */
  def apply(): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  def apply(fn: ResponseTimeFunction): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
  def apply(options: ResponseTimeOptions): js.Function3[
    /* request */ IncomingMessage, 
    /* response */ ServerResponse, 
    /* callback */ js.Function1[/* err */ js.Any, Unit], 
    _
  ] = js.native
}

