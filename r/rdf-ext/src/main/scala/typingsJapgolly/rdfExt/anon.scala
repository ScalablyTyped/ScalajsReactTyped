package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.libPropTypeMod.PropType
import typingsJapgolly.rdfExt.libQuadMod.QuadExt
import typingsJapgolly.rdfExt.rdfExtStrings.`object`
import typingsJapgolly.rdfExt.rdfExtStrings.graph
import typingsJapgolly.rdfExt.rdfExtStrings.language
import typingsJapgolly.rdfExt.rdfExtStrings.predicate
import typingsJapgolly.rdfExt.rdfExtStrings.subject
import typingsJapgolly.rdfExt.rdfExtStrings.termType
import typingsJapgolly.rdfExt.rdfExtStrings.toJSON
import typingsJapgolly.rdfExt.rdfExtStrings.value
import typingsJapgolly.rdfjsTypes.dataModelMod.BlankNode
import typingsJapgolly.rdfjsTypes.dataModelMod.DefaultGraph
import typingsJapgolly.rdfjsTypes.dataModelMod.Literal
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.rdfjsTypes.dataModelMod.Variable
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datatype extends StObject {
    
    var datatype: TermTypeValue
    
    var language: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.language]
    
    var termType: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[Literal, typingsJapgolly.rdfExt.rdfExtStrings.value]
  }
  object Datatype {
    
    inline def apply(
      datatype: TermTypeValue,
      language: PropType[Literal, language],
      termType: PropType[Literal, termType],
      value: PropType[Literal, value]
    ): Datatype = {
      val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datatype]
    }
    
    extension [Self <: Datatype](x: Self) {
      
      inline def setDatatype(value: TermTypeValue): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: PropType[Literal, language]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setTermType(value: PropType[Literal, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[Literal, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Graph extends StObject {
    
    var graph: ReturnType[PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.graph], toJSON]]
    
    var `object`: ReturnType[
        PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.`object`], toJSON]
      ]
    
    var predicate: ReturnType[
        PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.predicate], toJSON]
      ]
    
    var subject: ReturnType[
        PropType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.subject], toJSON]
      ]
  }
  object Graph {
    
    inline def apply(
      graph: ReturnType[PropType[PropType[QuadExt, graph], toJSON]],
      `object`: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]],
      predicate: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]],
      subject: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]
    ): Graph = {
      val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    extension [Self <: Graph](x: Self) {
      
      inline def setGraph(value: ReturnType[PropType[PropType[QuadExt, graph], toJSON]]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setObject(value: ReturnType[PropType[PropType[QuadExt, `object`], toJSON]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: ReturnType[PropType[PropType[QuadExt, predicate], toJSON]]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: ReturnType[PropType[PropType[QuadExt, subject], toJSON]]): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermType extends StObject {
    
    var termType: PropType[BlankNode, typingsJapgolly.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[BlankNode, typingsJapgolly.rdfExt.rdfExtStrings.value]
  }
  object TermType {
    
    inline def apply(termType: PropType[BlankNode, termType], value: PropType[BlankNode, value]): TermType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermType]
    }
    
    extension [Self <: TermType](x: Self) {
      
      inline def setTermType(value: PropType[BlankNode, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[BlankNode, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermTypePropType extends StObject {
    
    var termType: PropType[Variable, typingsJapgolly.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[Variable, typingsJapgolly.rdfExt.rdfExtStrings.value]
  }
  object TermTypePropType {
    
    inline def apply(termType: PropType[Variable, termType], value: PropType[Variable, value]): TermTypePropType = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypePropType]
    }
    
    extension [Self <: TermTypePropType](x: Self) {
      
      inline def setTermType(value: PropType[Variable, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[Variable, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermTypeValue extends StObject {
    
    var termType: PropType[NamedNode[String], typingsJapgolly.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[NamedNode[String], typingsJapgolly.rdfExt.rdfExtStrings.value]
  }
  object TermTypeValue {
    
    inline def apply(termType: PropType[NamedNode[String], termType], value: PropType[NamedNode[String], value]): TermTypeValue = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermTypeValue]
    }
    
    extension [Self <: TermTypeValue](x: Self) {
      
      inline def setTermType(value: PropType[NamedNode[String], termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[NamedNode[String], value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var termType: PropType[DefaultGraph, typingsJapgolly.rdfExt.rdfExtStrings.termType]
    
    var value: PropType[DefaultGraph, typingsJapgolly.rdfExt.rdfExtStrings.value]
  }
  object Value {
    
    inline def apply(termType: PropType[DefaultGraph, termType], value: PropType[DefaultGraph, value]): Value = {
      val __obj = js.Dynamic.literal(termType = termType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setTermType(value: PropType[DefaultGraph, termType]): Self = StObject.set(x, "termType", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropType[DefaultGraph, value]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
