package typingsJapgolly.naverWhale.whale.webRequest

import typingsJapgolly.chrome.chrome.events.EventWithRequiredFilterInAddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _WebResponseHeadersEvent[T /* <: typingsJapgolly.chrome.chrome.webRequest.WebResponseHeadersDetails */]
  extends StObject
     with EventWithRequiredFilterInAddListener[js.Function1[/* details */ T, Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
