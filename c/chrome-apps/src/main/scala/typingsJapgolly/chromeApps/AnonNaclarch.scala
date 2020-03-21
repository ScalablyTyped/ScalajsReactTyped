package typingsJapgolly.chromeApps

import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-32`
import typingsJapgolly.chromeApps.chromeAppsStrings.`x86-64`
import typingsJapgolly.chromeApps.chromeAppsStrings.arm
import typingsJapgolly.chromeApps.chromeAppsStrings.mips
import typingsJapgolly.chromeApps.chromeAppsStrings.mips64
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNaclarch extends js.Object {
  var nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]]
  var sub_package_path: String
}

object AnonNaclarch {
  @scala.inline
  def apply(
    nacl_arch: ToStringLiteral[AnonARM, String, Exclude[String, mips64 | arm | `x86-64` | `x86-32` | mips]],
    sub_package_path: String
  ): AnonNaclarch = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNaclarch]
  }
}

