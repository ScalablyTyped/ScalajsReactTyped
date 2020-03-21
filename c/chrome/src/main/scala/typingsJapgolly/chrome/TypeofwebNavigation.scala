package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwebNavigation extends js.Object {
  var onBeforeNavigate: WebNavigationParentedEvent
  var onCommitted: WebNavigationTransitionalEvent
  var onCompleted: WebNavigationFramedEvent
  var onCreatedNavigationTarget: WebNavigationSourceEvent
  var onDOMContentLoaded: WebNavigationFramedEvent
  var onErrorOccurred: WebNavigationFramedErrorEvent
  var onHistoryStateUpdated: WebNavigationTransitionalEvent
  var onReferenceFragmentUpdated: WebNavigationTransitionalEvent
  var onTabReplaced: WebNavigationReplacementEvent
  def getAllFrames(
    details: GetAllFrameDetails,
    callback: js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]
  ): Unit
  def getFrame(details: GetFrameDetails, callback: js.Function1[/* details */ GetFrameResultDetails | Null, Unit]): Unit
}

object TypeofwebNavigation {
  @scala.inline
  def apply(
    getAllFrames: (GetAllFrameDetails, js.Function1[/* details */ js.Array[GetAllFrameResultDetails] | Null, Unit]) => Callback,
    getFrame: (GetFrameDetails, js.Function1[/* details */ GetFrameResultDetails | Null, Unit]) => Callback,
    onBeforeNavigate: WebNavigationParentedEvent,
    onCommitted: WebNavigationTransitionalEvent,
    onCompleted: WebNavigationFramedEvent,
    onCreatedNavigationTarget: WebNavigationSourceEvent,
    onDOMContentLoaded: WebNavigationFramedEvent,
    onErrorOccurred: WebNavigationFramedErrorEvent,
    onHistoryStateUpdated: WebNavigationTransitionalEvent,
    onReferenceFragmentUpdated: WebNavigationTransitionalEvent,
    onTabReplaced: WebNavigationReplacementEvent
  ): TypeofwebNavigation = {
    val __obj = js.Dynamic.literal(onBeforeNavigate = onBeforeNavigate.asInstanceOf[js.Any], onCommitted = onCommitted.asInstanceOf[js.Any], onCompleted = onCompleted.asInstanceOf[js.Any], onCreatedNavigationTarget = onCreatedNavigationTarget.asInstanceOf[js.Any], onDOMContentLoaded = onDOMContentLoaded.asInstanceOf[js.Any], onErrorOccurred = onErrorOccurred.asInstanceOf[js.Any], onHistoryStateUpdated = onHistoryStateUpdated.asInstanceOf[js.Any], onReferenceFragmentUpdated = onReferenceFragmentUpdated.asInstanceOf[js.Any], onTabReplaced = onTabReplaced.asInstanceOf[js.Any])
    __obj.updateDynamic("getAllFrames")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameDetails, t1: js.Function1[
  /* details */ js.Array[typingsJapgolly.chrome.chrome.webNavigation.GetAllFrameResultDetails] | scala.Null, 
  scala.Unit]) => getAllFrames(t0, t1).runNow()))
    __obj.updateDynamic("getFrame")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.webNavigation.GetFrameDetails, t1: js.Function1[
  /* details */ typingsJapgolly.chrome.chrome.webNavigation.GetFrameResultDetails | scala.Null, 
  scala.Unit]) => getFrame(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofwebNavigation]
  }
}

