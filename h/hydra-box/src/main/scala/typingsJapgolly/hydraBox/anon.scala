package typingsJapgolly.hydraBox

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.clownface.mod.GraphPointer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.rdfExt.libDatasetMod.^
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hydra-box.hydra-box.Resource & {clownface (): std.Promise<clownface.clownface.GraphPointer<rdf-js.rdf-js.NamedNode<string>, rdf-ext.rdf-ext/lib/Dataset.^>>} */
  trait ResourceclownfacePromiseG extends StObject {
    
    def clownface(): js.Promise[GraphPointer[NamedNode[String], ^]]
    
    def dataset(): js.Promise[DatasetCore[Quad, Quad]]
    
    var prefetchDataset: DatasetCore[Quad, Quad]
    
    def quadStream(): Stream[Quad] & Readable
    
    var term: NamedNode[String]
    
    var types: Set[NamedNode[String]]
  }
  object ResourceclownfacePromiseG {
    
    inline def apply(
      clownface: CallbackTo[js.Promise[GraphPointer[NamedNode[String], ^]]],
      dataset: CallbackTo[js.Promise[DatasetCore[Quad, Quad]]],
      prefetchDataset: DatasetCore[Quad, Quad],
      quadStream: CallbackTo[Stream[Quad] & Readable],
      term: NamedNode[String],
      types: Set[NamedNode[String]]
    ): ResourceclownfacePromiseG = {
      val __obj = js.Dynamic.literal(clownface = clownface.toJsFn, dataset = dataset.toJsFn, prefetchDataset = prefetchDataset.asInstanceOf[js.Any], quadStream = quadStream.toJsFn, term = term.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceclownfacePromiseG]
    }
    
    extension [Self <: ResourceclownfacePromiseG](x: Self) {
      
      inline def setClownface(value: CallbackTo[js.Promise[GraphPointer[NamedNode[String], ^]]]): Self = StObject.set(x, "clownface", value.toJsFn)
      
      inline def setDataset(value: CallbackTo[js.Promise[DatasetCore[Quad, Quad]]]): Self = StObject.set(x, "dataset", value.toJsFn)
      
      inline def setPrefetchDataset(value: DatasetCore[Quad, Quad]): Self = StObject.set(x, "prefetchDataset", value.asInstanceOf[js.Any])
      
      inline def setQuadStream(value: CallbackTo[Stream[Quad] & Readable]): Self = StObject.set(x, "quadStream", value.toJsFn)
      
      inline def setTerm(value: NamedNode[String]): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Set[NamedNode[String]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store extends StObject {
    
    var store: typingsJapgolly.rdfjsTypes.streamMod.Store[Quad]
  }
  object Store {
    
    inline def apply(store: typingsJapgolly.rdfjsTypes.streamMod.Store[Quad]): Store = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setStore(value: typingsJapgolly.rdfjsTypes.streamMod.Store[Quad]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
