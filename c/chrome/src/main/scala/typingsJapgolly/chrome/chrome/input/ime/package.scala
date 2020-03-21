package typingsJapgolly.chrome.chrome.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ime {
  type ActivateEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* screen */ java.lang.String, scala.Unit]
  ]
  type BlurEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* contextID */ scala.Double, scala.Unit]]
  type CandidateClickedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* engineID */ java.lang.String, 
      /* candidateID */ scala.Double, 
      /* button */ java.lang.String, 
      scala.Unit
    ]
  ]
  type DeactivatedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type FocusEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* context */ typingsJapgolly.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  type InputContextUpdateEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* context */ typingsJapgolly.chrome.chrome.input.ime.InputContext, scala.Unit]
  ]
  type InputResetEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* engineID */ java.lang.String, scala.Unit]]
  type KeyEventEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* keyData */ typingsJapgolly.chrome.chrome.input.ime.KeyboardEvent, 
      scala.Unit
    ]
  ]
  type MenuItemActivatedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* engineID */ java.lang.String, /* name */ java.lang.String, scala.Unit]
  ]
  type SurroundingTextChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* engineID */ java.lang.String, 
      /* surroundingInfo */ typingsJapgolly.chrome.chrome.input.ime.SurroundingTextInfo, 
      scala.Unit
    ]
  ]
}
