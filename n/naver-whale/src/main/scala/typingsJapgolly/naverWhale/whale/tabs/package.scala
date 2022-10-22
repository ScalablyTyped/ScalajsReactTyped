package typingsJapgolly.naverWhale.whale.tabs

import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type TabActivatedEvent = Event[
js.Function1[/* activeInfo */ typingsJapgolly.chrome.chrome.tabs.TabActiveInfo, Unit]]

type TabAttachedEvent = Event[
js.Function2[
  /* tabId */ Double, 
  /* attachInfo */ typingsJapgolly.chrome.chrome.tabs.TabAttachInfo, 
  Unit
]]

type TabCreatedEvent = Event[js.Function1[/* tab */ typingsJapgolly.chrome.chrome.tabs.Tab, Unit]]

type TabDetachedEvent = Event[
js.Function2[
  /* tabId */ Double, 
  /* detachInfo */ typingsJapgolly.chrome.chrome.tabs.TabDetachInfo, 
  Unit
]]

type TabHighlightedEvent = Event[
js.Function1[/* highlightInfo */ typingsJapgolly.chrome.chrome.tabs.TabHighlightInfo, Unit]]

type TabMovedEvent = Event[
js.Function2[
  /* tabId */ Double, 
  /* moveInfo */ typingsJapgolly.chrome.chrome.tabs.TabMoveInfo, 
  Unit
]]

type TabRemovedEvent = Event[
js.Function2[
  /* tabId */ Double, 
  /* removeInfo */ typingsJapgolly.chrome.chrome.tabs.TabRemoveInfo, 
  Unit
]]

type TabReplacedEvent = Event[js.Function2[/* addedTabId */ Double, /* removedTabId */ Double, Unit]]

type TabSelectedEvent = Event[
js.Function2[
  /* tabId */ Double, 
  /* selectInfo */ typingsJapgolly.chrome.chrome.tabs.TabWindowInfo, 
  Unit
]]

type TabUpdatedEvent = Event[
js.Function3[
  /* tabId */ Double, 
  /* changeInfo */ typingsJapgolly.chrome.chrome.tabs.TabChangeInfo, 
  /* tab */ typingsJapgolly.chrome.chrome.tabs.Tab, 
  Unit
]]

type TabZoomChangeEvent = Event[
js.Function1[/* ZoomChangeInfo */ typingsJapgolly.chrome.chrome.tabs.ZoomChangeInfo, Unit]]
