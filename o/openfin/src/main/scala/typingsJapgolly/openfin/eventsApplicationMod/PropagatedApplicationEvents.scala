package typingsJapgolly.openfin.eventsApplicationMod

import typingsJapgolly.openfin.eventsBaseMod.ApplicationEvent
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.openfinStrings.`application-closed`
import typingsJapgolly.openfin.openfinStrings.`application-connected`
import typingsJapgolly.openfin.openfinStrings.`application-crashed`
import typingsJapgolly.openfin.openfinStrings.`application-initialized`
import typingsJapgolly.openfin.openfinStrings.`application-manifest-changed`
import typingsJapgolly.openfin.openfinStrings.`application-not-responding`
import typingsJapgolly.openfin.openfinStrings.`application-responding`
import typingsJapgolly.openfin.openfinStrings.`application-started`
import typingsJapgolly.openfin.openfinStrings.`application-tray-icon-clicked`
import typingsJapgolly.openfin.openfinStrings.`window-created`
import typingsJapgolly.openfin.openfinStrings.`window-did-change-theme-color`
import typingsJapgolly.openfin.openfinStrings.`window-end-load`
import typingsJapgolly.openfin.openfinStrings.`window-not-responding`
import typingsJapgolly.openfin.openfinStrings.`window-page-favicon-updated`
import typingsJapgolly.openfin.openfinStrings.`window-page-title-updated`
import typingsJapgolly.openfin.openfinStrings.`window-performance-report`
import typingsJapgolly.openfin.openfinStrings.`window-responding`
import typingsJapgolly.openfin.openfinStrings.`window-start-load`
import typingsJapgolly.openfin.windowMod.WindowEndLoadEvent
import typingsJapgolly.openfin.windowMod.WindowPerformanceReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.PropagatedApplicationEventMapping<Topic, Type>[Type]} */
trait PropagatedApplicationEvents[Topic] extends js.Object {
  var `application-closed`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-closed`]
  var `application-connected`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-connected`]
  var `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-crashed`])
  var `application-initialized`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-initialized`]
  var `application-manifest-changed`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-manifest-changed`]
  var `application-not-responding`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-not-responding`]
  var `application-responding`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-responding`]
  var `application-started`: ApplicationEvent[Topic, typingsJapgolly.openfin.openfinStrings.`application-started`]
  var `application-tray-icon-clicked`: TrayIconClicked[Topic, typingsJapgolly.openfin.openfinStrings.`application-tray-icon-clicked`]
  var `window-created`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-created`]
  var `window-did-change-theme-color`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-did-change-theme-color`]
  var `window-end-load`: WindowEndLoadEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-end-load`]
  var `window-not-responding`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-not-responding`]
  var `window-page-favicon-updated`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-page-favicon-updated`]
  var `window-page-title-updated`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-page-title-updated`]
  var `window-performance-report`: WindowPerformanceReport[Topic, typingsJapgolly.openfin.openfinStrings.`window-performance-report`]
  var `window-responding`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-responding`]
  var `window-start-load`: WindowEvent[Topic, typingsJapgolly.openfin.openfinStrings.`window-start-load`]
}

object PropagatedApplicationEvents {
  @scala.inline
  def apply[Topic](
    `application-closed`: ApplicationEvent[Topic, `application-closed`],
    `application-connected`: ApplicationEvent[Topic, `application-connected`],
    `application-crashed`: CrashedEvent with (ApplicationEvent[Topic, `application-crashed`]),
    `application-initialized`: ApplicationEvent[Topic, `application-initialized`],
    `application-manifest-changed`: ApplicationEvent[Topic, `application-manifest-changed`],
    `application-not-responding`: ApplicationEvent[Topic, `application-not-responding`],
    `application-responding`: ApplicationEvent[Topic, `application-responding`],
    `application-started`: ApplicationEvent[Topic, `application-started`],
    `application-tray-icon-clicked`: TrayIconClicked[Topic, `application-tray-icon-clicked`],
    `window-created`: WindowEvent[Topic, `window-created`],
    `window-did-change-theme-color`: WindowEvent[Topic, `window-did-change-theme-color`],
    `window-end-load`: WindowEndLoadEvent[Topic, `window-end-load`],
    `window-not-responding`: WindowEvent[Topic, `window-not-responding`],
    `window-page-favicon-updated`: WindowEvent[Topic, `window-page-favicon-updated`],
    `window-page-title-updated`: WindowEvent[Topic, `window-page-title-updated`],
    `window-performance-report`: WindowPerformanceReport[Topic, `window-performance-report`],
    `window-responding`: WindowEvent[Topic, `window-responding`],
    `window-start-load`: WindowEvent[Topic, `window-start-load`]
  ): PropagatedApplicationEvents[Topic] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application-closed")(`application-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-connected")(`application-connected`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-crashed")(`application-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-initialized")(`application-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-manifest-changed")(`application-manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-not-responding")(`application-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-responding")(`application-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-started")(`application-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("application-tray-icon-clicked")(`application-tray-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-did-change-theme-color")(`window-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-favicon-updated")(`window-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-page-title-updated")(`window-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedApplicationEvents[Topic]]
  }
}

