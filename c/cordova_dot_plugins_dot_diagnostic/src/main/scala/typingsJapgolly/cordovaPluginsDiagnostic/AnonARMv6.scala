package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonARMv6 extends js.Object {
  var ARMv6: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv6
  var ARMv7: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv7
  var ARMv8: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ARMv8
  // Android only
  var MIPS: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS
  var MIPS_64: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.MIPS_64
  // Both iOS and Android
  var UNKNOWN: unknown
  var X86: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86
  var X86_64: typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.X86_64
}

object AnonARMv6 {
  @scala.inline
  def apply(
    ARMv6: ARMv6,
    ARMv7: ARMv7,
    ARMv8: ARMv8,
    MIPS: MIPS,
    MIPS_64: MIPS_64,
    UNKNOWN: unknown,
    X86: X86,
    X86_64: X86_64
  ): AnonARMv6 = {
    val __obj = js.Dynamic.literal(ARMv6 = ARMv6.asInstanceOf[js.Any], ARMv7 = ARMv7.asInstanceOf[js.Any], ARMv8 = ARMv8.asInstanceOf[js.Any], MIPS = MIPS.asInstanceOf[js.Any], MIPS_64 = MIPS_64.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], X86 = X86.asInstanceOf[js.Any], X86_64 = X86_64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonARMv6]
  }
}

