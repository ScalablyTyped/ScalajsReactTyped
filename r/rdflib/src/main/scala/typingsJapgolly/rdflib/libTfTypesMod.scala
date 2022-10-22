package typingsJapgolly.rdflib

import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod.SupportTable
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable
import typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes
import typingsJapgolly.rdflib.libTypesMod._FromValueReturns
import typingsJapgolly.rdflib.libTypesMod._ValueType
import typingsJapgolly.rdflib.rdflibStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTfTypesMod {
  
  trait BaseQuad extends StObject {
    
    var graph: Term
    
    var `object`: Term
    
    var predicate: Term
    
    var subject: Term
  }
  object BaseQuad {
    
    inline def apply(graph: Term, `object`: Term, predicate: Term, subject: Term): BaseQuad = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseQuad]
    }
    
    extension [Self <: BaseQuad](x: Self) {
      
      inline def setGraph(value: Term): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Term): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: Term): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: Term): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes because Already inherited
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.QuadObject because Already inherited */ trait BlankNode
    extends StObject
       with Term
       with QuadGraph
       with QuadSubject {
    
    @JSName("termType")
    var termType_BlankNode: typingsJapgolly.rdflib.rdflibStrings.BlankNode
  }
  object BlankNode {
    
    inline def apply(equals_ : Term => Boolean, value: String): BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[BlankNode]
    }
    
    extension [Self <: BlankNode](x: Self) {
      
      inline def setTermType(value: typingsJapgolly.rdflib.rdflibStrings.BlankNode): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultGraph
    extends StObject
       with Term
       with QuadGraph {
    
    @JSName("termType")
    var termType_DefaultGraph: typingsJapgolly.rdflib.rdflibStrings.DefaultGraph
    
    /** should return and empty string'' */
    @JSName("value")
    var value_DefaultGraph: _empty
  }
  object DefaultGraph {
    
    inline def apply(equals_ : Term => Boolean): DefaultGraph = {
      val __obj = js.Dynamic.literal(termType = "DefaultGraph", value = "")
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[DefaultGraph]
    }
    
    extension [Self <: DefaultGraph](x: Self) {
      
      inline def setTermType(value: typingsJapgolly.rdflib.rdflibStrings.DefaultGraph): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: _empty): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes because Already inherited
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.QuadObject because Already inherited */ trait Literal
    extends StObject
       with Term {
    
    /** A NamedNode whose IRI represents the datatype of the literal. */
    var datatype: NamedNode
    
    /**
      * The language as lowercase BCP-47 [BCP47] string (examples: "en", "en-gb")
      * or an empty string if the literal has no language.
      */
    var language: String
    
    /** Contains the constant "Literal". */
    @JSName("termType")
    var termType_Literal: typingsJapgolly.rdflib.rdflibStrings.Literal
  }
  object Literal {
    
    inline def apply(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Literal]
    }
    
    extension [Self <: Literal](x: Self) {
      
      inline def setDatatype(value: NamedNode): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setTermType(value: typingsJapgolly.rdflib.rdflibStrings.Literal): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes because Already inherited
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._Comparable because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.QuadObject because Already inherited */ trait NamedNode
    extends StObject
       with Term
       with QuadGraph
       with QuadPredicate
       with QuadSubject {
    
    @JSName("termType")
    var termType_NamedNode: typingsJapgolly.rdflib.rdflibStrings.NamedNode
  }
  object NamedNode {
    
    inline def apply(equals_ : Term => Boolean, value: String): NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[NamedNode]
    }
    
    extension [Self <: NamedNode](x: Self) {
      
      inline def setTermType(value: typingsJapgolly.rdflib.rdflibStrings.NamedNode): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Quad[S /* <: Term */, P /* <: Term */, O /* <: Term */, G /* <: Term */] extends StObject {
    
    def equals(other: BaseQuad): Boolean
    
    var graph: G
    
    var `object`: O
    
    var predicate: P
    
    var subject: S
  }
  object Quad {
    
    inline def apply[S /* <: Term */, P /* <: Term */, O /* <: Term */, G /* <: Term */](equals_ : BaseQuad => Boolean, graph: G, `object`: O, predicate: P, subject: S): Quad[S, P, O, G] = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Quad[S, P, O, G]]
    }
    
    extension [Self <: Quad[?, ?, ?, ?], S /* <: Term */, P /* <: Term */, O /* <: Term */, G /* <: Term */](x: Self & (Quad[S, P, O, G])) {
      
      inline def setEquals_(value: BaseQuad => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGraph(value: G): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setObject(value: O): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: P): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: S): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.NamedNode
    - typingsJapgolly.rdflib.libTfTypesMod.DefaultGraph
    - typingsJapgolly.rdflib.libTfTypesMod.BlankNode
    - typingsJapgolly.rdflib.libTfTypesMod.Variable
  */
  trait QuadGraph extends StObject
  object QuadGraph {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.BlankNode]
    }
    
    inline def DefaultGraph(equals_ : Term => Boolean): typingsJapgolly.rdflib.libTfTypesMod.DefaultGraph = {
      val __obj = js.Dynamic.literal(termType = "DefaultGraph", value = "")
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.DefaultGraph]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Variable]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.NamedNode
    - typingsJapgolly.rdflib.libTfTypesMod.BlankNode
    - typingsJapgolly.rdflib.libTfTypesMod.Literal
    - typingsJapgolly.rdflib.libTfTypesMod.Variable
    - typingsJapgolly.rdflib.libTfTypesMod.Term
  */
  trait QuadObject extends StObject
  object QuadObject {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.BlankNode]
    }
    
    inline def Literal(datatype: NamedNode, equals_ : Term => Boolean, language: String, value: String): typingsJapgolly.rdflib.libTfTypesMod.Literal = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = "Literal", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Literal]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Term(equals_ : typingsJapgolly.rdflib.libTfTypesMod.Term => Boolean, termType: String, value: String): typingsJapgolly.rdflib.libTfTypesMod.Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Term]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Variable]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.NamedNode
    - typingsJapgolly.rdflib.libTfTypesMod.Variable
  */
  trait QuadPredicate extends StObject
  object QuadPredicate {
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Variable]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rdflib.libTfTypesMod.NamedNode
    - typingsJapgolly.rdflib.libTfTypesMod.BlankNode
    - typingsJapgolly.rdflib.libTfTypesMod.Variable
  */
  trait QuadSubject extends StObject
  object QuadSubject {
    
    inline def BlankNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.BlankNode = {
      val __obj = js.Dynamic.literal(termType = "BlankNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.BlankNode]
    }
    
    inline def NamedNode(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.NamedNode = {
      val __obj = js.Dynamic.literal(termType = "NamedNode", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.NamedNode]
    }
    
    inline def Variable(equals_ : Term => Boolean, value: String): typingsJapgolly.rdflib.libTfTypesMod.Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[typingsJapgolly.rdflib.libTfTypesMod.Variable]
    }
  }
  
  @js.native
  trait RdfJsDataFactory extends StObject {
    
    /**
      * Returns a new instance of BlankNode.
      * If the value parameter is undefined a new identifier for the
      * blank node is generated for each call.
      */
    def blankNode(): BlankNode = js.native
    def blankNode(value: String): BlankNode = js.native
    
    /**
      * Returns an instance of DefaultGraph.
      */
    def defaultGraph(): DefaultGraph = js.native
    
    /**
      * Returns a new instance of Quad, such that newObject.equals(original) returns true.
      * Not implemented in RDFJS, so optional.
      */
    var fromQuad: js.UndefOr[
        js.Function1[
          /* original */ Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph], 
          Quad[QuadSubject, QuadPredicate, QuadObject, QuadGraph]
        ]
      ] = js.native
    
    /**
      * Returns a new instance of the specific Term subclass given by original.termType
      * (e.g., NamedNode, BlankNode, Literal, etc.),
      * such that newObject.equals(original) returns true.
      * Not implemented in RDFJS, so optional.
      */
    var fromTerm: js.UndefOr[js.Function1[/* original */ Term, Term]] = js.native
    
    /**
      * Returns a new instance of Literal.
      * If languageOrDatatype is a NamedNode, then it is used for the value of datatype.
      * Otherwise languageOrDatatype is used for the value of language. */
    def literal(value: String, languageOrDatatype: String): Literal = js.native
    def literal(value: String, languageOrDatatype: NamedNode): Literal = js.native
    
    /** Returns a new instance of NamedNode. */
    def namedNode(value: String): NamedNode = js.native
    
    /**
      * Returns a new instance of Quad.
      * If graph is undefined or null it MUST set graph to a DefaultGraph.
      */
    def quad(subject: Term, predicate: Term, `object`: Term): Quad[Any, Any, Any, Any] = js.native
    def quad(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad[Any, Any, Any, Any] = js.native
    
    /**
      * Check for specific features/behaviour on the factory.
      *
      * This does not exist on the original RDF/JS spec
      */
    var supports: SupportTable = js.native
    
    /**
      * Returns a new instance of Quad.
      * If graph is undefined or null it MUST set graph to a DefaultGraph.
      */
    def triple(subject: Term, predicate: Term, `object`: Term): Quad[Any, Any, Any, Any] = js.native
    def triple(subject: Term, predicate: Term, `object`: Term, graph: Term): Quad[Any, Any, Any, Any] = js.native
    
    /** Returns a new instance of Variable. This method is optional. */
    var variable: js.UndefOr[js.Function1[/* value */ String, Variable]] = js.native
  }
  
  trait Term
    extends StObject
       with QuadObject
       with _Comparable
       with _FromValueReturns[Any]
       with _TFIDFactoryTypes
       with _ValueType {
    
    /**
      * Compare this term with {other} for structural equality
      *
      * Note that the task force spec only allows comparison with other terms
      */
    def equals(other: Term): Boolean
    
    var termType: String
    
    var value: String
  }
  object Term {
    
    inline def apply(equals_ : Term => Boolean, termType: String, value: String): Term = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Term]
    }
    
    extension [Self <: Term](x: Self) {
      
      inline def setEquals_(value: Term => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setTermType(value: String): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rdflib.libFactoriesFactoryTypesMod._TFIDFactoryTypes because Already inherited
  - typingsJapgolly.rdflib.libTfTypesMod.QuadObject because Already inherited */ trait Variable
    extends StObject
       with Term
       with QuadGraph
       with QuadPredicate
       with QuadSubject {
    
    /** Contains the constant "Variable". */
    @JSName("termType")
    var termType_Variable: typingsJapgolly.rdflib.rdflibStrings.Variable
  }
  object Variable {
    
    inline def apply(equals_ : Term => Boolean, value: String): Variable = {
      val __obj = js.Dynamic.literal(termType = "Variable", value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Variable]
    }
    
    extension [Self <: Variable](x: Self) {
      
      inline def setTermType(value: typingsJapgolly.rdflib.rdflibStrings.Variable): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
    }
  }
}
