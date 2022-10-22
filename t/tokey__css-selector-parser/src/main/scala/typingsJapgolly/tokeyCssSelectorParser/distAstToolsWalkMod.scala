package typingsJapgolly.tokeyCssSelectorParser

import typingsJapgolly.tokeyCore.distTypesMod.Token
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Attribute
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Class
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Combinator
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Comment
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.CompoundSelector
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Id
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorNode
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nesting
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Nth
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.NthBase
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoClass
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.PseudoElement
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Selector
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.SelectorNode
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Type
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.Universal
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`0`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserInts.`1`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`class`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.`type`
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.attribute
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.combinator
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.comment
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.compound_selector
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.id
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.invalid
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nesting
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_dash
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_of
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_offset
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.nth_step
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_class
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.pseudo_element
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.selector
import typingsJapgolly.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAstToolsWalkMod {
  
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
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.skipCurrentSelector")
    @js.native
    def skipCurrentSelector: `1` = js.native
    inline def skipCurrentSelector_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipCurrentSelector")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.skipNested")
    @js.native
    def skipNested: `0` = js.native
    inline def skipNested_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipNested")(x.asInstanceOf[js.Any])
    
    @JSImport("@tokey/css-selector-parser/dist/ast-tools/walk", "walk.stopAll")
    @js.native
    def stopAll: Double = js.native
    inline def stopAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAll")(x.asInstanceOf[js.Any])
  }
  
  trait WalkOptions extends StObject {
    
    var ignoreList: js.UndefOr[
        js.Array[
          `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
        ]
      ] = js.undefined
    
    var visitList: js.UndefOr[
        js.Array[
          `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
        ]
      ] = js.undefined
  }
  object WalkOptions {
    
    inline def apply(): WalkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WalkOptions]
    }
    
    extension [Self <: WalkOptions](x: Self) {
      
      inline def setIgnoreList(
        value: js.Array[
              `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
            ]
      ): Self = StObject.set(x, "ignoreList", value.asInstanceOf[js.Any])
      
      inline def setIgnoreListUndefined: Self = StObject.set(x, "ignoreList", js.undefined)
      
      inline def setIgnoreListVarargs(
        value: (`type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of)*
      ): Self = StObject.set(x, "ignoreList", js.Array(value*))
      
      inline def setVisitList(
        value: js.Array[
              `type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of
            ]
      ): Self = StObject.set(x, "visitList", value.asInstanceOf[js.Any])
      
      inline def setVisitListUndefined: Self = StObject.set(x, "visitList", js.undefined)
      
      inline def setVisitListVarargs(
        value: (`type` | universal | attribute | id | `class` | pseudo_class | pseudo_element | nesting | selector | compound_selector | combinator | comment | invalid | nth | nth_step | nth_dash | nth_offset | nth_of)*
      ): Self = StObject.set(x, "visitList", js.Array(value*))
    }
  }
  
  type WalkVisitor[AST /* <: SelectorNode | ImmutableSelectorNode */] = js.Function4[
    /* node */ AST, 
    /* index */ Double, 
    /* nodes */ js.Array[AST], 
    /* parents */ js.Array[AST], 
    js.UndefOr[Double | Unit]
  ]
}
