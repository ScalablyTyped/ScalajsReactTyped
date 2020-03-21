package typingsJapgolly.openfin.windowMod

import typingsJapgolly.openfin.eventsApplicationMod.CrashedEvent
import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagatedWindowEventMapping[Topic, Type] extends BaseEventMap {
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type]
  var `window-blurred`: WindowEvent[Topic, Type]
  var `window-bounds-changed`: WindowBoundsChange[Topic, Type]
  var `window-bounds-changing`: WindowBoundsChange[Topic, Type]
  var `window-closed`: WindowEvent[Topic, Type]
  var `window-closing`: WindowEvent[Topic, Type]
  var `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type])
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type]
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type]
  var `window-embedded`: WindowEvent[Topic, Type]
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type]
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type]
  var `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type]
  var `window-focused`: WindowEvent[Topic, Type]
  var `window-group-changed`: WindowGroupChanged[Topic, Type]
  var `window-hidden`: WindowHiddenEvent[Topic, Type]
  var `window-initialized`: WindowEvent[Topic, Type]
  var `window-maximized`: WindowEvent[Topic, Type]
  var `window-minimized`: WindowEvent[Topic, Type]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type]
  var `window-options-changed`: WindowOptionsChangedEvent[Topic, Type]
  var `window-performance-report`: WindowPerformanceReport[Topic, Type]
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type]
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type]
  var `window-reloaded`: WindowReloadedEvent[Topic, Type]
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type]
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  var `window-restored`: WindowEvent[Topic, Type]
  var `window-shown`: WindowEvent[Topic, Type]
  var `window-user-movement-disabled`: WindowEvent[Topic, Type]
  var `window-user-movement-enabled`: WindowEvent[Topic, Type]
  var `window-will-move`: WillMoveOrResize[Topic, Type]
  var `window-will-resize`: WillMoveOrResize[Topic, Type]
}

object PropagatedWindowEventMapping {
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-blurred`: WindowEvent[Topic, Type],
    `window-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-closed`: WindowEvent[Topic, Type],
    `window-closing`: WindowEvent[Topic, Type],
    `window-crashed`: CrashedEvent with (WindowEvent[Topic, Type]),
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    `window-embedded`: WindowEvent[Topic, Type],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `window-external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    `window-focused`: WindowEvent[Topic, Type],
    `window-group-changed`: WindowGroupChanged[Topic, Type],
    `window-hidden`: WindowHiddenEvent[Topic, Type],
    `window-initialized`: WindowEvent[Topic, Type],
    `window-maximized`: WindowEvent[Topic, Type],
    `window-minimized`: WindowEvent[Topic, Type],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    `window-options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `window-performance-report`: WindowPerformanceReport[Topic, Type],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[Topic, Type],
    `window-reloaded`: WindowReloadedEvent[Topic, Type],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type],
    `window-restored`: WindowEvent[Topic, Type],
    `window-shown`: WindowEvent[Topic, Type],
    `window-user-movement-disabled`: WindowEvent[Topic, Type],
    `window-user-movement-enabled`: WindowEvent[Topic, Type],
    `window-will-move`: WillMoveOrResize[Topic, Type],
    `window-will-resize`: WillMoveOrResize[Topic, Type]
  ): PropagatedWindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-user-bounds-changing")(`window-end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-exited")(`window-external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-external-process-started")(`window-external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-focused")(`window-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-group-changed")(`window-group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-hidden")(`window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-initialized")(`window-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-maximized")(`window-maximized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-minimized")(`window-minimized`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-navigation-rejected")(`window-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedWindowEventMapping[Topic, Type]]
  }
}

