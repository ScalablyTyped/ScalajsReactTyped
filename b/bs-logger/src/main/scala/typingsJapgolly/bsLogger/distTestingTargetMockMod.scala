package typingsJapgolly.bsLogger

import typingsJapgolly.bsLogger.distLoggerMessageMod.LogMessage
import typingsJapgolly.bsLogger.distLoggerMessageMod.LogMessageFormatter
import typingsJapgolly.bsLogger.distLoggerTargetMod.LogTarget
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestingTargetMockMod {
  
  @JSImport("bs-logger/dist/testing/target-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bs-logger/dist/testing/target-mock", "LogTargetMock")
  @js.native
  open class LogTargetMock ()
    extends StObject
       with LogTarget {
    def this(minLevel: Double) = this()
    
    def clear(): Unit = js.native
    
    def filteredLines(level: Double): ExtendedArray[String] = js.native
    def filteredLines(level: Double, untilLevel: Double): ExtendedArray[String] = js.native
    def filteredLines(level: Null): ExtendedArray[String] = js.native
    
    def filteredMessages(level: Double): ExtendedArray[LogMessage] = js.native
    def filteredMessages(level: Double, untilLevel: Double): ExtendedArray[LogMessage] = js.native
    def filteredMessages(level: Null): ExtendedArray[LogMessage] = js.native
    
    /* CompleteClass */
    override def format(msg: LogMessage): String = js.native
    /* CompleteClass */
    @JSName("format")
    var format_Original: LogMessageFormatter = js.native
    
    val lines: ExtendedArray[String] & LogLevelMap[ExtendedArray[String]] = js.native
    
    val messages: ExtendedArray[LogMessage] & LogLevelMap[ExtendedArray[LogMessage]] = js.native
    
    /* CompleteClass */
    var minLevel: Double = js.native
    
    /* CompleteClass */
    var stream: Writable = js.native
  }
  
  inline def extendArray[T](array: js.Array[T]): ExtendedArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendArray")(array.asInstanceOf[js.Any]).asInstanceOf[ExtendedArray[T]]
  
  @js.native
  trait ExtendedArray[T]
    extends StObject
       with Array[T] {
    
    val last: js.UndefOr[T] = js.native
  }
  
  trait LogLevelMap[T] extends StObject {
    
    var debug: T
    
    var error: T
    
    var fatal: T
    
    var info: T
    
    var trace: T
    
    var warn: T
  }
  object LogLevelMap {
    
    inline def apply[T](debug: T, error: T, fatal: T, info: T, trace: T, warn: T): LogLevelMap[T] = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogLevelMap[T]]
    }
    
    extension [Self <: LogLevelMap[?], T](x: Self & LogLevelMap[T]) {
      
      inline def setDebug(value: T): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: T): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: T): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: T): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: T): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: T): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
