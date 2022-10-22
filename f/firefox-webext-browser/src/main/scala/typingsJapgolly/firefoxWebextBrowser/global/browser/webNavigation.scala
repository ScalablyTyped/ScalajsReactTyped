package typingsJapgolly.firefoxWebextBrowser.global.browser

import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.GetAllFramesDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.GetAllFramesReturnDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.GetFrameDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.GetFrameReturnDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnBeforeNavigateDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnCommittedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnCompletedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnCreatedNavigationTargetDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnDOMContentLoadedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnErrorOccurredDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnHistoryStateUpdatedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnReferenceFragmentUpdatedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.OnTabReplacedDetails
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnBeforeNavigateEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCommittedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCompletedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnCreatedNavigationTargetEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnDOMContentLoadedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnErrorOccurredEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnHistoryStateUpdatedEvent
import typingsJapgolly.firefoxWebextBrowser.browser.webNavigation.WebNavigationOnReferenceFragmentUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.webNavigation` API to receive notifications about the status of navigation requests in-flight.
  *
  * Permissions: `webNavigation`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object webNavigation {
  
  @JSGlobal("browser.webNavigation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  inline def getAllFrames(details: GetAllFramesDetails): js.Promise[js.Array[GetAllFramesReturnDetails]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllFrames")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GetAllFramesReturnDetails]]]
  
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  inline def getFrame(details: GetFrameDetails): js.Promise[GetFrameReturnDetails] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrame")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetFrameReturnDetails]]
  
  /* webNavigation events */
  /** Fired when a navigation is about to occur. */
  @JSGlobal("browser.webNavigation.onBeforeNavigate")
  @js.native
  val onBeforeNavigate: WebNavigationOnBeforeNavigateEvent[js.Function1[/* details */ OnBeforeNavigateDetails, Unit]] = js.native
  
  /**
    * Fired when a navigation is committed. The document (and the resources it refers to, such as images and subframes) might still be downloading, but at least part of the document has been received from the server and the browser has decided to switch to the new document.
    */
  @JSGlobal("browser.webNavigation.onCommitted")
  @js.native
  val onCommitted: WebNavigationOnCommittedEvent[js.Function1[/* details */ OnCommittedDetails, Unit]] = js.native
  
  /** Fired when a document, including the resources it refers to, is completely loaded and initialized. */
  @JSGlobal("browser.webNavigation.onCompleted")
  @js.native
  val onCompleted: WebNavigationOnCompletedEvent[js.Function1[/* details */ OnCompletedDetails, Unit]] = js.native
  
  /** Fired when a new window, or a new tab in an existing window, is created to host a navigation. */
  @JSGlobal("browser.webNavigation.onCreatedNavigationTarget")
  @js.native
  val onCreatedNavigationTarget: WebNavigationOnCreatedNavigationTargetEvent[js.Function1[/* details */ OnCreatedNavigationTargetDetails, Unit]] = js.native
  
  /** Fired when the page's DOM is fully constructed, but the referenced resources may not finish loading. */
  @JSGlobal("browser.webNavigation.onDOMContentLoaded")
  @js.native
  val onDOMContentLoaded: WebNavigationOnDOMContentLoadedEvent[js.Function1[/* details */ OnDOMContentLoadedDetails, Unit]] = js.native
  
  /**
    * Fired when an error occurs and the navigation is aborted. This can happen if either a network error occurred, or the user aborted the navigation.
    */
  @JSGlobal("browser.webNavigation.onErrorOccurred")
  @js.native
  val onErrorOccurred: WebNavigationOnErrorOccurredEvent[js.Function1[/* details */ OnErrorOccurredDetails, Unit]] = js.native
  
  /**
    * Fired when the frame's history was updated to a new URL. All future events for that frame will use the updated URL.
    */
  @JSGlobal("browser.webNavigation.onHistoryStateUpdated")
  @js.native
  val onHistoryStateUpdated: WebNavigationOnHistoryStateUpdatedEvent[js.Function1[/* details */ OnHistoryStateUpdatedDetails, Unit]] = js.native
  
  /**
    * Fired when the reference fragment of a frame was updated. All future events for that frame will use the updated URL.
    */
  @JSGlobal("browser.webNavigation.onReferenceFragmentUpdated")
  @js.native
  val onReferenceFragmentUpdated: WebNavigationOnReferenceFragmentUpdatedEvent[js.Function1[/* details */ OnReferenceFragmentUpdatedDetails, Unit]] = js.native
  
  /** Fired when the contents of the tab is replaced by a different (usually previously pre-rendered) tab. */
  @JSGlobal("browser.webNavigation.onTabReplaced")
  @js.native
  val onTabReplaced: WebExtEvent[js.Function1[/* details */ OnTabReplacedDetails, Unit]] = js.native
}
