package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  def group(config: js.Any): Unit = js.native
  def group(config: js.Any, target: String): Unit = js.native
  def group(config: js.Any, target: Double): Unit = js.native
  def ungroup(mode: Boolean): Unit = js.native
}

@JSGlobal("webix.Group")
@js.native
object Group extends TopLevel[Group]

