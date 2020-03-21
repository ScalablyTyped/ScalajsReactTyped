package typingsJapgolly.jui.mod

import typingsJapgolly.jui.AnonAnimated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIProgress extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: AnonAnimated): this.type = js.native
  def getValue(): Double = js.native
  def setAnimated(isAnimated: Boolean): Unit = js.native
  def setStriped(isStriped: Boolean): Unit = js.native
  def setValue(v: Double): Unit = js.native
}

