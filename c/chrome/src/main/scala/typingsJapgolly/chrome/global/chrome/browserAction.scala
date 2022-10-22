package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.browserAction.BadgeBackgroundColorDetails
import typingsJapgolly.chrome.chrome.browserAction.BadgeTextDetails
import typingsJapgolly.chrome.chrome.browserAction.BrowserClickedEvent
import typingsJapgolly.chrome.chrome.browserAction.ColorArray
import typingsJapgolly.chrome.chrome.browserAction.PopupDetails
import typingsJapgolly.chrome.chrome.browserAction.TabDetails
import typingsJapgolly.chrome.chrome.browserAction.TabIconDetails
import typingsJapgolly.chrome.chrome.browserAction.TitleDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Browser Action
////////////////////
/**
  * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
  * Availability: Since Chrome 5.
  * Manifest:  "browser_action": {...}
  */
object browserAction {
  
  @JSGlobal("chrome.browserAction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  inline def disable(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def disable(tabId: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disable_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Unit]]
  inline def disable_Promise(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(tabId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enable(tabId: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def enable(tabId: Unit, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enable_Promise(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Unit]]
  inline def enable_Promise(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBadgeBackgroundColor(details: TabDetails): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  inline def getBadgeBackgroundColor(details: TabDetails, callback: js.Function1[/* result */ ColorArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBadgeText(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getBadgeText(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPopup(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getPopup(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTitle(details: TabDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def getTitle(details: TabDetails, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("chrome.browserAction.onClicked")
  @js.native
  def onClicked: BrowserClickedEvent = js.native
  inline def onClicked_=(x: BrowserClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  inline def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBadgeBackgroundColor(details: BadgeBackgroundColorDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeBackgroundColor_Promise(details: BadgeBackgroundColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setBadgeText(details: BadgeTextDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBadgeText(details: BadgeTextDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setBadgeText_Promise(details: BadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIcon(details: TabIconDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setIcon(details: TabIconDetails, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPopup(details: PopupDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setPopup(details: PopupDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setPopup_Promise(details: PopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setTitle(details: TitleDetails): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setTitle(details: TitleDetails, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setTitle_Promise(details: TitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
