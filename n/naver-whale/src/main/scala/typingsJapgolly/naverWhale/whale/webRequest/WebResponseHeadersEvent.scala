package typingsJapgolly.naverWhale.whale.webRequest

import typingsJapgolly.chrome.chrome.events.EventWithRequiredFilterInAddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponseHeadersEvent
  extends StObject
     with EventWithRequiredFilterInAddListener[
      js.Function1[
        /* details */ typingsJapgolly.chrome.chrome.webRequest.WebResponseHeadersDetails, 
        typingsJapgolly.chrome.chrome.webRequest.BlockingResponse | Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.webRequest.WebResponseHeadersDetails, 
      typingsJapgolly.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
