package typingsJapgolly.openfin.windowMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openfin.eventsApplicationMod.CrashedEvent
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.openfinStrings.`auth-requested`
import typingsJapgolly.openfin.openfinStrings.`begin-user-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`bounds-changed`
import typingsJapgolly.openfin.openfinStrings.`bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`close-requested`
import typingsJapgolly.openfin.openfinStrings.`disabled-movement-bounds-changed`
import typingsJapgolly.openfin.openfinStrings.`disabled-movement-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`end-user-bounds-changing`
import typingsJapgolly.openfin.openfinStrings.`external-process-exited`
import typingsJapgolly.openfin.openfinStrings.`external-process-started`
import typingsJapgolly.openfin.openfinStrings.`group-changed`
import typingsJapgolly.openfin.openfinStrings.`options-changed`
import typingsJapgolly.openfin.openfinStrings.`performance-report`
import typingsJapgolly.openfin.openfinStrings.`preload-scripts-state-changed`
import typingsJapgolly.openfin.openfinStrings.`preload-scripts-state-changing`
import typingsJapgolly.openfin.openfinStrings.`show-requested`
import typingsJapgolly.openfin.openfinStrings.`user-movement-disabled`
import typingsJapgolly.openfin.openfinStrings.`user-movement-enabled`
import typingsJapgolly.openfin.openfinStrings.`view-attached`
import typingsJapgolly.openfin.openfinStrings.`view-detached`
import typingsJapgolly.openfin.openfinStrings.`will-move`
import typingsJapgolly.openfin.openfinStrings.`will-resize`
import typingsJapgolly.openfin.openfinStrings.blurred
import typingsJapgolly.openfin.openfinStrings.closed
import typingsJapgolly.openfin.openfinStrings.closing
import typingsJapgolly.openfin.openfinStrings.embedded
import typingsJapgolly.openfin.openfinStrings.focused
import typingsJapgolly.openfin.openfinStrings.hidden
import typingsJapgolly.openfin.openfinStrings.initialized
import typingsJapgolly.openfin.openfinStrings.maximized
import typingsJapgolly.openfin.openfinStrings.minimized
import typingsJapgolly.openfin.openfinStrings.reloaded
import typingsJapgolly.openfin.openfinStrings.restored
import typingsJapgolly.openfin.openfinStrings.shown
import typingsJapgolly.openfin.openfinStrings.window
import typingsJapgolly.openfin.webcontentsMod.CertificateErrorEvent
import typingsJapgolly.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<'window', string> & {[ Type in keyof openfin.openfin/_v2/api/events/window.WindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/window.WindowEventMapping<'window', Type>[Type]} */
trait WindowEvents
  extends /* name */ StringDictionary[js.Any] {
  var `auth-requested`: WindowAuthRequestedEvent[window, typingsJapgolly.openfin.openfinStrings.`auth-requested`]
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, typingsJapgolly.openfin.openfinStrings.`begin-user-bounds-changing`]
  var blurred: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.blurred]
  var `bounds-changed`: WindowBoundsChange[window, typingsJapgolly.openfin.openfinStrings.`bounds-changed`]
  var `bounds-changing`: WindowBoundsChange[window, typingsJapgolly.openfin.openfinStrings.`bounds-changing`]
  var `certificate-error`: CertificateErrorEvent[String, String]
  var `close-requested`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`close-requested`]
  var closed: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.closed]
  var closing: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.closing]
  var crashed: CrashedEvent with (WindowEvent[String, String])
  var `did-change-theme-color`: WindowEvent[String, String]
  var `disabled-movement-bounds-changed`: WindowBoundsChange[window, typingsJapgolly.openfin.openfinStrings.`disabled-movement-bounds-changed`]
  var `disabled-movement-bounds-changing`: WindowBoundsChange[window, typingsJapgolly.openfin.openfinStrings.`disabled-movement-bounds-changing`]
  var embedded: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.embedded]
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, typingsJapgolly.openfin.openfinStrings.`end-user-bounds-changing`]
  var `external-process-exited`: WindowExternalProcessExitedEvent[window, typingsJapgolly.openfin.openfinStrings.`external-process-exited`]
  var `external-process-started`: WindowExternalProcessStartedEvent[window, typingsJapgolly.openfin.openfinStrings.`external-process-started`]
  var focused: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.focused]
  var `found-in-page`: WindowEvent[String, String]
  var `group-changed`: WindowGroupChanged[window, typingsJapgolly.openfin.openfinStrings.`group-changed`]
  var hidden: WindowHiddenEvent[window, typingsJapgolly.openfin.openfinStrings.hidden]
  var initialized: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.initialized]
  var listenerRemoved: String
  var maximized: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.maximized]
  var minimized: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.minimized]
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String]
  var newListener: String
  var `options-changed`: WindowOptionsChangedEvent[window, typingsJapgolly.openfin.openfinStrings.`options-changed`]
  var `page-favicon-updated`: WindowEvent[String, String]
  var `page-title-updated`: PageTitleUpdatedEvent[String, String]
  var `performance-report`: WindowPerformanceReport[window, typingsJapgolly.openfin.openfinStrings.`performance-report`]
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, typingsJapgolly.openfin.openfinStrings.`preload-scripts-state-changed`]
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, typingsJapgolly.openfin.openfinStrings.`preload-scripts-state-changing`]
  var reloaded: WindowReloadedEvent[window, typingsJapgolly.openfin.openfinStrings.reloaded]
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String]
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String]
  var restored: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.restored]
  var `show-requested`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`show-requested`]
  var shown: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.shown]
  var `user-movement-disabled`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`user-movement-disabled`]
  var `user-movement-enabled`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`user-movement-enabled`]
  var `view-attached`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`view-attached`]
  var `view-crashed`: CrashedEvent with (WindowEvent[window, String])
  var `view-created`: CrashedEvent with (WindowEvent[window, String])
  var `view-destroyed`: WindowEvent[window, String]
  var `view-detached`: WindowEvent[window, typingsJapgolly.openfin.openfinStrings.`view-detached`]
  var `view-did-change-theme-color`: WindowEvent[window, String]
  var `view-hidden`: WindowEvent[window, String]
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[window, String]
  var `view-page-favicon-updated`: WindowEvent[window, String]
  var `view-page-title-updated`: WindowEvent[window, String]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[window, String]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[window, String]
  var `view-shown`: WindowEvent[window, String]
  var `view-target-changed`: WindowEvent[window, String]
  var `will-move`: WillMoveOrResize[window, typingsJapgolly.openfin.openfinStrings.`will-move`]
  var `will-resize`: WillMoveOrResize[window, typingsJapgolly.openfin.openfinStrings.`will-resize`]
}

object WindowEvents {
  @scala.inline
  def apply(
    `auth-requested`: WindowAuthRequestedEvent[window, `auth-requested`],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[window, `begin-user-bounds-changing`],
    blurred: WindowEvent[window, blurred],
    `bounds-changed`: WindowBoundsChange[window, `bounds-changed`],
    `bounds-changing`: WindowBoundsChange[window, `bounds-changing`],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[window, `close-requested`],
    closed: WindowEvent[window, closed],
    closing: WindowEvent[window, closing],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[window, `disabled-movement-bounds-changed`],
    `disabled-movement-bounds-changing`: WindowBoundsChange[window, `disabled-movement-bounds-changing`],
    embedded: WindowEvent[window, embedded],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[window, `end-user-bounds-changing`],
    `external-process-exited`: WindowExternalProcessExitedEvent[window, `external-process-exited`],
    `external-process-started`: WindowExternalProcessStartedEvent[window, `external-process-started`],
    focused: WindowEvent[window, focused],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[window, `group-changed`],
    hidden: WindowHiddenEvent[window, hidden],
    initialized: WindowEvent[window, initialized],
    listenerRemoved: String,
    maximized: WindowEvent[window, maximized],
    minimized: WindowEvent[window, minimized],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[window, `options-changed`],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[window, `performance-report`],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changed`],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[window, `preload-scripts-state-changing`],
    reloaded: WindowReloadedEvent[window, reloaded],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[window, restored],
    `show-requested`: WindowEvent[window, `show-requested`],
    shown: WindowEvent[window, shown],
    `user-movement-disabled`: WindowEvent[window, `user-movement-disabled`],
    `user-movement-enabled`: WindowEvent[window, `user-movement-enabled`],
    `view-attached`: WindowEvent[window, `view-attached`],
    `view-crashed`: CrashedEvent with (WindowEvent[window, String]),
    `view-created`: CrashedEvent with (WindowEvent[window, String]),
    `view-destroyed`: WindowEvent[window, String],
    `view-detached`: WindowEvent[window, `view-detached`],
    `view-did-change-theme-color`: WindowEvent[window, String],
    `view-hidden`: WindowEvent[window, String],
    `view-navigation-rejected`: WindowNavigationRejectedEvent[window, String],
    `view-page-favicon-updated`: WindowEvent[window, String],
    `view-page-title-updated`: WindowEvent[window, String],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[window, String],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[window, String],
    `view-shown`: WindowEvent[window, String],
    `view-target-changed`: WindowEvent[window, String],
    `will-move`: WillMoveOrResize[window, `will-move`],
    `will-resize`: WillMoveOrResize[window, `will-resize`],
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): WindowEvents = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("auth-requested")(`auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-requested")(`close-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-exited")(`external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-started")(`external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("options-changed")(`options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("performance-report")(`performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changed")(`preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changing")(`preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-requested")(`show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-attached")(`view-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[WindowEvents]
  }
}

