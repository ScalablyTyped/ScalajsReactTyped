package typingsJapgolly.openfin.eventsApplicationMod

import typingsJapgolly.openfin.eventsBaseMod.ApplicationEvent
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.openfinStrings.`manifest-changed`
import typingsJapgolly.openfin.openfinStrings.`not-responding`
import typingsJapgolly.openfin.openfinStrings.`run-requested`
import typingsJapgolly.openfin.openfinStrings.`tray-icon-clicked`
import typingsJapgolly.openfin.openfinStrings.`view-crashed`
import typingsJapgolly.openfin.openfinStrings.`view-created`
import typingsJapgolly.openfin.openfinStrings.`view-destroyed`
import typingsJapgolly.openfin.openfinStrings.`view-did-change-theme-color`
import typingsJapgolly.openfin.openfinStrings.`view-hidden`
import typingsJapgolly.openfin.openfinStrings.`view-navigation-rejected`
import typingsJapgolly.openfin.openfinStrings.`view-page-favicon-updated`
import typingsJapgolly.openfin.openfinStrings.`view-page-title-updated`
import typingsJapgolly.openfin.openfinStrings.`view-resource-load-failed`
import typingsJapgolly.openfin.openfinStrings.`view-resource-response-received`
import typingsJapgolly.openfin.openfinStrings.`view-shown`
import typingsJapgolly.openfin.openfinStrings.`view-target-changed`
import typingsJapgolly.openfin.openfinStrings.`window-alert-requested`
import typingsJapgolly.openfin.openfinStrings.`window-auth-requested`
import typingsJapgolly.openfin.openfinStrings.`window-begin-user-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`window-blurred`
import typingsJapgolly.openfin.openfinStrings.`window-bounds-changed`
import typingsJapgolly.openfin.openfinStrings.`window-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`window-closed`
import typingsJapgolly.openfin.openfinStrings.`window-closing`
import typingsJapgolly.openfin.openfinStrings.`window-crashed`
import typingsJapgolly.openfin.openfinStrings.`window-created`
import typingsJapgolly.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
import typingsJapgolly.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`window-embedded`
import typingsJapgolly.openfin.openfinStrings.`window-end-load`
import typingsJapgolly.openfin.openfinStrings.`window-end-user-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`window-external-process-exited`
import typingsJapgolly.openfin.openfinStrings.`window-external-process-started`
import typingsJapgolly.openfin.openfinStrings.`window-focused`
import typingsJapgolly.openfin.openfinStrings.`window-group-changed`
import typingsJapgolly.openfin.openfinStrings.`window-hidden`
import typingsJapgolly.openfin.openfinStrings.`window-initialized`
import typingsJapgolly.openfin.openfinStrings.`window-maximized`
import typingsJapgolly.openfin.openfinStrings.`window-minimized`
import typingsJapgolly.openfin.openfinStrings.`window-navigation-rejected`
import typingsJapgolly.openfin.openfinStrings.`window-not-responding`
import typingsJapgolly.openfin.openfinStrings.`window-options-changed`
import typingsJapgolly.openfin.openfinStrings.`window-performance-report`
import typingsJapgolly.openfin.openfinStrings.`window-preload-scripts-state-changed`
import typingsJapgolly.openfin.openfinStrings.`window-preload-scripts-state-changing`
import typingsJapgolly.openfin.openfinStrings.`window-reloaded`
import typingsJapgolly.openfin.openfinStrings.`window-resource-load-failed`
import typingsJapgolly.openfin.openfinStrings.`window-resource-response-received`
import typingsJapgolly.openfin.openfinStrings.`window-responding`
import typingsJapgolly.openfin.openfinStrings.`window-restored`
import typingsJapgolly.openfin.openfinStrings.`window-show-requested`
import typingsJapgolly.openfin.openfinStrings.`window-shown`
import typingsJapgolly.openfin.openfinStrings.`window-start-load`
import typingsJapgolly.openfin.openfinStrings.`window-user-movement-disabled`
import typingsJapgolly.openfin.openfinStrings.`window-user-movement-enabled`
import typingsJapgolly.openfin.openfinStrings.`window-will-move`
import typingsJapgolly.openfin.openfinStrings.`window-will-resize`
import typingsJapgolly.openfin.openfinStrings.application
import typingsJapgolly.openfin.openfinStrings.closed
import typingsJapgolly.openfin.openfinStrings.connected
import typingsJapgolly.openfin.openfinStrings.crashed
import typingsJapgolly.openfin.openfinStrings.initialized
import typingsJapgolly.openfin.openfinStrings.responding
import typingsJapgolly.openfin.openfinStrings.started
import typingsJapgolly.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsJapgolly.openfin.windowMod.WillMoveOrResize
import typingsJapgolly.openfin.windowMod.WindowAlertRequestedEvent
import typingsJapgolly.openfin.windowMod.WindowAuthRequestedEvent
import typingsJapgolly.openfin.windowMod.WindowBeginBoundsChangingEvent
import typingsJapgolly.openfin.windowMod.WindowBoundsChange
import typingsJapgolly.openfin.windowMod.WindowEndLoadEvent
import typingsJapgolly.openfin.windowMod.WindowExternalProcessExitedEvent
import typingsJapgolly.openfin.windowMod.WindowExternalProcessStartedEvent
import typingsJapgolly.openfin.windowMod.WindowGroupChanged
import typingsJapgolly.openfin.windowMod.WindowHiddenEvent
import typingsJapgolly.openfin.windowMod.WindowNavigationRejectedEvent
import typingsJapgolly.openfin.windowMod.WindowOptionsChangedEvent
import typingsJapgolly.openfin.windowMod.WindowPerformanceReport
import typingsJapgolly.openfin.windowMod.WindowPreloadScriptsStateChangeEvent
import typingsJapgolly.openfin.windowMod.WindowPreloadScriptsStateChangedEvent
import typingsJapgolly.openfin.windowMod.WindowReloadedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/window.PropagatedWindowEvents<'application'> & openfin.openfin/_v2/api/events/view.PropagatedViewEvents<'application'> & {[ Type in keyof openfin.openfin/_v2/api/events/application.ApplicationEventMapping<string, string> ]: openfin.openfin/_v2/api/events/application.ApplicationEventMapping<'application', Type>[Type]} */
trait ApplicationEvents extends js.Object {
  var closed: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.closed]
  var connected: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.connected]
  var crashed: CrashedEvent with (ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.crashed])
  var initialized: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.initialized]
  var listenerRemoved: String
  var `manifest-changed`: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.`manifest-changed`]
  var newListener: String
  var `not-responding`: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.`not-responding`]
  var responding: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.responding]
  var `run-requested`: RunRequestedEvent[application, typingsJapgolly.openfin.openfinStrings.`run-requested`]
  var started: ApplicationEvent[application, typingsJapgolly.openfin.openfinStrings.started]
  var `tray-icon-clicked`: TrayIconClicked[application, typingsJapgolly.openfin.openfinStrings.`tray-icon-clicked`]
  var `view-crashed`: CrashedEvent with (WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-crashed`])
  var `view-created`: CrashedEvent with (WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-created`])
  var `view-destroyed`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-destroyed`]
  var `view-did-change-theme-color`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-did-change-theme-color`]
  var `view-hidden`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-hidden`]
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[application, typingsJapgolly.openfin.openfinStrings.`view-navigation-rejected`]
  var `view-page-favicon-updated`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-page-favicon-updated`]
  var `view-page-title-updated`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-page-title-updated`]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, typingsJapgolly.openfin.openfinStrings.`view-resource-load-failed`]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`view-resource-response-received`
  ]
  var `view-shown`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-shown`]
  var `view-target-changed`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`view-target-changed`]
  var `window-alert-requested`: WindowAlertRequestedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-alert-requested`]
  var `window-auth-requested`: WindowAuthRequestedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-auth-requested`]
  var `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-begin-user-bounds-changing`
  ]
  var `window-blurred`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-blurred`]
  var `window-bounds-changed`: WindowBoundsChange[application, typingsJapgolly.openfin.openfinStrings.`window-bounds-changed`]
  var `window-bounds-changing`: WindowBoundsChange[application, typingsJapgolly.openfin.openfinStrings.`window-bounds-changing`]
  var `window-closed`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-closed`]
  var `window-closing`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-closing`]
  var `window-crashed`: CrashedEvent with (WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-crashed`])
  var `window-created`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-created`]
  var `window-disabled-movement-bounds-changed`: WindowBoundsChange[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-disabled-movement-bounds-changed`
  ]
  var `window-disabled-movement-bounds-changing`: WindowBoundsChange[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-disabled-movement-bounds-changing`
  ]
  var `window-embedded`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-embedded`]
  var `window-end-load`: WindowEndLoadEvent[application, typingsJapgolly.openfin.openfinStrings.`window-end-load`]
  var `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-end-user-bounds-changing`
  ]
  var `window-external-process-exited`: WindowExternalProcessExitedEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-external-process-exited`
  ]
  var `window-external-process-started`: WindowExternalProcessStartedEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-external-process-started`
  ]
  var `window-focused`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-focused`]
  var `window-group-changed`: WindowGroupChanged[application, typingsJapgolly.openfin.openfinStrings.`window-group-changed`]
  var `window-hidden`: WindowHiddenEvent[application, typingsJapgolly.openfin.openfinStrings.`window-hidden`]
  var `window-initialized`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-initialized`]
  var `window-maximized`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-maximized`]
  var `window-minimized`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-minimized`]
  var `window-navigation-rejected`: WindowNavigationRejectedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-navigation-rejected`]
  var `window-not-responding`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-not-responding`]
  var `window-options-changed`: WindowOptionsChangedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-options-changed`]
  var `window-performance-report`: WindowPerformanceReport[application, typingsJapgolly.openfin.openfinStrings.`window-performance-report`]
  var `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-preload-scripts-state-changed`
  ]
  var `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-preload-scripts-state-changing`
  ]
  var `window-reloaded`: WindowReloadedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-reloaded`]
  var `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, typingsJapgolly.openfin.openfinStrings.`window-resource-load-failed`]
  var `window-resource-response-received`: WindowResourceResponseReceivedEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-resource-response-received`
  ]
  var `window-responding`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-responding`]
  var `window-restored`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-restored`]
  var `window-show-requested`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-show-requested`]
  var `window-shown`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-shown`]
  var `window-start-load`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-start-load`]
  var `window-user-movement-disabled`: WindowEvent[
    application, 
    typingsJapgolly.openfin.openfinStrings.`window-user-movement-disabled`
  ]
  var `window-user-movement-enabled`: WindowEvent[application, typingsJapgolly.openfin.openfinStrings.`window-user-movement-enabled`]
  var `window-will-move`: WillMoveOrResize[application, typingsJapgolly.openfin.openfinStrings.`window-will-move`]
  var `window-will-resize`: WillMoveOrResize[application, typingsJapgolly.openfin.openfinStrings.`window-will-resize`]
}

