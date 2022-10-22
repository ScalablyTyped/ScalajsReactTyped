package typingsJapgolly.cssSelectorParser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cssSelectorParser.cssSelectorParserBooleans.`true`
import typingsJapgolly.cssSelectorParser.libSelectorMod.RuleSet
import typingsJapgolly.cssSelectorParser.libSelectorMod.Selectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParserContextMod {
  
  @JSImport("css-selector-parser/lib/parser-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCssSelector_true(
    str: String,
    pos: Double,
    pseudos: StringDictionary[PseudoSelectorType],
    attrEqualityMods: StringDictionary[`true`],
    ruleNestingOperators: StringDictionary[`true`],
    substitutesEnabled: Boolean
  ): Selectors | RuleSet | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], pseudos.asInstanceOf[js.Any], attrEqualityMods.asInstanceOf[js.Any], ruleNestingOperators.asInstanceOf[js.Any], substitutesEnabled.asInstanceOf[js.Any])).asInstanceOf[Selectors | RuleSet | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.numeric
    - typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.selector
  */
  trait PseudoSelectorType extends StObject
  object PseudoSelectorType {
    
    inline def numeric: typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.numeric = "numeric".asInstanceOf[typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.numeric]
    
    inline def selector: typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.selector = "selector".asInstanceOf[typingsJapgolly.cssSelectorParser.cssSelectorParserStrings.selector]
  }
}
