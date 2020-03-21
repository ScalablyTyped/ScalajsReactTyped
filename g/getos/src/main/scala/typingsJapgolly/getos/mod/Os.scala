package typingsJapgolly.getos.mod

import typingsJapgolly.getos.getosStrings.aix
import typingsJapgolly.getos.getosStrings.android
import typingsJapgolly.getos.getosStrings.cygwin
import typingsJapgolly.getos.getosStrings.darwin
import typingsJapgolly.getos.getosStrings.freebsd
import typingsJapgolly.getos.getosStrings.linux
import typingsJapgolly.getos.getosStrings.openbsd
import typingsJapgolly.getos.getosStrings.sunos
import typingsJapgolly.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.getos.mod.OtherOs
  - typingsJapgolly.getos.mod.LinuxOs
*/
trait Os extends js.Object

object Os {
  @scala.inline
  def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Os]
  }
  @scala.inline
  def LinuxOs(dist: String, os: linux, release: String, codename: String = null): Os = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
}

