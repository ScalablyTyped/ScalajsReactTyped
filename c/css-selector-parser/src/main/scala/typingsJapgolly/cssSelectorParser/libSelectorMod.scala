package typingsJapgolly.cssSelectorParser

import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.numeric
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.rule
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.ruleSet
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.selectors
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.string
import typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.substitute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.string
    - typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.substitute
  */
  trait AttrValueType extends StObject
  object AttrValueType {
    
    inline def string: typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.string = "string".asInstanceOf[typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.string]
    
    inline def substitute: typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.substitute = "substitute".asInstanceOf[typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.substitute]
  }
  
  trait Rule
    extends StObject
       with SelectorEntity {
    
    var attrs: js.Array[RuleAttr]
    
    var classNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var nestingOperator: String | Null
    
    var pseudos: js.Array[RulePseudo]
    
    var rule: js.UndefOr[Rule] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var `type`: rule
  }
  object Rule {
    
    inline def apply(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo]): Rule = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], nestingOperator = null)
      __obj.updateDynamic("type")("rule")
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setAttrs(value: js.Array[RuleAttr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: RuleAttr*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setClassNames(value: js.Array[String]): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setClassNamesVarargs(value: String*): Self = StObject.set(x, "classNames", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNestingOperator(value: String): Self = StObject.set(x, "nestingOperator", value.asInstanceOf[js.Any])
      
      inline def setNestingOperatorNull: Self = StObject.set(x, "nestingOperator", null)
      
      inline def setPseudos(value: js.Array[RulePseudo]): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      inline def setPseudosVarargs(value: RulePseudo*): Self = StObject.set(x, "pseudos", js.Array(value*))
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setType(value: rule): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.anon.namestring
    - typingsJapgolly.cssSelectorParser.anon.operatorstringvalueTypeAt
  */
  trait RuleAttr extends StObject
  object RuleAttr {
    
    inline def namestring(name: String): typingsJapgolly.cssSelectorParser.anon.namestring = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.anon.namestring]
    }
    
    inline def operatorstringvalueTypeAt(name: String, operator: String, value: String, valueType: AttrValueType): typingsJapgolly.cssSelectorParser.anon.operatorstringvalueTypeAt = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.anon.operatorstringvalueTypeAt]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.anon.valueTypeselectorvalueSel
    - typingsJapgolly.cssSelectorParser.anon.valueTypestringsubstitute
  */
  trait RulePseudo extends StObject
  object RulePseudo {
    
    inline def valueTypeselectorvalueSel(name: String, value: Selector): typingsJapgolly.cssSelectorParser.anon.valueTypeselectorvalueSel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = "selector")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.anon.valueTypeselectorvalueSel]
    }
    
    inline def valueTypestringsubstitute(name: String, value: String, valueType: string | substitute | numeric): typingsJapgolly.cssSelectorParser.anon.valueTypestringsubstitute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.anon.valueTypestringsubstitute]
    }
  }
  
  trait RuleSet
    extends StObject
       with Selector
       with SelectorEntity {
    
    var rule: Rule
    
    var `type`: ruleSet
  }
  object RuleSet {
    
    inline def apply(rule: Rule): RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[RuleSet]
    }
    
    extension [Self <: RuleSet](x: Self) {
      
      inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      inline def setType(value: ruleSet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors
    - typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet
  */
  trait Selector extends StObject
  object Selector {
    
    inline def RuleSet(rule: Rule): typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet]
    }
    
    inline def Selectors(selectors: js.Array[RuleSet]): typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors
    - typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet
    - typingsJapgolly.cssSelectorParser.libSelectorMod.Rule
  */
  trait SelectorEntity extends StObject
  object SelectorEntity {
    
    inline def Rule(attrs: js.Array[RuleAttr], pseudos: js.Array[RulePseudo]): typingsJapgolly.cssSelectorParser.libSelectorMod.Rule = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], nestingOperator = null)
      __obj.updateDynamic("type")("rule")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.libSelectorMod.Rule]
    }
    
    inline def RuleSet(rule: Rule): typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("ruleSet")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet]
    }
    
    inline def Selectors(selectors: js.Array[RuleSet]): typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors]
    }
  }
  
  trait Selectors
    extends StObject
       with Selector
       with SelectorEntity {
    
    var selectors: js.Array[RuleSet]
    
    var `type`: selectors
  }
  object Selectors {
    
    inline def apply(selectors: js.Array[RuleSet]): Selectors = {
      val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selectors")
      __obj.asInstanceOf[Selectors]
    }
    
    extension [Self <: Selectors](x: Self) {
      
      inline def setSelectors(value: js.Array[RuleSet]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsVarargs(value: RuleSet*): Self = StObject.set(x, "selectors", js.Array(value*))
      
      inline def setType(value: selectors): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
