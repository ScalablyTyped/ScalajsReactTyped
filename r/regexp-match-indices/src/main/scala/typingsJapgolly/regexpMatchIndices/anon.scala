package typingsJapgolly.regexpMatchIndices

import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesBooleans.`false`
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesBooleans.`true`
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.Alternative
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.CharacterClass
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.Disjunction
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.RegExp
import typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.Repetition
import typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstNode
import typingsJapgolly.regexpTree.anon.End
import typingsJapgolly.regexpTree.astMod.Char
import typingsJapgolly.regexpTree.astMod.ClassRange
import typingsJapgolly.regexpTree.astMod.Expression
import typingsJapgolly.regexpTree.astMod.Quantifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var TraversalKind: js.UndefOr[`false`] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTraversalKind(value: `false`): Self = StObject.set(x, "TraversalKind", value.asInstanceOf[js.Any])
      
      inline def setTraversalKindUndefined: Self = StObject.set(x, "TraversalKind", js.undefined)
    }
  }
  
  @js.native
  trait Ast[T /* <: AstNode */] extends StObject {
    
    def Ast(node: T): Unit | Boolean = js.native
    def Ast(node: T, parent: Null, prop: String): Unit | Boolean = js.native
    def Ast(node: T, parent: Null, prop: String, index: Double): Unit | Boolean = js.native
    def Ast(node: T, parent: Null, prop: Unit, index: Double): Unit | Boolean = js.native
    
    def AstPath(path: typingsJapgolly.regexpMatchIndices.regexpTreeAstMod.AstPath[T]): Unit | Boolean = js.native
    
    @JSName("Ast")
    def Ast_parent(
      node: T,
      parent: /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPath<T>['parent'] */ js.Any
    ): Unit | Boolean = js.native
    @JSName("Ast")
    def Ast_parent(
      node: T,
      parent: /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPath<T>['parent'] */ js.Any,
      prop: String
    ): Unit | Boolean = js.native
    @JSName("Ast")
    def Ast_parent(
      node: T,
      parent: /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPath<T>['parent'] */ js.Any,
      prop: String,
      index: Double
    ): Unit | Boolean = js.native
    @JSName("Ast")
    def Ast_parent(
      node: T,
      parent: /* import warning: importer.ImportType#apply Failed type conversion: regexp-match-indices.regexp-tree/ast.AstPath<T>['parent'] */ js.Any,
      prop: Unit,
      index: Double
    ): Unit | Boolean = js.native
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String | Double] = js.undefined
    
    var useLoc: js.UndefOr[Boolean] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String | Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setUseLoc(value: Boolean): Self = StObject.set(x, "useLoc", value.asInstanceOf[js.Any])
      
      inline def setUseLocUndefined: Self = StObject.set(x, "useLoc", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.Alternative> */
  trait PartialAlternative extends StObject {
    
    var expressions: js.UndefOr[js.Array[Expression]] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var `type`: js.UndefOr[Alternative] = js.undefined
  }
  object PartialAlternative {
    
    inline def apply(): PartialAlternative = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAlternative]
    }
    
    extension [Self <: PartialAlternative](x: Self) {
      
      inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setType(value: Alternative): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.AstRegExp> */
  trait PartialAstRegExp extends StObject {
    
    var body: js.UndefOr[Expression | Null] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var `type`: js.UndefOr[RegExp] = js.undefined
  }
  object PartialAstRegExp {
    
    inline def apply(): PartialAstRegExp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialAstRegExp]
    }
    
    extension [Self <: PartialAstRegExp](x: Self) {
      
      inline def setBody(value: Expression): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setType(value: RegExp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.CharacterClass> */
  trait PartialCharacterClass extends StObject {
    
    var expressions: js.UndefOr[js.Array[Char | ClassRange]] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var negative: js.UndefOr[`true`] = js.undefined
    
    var `type`: js.UndefOr[CharacterClass] = js.undefined
  }
  object PartialCharacterClass {
    
    inline def apply(): PartialCharacterClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCharacterClass]
    }
    
    extension [Self <: PartialCharacterClass](x: Self) {
      
      inline def setExpressions(value: js.Array[Char | ClassRange]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
      
      inline def setExpressionsVarargs(value: (Char | ClassRange)*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setNegative(value: `true`): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      inline def setType(value: CharacterClass): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.ClassRange> */
  trait PartialClassRange extends StObject {
    
    var from: js.UndefOr[Char] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var to: js.UndefOr[Char] = js.undefined
    
    var `type`: js.UndefOr[typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.ClassRange] = js.undefined
  }
  object PartialClassRange {
    
    inline def apply(): PartialClassRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialClassRange]
    }
    
    extension [Self <: PartialClassRange](x: Self) {
      
      inline def setFrom(value: Char): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setTo(value: Char): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setType(value: typingsJapgolly.regexpMatchIndices.regexpMatchIndicesStrings.ClassRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.Disjunction> */
  trait PartialDisjunction extends StObject {
    
    var left: js.UndefOr[Expression | Null] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var right: js.UndefOr[Expression | Null] = js.undefined
    
    var `type`: js.UndefOr[Disjunction] = js.undefined
  }
  object PartialDisjunction {
    
    inline def apply(): PartialDisjunction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDisjunction]
    }
    
    extension [Self <: PartialDisjunction](x: Self) {
      
      inline def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setType(value: Disjunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<regexp-tree.regexp-tree/ast.Repetition> */
  trait PartialRepetition extends StObject {
    
    var expression: js.UndefOr[Expression] = js.undefined
    
    var loc: js.UndefOr[End] = js.undefined
    
    var quantifier: js.UndefOr[Quantifier] = js.undefined
    
    var `type`: js.UndefOr[Repetition] = js.undefined
  }
  object PartialRepetition {
    
    inline def apply(): PartialRepetition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRepetition]
    }
    
    extension [Self <: PartialRepetition](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
      
      inline def setQuantifier(value: Quantifier): Self = StObject.set(x, "quantifier", value.asInstanceOf[js.Any])
      
      inline def setQuantifierUndefined: Self = StObject.set(x, "quantifier", js.undefined)
      
      inline def setType(value: Repetition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TraversalKind extends StObject {
    
    var TraversalKind: `true`
  }
  object TraversalKind {
    
    inline def apply(): TraversalKind = {
      val __obj = js.Dynamic.literal(TraversalKind = true)
      __obj.asInstanceOf[TraversalKind]
    }
    
    extension [Self <: TraversalKind](x: Self) {
      
      inline def setTraversalKind(value: `true`): Self = StObject.set(x, "TraversalKind", value.asInstanceOf[js.Any])
    }
  }
}
