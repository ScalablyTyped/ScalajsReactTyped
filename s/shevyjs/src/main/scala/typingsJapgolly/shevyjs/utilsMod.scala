package typingsJapgolly.shevyjs

import typingsJapgolly.shevyjs.mod.default
import typingsJapgolly.shevyjs.shevyjsStrings.augmentedFourth
import typingsJapgolly.shevyjs.shevyjsStrings.majorSecond
import typingsJapgolly.shevyjs.shevyjsStrings.majorThird
import typingsJapgolly.shevyjs.shevyjsStrings.minorThird
import typingsJapgolly.shevyjs.shevyjsStrings.perfectFourth
import typingsJapgolly.shevyjs.typesMod.Factor
import typingsJapgolly.shevyjs.typesMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shevyjs/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def calcHeadingFontSize(thisArg: default, factor: Factor): String = js.native
  def calcHeadingLineHeight(thisArg: default, factor: Factor): Double = js.native
  def calcHeadingMarginBottom(thisArg: default, factor: Factor): js.UndefOr[String] = js.native
  def calcHeadingMarginBottom(thisArg: default, factor: Factor, addMarginBottom: Boolean): js.UndefOr[String] = js.native
  def getFontScale(fontScale: majorSecond | minorThird | majorThird | perfectFourth | augmentedFourth): js.Array[Double] = js.native
  def getFontScale(fontScale: Scale): js.Array[Double] = js.native
  def getFontUnit(size: String): String = js.native
  def getFontValue(size: String): Double = js.native
  def trimArrayToMaxOf6[T](array: js.Array[T]): js.Array[T] = js.native
}

