package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.anon.Graph
import typingsJapgolly.rdfExt.rdfExtStrings._empty
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadGraph
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadObject
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadPredicate
import typingsJapgolly.rdfjsTypes.dataModelMod.QuadSubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQuadMod {
  
  // tslint:disable-next-line:no-unnecessary-class
  @JSImport("rdf-ext/lib/Quad", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with QuadExt {
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject) = this()
    def this(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph) = this()
  }
  
  // tslint:disable-next-line:no-unnecessary-class
  @js.native
  trait QuadExt
    extends StObject
       with Quad {
    
    @JSName("graph")
    var graph_QuadExt: typingsJapgolly.rdfExt.libDefaultGraphMod.^ | typingsJapgolly.rdfExt.libNamedNodeMod.^[String] | typingsJapgolly.rdfExt.libBlankNodeMod.^ | typingsJapgolly.rdfExt.libVariableMod.^ = js.native
    
    @JSName("object")
    var object_QuadExt: typingsJapgolly.rdfExt.libNamedNodeMod.^[String] | typingsJapgolly.rdfExt.libLiteralMod.^ | typingsJapgolly.rdfExt.libBlankNodeMod.^ | typingsJapgolly.rdfExt.libVariableMod.^ = js.native
    
    @JSName("predicate")
    var predicate_QuadExt: typingsJapgolly.rdfExt.libNamedNodeMod.^[String] | typingsJapgolly.rdfExt.libVariableMod.^ = js.native
    
    @JSName("subject")
    var subject_QuadExt: typingsJapgolly.rdfExt.libNamedNodeMod.^[String] | typingsJapgolly.rdfExt.libBlankNodeMod.^ | typingsJapgolly.rdfExt.libVariableMod.^ = js.native
    
    @JSName("termType")
    var termType_QuadExt: typingsJapgolly.rdfExt.rdfExtStrings.Quad = js.native
    
    def toCanonical(): String = js.native
    
    def toJSON(): Graph = js.native
    
    @JSName("value")
    var value_QuadExt: _empty = js.native
  }
}
