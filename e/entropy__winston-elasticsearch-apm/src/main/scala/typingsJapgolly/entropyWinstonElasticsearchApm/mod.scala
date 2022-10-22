package typingsJapgolly.entropyWinstonElasticsearchApm

import typingsJapgolly.elasticApmNode.mod.Agent
import typingsJapgolly.winstonTransport.mod.TransportStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@entropy/winston-elasticsearch-apm", JSImport.Namespace)
  @js.native
  open class ^ protected () extends ElasticsearchApm {
    def this(opts: ElasticsearchApmOptions) = this()
  }
  
  @js.native
  trait ElasticsearchApm
    extends typingsJapgolly.winstonTransport.mod.^ {
    
    @JSName("log")
    def log_MElasticsearchApm(info: Any, next: js.Function0[Unit]): Any = js.native
  }
  
  trait ElasticsearchApmOptions
    extends StObject
       with TransportStreamOptions {
    
    var apm: Agent
  }
  object ElasticsearchApmOptions {
    
    inline def apply(apm: Agent): ElasticsearchApmOptions = {
      val __obj = js.Dynamic.literal(apm = apm.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElasticsearchApmOptions]
    }
    
    extension [Self <: ElasticsearchApmOptions](x: Self) {
      
      inline def setApm(value: Agent): Self = StObject.set(x, "apm", value.asInstanceOf[js.Any])
    }
  }
}
