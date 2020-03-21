package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.authorized_when_in_use
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.denied_always_
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.not_determined
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.restricted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDENIEDALWAYS extends js.Object {
  var DENIED_ALWAYS: denied_always_ | typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ALWAYS
  // Android only
  var DENIED_ONCE: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.DENIED_ONCE
  // Both iOS and Android
  var GRANTED: authorized | typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GRANTED
  var GRANTED_WHEN_IN_USE: authorized_when_in_use
  var NOT_REQUESTED: not_determined | typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.NOT_REQUESTED
  // iOS only
  var RESTRICTED: restricted
}

object AnonDENIEDALWAYS {
  @scala.inline
  def apply(
    DENIED_ALWAYS: denied_always_ | DENIED_ALWAYS,
    DENIED_ONCE: DENIED_ONCE,
    GRANTED: authorized | GRANTED,
    GRANTED_WHEN_IN_USE: authorized_when_in_use,
    NOT_REQUESTED: not_determined | NOT_REQUESTED,
    RESTRICTED: restricted
  ): AnonDENIEDALWAYS = {
    val __obj = js.Dynamic.literal(DENIED_ALWAYS = DENIED_ALWAYS.asInstanceOf[js.Any], DENIED_ONCE = DENIED_ONCE.asInstanceOf[js.Any], GRANTED = GRANTED.asInstanceOf[js.Any], GRANTED_WHEN_IN_USE = GRANTED_WHEN_IN_USE.asInstanceOf[js.Any], NOT_REQUESTED = NOT_REQUESTED.asInstanceOf[js.Any], RESTRICTED = RESTRICTED.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDENIEDALWAYS]
  }
}

