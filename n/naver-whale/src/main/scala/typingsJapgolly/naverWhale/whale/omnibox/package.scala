package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omnibox {
  type OmniboxInputCancelledEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxInputChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* suggest */ js.Function1[
        /* suggestResults */ js.Array[typingsJapgolly.chrome.chrome.omnibox.SuggestResult], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type OmniboxInputEnteredEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* text */ java.lang.String, 
      /* disposition */ typingsJapgolly.chrome.chrome.omnibox.OnInputEnteredDisposition, 
      scala.Unit
    ]
  ]
  type OmniboxInputStartedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type OmniboxSuggestionDeletedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* text */ java.lang.String, scala.Unit]]
}
