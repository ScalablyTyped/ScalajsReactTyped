package typingsJapgolly.naverWhale.whale.webRequest

import typingsJapgolly.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestHeadersSynchronousEvent
  extends Event[
      js.Function1[
        /* details */ typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersDetails, 
        typingsJapgolly.chrome.chrome.webRequest.BlockingResponse | Unit
      ]
    ] {
  def addListener(
    callback: js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typingsJapgolly.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typingsJapgolly.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

