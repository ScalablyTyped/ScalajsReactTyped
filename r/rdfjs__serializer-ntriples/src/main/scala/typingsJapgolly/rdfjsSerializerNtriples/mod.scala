package typingsJapgolly.rdfjsSerializerNtriples

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.streamMod.Sink
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-ntriples", JSImport.Namespace)
  @js.native
  open class ^[Q /* <: BaseQuad */] ()
    extends StObject
       with Serializer[Q] {
    
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
  
  trait Serializer[Q /* <: BaseQuad */]
    extends StObject
       with Sink[Stream[Q], EventEmitter]
  object Serializer {
    
    inline def apply[Q /* <: BaseQuad */](`import`: Stream[Q] => EventEmitter): Serializer[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Serializer[Q]]
    }
  }
}
