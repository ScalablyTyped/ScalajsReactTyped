package typingsJapgolly.protonNative

import typingsJapgolly.protonNative.protonNativeStrings.auxiliary
import typingsJapgolly.protonNative.protonNativeStrings.bold
import typingsJapgolly.protonNative.protonNativeStrings.book
import typingsJapgolly.protonNative.protonNativeStrings.center
import typingsJapgolly.protonNative.protonNativeStrings.condensed
import typingsJapgolly.protonNative.protonNativeStrings.double
import typingsJapgolly.protonNative.protonNativeStrings.expanded
import typingsJapgolly.protonNative.protonNativeStrings.extraCondensed
import typingsJapgolly.protonNative.protonNativeStrings.extraExpanded
import typingsJapgolly.protonNative.protonNativeStrings.grammar
import typingsJapgolly.protonNative.protonNativeStrings.heavy
import typingsJapgolly.protonNative.protonNativeStrings.italic
import typingsJapgolly.protonNative.protonNativeStrings.left
import typingsJapgolly.protonNative.protonNativeStrings.light
import typingsJapgolly.protonNative.protonNativeStrings.maximum
import typingsJapgolly.protonNative.protonNativeStrings.medium
import typingsJapgolly.protonNative.protonNativeStrings.minimum
import typingsJapgolly.protonNative.protonNativeStrings.none
import typingsJapgolly.protonNative.protonNativeStrings.normal
import typingsJapgolly.protonNative.protonNativeStrings.oblique
import typingsJapgolly.protonNative.protonNativeStrings.right
import typingsJapgolly.protonNative.protonNativeStrings.semiBold
import typingsJapgolly.protonNative.protonNativeStrings.semiCondensed
import typingsJapgolly.protonNative.protonNativeStrings.semiExpanded
import typingsJapgolly.protonNative.protonNativeStrings.single
import typingsJapgolly.protonNative.protonNativeStrings.spelling
import typingsJapgolly.protonNative.protonNativeStrings.suggestion
import typingsJapgolly.protonNative.protonNativeStrings.thin
import typingsJapgolly.protonNative.protonNativeStrings.ultraBold
import typingsJapgolly.protonNative.protonNativeStrings.ultraCondensed
import typingsJapgolly.protonNative.protonNativeStrings.ultraExpanded
import typingsJapgolly.protonNative.protonNativeStrings.ultraHeavy
import typingsJapgolly.protonNative.protonNativeStrings.ultraLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  /**
    * The background color, specified as a CSS color string.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The text color, specified as a CSS color string.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * The font family (only if available on the system).
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The font size (in pt).
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Whether an italic font should be used.
    */
  var fontStyle: js.UndefOr[normal | oblique | italic] = js.undefined
  /**
    * Whether a bold font should be used (and the amount).
    */
  var fontWeight: js.UndefOr[
    minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
  ] = js.undefined
  /**
    * Wheter the text should be aligned to the left, center or right.
    *
    * **Works only on a top level text component, not it's children!**
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
  /**
    * How wide or narrow the characters should be.
    */
  var textStretch: js.UndefOr[
    ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
  ] = js.undefined
  /**
    * The text underline style.
    */
  var textUnderline: js.UndefOr[none | single | double | suggestion] = js.undefined
  /**
    * The text underline color.
    *
    * A color string | 'spelling' | 'grammar' | 'auxiliary'
    */
  var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | oblique | italic = null,
    fontWeight: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double = null,
    textAlign: left | center | right = null,
    textStretch: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded = null,
    textUnderline: none | single | double | suggestion = null,
    textUnderlineColor: spelling | grammar | auxiliary | String = null
  ): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textStretch != null) __obj.updateDynamic("textStretch")(textStretch.asInstanceOf[js.Any])
    if (textUnderline != null) __obj.updateDynamic("textUnderline")(textUnderline.asInstanceOf[js.Any])
    if (textUnderlineColor != null) __obj.updateDynamic("textUnderlineColor")(textUnderlineColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

