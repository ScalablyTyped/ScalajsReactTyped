package typingsJapgolly.ajv

import typingsJapgolly.ajv.distTypesMod.AddedKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileRulesMod {
  
  @JSImport("ajv/dist/compile/rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRules(): ValidationRules = ^.asInstanceOf[js.Dynamic].applyDynamic("getRules")().asInstanceOf[ValidationRules]
  
  inline def isJSONType(x: Any): /* is ajv.ajv/dist/compile/rules.JSONType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSONType")(x.asInstanceOf[js.Any]).asInstanceOf[/* is ajv.ajv/dist/compile/rules.JSONType */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajv.ajvStrings.string
    - typingsJapgolly.ajv.ajvStrings.number
    - typingsJapgolly.ajv.ajvStrings.integer
    - typingsJapgolly.ajv.ajvStrings.boolean
    - typingsJapgolly.ajv.ajvStrings.`null`
    - typingsJapgolly.ajv.ajvStrings.`object`
    - typingsJapgolly.ajv.ajvStrings.array
  */
  trait JSONType extends StObject
  
  trait Rule extends StObject {
    
    var definition: AddedKeywordDefinition
    
    var keyword: String
  }
  object Rule {
    
    inline def apply(definition: AddedKeywordDefinition, keyword: String): Rule = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rule]
    }
    
    extension [Self <: Rule](x: Self) {
      
      inline def setDefinition(value: AddedKeywordDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleGroup extends StObject {
    
    var rules: js.Array[Rule]
    
    var `type`: js.UndefOr[JSONType] = js.undefined
  }
  object RuleGroup {
    
    inline def apply(rules: js.Array[Rule]): RuleGroup = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleGroup]
    }
    
    extension [Self <: RuleGroup](x: Self) {
      
      inline def setRules(value: js.Array[Rule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setType(value: JSONType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ValidationRules extends StObject {
    
    var all: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean | ajv.ajv/dist/compile/rules.Rule} */ js.Any
    
    var keywords: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean} */ js.Any
    
    var post: RuleGroup
    
    var rules: js.Array[RuleGroup]
    
    var types: ValidationTypes
  }
  object ValidationRules {
    
    inline def apply(
      all: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean | ajv.ajv/dist/compile/rules.Rule} */ js.Any,
      keywords: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean} */ js.Any,
      post: RuleGroup,
      rules: js.Array[RuleGroup],
      types: ValidationTypes
    ): ValidationRules = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationRules]
    }
    
    extension [Self <: ValidationRules](x: Self) {
      
      inline def setAll(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean | ajv.ajv/dist/compile/rules.Rule} */ js.Any
      ): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setKeywords(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? boolean} */ js.Any
      ): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setPost(value: RuleGroup): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[RuleGroup]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: RuleGroup*): Self = StObject.set(x, "rules", js.Array(value*))
      
      inline def setTypes(value: ValidationTypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in ajv.ajv/dist/compile/rules.JSONType ]: boolean | ajv.ajv/dist/compile/rules.RuleGroup | undefined}
    }}}
    */
  @js.native
  trait ValidationTypes extends StObject
}
