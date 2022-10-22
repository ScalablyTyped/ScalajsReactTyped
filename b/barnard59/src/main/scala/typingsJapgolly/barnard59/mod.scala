package typingsJapgolly.barnard59

import typingsJapgolly.barnard59.runnerMod.Create
import typingsJapgolly.barnard59.runnerMod.Runner
import typingsJapgolly.clownface.mod.GraphPointer
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.Term
import typingsJapgolly.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPipeline(dataset: DatasetCore[Quad, Quad]): GraphPointer[Term, DatasetCore[Quad, Quad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any]).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def findPipeline(dataset: DatasetCore[Quad, Quad], iri: String): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  inline def findPipeline(dataset: DatasetCore[Quad, Quad], iri: NamedNode[String]): GraphPointer[Term, DatasetCore[Quad, Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPipeline")(dataset.asInstanceOf[js.Any], iri.asInstanceOf[js.Any])).asInstanceOf[GraphPointer[Term, DatasetCore[Quad, Quad]]]
  
  inline def runner(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]]): js.Promise[Runner] = ^.asInstanceOf[js.Dynamic].applyDynamic("runner")(ptr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Runner]]
  inline def runner(ptr: GraphPointer[Term, DatasetCore[Quad, Quad]], args: Create): js.Promise[Runner] = (^.asInstanceOf[js.Dynamic].applyDynamic("runner")(ptr.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Runner]]
}
