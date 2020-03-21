package typingsJapgolly.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BorderProperty
import typingsJapgolly.csstype.mod.BorderRadiusProperty
import typingsJapgolly.csstype.mod.BorderWidthProperty
import typingsJapgolly.csstype.mod.BoxShadowProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.csstype.mod.FontFamilyProperty
import typingsJapgolly.csstype.mod.FontSizeProperty
import typingsJapgolly.csstype.mod.FontWeightProperty
import typingsJapgolly.csstype.mod.HeightProperty
import typingsJapgolly.csstype.mod.LetterSpacingProperty
import typingsJapgolly.csstype.mod.LineHeightProperty
import typingsJapgolly.csstype.mod.MarginProperty
import typingsJapgolly.csstype.mod.StandardProperties
import typingsJapgolly.csstype.mod.WidthProperty
import typingsJapgolly.csstype.mod.ZIndexProperty
import typingsJapgolly.styledSystem.styledSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>> */
trait RequiredTheme extends js.Object {
  var borderStyles: ObjectOrArray[BorderProperty[js.Object], String]
  var borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], String]
  var borders: ObjectOrArray[BorderProperty[js.Object], String]
  var breakpoints: ObjectOrArray[Double | String | js.Symbol, String]
  var buttons: ObjectOrArray[StandardProperties[String | `0`], String]
  var colorStyles: ObjectOrArray[StandardProperties[String | `0`], String]
  var colors: ObjectOrArray[ColorProperty, String]
  var fontSizes: ObjectOrArray[FontSizeProperty[Double], String]
  var fontWeights: ObjectOrArray[FontWeightProperty, String]
  var fonts: ObjectOrArray[FontFamilyProperty, String]
  var letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], String]
  var lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], String]
  var mediaQueries: StringDictionary[String]
  var radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], String]
  var shadows: ObjectOrArray[BoxShadowProperty, String]
  var sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String]
  var space: ObjectOrArray[MarginProperty[Double | String], String]
  var textStyles: ObjectOrArray[StandardProperties[String | `0`], String]
  var zIndices: ObjectOrArray[ZIndexProperty, String]
}

object RequiredTheme {
  @scala.inline
  def apply(
    borderStyles: ObjectOrArray[BorderProperty[js.Object], String],
    borderWidths: ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], String],
    borders: ObjectOrArray[BorderProperty[js.Object], String],
    breakpoints: ObjectOrArray[Double | String | js.Symbol, String],
    buttons: ObjectOrArray[StandardProperties[String | `0`], String],
    colorStyles: ObjectOrArray[StandardProperties[String | `0`], String],
    colors: ObjectOrArray[ColorProperty, String],
    fontSizes: ObjectOrArray[FontSizeProperty[Double], String],
    fontWeights: ObjectOrArray[FontWeightProperty, String],
    fonts: ObjectOrArray[FontFamilyProperty, String],
    letterSpacings: ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], String],
    lineHeights: ObjectOrArray[LineHeightProperty[TLengthStyledSystem], String],
    mediaQueries: StringDictionary[String],
    radii: ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], String],
    shadows: ObjectOrArray[BoxShadowProperty, String],
    sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String],
    space: ObjectOrArray[MarginProperty[Double | String], String],
    textStyles: ObjectOrArray[StandardProperties[String | `0`], String],
    zIndices: ObjectOrArray[ZIndexProperty, String]
  ): RequiredTheme = {
    val __obj = js.Dynamic.literal(borderStyles = borderStyles.asInstanceOf[js.Any], borderWidths = borderWidths.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], colorStyles = colorStyles.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], fontWeights = fontWeights.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], letterSpacings = letterSpacings.asInstanceOf[js.Any], lineHeights = lineHeights.asInstanceOf[js.Any], mediaQueries = mediaQueries.asInstanceOf[js.Any], radii = radii.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any], zIndices = zIndices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequiredTheme]
  }
}

