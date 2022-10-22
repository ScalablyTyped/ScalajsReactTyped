package typingsJapgolly.cssSelectorParser

import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.numeric
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.selector
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.string
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.substitute
import typingsJapgolly.cssSelectorParser.libSelectorMod.AttrValueType
import typingsJapgolly.cssSelectorParser.libSelectorMod.RuleAttr
import typingsJapgolly.cssSelectorParser.libSelectorMod.RulePseudo
import typingsJapgolly.cssSelectorParser.libSelectorMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {} & {  name :string} */
  trait namestring
    extends StObject
       with RuleAttr {
    
    var name: String
  }
  object namestring {
    
    inline def apply(name: String): namestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[namestring]
    }
    
    extension [Self <: namestring](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  operator :string,   valueType :css-selector-parser.css-selector-parser/lib/selector.AttrValueType,   value :string} & {  name :string} */
  trait operatorstringvalueTypeAt
    extends StObject
       with RuleAttr {
    
    var name: String
    
    var operator: String
    
    var value: String
    
    var valueType: AttrValueType
  }
  object operatorstringvalueTypeAt {
    
    inline def apply(name: String, operator: String, value: String, valueType: AttrValueType): operatorstringvalueTypeAt = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[operatorstringvalueTypeAt]
    }
    
    extension [Self <: operatorstringvalueTypeAt](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: AttrValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  valueType :'selector',   value :css-selector-parser.css-selector-parser/lib/selector.Selector} & {  name :string} */
  trait valueTypeselectorvalueSel
    extends StObject
       with RulePseudo {
    
    var name: String
    
    var value: Selector
    
    var valueType: selector
  }
  object valueTypeselectorvalueSel {
    
    inline def apply(name: String, value: Selector): valueTypeselectorvalueSel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = "selector")
      __obj.asInstanceOf[valueTypeselectorvalueSel]
    }
    
    extension [Self <: valueTypeselectorvalueSel](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Selector): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: selector): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  valueType :'string' | 'substitute' | 'numeric',   value :string} & {  name :string} */
  trait valueTypestringsubstitute
    extends StObject
       with RulePseudo {
    
    var name: String
    
    var value: String
    
    var valueType: string | substitute | numeric
  }
  object valueTypestringsubstitute {
    
    inline def apply(name: String, value: String, valueType: string | substitute | numeric): valueTypestringsubstitute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[valueTypestringsubstitute]
    }
    
    extension [Self <: valueTypestringsubstitute](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: string | substitute | numeric): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
}
