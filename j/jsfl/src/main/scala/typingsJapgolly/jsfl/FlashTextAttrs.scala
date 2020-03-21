package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashTextAttrs extends FlashText {
  var aliasText: Boolean
  var alignment: String
  var autoKern: Boolean
  var bold: Boolean
  var characterPosition: String
  var characterSpacing: Double
  var face: String
  var fillColor: js.Any
  var indent: Double
  var italic: Boolean
  var leftMargin: Double
  var letterSpacing: Double
  var lineSpacing: Double
  var rightMargin: Double
  var rotation: Boolean
  var size: Double
  var target: String
  var url: String
}

object FlashTextAttrs {
  @scala.inline
  def apply(
    accName: String,
    aliasText: Boolean,
    alignment: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    autoKern: Boolean,
    bold: Boolean,
    border: Boolean,
    characterPosition: String,
    characterSpacing: Double,
    description: String,
    embeddedCharacters: String,
    face: String,
    fillColor: js.Any,
    getTextAttr: CallbackTo[js.Any],
    getTextString: CallbackTo[js.Any],
    indent: Double,
    italic: Boolean,
    leftMargin: Double,
    letterSpacing: Double,
    lineSpacing: Double,
    rightMargin: Double,
    rotation: Boolean,
    setTextAttr: CallbackTo[js.Any],
    setTextString: CallbackTo[js.Any],
    size: Double,
    target: String,
    url: String
  ): FlashTextAttrs = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], aliasText = aliasText.asInstanceOf[js.Any], alignment = alignment.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], autoKern = autoKern.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], characterPosition = characterPosition.asInstanceOf[js.Any], characterSpacing = characterSpacing.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], leftMargin = leftMargin.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], rightMargin = rightMargin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("getTextAttr")(getTextAttr.toJsFn)
    __obj.updateDynamic("getTextString")(getTextString.toJsFn)
    __obj.updateDynamic("setTextAttr")(setTextAttr.toJsFn)
    __obj.updateDynamic("setTextString")(setTextString.toJsFn)
    __obj.asInstanceOf[FlashTextAttrs]
  }
}

