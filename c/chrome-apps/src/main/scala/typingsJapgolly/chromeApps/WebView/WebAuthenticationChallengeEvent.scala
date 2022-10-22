package typingsJapgolly.chromeApps.WebView

import typingsJapgolly.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthenticationChallengeEvent
  extends StObject
     with Event[
      js.Function2[
        /* details */ WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
        Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: Unit,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[js.Function1[/* response */ BlockingResponse, Unit]], 
      Unit
    ],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
