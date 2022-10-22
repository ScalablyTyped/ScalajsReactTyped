package typingsJapgolly.hyperformula

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hyperformula.hyperformulaBooleans.`false`
import typingsJapgolly.hyperformula.typingsCellMod.ErrorType.REF
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserAstMod.CellRangeAst
import typingsJapgolly.hyperformula.typingsParserAstMod.CellReferenceAst
import typingsJapgolly.hyperformula.typingsParserAstMod.ColumnRangeAst
import typingsJapgolly.hyperformula.typingsParserAstMod.RowRangeAst
import typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typingsJapgolly.hyperformula.typingsParserMod.CellAddress
import typingsJapgolly.hyperformula.typingsParserMod.ParserWithCaching
import typingsJapgolly.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyTransformersTransformerMod {
  
  /* note: abstract class */ @JSImport("hyperformula/typings/dependencyTransformers/Transformer", "Transformer")
  @js.native
  open class Transformer ()
    extends StObject
       with FormulaTransformer {
    
    /* protected */ def fixNodeAddress(address: SimpleCellAddress_): SimpleCellAddress_ = js.native
    
    /* CompleteClass */
    override def isIrreversible(): Boolean = js.native
    
    /* CompleteClass */
    override def performEagerTransformations(graph: DependencyGraph, parser: ParserWithCaching): Unit = js.native
    
    /* CompleteClass */
    var sheet: Double = js.native
    @JSName("sheet")
    def sheet_MTransformer: Double = js.native
    
    /* protected */ def transformAst(ast: Ast, address: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformCellAddress[T /* <: CellAddress */](dependencyAddress: T, formulaAddress: SimpleCellAddress_): T | REF | `false` = js.native
    
    /* protected */ def transformCellRange(start: CellAddress, end: CellAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[CellAddress, CellAddress]) | REF | `false` = js.native
    
    /* protected */ def transformCellRangeAst(ast: CellRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformCellReferenceAst(ast: CellReferenceAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformColumnRange(start: ColumnAddress, end: ColumnAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[ColumnAddress, ColumnAddress]) | REF | `false` = js.native
    
    /* protected */ def transformColumnRangeAst(ast: ColumnRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* protected */ def transformRowRange(start: RowAddress, end: RowAddress, formulaAddress: SimpleCellAddress_): (js.Tuple2[RowAddress, RowAddress]) | REF | `false` = js.native
    
    /* protected */ def transformRowRangeAst(ast: RowRangeAst, formulaAddress: SimpleCellAddress_): Ast = js.native
    
    /* CompleteClass */
    override def transformSingleAst(ast: Ast, address: SimpleCellAddress_): js.Tuple2[Ast, SimpleCellAddress_] = js.native
  }
  
  trait FormulaTransformer extends StObject {
    
    def isIrreversible(): Boolean
    
    def performEagerTransformations(graph: DependencyGraph, parser: ParserWithCaching): Unit
    
    var sheet: Double
    
    def transformSingleAst(ast: Ast, address: SimpleCellAddress_): js.Tuple2[Ast, SimpleCellAddress_]
  }
  object FormulaTransformer {
    
    inline def apply(
      isIrreversible: CallbackTo[Boolean],
      performEagerTransformations: (DependencyGraph, ParserWithCaching) => Callback,
      sheet: Double,
      transformSingleAst: (Ast, SimpleCellAddress_) => js.Tuple2[Ast, SimpleCellAddress_]
    ): FormulaTransformer = {
      val __obj = js.Dynamic.literal(isIrreversible = isIrreversible.toJsFn, performEagerTransformations = js.Any.fromFunction2((t0: DependencyGraph, t1: ParserWithCaching) => (performEagerTransformations(t0, t1)).runNow()), sheet = sheet.asInstanceOf[js.Any], transformSingleAst = js.Any.fromFunction2(transformSingleAst))
      __obj.asInstanceOf[FormulaTransformer]
    }
    
    extension [Self <: FormulaTransformer](x: Self) {
      
      inline def setIsIrreversible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIrreversible", value.toJsFn)
      
      inline def setPerformEagerTransformations(value: (DependencyGraph, ParserWithCaching) => Callback): Self = StObject.set(x, "performEagerTransformations", js.Any.fromFunction2((t0: DependencyGraph, t1: ParserWithCaching) => (value(t0, t1)).runNow()))
      
      inline def setSheet(value: Double): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setTransformSingleAst(value: (Ast, SimpleCellAddress_) => js.Tuple2[Ast, SimpleCellAddress_]): Self = StObject.set(x, "transformSingleAst", js.Any.fromFunction2(value))
    }
  }
}
