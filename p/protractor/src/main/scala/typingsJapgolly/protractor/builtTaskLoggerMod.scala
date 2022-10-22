package typingsJapgolly.protractor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtTaskLoggerMod {
  
  @JSImport("protractor/built/taskLogger", "TaskLogger")
  @js.native
  open class TaskLogger protected () extends StObject {
    /**
      * Log output such that metadata are appended.
      * Calling log(data) will not flush to console until you call flush()
      *
      * @constructor
      * @param {object} task Task that is being reported.
      * @param {number} pid PID of process running the task.
      */
    def this(task: Any, pid: Double) = this()
    
    /* private */ var buffer: Any = js.native
    
    /**
      * Flushes the buffer to stdout.
      */
    def flush(): Unit = js.native
    
    /* private */ var insertTag: Any = js.native
    
    /**
      * Log the data in the argument such that metadata are appended.
      * The data will be saved to a buffer until flush() is called.
      *
      * @param {string} data
      */
    def log(data: String): Unit = js.native
    
    /**
      * Log the header for the current task including information such as
      * PID, browser name/version, task Id, specs being run.
      *
      * @private
      */
    /* private */ def logHeader_(): Any = js.native
    
    /**
      * Prints the contents of the buffer without clearing it.
      */
    def peek(): Unit = js.native
    
    /* private */ var pid: Any = js.native
    
    /* private */ var task: Any = js.native
  }
}
