package typingsJapgolly.openfin.viewMod

import typingsJapgolly.openfin.eventsApplicationMod.CrashedEvent
import typingsJapgolly.openfin.eventsBaseMod.WindowEvent
import typingsJapgolly.openfin.openfinStrings.`target-changed`
import typingsJapgolly.openfin.openfinStrings.attached
import typingsJapgolly.openfin.openfinStrings.created
import typingsJapgolly.openfin.openfinStrings.destroyed
import typingsJapgolly.openfin.openfinStrings.hidden
import typingsJapgolly.openfin.openfinStrings.shown
import typingsJapgolly.openfin.openfinStrings.view
import typingsJapgolly.openfin.webcontentsMod.CertificateErrorEvent
import typingsJapgolly.openfin.webcontentsMod.PageTitleUpdatedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typingsJapgolly.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typingsJapgolly.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.ViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.ViewEventMapping<'view', Type>[Type]} */
trait ViewEvents extends js.Object {
  var attached: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.attached]
  var `certificate-error`: CertificateErrorEvent[String, String]
  var crashed: CrashedEvent with (WindowEvent[String, String])
  var created: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.created]
  var destroyed: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.destroyed]
  var `did-change-theme-color`: WindowEvent[String, String]
  var `found-in-page`: WindowEvent[String, String]
  var hidden: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.hidden]
  var listenerRemoved: String
  var `navigation-rejected`: WindowNavigationRejectedEvent[String, String]
  var newListener: String
  var `page-favicon-updated`: WindowEvent[String, String]
  var `page-title-updated`: PageTitleUpdatedEvent[String, String]
  var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String]
  var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String]
  var shown: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.shown]
  var `target-changed`: WindowEvent[view, typingsJapgolly.openfin.openfinStrings.`target-changed`]
}

object ViewEvents {
  @scala.inline
  def apply(
    attached: WindowEvent[view, attached],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[view, created],
    destroyed: WindowEvent[view, destroyed],
    `did-change-theme-color`: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[view, hidden],
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[view, shown],
    `target-changed`: WindowEvent[view, `target-changed`]
  ): ViewEvents = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-changed")(`target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEvents]
  }
}

