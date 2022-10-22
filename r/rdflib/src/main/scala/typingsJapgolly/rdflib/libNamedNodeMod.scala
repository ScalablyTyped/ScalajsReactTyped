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

object libNamedNodeMod {
  
  @JSImport("rdflib/lib/named-node", JSImport.Default)
  @js.native
  open class default protected ()
    extends NamedNode
       with GraphType
       with PredicateType
       with SubjectType
       with _DefaultFactoryTypes
       with _ObjectType {
    /**
      * Create a named (IRI) RDF Node
      * @constructor
      * @param iri - The IRI for this node
      */
    def this(iri: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rdflib/lib/named-node", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a named node from the specified input value
      * @param value - An input value
      */
    inline def fromValue(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libTypesMod._ValueType because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.Term because var conflicts: termType, value. Inlined 
  - typingsJapgolly.rdflib.libTfTypesMod.NamedNode because var conflicts: termType, value. Inlined  */ @js.native
  trait NamedNode
    extends typingsJapgolly.rdflib.libNodeInternalMod.default
       with QuadGraph
       with QuadObject
       with QuadPredicate
       with QuadSubject
       with _Comparable
       with _TFIDFactoryTypes
       with _FromValueReturns[Any] {
    
    /**
      * Returns an $rdf node for the containing directory, ending in slash.
      */
    def dir(): NamedNode | Null = js.native
    
    /**
      * Creates the fetchable named node for the document.
      * Removes everything from the # anchor tag.
      */
    def doc(): NamedNode = js.native
    
    /** The local identifier with the document */
    def id(): String = js.native
    
    /**
      * Returns an NN for the whole web site, ending in slash.
      * Contrast with the "origin" which does NOT have a trailing slash
      */
    def site(): NamedNode = js.native
    
    @JSName("termType")
    var termType_NamedNode: typingsJapgolly.rdflib.rdflibStrings.NamedNode = js.native
    
    /** Alias for value, favored by Tim */
    def uri: String = js.native
    def uri_=(uri: String): Unit = js.native
  }
}
