package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typingsJapgolly.rdflib.libTfTypesMod.QuadGraph
import typingsJapgolly.rdflib.libTfTypesMod.QuadObject
import typingsJapgolly.rdflib.libTypesMod.GraphType
import typingsJapgolly.rdflib.libTypesMod._FromValueReturns
import typingsJapgolly.rdflib.rdflibStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultGraphMod {
  
  @JSImport("rdflib/lib/default-graph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rdflib/lib/default-graph", JSImport.Default)
  @js.native
  open class default ()
    extends DefaultGraph
       with GraphType
  
  inline def isDefaultGraph(`object`: Any): /* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is rdflib.rdflib/lib/default-graph.DefaultGraph */ Boolean]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libTypesMod._ValueType because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsJapgolly.rdflib.libTfTypesMod.DefaultGraph because var conflicts: termType, value. Inlined  */ @js.native
  trait DefaultGraph
    extends typingsJapgolly.rdflib.libNodeInternalMod.default
       with QuadGraph
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_DefaultGraph: typingsJapgolly.rdflib.rdflibStrings.DefaultGraph = js.native
    
    var uri: String = js.native
    
    @JSName("value")
    var value_DefaultGraph: _empty = js.native
  }
}
