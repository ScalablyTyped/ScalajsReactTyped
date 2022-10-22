package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonJshandleMod.JSHandle
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.clear_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonConsoleMessageMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/ConsoleMessage", "ConsoleMessage")
  @js.native
  open class ConsoleMessage protected () extends StObject {
    /**
      * @public
      */
    def this(
      `type`: ConsoleMessageType,
      text: String,
      args: js.Array[JSHandle[Any]],
      stackTraceLocations: js.Array[ConsoleMessageLocation]
    ) = this()
    
    /**
      * @returns An array of arguments passed to the console.
      */
    def args(): js.Array[JSHandle[Any]] = js.native
    
    /**
      * @returns The location of the console message.
      */
    def location(): ConsoleMessageLocation = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns The array of locations on the stack of the console message.
      */
    def stackTrace(): js.Array[ConsoleMessageLocation] = js.native
    
    /**
      * @returns The text of the console message.
      */
    def text(): String = js.native
    
    /**
      * @returns The type of the console message.
      */
    def `type`(): ConsoleMessageType = js.native
  }
  
  trait ConsoleMessageLocation extends StObject {
    
    /**
      * 0-based column number in the resource if known or `undefined` otherwise.
      */
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * 0-based line number in the resource if known or `undefined` otherwise.
      */
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of the resource if known or `undefined` otherwise.
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ConsoleMessageLocation {
    
    inline def apply(): ConsoleMessageLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsoleMessageLocation]
    }
    
    extension [Self <: ConsoleMessageLocation](x: Self) {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.log
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.debug
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.info
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.error
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.warning
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dir
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dirxml
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.table
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.trace
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.clear_
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroup
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.endGroup
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.assert
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profile
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profileEnd
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.count
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.timeEnd
    - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.verbose
  */
  trait ConsoleMessageType extends StObject
  object ConsoleMessageType {
    
    inline def assert: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.assert = "assert".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.assert]
    
    inline def clear: clear_ = "clear".asInstanceOf[clear_]
    
    inline def count: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.count = "count".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.count]
    
    inline def debug: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.debug = "debug".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.debug]
    
    inline def dir: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dir = "dir".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dir]
    
    inline def dirxml: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dirxml = "dirxml".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.dirxml]
    
    inline def endGroup: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.endGroup = "endGroup".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.endGroup]
    
    inline def error: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.error = "error".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.error]
    
    inline def info: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.info = "info".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.info]
    
    inline def log: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.log = "log".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.log]
    
    inline def profile: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profile = "profile".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profile]
    
    inline def profileEnd: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profileEnd = "profileEnd".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.profileEnd]
    
    inline def startGroup: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroup = "startGroup".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroup]
    
    inline def startGroupCollapsed: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed = "startGroupCollapsed".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.startGroupCollapsed]
    
    inline def table: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.table = "table".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.table]
    
    inline def timeEnd: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.timeEnd = "timeEnd".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.timeEnd]
    
    inline def trace: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.trace = "trace".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.trace]
    
    inline def verbose: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.verbose = "verbose".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.verbose]
    
    inline def warning: typingsJapgolly.puppeteerCore.puppeteerCoreStrings.warning = "warning".asInstanceOf[typingsJapgolly.puppeteerCore.puppeteerCoreStrings.warning]
  }
}
