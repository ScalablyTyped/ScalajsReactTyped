package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashText extends js.Object {
  var accName: String
  var antiAliasSharpness: Double
  var antiAliasThickness: Double
  var autoExpand: Boolean
  var border: Boolean
  var description: String
  var embeddedCharacters: String
  def getTextAttr(): js.Any
  def getTextString(): js.Any
  def setTextAttr(): js.Any
  def setTextString(): js.Any
}

object FlashText {
  @scala.inline
  def apply(
    accName: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    border: Boolean,
    description: String,
    embeddedCharacters: String,
    getTextAttr: CallbackTo[js.Any],
    getTextString: CallbackTo[js.Any],
    setTextAttr: CallbackTo[js.Any],
    setTextString: CallbackTo[js.Any]
  ): FlashText = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any])
    __obj.updateDynamic("getTextAttr")(getTextAttr.toJsFn)
    __obj.updateDynamic("getTextString")(getTextString.toJsFn)
    __obj.updateDynamic("setTextAttr")(setTextAttr.toJsFn)
    __obj.updateDynamic("setTextString")(setTextString.toJsFn)
    __obj.asInstanceOf[FlashText]
  }
}

