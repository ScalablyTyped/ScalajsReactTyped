package typingsJapgolly.splunkBunyanLogger

import typingsJapgolly.bunyan.mod.Stream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.splunkLogging.mod.Config
import typingsJapgolly.splunkLogging.mod.EventFormatter
import typingsJapgolly.splunkLogging.mod.Logger
import typingsJapgolly.splunkLogging.mod.SendContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("splunk-bunyan-logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(config: Config): SplunkBunyanStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(config.asInstanceOf[js.Any]).asInstanceOf[SplunkBunyanStream]
  
  @js.native
  trait SplunkBunyanStream
    extends StObject
       with Stream {
    
    def flush(): Unit = js.native
    def flush(callback: js.Function3[/* error */ js.Error, /* req */ Any, /* res */ Any, Unit]): Unit = js.native
    
    def on(event: String, callback: js.Function2[/* err */ js.Error, /* context */ SendContext, Unit]): Unit = js.native
    
    def setEventFormatter(eventFormatter: EventFormatter): Unit = js.native
    
    @JSName("stream")
    var stream_SplunkBunyanStream: SplunkStream = js.native
  }
  
  @js.native
  trait SplunkStream
    extends StObject
       with WritableStream {
    
    var logger: Logger = js.native
  }
}
