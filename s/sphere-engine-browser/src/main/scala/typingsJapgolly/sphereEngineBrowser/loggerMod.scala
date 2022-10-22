package typingsJapgolly.sphereEngineBrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  /**
    * Provides a means to log individual lines of text to a file, with associated timestamps for
    * each entry.
    */
  @JSImport("logger", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Logger {
    /**
      * Construct a `Logger` which writes to a specified file. If the file doesn't exist, it will
      * be created; otherwise, new entries will be appended to the existing file.
      * @param fileName SphereFS path of the log file.
      */
    def this(fileName: String) = this()
    
    /**
      * Begin a grouping of related log entries. Everything written between this and the
      * corresponding `endGroup` will be indented under the grouping's header.
      * @param title Name of the grouping to start.
      */
    /* CompleteClass */
    override def beginGroup(title: String): Unit = js.native
    
    /**
      * Close the most recently opened group of log entries.
      */
    /* CompleteClass */
    override def endGroup(): Unit = js.native
    
    /**
      * Write a timestamped log entry to this log file.
      * @param text The text of the log entry.
      */
    /* CompleteClass */
    override def write(text: String): Unit = js.native
  }
  
  /**
    * Provides a means to log individual lines of text to a file, with associated timestamps for
    * each entry.
    */
  trait Logger extends StObject {
    
    /**
      * Begin a grouping of related log entries. Everything written between this and the
      * corresponding `endGroup` will be indented under the grouping's header.
      * @param title Name of the grouping to start.
      */
    def beginGroup(title: String): Unit
    
    /**
      * Close the most recently opened group of log entries.
      */
    def endGroup(): Unit
    
    /**
      * Write a timestamped log entry to this log file.
      * @param text The text of the log entry.
      */
    def write(text: String): Unit
  }
  object Logger {
    
    inline def apply(beginGroup: String => Callback, endGroup: Callback, write: String => Callback): Logger = {
      val __obj = js.Dynamic.literal(beginGroup = js.Any.fromFunction1((t0: String) => beginGroup(t0).runNow()), endGroup = endGroup.toJsFn, write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setBeginGroup(value: String => Callback): Self = StObject.set(x, "beginGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setEndGroup(value: Callback): Self = StObject.set(x, "endGroup", value.toJsFn)
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
