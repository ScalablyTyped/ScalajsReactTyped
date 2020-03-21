package typingsJapgolly.openfin.viewMod

import typingsJapgolly.openfin.eventsApplicationMod.CrashedEvent
import typingsJapgolly.openfin.eventsBaseMod.BaseEventMap
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsJapgolly.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagatedViewEventMapping[Topic, Type] extends BaseEventMap {
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type])
  var `view-created`: CrashedEvent with (WindowEvent[Topic, Type])
  var `view-destroyed`: WindowEvent[Topic, Type]
  var `view-did-change-theme-color`: WindowEvent[Topic, Type]
  var `view-hidden`: WindowEvent[Topic, Type]
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type]
  var `view-page-favicon-updated`: WindowEvent[Topic, Type]
  var `view-page-title-updated`: WindowEvent[Topic, Type]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type]
  var `view-shown`: WindowEvent[Topic, Type]
  var `view-target-changed`: WindowEvent[Topic, Type]
}

object PropagatedViewEventMapping {
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type]),
    `view-created`: CrashedEvent with (WindowEvent[Topic, Type]),
    `view-destroyed`: WindowEvent[Topic, Type],
    `view-did-change-theme-color`: WindowEvent[Topic, Type],
    `view-hidden`: WindowEvent[Topic, Type],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, Type],
    `view-page-favicon-updated`: WindowEvent[Topic, Type],
    `view-page-title-updated`: WindowEvent[Topic, Type],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, Type],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, Type],
    `view-shown`: WindowEvent[Topic, Type],
    `view-target-changed`: WindowEvent[Topic, Type]
  ): PropagatedViewEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedViewEventMapping[Topic, Type]]
  }
}

