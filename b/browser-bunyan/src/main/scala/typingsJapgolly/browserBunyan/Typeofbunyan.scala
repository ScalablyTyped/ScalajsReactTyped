package typingsJapgolly.browserBunyan

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.bunyan.mod.LogLevel
import typingsJapgolly.bunyan.mod.Logger
import typingsJapgolly.bunyan.mod.LoggerOptions
import typingsJapgolly.bunyan.mod.RingBuffer
import typingsJapgolly.bunyan.mod.RingBufferOptions
import typingsJapgolly.bunyan.mod.RotatingFileStream
import typingsJapgolly.bunyan.mod.RotatingFileStreamOptions
import typingsJapgolly.bunyan.mod.StdSerializers_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbunyan extends js.Object {
  val DEBUG: Double
  val ERROR: Double
  val FATAL: Double
  val INFO: Double
  var RingBuffer: Instantiable1[/* options */ RingBufferOptions, typingsJapgolly.bunyan.mod.RingBuffer]
  var RotatingFileStream: Instantiable1[
    /* options */ RotatingFileStreamOptions, 
    typingsJapgolly.bunyan.mod.RotatingFileStream
  ]
  val TRACE: Double
  val WARN: Double
  val levelFromName: nameinLogLevelStringnumbe
  val nameFromLevel: NumberDictionary[String]
  val stdSerializers: StdSerializers_
  def createLogger(options: LoggerOptions): Logger
  def resolveLevel(value: LogLevel): Double
  def safeCycles(): js.Function2[/* key */ String, /* value */ js.Any, _]
}

object Typeofbunyan {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    FATAL: Double,
    INFO: Double,
    RingBuffer: Instantiable1[/* options */ RingBufferOptions, RingBuffer],
    RotatingFileStream: Instantiable1[/* options */ RotatingFileStreamOptions, RotatingFileStream],
    TRACE: Double,
    WARN: Double,
    createLogger: LoggerOptions => CallbackTo[Logger],
    levelFromName: nameinLogLevelStringnumbe,
    nameFromLevel: NumberDictionary[String],
    resolveLevel: LogLevel => CallbackTo[Double],
    safeCycles: CallbackTo[js.Function2[/* key */ String, /* value */ js.Any, js.Any]],
    stdSerializers: StdSerializers_
  ): Typeofbunyan = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], RingBuffer = RingBuffer.asInstanceOf[js.Any], RotatingFileStream = RotatingFileStream.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], levelFromName = levelFromName.asInstanceOf[js.Any], nameFromLevel = nameFromLevel.asInstanceOf[js.Any], stdSerializers = stdSerializers.asInstanceOf[js.Any])
    __obj.updateDynamic("createLogger")(js.Any.fromFunction1((t0: typingsJapgolly.bunyan.mod.LoggerOptions) => createLogger(t0).runNow()))
    __obj.updateDynamic("resolveLevel")(js.Any.fromFunction1((t0: typingsJapgolly.bunyan.mod.LogLevel) => resolveLevel(t0).runNow()))
    __obj.updateDynamic("safeCycles")(safeCycles.toJsFn)
    __obj.asInstanceOf[Typeofbunyan]
  }
}

