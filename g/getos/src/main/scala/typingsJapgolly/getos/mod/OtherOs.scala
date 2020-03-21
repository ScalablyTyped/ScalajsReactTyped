package typingsJapgolly.getos.mod

import typingsJapgolly.getos.getosStrings.aix
import typingsJapgolly.getos.getosStrings.android
import typingsJapgolly.getos.getosStrings.cygwin
import typingsJapgolly.getos.getosStrings.darwin
import typingsJapgolly.getos.getosStrings.freebsd
import typingsJapgolly.getos.getosStrings.openbsd
import typingsJapgolly.getos.getosStrings.sunos
import typingsJapgolly.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherOs extends Os {
  var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin
}

object OtherOs {
  @scala.inline
  def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OtherOs]
  }
}

