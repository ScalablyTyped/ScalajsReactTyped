package typingsJapgolly.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.seleniumWebdriver.libLoggingMod.IType
import typingsJapgolly.seleniumWebdriver.libLoggingMod.Level
import typingsJapgolly.seleniumWebdriver.libLoggingMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoflogging extends StObject {
  
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
