package typingsJapgolly.ionicCliFramework.libMod

import typingsJapgolly.ionicCliFramework.loggerMod.Logger
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerHandler
import typingsJapgolly.ionicCliFramework.loggerMod.LoggerOptions
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
class Logger_ () extends Logger {
  def this(hasLevelHandlers: LoggerOptions) = this()
}

/* static members */
@JSImport("@ionic/cli-framework/lib", "Logger")
@js.native
object Logger_ extends js.Object {
  def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
}

