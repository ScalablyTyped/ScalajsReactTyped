package typingsJapgolly.chrome.anon

import typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameDetails
import typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameResultDetails
import typingsJapgolly.chrome.chrome.webNavigation.GetFrameDetails
import typingsJapgolly.chrome.chrome.webNavigation.GetFrameResultDetails
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationFramedErrorEvent
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationFramedEvent
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationParentedEvent
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationReplacementEvent
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationSourceEvent
import typingsJapgolly.chrome.chrome.webNavigation.WebNavigationTransitionalEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwebNavigation extends StObject {
  
  def getAllFrames(details: GetAllFrameDetails): js.Promise[js.Array[GetAllFrameResultDetails] | Null] = js.native
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit = js.native
  
  def getFrame(details: GetFrameDetails): js.Promise[GetFrameResultDetails | Null] = js.native
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit = js.native
  
  var onBeforeNavigate: WebNavigationParentedEvent = js.native
  
  var onCommitted: WebNavigationTransitionalEvent = js.native
  
  var onCompleted: WebNavigationFramedEvent = js.native
  
  var onCreatedNavigationTarget: WebNavigationSourceEvent = js.native
  
  var onDOMContentLoaded: WebNavigationFramedEvent = js.native
  
  var onErrorOccurred: WebNavigationFramedErrorEvent = js.native
  
  var onHistoryStateUpdated: WebNavigationTransitionalEvent = js.native
  
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent = js.native
  
  var onTabReplaced: WebNavigationReplacementEvent = js.native
}
