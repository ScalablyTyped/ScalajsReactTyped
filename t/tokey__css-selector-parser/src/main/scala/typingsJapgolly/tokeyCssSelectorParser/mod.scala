package typingsJapgolly.tokeyCssSelectorParser

import typingsJapgolly.tokeyCore.distTypesMod.Token
import typingsJapgolly.tokeyCssSelectorParser.anon.PartialParseConfig
import typingsJapgolly.tokeyCssSelectorParser.distAstToolsCompoundMod.GroupCompoundOptions
import typingsJapgolly.tokeyCssSelectorParser.distAstToolsSpecificityMod.Specificity
import typingsJapgolly.tokeyCssSelectorParser.distAstToolsWalkMod.WalkOptions
import typingsJapgolly.tokeyCssSelectorParser.distAstToolsWalkMod.WalkVisitor
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Attribute
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Class
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Combinator
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Comment
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Id
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableNthSelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelector
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorNode
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nesting
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nth
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthBase
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoElement
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Selector
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.SelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.SelectorNode
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Type
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Universal
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`-1`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`0`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`1`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tokey/css-selector-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcSpecificity(ast: ImmutableSelectorNode): Specificity = ^.asInstanceOf[js.Dynamic].applyDynamic("calcSpecificity")(ast.asInstanceOf[js.Any]).asInstanceOf[Specificity]
  
  inline def compareSpecificity(a: Specificity, b: Specificity): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareSpecificity")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  inline def groupCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  inline def groupCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST, options: GroupCompoundOptions): ImmutableSelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelectorList]
  
  inline def groupCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  inline def groupCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST, options: GroupCompoundOptions): ImmutableSelector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImmutableSelector]
  
  inline def groupCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  inline def groupCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST, options: GroupCompoundOptions): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def groupCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def groupCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST, options: GroupCompoundOptions): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("groupCompoundSelectors")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  inline def parseCssSelector(source: String): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def parseCssSelector(source: String, options: PartialParseConfig): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  inline def splitCompoundSelectors[AST /* <: ImmutableSelectorList */](input: AST): ImmutableSelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelectorList]
  
  inline def splitCompoundSelectors_AST_ImmutableSelector[AST /* <: ImmutableSelector */](input: AST): ImmutableSelector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[ImmutableSelector]
  
  inline def splitCompoundSelectors_AST_Selector[AST /* <: Selector */](input: AST): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[Selector]
  
  inline def splitCompoundSelectors_AST_SelectorList[AST /* <: SelectorList */](input: AST): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCompoundSelectors")(input.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  
  inline def stringifySelectorAst(value: ImmutableNthSelectorList | ImmutableSelectorList | ImmutableSelectorNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object walk {
    
    inline def apply(topNode: js.Array[Selector], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: js.Array[Selector], visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Token[invalid], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Token[invalid], visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Attribute, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Attribute, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Class, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Class, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Combinator, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Combinator, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Comment, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Comment, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: CompoundSelector, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: CompoundSelector, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Id, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Id, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nesting, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nesting, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: NthBase[nth_dash | nth_of | nth_offset | nth_step], visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(
      topNode: NthBase[nth_dash | nth_of | nth_offset | nth_step],
      visit: WalkVisitor[SelectorNode],
      options: WalkOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nth, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Nth, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoClass, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoClass, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoElement, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: PseudoElement, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Selector, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Selector, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Type, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Type, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Universal, visit: WalkVisitor[SelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(topNode: Universal, visit: WalkVisitor[SelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[AST /* <: ImmutableSelectorNode | ImmutableSelectorList */](topNode: AST, visit: WalkVisitor[ImmutableSelectorNode]): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply[AST /* <: ImmutableSelectorNode | ImmutableSelectorList */](topNode: AST, visit: WalkVisitor[ImmutableSelectorNode], options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(topNode.asInstanceOf[js.Any], visit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@tokey/css-selector-parser", "walk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tokey/css-selector-parser", "walk.skipCurrentSelector")
    @js.native
    def skipCurrentSelector: `1` = js.native
    inline def skipCurrentSelector_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipCurrentSelector")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser", "walk.skipNested")
    @js.native
    def skipNested: `0` = js.native
    inline def skipNested_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipNested")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser", "walk.stopAll")
    @js.native
    def stopAll: Double = js.native
    inline def stopAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(x.asInstanceOf[js.Any])
  }
}