object ApplicationEvents {
  @scala.inline
  def apply(
    closed: ApplicationEvent[application, closed],
    connected: ApplicationEvent[application, connected],
    crashed: CrashedEvent with (ApplicationEvent[application, crashed]),
    initialized: ApplicationEvent[application, initialized],
    listenerRemoved: String,
    `manifest-changed`: ApplicationEvent[application, `manifest-changed`],
    newListener: String,
    `not-responding`: ApplicationEvent[application, `not-responding`],
    responding: ApplicationEvent[application, responding],
    `run-requested`: RunRequestedEvent[application, `run-requested`],
    started: ApplicationEvent[application, started],
    `tray-icon-clicked`: TrayIconClicked[application, `tray-icon-clicked`],
    `view-crashed`: CrashedEvent with (WindowEvent[application, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[application, `view-created`]),
    `view-destroyed`: WindowEvent[application, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[application, `view-did-change-theme-color`],
    `view-hidden`: WindowEvent[application, `view-hidden`],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[application, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[application, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[application, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[application, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[application, `view-resource-response-received`],
    `view-shown`: WindowEvent[application, `view-shown`],
    `view-target-changed`: WindowEvent[application, `view-target-changed`],
    `window-alert-requested`: WindowAlertRequestedEvent[application, `window-alert-requested`],
    `window-auth-requested`: WindowAuthRequestedEvent[application, `window-auth-requested`],
    `window-begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-begin-user-bounds-changing`],
    `window-blurred`: WindowEvent[application, `window-blurred`],
    `window-bounds-changed`: WindowBoundsChange[application, `window-bounds-changed`],
    `window-bounds-changing`: WindowBoundsChange[application, `window-bounds-changing`],
    `window-closed`: WindowEvent[application, `window-closed`],
    `window-closing`: WindowEvent[application, `window-closing`],
    `window-crashed`: CrashedEvent with (WindowEvent[application, `window-crashed`]),
    `window-created`: WindowEvent[application, `window-created`],
    `window-disabled-movement-bounds-changed`: WindowBoundsChange[application, `window-disabled-movement-bounds-changed`],
    `window-disabled-movement-bounds-changing`: WindowBoundsChange[application, `window-disabled-movement-bounds-changing`],
    `window-embedded`: WindowEvent[application, `window-embedded`],
    `window-end-load`: WindowEndLoadEvent[application, `window-end-load`],
    `window-end-user-bounds-changing`: WindowBeginBoundsChangingEvent[application, `window-end-user-bounds-changing`],
    `window-external-process-exited`: WindowExternalProcessExitedEvent[application, `window-external-process-exited`],
    `window-external-process-started`: WindowExternalProcessStartedEvent[application, `window-external-process-started`],
    `window-focused`: WindowEvent[application, `window-focused`],
    `window-group-changed`: WindowGroupChanged[application, `window-group-changed`],
    `window-hidden`: WindowHiddenEvent[application, `window-hidden`],
    `window-initialized`: WindowEvent[application, `window-initialized`],
    `window-maximized`: WindowEvent[application, `window-maximized`],
    `window-minimized`: WindowEvent[application, `window-minimized`],
    `window-navigation-rejected`: WindowNavigationRejectedEvent[application, `window-navigation-rejected`],
    `window-not-responding`: WindowEvent[application, `window-not-responding`],
    `window-options-changed`: WindowOptionsChangedEvent[application, `window-options-changed`],
    `window-performance-report`: WindowPerformanceReport[application, `window-performance-report`],
    `window-preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[application, `window-preload-scripts-state-changed`],
    `window-preload-scripts-state-changing`: WindowPreloadScriptsStateChangedEvent[application, `window-preload-scripts-state-changing`],
    `window-reloaded`: WindowReloadedEvent[application, `window-reloaded`],
    `window-resource-load-failed`: WindowResourceLoadFailedEvent[application, `window-resource-load-failed`],
    `window-resource-response-received`: WindowResourceResponseReceivedEvent[application, `window-resource-response-received`],
    `window-responding`: WindowEvent[application, `window-responding`],
    `window-restored`: WindowEvent[application, `window-restored`],
    `window-show-requested`: WindowEvent[application, `window-show-requested`],
    `window-shown`: WindowEvent[application, `window-shown`],
    `window-start-load`: WindowEvent[application, `window-start-load`],
    `window-user-movement-disabled`: WindowEvent[application, `window-user-movement-disabled`],
    `window-user-movement-enabled`: WindowEvent[application, `window-user-movement-enabled`],
    `window-will-move`: WillMoveOrResize[application, `window-will-move`],
    `window-will-resize`: WillMoveOrResize[application, `window-will-resize`]
  ): ApplicationEvents = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], responding = responding.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.updateDynamic("manifest-changed")(`manifest-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("not-responding")(`not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("run-requested")(`run-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("tray-icon-clicked")(`tray-icon-clicked`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-alert-requested")(`window-alert-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-auth-requested")(`window-auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-begin-user-bounds-changing")(`window-begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-blurred")(`window-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changed")(`window-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-bounds-changing")(`window-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closed")(`window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-closing")(`window-closing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-crashed")(`window-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-created")(`window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changed")(`window-disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-disabled-movement-bounds-changing")(`window-disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-embedded")(`window-embedded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-end-load")(`window-end-load`.asInstanceOf[js.Any])
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
    __obj.updateDynamic("window-not-responding")(`window-not-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-options-changed")(`window-options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-performance-report")(`window-performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changed")(`window-preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-preload-scripts-state-changing")(`window-preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-reloaded")(`window-reloaded`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-load-failed")(`window-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-resource-response-received")(`window-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-responding")(`window-responding`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-restored")(`window-restored`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-show-requested")(`window-show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-shown")(`window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-start-load")(`window-start-load`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-disabled")(`window-user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-user-movement-enabled")(`window-user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-move")(`window-will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("window-will-resize")(`window-will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEvents]
  }
}

