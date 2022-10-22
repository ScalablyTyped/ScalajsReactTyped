package typingsJapgolly.rdfLoadersRegistry

import typingsJapgolly.clownface.mod.GraphPointer
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line no-empty-interface
  @JSImport("rdf-loaders-registry", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with LoaderRegistry
  
  type LoadOptions[T /* <: Record[String, Any] */] = T & typingsJapgolly.rdfLoadersRegistry.anon.LoaderRegistry
  
  type Loader[T, TOptions /* <: Record[String, Any] */] = js.Function2[
    /* node */ GraphPointer[Term, DatasetCore[Quad, Quad]], 
    /* options */ LoadOptions[TOptions], 
    T | js.Promise[T]
  ]
  
  // tslint:disable-next-line no-empty-interface
  @js.native
  trait LoaderRegistry extends StObject {
    
    var _literalLoaders: Map[String, Any] = js.native
    
    var _nodeLoaders: Map[String, Any] = js.native
    
    def load[T /* <: Any */, // tslint:disable-next-line:no-unnecessary-generics
    TLoader /* <: Loader[T, TOptions] */, TOptions /* <: Record[String, Any] */](node: GraphPointer[Term, DatasetCore[Quad, Quad]]): js.UndefOr[js.Promise[T] | T] = js.native
    def load[T /* <: Any */, // tslint:disable-next-line:no-unnecessary-generics
    TLoader /* <: Loader[T, TOptions] */, TOptions /* <: Record[String, Any] */](node: GraphPointer[Term, DatasetCore[Quad, Quad]], options: TOptions): js.UndefOr[js.Promise[T] | T] = js.native
    
    def loader(node: GraphPointer[Term, DatasetCore[Quad, Quad]]): (Loader[Any, Any]) | Null = js.native
    
    def registerLiteralLoader(datatype: String, loader: Loader[Any, Any]): Unit = js.native
    def registerLiteralLoader(datatype: NamedNode[String], loader: Loader[Any, Any]): Unit = js.native
    
    def registerNodeLoader(`type`: String, loader: Loader[Any, Any]): Unit = js.native
    def registerNodeLoader(`type`: NamedNode[String], loader: Loader[Any, Any]): Unit = js.native
  }
}
