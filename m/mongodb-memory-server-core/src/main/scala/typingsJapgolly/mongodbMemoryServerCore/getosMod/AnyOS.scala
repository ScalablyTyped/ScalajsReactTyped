package typingsJapgolly.mongodbMemoryServerCore.getosMod

import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodbMemoryServerCore.getosMod.OtherOS
  - typingsJapgolly.mongodbMemoryServerCore.getosMod.LinuxOS
*/
trait AnyOS extends js.Object

object AnyOS {
  @scala.inline
  def OtherOS(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): AnyOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnyOS]
  }
  @scala.inline
  def LinuxOS(dist: String, os: linux, release: String, codename: String = null): AnyOS = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOS]
  }
}

