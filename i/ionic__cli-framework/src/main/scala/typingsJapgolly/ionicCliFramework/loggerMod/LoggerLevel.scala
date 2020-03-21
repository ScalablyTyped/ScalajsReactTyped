package typingsJapgolly.ionicCliFramework.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.DEBUG
  - typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.INFO
  - typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.WARN
  - typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.ERROR
*/
trait LoggerLevel extends js.Object

object LoggerLevel {
  @scala.inline
  def DEBUG: typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.DEBUG = this.cast("DEBUG")
  @scala.inline
  def ERROR: typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def INFO: typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.INFO = this.cast("INFO")
  @scala.inline
  def WARN: typingsJapgolly.ionicCliFramework.ionicCliFrameworkStrings.WARN = this.cast("WARN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

