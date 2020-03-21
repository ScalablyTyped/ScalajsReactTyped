package typingsJapgolly.mongodbMemoryServerCore.getosMod

import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOS extends AnyOS {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String
}

object OtherOS {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOS]
  }
}

