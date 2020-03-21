package typingsJapgolly.protractor

import typingsJapgolly.protractor.loggerMod.Logger
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/exitCodes", JSImport.Namespace)
@js.native
object exitCodesMod extends js.Object {
  @js.native
  class BrowserError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
  }
  
  @js.native
  class ConfigError protected () extends ProtractorError {
    def this(logger: Logger, message: String) = this()
    def this(logger: Logger, message: String, error: js.Error) = this()
  }
  
  @js.native
  class ErrorHandler () extends js.Object
  
  @js.native
  class IError () extends Error {
    var code: js.UndefOr[Double] = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class ProtractorError protected () extends IError {
    def this(logger: Logger, message: String, code: Double) = this()
    def this(logger: Logger, message: String, code: Double, error: js.Error) = this()
  }
  
  /* static members */
  @js.native
  object BrowserError extends js.Object {
    var CODE: Double = js.native
    var ERR_MSGS: js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object ConfigError extends js.Object {
    var CODE: Double = js.native
  }
  
  /* static members */
  @js.native
  object ErrorHandler extends js.Object {
    def isError(errMsgs: js.Array[String], e: js.Error): Boolean = js.native
    def parseError(e: js.Error): Double = js.native
  }
  
  /* static members */
  @js.native
  object ProtractorError extends js.Object {
    var CODE: Double = js.native
    var ERR_MSGS: js.Array[String] = js.native
    var SUPRESS_EXIT_CODE: Boolean = js.native
    def log(logger: Logger, code: Double, message: String, stack: String): Unit = js.native
  }
  
}

