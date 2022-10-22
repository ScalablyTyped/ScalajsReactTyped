package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typingsJapgolly.rdflib.libTfTypesMod.QuadObject
import typingsJapgolly.rdflib.libTypesMod._FromValueReturns
import typingsJapgolly.rdflib.libTypesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEmptyMod {
  
  @JSImport("rdflib/lib/empty", JSImport.Default)
  @js.native
  open class default ()
    extends Empty
       with _ObjectType
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libTypesMod._ValueType because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Empty
    extends typingsJapgolly.rdflib.libNodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes {
    
    @JSName("termType")
    var termType_Empty: typingsJapgolly.rdflib.rdflibStrings.Empty = js.native
  }
}
