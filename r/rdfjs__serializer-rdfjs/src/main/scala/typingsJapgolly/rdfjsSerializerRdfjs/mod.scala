package typingsJapgolly.rdfjsSerializerRdfjs

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.esm
import typingsJapgolly.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.ts
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.streamMod.Sink
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-rdfjs", JSImport.Namespace)
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
    
    def transform(quads: js.Iterable[Q]): String = js.native
  }
  
  trait SerializerOptions extends StObject {
    
    var module: js.UndefOr[esm | ts | String] = js.undefined
  }
  object SerializerOptions {
    
    inline def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    extension [Self <: SerializerOptions](x: Self) {
      
      inline def setModule(value: esm | ts | String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
}
