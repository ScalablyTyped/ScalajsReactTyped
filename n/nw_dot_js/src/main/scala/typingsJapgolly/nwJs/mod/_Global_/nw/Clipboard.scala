package typingsJapgolly.nwJs.mod._Global_.nw

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.clip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clipboard extends js.Object {
  /**
    * Get the clipboard object.
    *
    * @returns {Clipboard} the clipboard object.
    */
  def get(): clip
}

@JSGlobal("nw.Clipboard")
@js.native
object Clipboard extends TopLevel[Clipboard]

