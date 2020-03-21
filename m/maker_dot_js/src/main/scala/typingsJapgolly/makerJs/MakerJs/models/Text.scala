package typingsJapgolly.makerJs.MakerJs.models

import typingsJapgolly.makerJs.MakerJs.IModel
import typingsJapgolly.makerJs.MakerJs.IModelMap
import typingsJapgolly.opentypeJs.mod.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Text")
@js.native
class Text protected () extends IModel {
  def this(font: Font, text: String, fontSize: Double) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean) = this()
  def this(font: Font, text: String, fontSize: Double, combine: Boolean, centerCharacterOrigin: Boolean) = this()
  def this(
    font: Font,
    text: String,
    fontSize: Double,
    combine: Boolean,
    centerCharacterOrigin: Boolean,
    bezierAccuracy: Double
  ) = this()
  @JSName("models")
  var models_Text: IModelMap = js.native
}

