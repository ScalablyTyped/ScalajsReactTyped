package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_off
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powered_on
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_off
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.powering_on
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.resetting
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unauthorized
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPOWEREDOFF extends js.Object {
  var POWERED_OFF: powered_off
  var POWERED_ON: powered_on
  // Android only
  var POWERING_OFF: powering_off
  var POWERING_ON: powering_on
  // iOS only
  var RESETTING: resetting
  var UNAUTHORIZED: unauthorized
  // Both iOS and Android
  var UNKNOWN: unknown
  var UNSUPPORTED: unsupported
}

object AnonPOWEREDOFF {
  @scala.inline
  def apply(
    POWERED_OFF: powered_off,
    POWERED_ON: powered_on,
    POWERING_OFF: powering_off,
    POWERING_ON: powering_on,
    RESETTING: resetting,
    UNAUTHORIZED: unauthorized,
    UNKNOWN: unknown,
    UNSUPPORTED: unsupported
  ): AnonPOWEREDOFF = {
    val __obj = js.Dynamic.literal(POWERED_OFF = POWERED_OFF.asInstanceOf[js.Any], POWERED_ON = POWERED_ON.asInstanceOf[js.Any], POWERING_OFF = POWERING_OFF.asInstanceOf[js.Any], POWERING_ON = POWERING_ON.asInstanceOf[js.Any], RESETTING = RESETTING.asInstanceOf[js.Any], UNAUTHORIZED = UNAUTHORIZED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], UNSUPPORTED = UNSUPPORTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPOWEREDOFF]
  }
}

