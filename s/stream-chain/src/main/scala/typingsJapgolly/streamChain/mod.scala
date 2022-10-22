package typingsJapgolly.streamChain

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-chain", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Chain_ {
    def this(fns: js.Array[StreamItem]) = this()
    def this(fns: js.Array[StreamItem], options: ChainOptions) = this()
  }
  @JSImport("stream-chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain(fns: js.Array[StreamItem]): Chain_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(fns.asInstanceOf[js.Any]).asInstanceOf[Chain_]
  inline def chain(fns: js.Array[StreamItem], options: ChainOptions): Chain_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(fns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chain_]
  
  trait ChainOptions
    extends StObject
       with DuplexOptions {
    
    var skipEvents: js.UndefOr[Boolean] = js.undefined
  }
  object ChainOptions {
    
    inline def apply(): ChainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChainOptions]
    }
    
    extension [Self <: ChainOptions](x: Self) {
      
      inline def setSkipEvents(value: Boolean): Self = StObject.set(x, "skipEvents", value.asInstanceOf[js.Any])
      
      inline def setSkipEventsUndefined: Self = StObject.set(x, "skipEvents", js.undefined)
    }
  }
  
  @js.native
  trait Chain_ extends Duplex {
    
    var input: Stream = js.native
    
    var output: Stream = js.native
    
    var streams: js.Array[Stream] = js.native
  }
  
  type Stream = Readable | Writable | Duplex | Transform
  
  type StreamItem = Stream | TransformFunction
  
  type TransformFunction = js.Function2[/* chunk */ Any, /* encoding */ js.UndefOr[String], Any]
}
