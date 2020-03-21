package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.alert
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.badge
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.sound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonALERT extends js.Object {
  var ALERT: alert
  var BADGE: badge
  var SOUND: sound
}

object AnonALERT {
  @scala.inline
  def apply(ALERT: alert, BADGE: badge, SOUND: sound): AnonALERT = {
    val __obj = js.Dynamic.literal(ALERT = ALERT.asInstanceOf[js.Any], BADGE = BADGE.asInstanceOf[js.Any], SOUND = SOUND.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonALERT]
  }
}

