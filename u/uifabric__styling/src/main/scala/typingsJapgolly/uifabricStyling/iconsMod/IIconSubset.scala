package typingsJapgolly.uifabricStyling.iconsMod

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typingsJapgolly.uifabricMergeStyles.istyleMod.IRawStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconSubset extends js.Object {
  var fontFace: js.UndefOr[IFontFace] = js.undefined
  var icons: StringDictionary[String | Element]
  var style: js.UndefOr[IRawStyle] = js.undefined
}

object IIconSubset {
  @scala.inline
  def apply(icons: StringDictionary[String | Element], fontFace: IFontFace = null, style: IRawStyle = null): IIconSubset = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    if (fontFace != null) __obj.updateDynamic("fontFace")(fontFace.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubset]
  }
}

