package typingsJapgolly.winrt.Windows.UI.Text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextCharacterFormat extends js.Object {
  var allCaps: FormatEffect
  var backgroundColor: Color
  var bold: FormatEffect
  var fontStretch: FontStretch
  var fontStyle: FontStyle
  var foregroundColor: Color
  var hidden: FormatEffect
  var italic: FormatEffect
  var kerning: Double
  var languageTag: String
  var linkType: LinkType
  var name: String
  var outline: FormatEffect
  var position: Double
  var protectedText: FormatEffect
  var size: Double
  var smallCaps: FormatEffect
  var spacing: Double
  var strikethrough: FormatEffect
  var subscript: FormatEffect
  var superscript: FormatEffect
  var textScript: TextScript
  var underline: UnderlineType
  var weight: Double
  def getClone(): ITextCharacterFormat
  def isEqual(format: ITextCharacterFormat): Boolean
  def setClone(value: ITextCharacterFormat): Unit
}

object ITextCharacterFormat {
  @scala.inline
  def apply(
    allCaps: FormatEffect,
    backgroundColor: Color,
    bold: FormatEffect,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    foregroundColor: Color,
    getClone: CallbackTo[ITextCharacterFormat],
    hidden: FormatEffect,
    isEqual: ITextCharacterFormat => CallbackTo[Boolean],
    italic: FormatEffect,
    kerning: Double,
    languageTag: String,
    linkType: LinkType,
    name: String,
    outline: FormatEffect,
    position: Double,
    protectedText: FormatEffect,
    setClone: ITextCharacterFormat => Callback,
    size: Double,
    smallCaps: FormatEffect,
    spacing: Double,
    strikethrough: FormatEffect,
    subscript: FormatEffect,
    superscript: FormatEffect,
    textScript: TextScript,
    underline: UnderlineType,
    weight: Double
  ): ITextCharacterFormat = {
    val __obj = js.Dynamic.literal(allCaps = allCaps.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], protectedText = protectedText.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smallCaps = smallCaps.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], subscript = subscript.asInstanceOf[js.Any], superscript = superscript.asInstanceOf[js.Any], textScript = textScript.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("getClone")(getClone.toJsFn)
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextCharacterFormat) => isEqual(t0).runNow()))
    __obj.updateDynamic("setClone")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Text.ITextCharacterFormat) => setClone(t0).runNow()))
    __obj.asInstanceOf[ITextCharacterFormat]
  }
}

