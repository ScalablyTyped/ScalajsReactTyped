package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import typingsJapgolly.angular.JQuery
import typingsJapgolly.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThemingService extends js.Object {
  var PALETTES: IConfiguredColorPalette = js.native
   // get only
  var THEMES: IConfiguredThemes = js.native
   // get only
  def apply(element: JQuery): Unit = js.native
  def defaultTheme(): String = js.native
  def defineTheme(name: String, options: IDefineThemeOptions): IPromise[String] = js.native
  def generateTheme(name: String): Unit = js.native
  def registered(themeName: String): Boolean = js.native
  def setBrowserColor(options: IBrowserColors): js.Function0[Unit] = js.native
}

