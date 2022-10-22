package typingsJapgolly.rdfjsSerializerJsonld

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.`object`
import typingsJapgolly.rdfjsSerializerJsonld.rdfjsSerializerJsonldStrings.string
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.streamMod.Sink
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-jsonld", JSImport.Namespace)
  @js.native
  open class ^[Q /* <: BaseQuad */] ()
    extends StObject
       with Serializer[Q] {
    def this(options: SerializerOptions) = this()
    
    /**
      * Consumes the given stream.
      *
      * The `end` and `error` events are used like described in the Stream interface.
      * Depending on the use case, subtypes of EventEmitter or Stream are used.
      * @see Stream
      *
      * @param stream The stream that will be consumed.
      * @return The resulting event emitter.
      */
    /* CompleteClass */
    override def `import`(stream: Stream[Q]): EventEmitter = js.native
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */]
    extends StObject
       with Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
  }
  
  trait SerializerOptions extends StObject {
    
    var encoding: js.UndefOr[string | `object`] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    extension [Self <: SerializerOptions](x: Self) {
      
      inline def setEncoding(value: string | `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
