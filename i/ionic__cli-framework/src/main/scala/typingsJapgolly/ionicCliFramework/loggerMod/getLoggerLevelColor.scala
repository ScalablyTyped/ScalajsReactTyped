package typingsJapgolly.ionicCliFramework.loggerMod

import typingsJapgolly.ionicCliFramework.colorsMod.ColorFunction
import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/logger", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}

