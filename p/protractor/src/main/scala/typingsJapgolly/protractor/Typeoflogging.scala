package typingsJapgolly.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.seleniumWebdriver.loggingMod.IType
import typingsJapgolly.seleniumWebdriver.loggingMod.Level
import typingsJapgolly.seleniumWebdriver.loggingMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflogging extends js.Object {
  var Entry: Instantiable2[
    /* level */ Level, 
    /* message */ String, 
    typingsJapgolly.seleniumWebdriver.mod.logging.Entry
  ] = js.native
  var Level: TypeofLevel = js.native
  var LogManager: Instantiable0[typingsJapgolly.seleniumWebdriver.mod.logging.LogManager] = js.native
  var Logger: Instantiable1[/* name */ String, typingsJapgolly.seleniumWebdriver.mod.logging.Logger] = js.native
  var Preferences: Instantiable0[typingsJapgolly.seleniumWebdriver.mod.logging.Preferences] = js.native
  val Type: IType = js.native
  def addConsoleHandler(): Unit = js.native
  def addConsoleHandler(opt_logger: Logger): Unit = js.native
  def getLevel(nameOrValue: String): Level = js.native
  def getLevel(nameOrValue: Double): Level = js.native
  def getLogger(): Logger = js.native
  def getLogger(name: String): Logger = js.native
  def installConsoleHandler(): Unit = js.native
  def removeConsoleHandler(): Unit = js.native
  def removeConsoleHandler(opt_logger: Logger): Unit = js.native
}

