package typingsJapgolly.three.fogMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.three.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFog extends js.Object {
  var color: Color
  var name: String
  def toJSON(): js.Any
}

object IFog {
  @scala.inline
  def apply(color: Color, name: String, toJSON: CallbackTo[js.Any]): IFog = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[IFog]
  }
}

