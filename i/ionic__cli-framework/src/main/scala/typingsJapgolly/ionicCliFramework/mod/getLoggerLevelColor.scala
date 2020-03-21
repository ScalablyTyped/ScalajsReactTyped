package typingsJapgolly.ionicCliFramework.mod

import typingsJapgolly.ionicCliFramework.colorsMod.ColorFunction
import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerLevelWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}

