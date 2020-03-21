package typingsJapgolly.naverWhale.whale.webRequest

import typingsJapgolly.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthenticationChallengeEvent
  extends Event[
      js.Function2[
        /* details */ typingsJapgolly.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[
          js.Function1[/* response */ typingsJapgolly.chrome.chrome.webRequest.BlockingResponse, Unit]
        ], 
        Unit
      ]
    ] {
  def addListener(
    callback: js.Function2[
      /* details */ typingsJapgolly.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typingsJapgolly.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typingsJapgolly.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typingsJapgolly.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typingsJapgolly.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

