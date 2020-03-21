package typingsJapgolly.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Text")
@js.native
class Text () extends DisplayObject {
  def this(text: String) = this()
  def this(text: String, font: String) = this()
  def this(text: String, font: String, color: String) = this()
  // properties
  var color: String = js.native
  var font: String = js.native
  var lineHeight: Double = js.native
  var lineWidth: Double = js.native
  var maxWidth: Double = js.native
  var outline: Double = js.native
  var text: String = js.native
  var textAlign: String = js.native
  var textBaseline: String = js.native
  def getMeasuredHeight(): Double = js.native
  def getMeasuredLineHeight(): Double = js.native
  def getMeasuredWidth(): Double = js.native
  def getMetrics(): js.Object = js.native
}

