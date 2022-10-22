package typingsJapgolly.rdfTransformTripleToQuad

import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad
import typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-transform-triple-to-quad", JSImport.Namespace)
  @js.native
  open class ^[Q /* <: BaseQuad */] () extends TripleToQuadTransform[Q] {
    def this(graph: String) = this()
    def this(graph: QuadGraph) = this()
    def this(graph: String, options: TripleToQuadTransformOptions) = this()
    def this(graph: Unit, options: TripleToQuadTransformOptions) = this()
    def this(graph: QuadGraph, options: TripleToQuadTransformOptions) = this()
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined 
  - typingsJapgolly.rdfjsTypes.streamMod.Stream because Inheritance from two classes. Inlined read */ @js.native
  trait TripleToQuadTransform[Q /* <: BaseQuad */]
    extends Transform
       with EventEmitter {
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    def read(): Q | Null = js.native
  }
  
  trait TripleToQuadTransformOptions extends StObject {
    
    var factory: DataFactory[Quad, Quad]
  }
  object TripleToQuadTransformOptions {
    
    inline def apply(factory: DataFactory[Quad, Quad]): TripleToQuadTransformOptions = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TripleToQuadTransformOptions]
    }
    
    extension [Self <: TripleToQuadTransformOptions](x: Self) {
      
      inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
}
