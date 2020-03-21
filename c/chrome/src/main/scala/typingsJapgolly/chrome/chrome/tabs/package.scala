package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabs {
  type TabActivatedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* activeInfo */ typingsJapgolly.chrome.chrome.tabs.TabActiveInfo, scala.Unit]
  ]
  type TabAttachedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* attachInfo */ typingsJapgolly.chrome.chrome.tabs.TabAttachInfo, 
      scala.Unit
    ]
  ]
  type TabCreatedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* tab */ typingsJapgolly.chrome.chrome.tabs.Tab, scala.Unit]]
  type TabDetachedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* detachInfo */ typingsJapgolly.chrome.chrome.tabs.TabDetachInfo, 
      scala.Unit
    ]
  ]
  type TabHighlightedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* highlightInfo */ typingsJapgolly.chrome.chrome.tabs.TabHighlightInfo, 
      scala.Unit
    ]
  ]
  type TabMovedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* moveInfo */ typingsJapgolly.chrome.chrome.tabs.TabMoveInfo, 
      scala.Unit
    ]
  ]
  type TabRemovedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* removeInfo */ typingsJapgolly.chrome.chrome.tabs.TabRemoveInfo, 
      scala.Unit
    ]
  ]
  type TabReplacedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* addedTabId */ scala.Double, /* removedTabId */ scala.Double, scala.Unit]
  ]
  type TabSelectedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* tabId */ scala.Double, 
      /* selectInfo */ typingsJapgolly.chrome.chrome.tabs.TabWindowInfo, 
      scala.Unit
    ]
  ]
  type TabUpdatedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* tabId */ scala.Double, 
      /* changeInfo */ typingsJapgolly.chrome.chrome.tabs.TabChangeInfo, 
      /* tab */ typingsJapgolly.chrome.chrome.tabs.Tab, 
      scala.Unit
    ]
  ]
  type TabZoomChangeEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* ZoomChangeInfo */ typingsJapgolly.chrome.chrome.tabs.ZoomChangeInfo, scala.Unit]
  ]
}
