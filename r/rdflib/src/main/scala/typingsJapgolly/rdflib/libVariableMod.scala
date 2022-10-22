package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._DefaultFactoryTypes
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typingsJapgolly.rdflib.libTfTypesMod.QuadGraph
import typingsJapgolly.rdflib.libTfTypesMod.QuadObject
import typingsJapgolly.rdflib.libTfTypesMod.QuadPredicate
import typingsJapgolly.rdflib.libTfTypesMod.QuadSubject
import typingsJapgolly.rdflib.libTypesMod.GraphType
import typingsJapgolly.rdflib.libTypesMod.PredicateType
import typingsJapgolly.rdflib.libTypesMod.SubjectType
import typingsJapgolly.rdflib.libTypesMod._FromValueReturns
import typingsJapgolly.rdflib.libTypesMod._ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVariableMod {
  
  @JSImport("rdflib/lib/variable", JSImport.Default)
  @js.native
  /**
    * Initializes this variable
    * @param name The variable's name
    */
  open class default ()
    extends Variable
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    def this(name: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/variable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def toString(variable: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(variable.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libTypesMod._ValueType because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsJapgolly.rdflib.libTfTypesMod.Variable because var conflicts: termType, value. Inlined  */ @js.native
  trait Variable
    extends typingsJapgolly.rdflib.libNodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _TFIDFactoryTypes
       with _Comparable
       with _FromValueReturns[Any] {
    
    /** The base string for a variable's name */
    var base: String = js.native
    
    var isVar: Double = js.native
    
    def substitute(bindings: Any): Any = js.native
    
    @JSName("termType")
    var termType_Variable: typingsJapgolly.rdflib.rdflibStrings.Variable = js.native
    
    /** The unique identifier of this variable */
    var uri: String = js.native
  }
}
