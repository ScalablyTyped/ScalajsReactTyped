package typingsJapgolly.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inspectedWindow {
  type ResourceAddedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* resource */ typingsJapgolly.chrome.chrome.devtools.inspectedWindow.Resource, 
      scala.Unit
    ]
  ]
  type ResourceContentCommittedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* resource */ typingsJapgolly.chrome.chrome.devtools.inspectedWindow.Resource, 
      /* content */ java.lang.String, 
      scala.Unit
    ]
  ]
}
