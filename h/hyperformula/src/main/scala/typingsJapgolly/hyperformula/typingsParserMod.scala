package typingsJapgolly.hyperformula

import typingsJapgolly.chevrotainTypes.mod.IToken
import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.SimpleCellRange_
import typingsJapgolly.hyperformula.typingsCellMod.CellError
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsMaybeMod.Maybe
import typingsJapgolly.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typingsJapgolly.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetIndexMappingFn
import typingsJapgolly.hyperformula.typingsParserAddressRepresentationConvertersMod.SheetMappingFn
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserAstMod.CellRangeAst
import typingsJapgolly.hyperformula.typingsParserAstMod.ErrorAst
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import typingsJapgolly.hyperformula.typingsParserAstMod.RangeSheetReferenceType
import typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellReferenceType
import typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typingsJapgolly.hyperformula.typingsParserLexerConfigMod.ILexerConfig
import typingsJapgolly.hyperformula.typingsParserParserConfigMod.ParserConfig
import typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import typingsJapgolly.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserMod {
  
  @JSImport("hyperformula/typings/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/parser", "AddressDependency")
  @js.native
  open class AddressDependency protected ()
    extends typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.AddressDependency {
    def this(dependency: CellAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "AstNodeType")
  @js.native
  object AstNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType & String] = js.native
    
    /* "ARRAY" */ val ARRAY: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ARRAY & String = js.native
    
    /* "CELL_RANGE" */ val CELL_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_RANGE & String = js.native
    
    /* "CELL_REFERENCE" */ val CELL_REFERENCE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CELL_REFERENCE & String = js.native
    
    /* "COLUMN_RANGE" */ val COLUMN_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.COLUMN_RANGE & String = js.native
    
    /* "CONCATENATE_OP" */ val CONCATENATE_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.CONCATENATE_OP & String = js.native
    
    /* "DIV_OP" */ val DIV_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.DIV_OP & String = js.native
    
    /* "EMPTY" */ val EMPTY: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EMPTY & String = js.native
    
    /* "EQUALS_OP" */ val EQUALS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.EQUALS_OP & String = js.native
    
    /* "ERROR" */ val ERROR: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR & String = js.native
    
    /* "ERROR_WITH_RAW_INPUT" */ val ERROR_WITH_RAW_INPUT: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ERROR_WITH_RAW_INPUT & String = js.native
    
    /* "FUNCTION_CALL" */ val FUNCTION_CALL: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.FUNCTION_CALL & String = js.native
    
    /* "GREATER_THAN_OP" */ val GREATER_THAN_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OP & String = js.native
    
    /* "GREATER_THAN_OR_EQUAL_OP" */ val GREATER_THAN_OR_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.GREATER_THAN_OR_EQUAL_OP & String = js.native
    
    /* "LESS_THAN_OP" */ val LESS_THAN_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OP & String = js.native
    
    /* "LESS_THAN_OR_EQUAL_OP" */ val LESS_THAN_OR_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.LESS_THAN_OR_EQUAL_OP & String = js.native
    
    /* "MINUS_OP" */ val MINUS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_OP & String = js.native
    
    /* "MINUS_UNARY_OP" */ val MINUS_UNARY_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.MINUS_UNARY_OP & String = js.native
    
    /* "NAMED_EXPRESSION" */ val NAMED_EXPRESSION: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NAMED_EXPRESSION & String = js.native
    
    /* "NOT_EQUAL_OP" */ val NOT_EQUAL_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NOT_EQUAL_OP & String = js.native
    
    /* "NUMBER" */ val NUMBER: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.NUMBER & String = js.native
    
    /* "PARENTHESES" */ val PARENTHESIS: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PARENTHESIS & String = js.native
    
    /* "PERCENT_OP" */ val PERCENT_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PERCENT_OP & String = js.native
    
    /* "PLUS_OP" */ val PLUS_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_OP & String = js.native
    
    /* "PLUS_UNARY_OP" */ val PLUS_UNARY_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.PLUS_UNARY_OP & String = js.native
    
    /* "POWER_OP" */ val POWER_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.POWER_OP & String = js.native
    
    /* "ROW_RANGE" */ val ROW_RANGE: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.ROW_RANGE & String = js.native
    
    /* "STRING" */ val STRING: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.STRING & String = js.native
    
    /* "TIMES_OP" */ val TIMES_OP: typingsJapgolly.hyperformula.typingsParserAstMod.AstNodeType.TIMES_OP & String = js.native
  }
  
  @JSImport("hyperformula/typings/parser", "CellAddress")
  @js.native
  open class CellAddress protected ()
    extends typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress {
    def this(col: Double, row: Double, `type`: CellReferenceType) = this()
    def this(col: Double, row: Double, `type`: CellReferenceType, sheet: Double) = this()
  }
  /* static members */
  object CellAddress {
    
    @JSImport("hyperformula/typings/parser", "CellAddress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolute(col: Double, row: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absolute(col: Double, row: Double, sheet: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def absoluteCol(col: Double, row: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absoluteCol(col: Double, row: Double, sheet: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteCol")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def absoluteRow(col: Double, row: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def absoluteRow(col: Double, row: Double, sheet: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def fromColAndRow(col: ColumnAddress, row: RowAddress, sheet: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("fromColAndRow")(col.asInstanceOf[js.Any], row.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    
    inline def relative(row: Double, col: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
    inline def relative(row: Double, col: Double, sheet: Double): typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]
  }
  
  @JSImport("hyperformula/typings/parser", "CellRangeDependency")
  @js.native
  open class CellRangeDependency protected ()
    extends typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.CellRangeDependency {
    def this(start: CellAddress, end: CellAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ColumnRangeDependency")
  @js.native
  open class ColumnRangeDependency protected ()
    extends typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.ColumnRangeDependency {
    def this(start: ColumnAddress, end: ColumnAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "FormulaLexer")
  @js.native
  open class FormulaLexer protected ()
    extends typingsJapgolly.hyperformula.typingsParserFormulaParserMod.FormulaLexer {
    def this(lexerConfig: ILexerConfig) = this()
  }
  /* static members */
  object FormulaLexer {
    
    @JSImport("hyperformula/typings/parser", "FormulaLexer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/parser", "FormulaLexer.filterTokensByNeighbors")
    @js.native
    def filterTokensByNeighbors: Any = js.native
    inline def filterTokensByNeighbors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterTokensByNeighbors")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hyperformula/typings/parser", "NamedExpressionDependency")
  @js.native
  open class NamedExpressionDependency protected ()
    extends typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.NamedExpressionDependency {
    def this(name: String) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ParserWithCaching")
  @js.native
  open class ParserWithCaching protected ()
    extends typingsJapgolly.hyperformula.typingsParserParserWithCachingMod.ParserWithCaching {
    def this(config: ParserConfig, functionRegistry: FunctionRegistry, sheetMapping: SheetMappingFn) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "ParsingErrorType")
  @js.native
  object ParsingErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType & String] = js.native
    
    /* "LexingError" */ val LexingError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.LexingError & String = js.native
    
    /* "ParsingError" */ val ParserError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.ParserError & String = js.native
    
    /* "RangeOffsetNotAllowed" */ val RangeOffsetNotAllowed: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.RangeOffsetNotAllowed & String = js.native
    
    /* "StaticOffsetError" */ val StaticOffsetError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetError & String = js.native
    
    /* "StaticOffsetOutOfRangeError" */ val StaticOffsetOutOfRangeError: typingsJapgolly.hyperformula.typingsParserAstMod.ParsingErrorType.StaticOffsetOutOfRangeError & String = js.native
  }
  
  @JSImport("hyperformula/typings/parser", "RowRangeDependency")
  @js.native
  open class RowRangeDependency protected ()
    extends typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RowRangeDependency {
    def this(start: RowAddress, end: RowAddress) = this()
  }
  
  @JSImport("hyperformula/typings/parser", "Unparser")
  @js.native
  open class Unparser protected ()
    extends typingsJapgolly.hyperformula.typingsParserUnparserMod.Unparser {
    def this(
      config: ParserConfig,
      lexerConfig: ILexerConfig,
      sheetMappingFn: SheetIndexMappingFn,
      namedExpressions: NamedExpressions
    ) = this()
  }
  
  inline def buildCellErrorAst(error: CellError): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any]).asInstanceOf[ErrorAst]
  inline def buildCellErrorAst(error: CellError, leadingWhitespace: IToken): ErrorAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellErrorAst")(error.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ErrorAst]
  
  inline def buildCellRangeAst(
    start: typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress,
    end: typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress,
    sheetReferenceType: RangeSheetReferenceType
  ): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]
  inline def buildCellRangeAst(
    start: typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress,
    end: typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress,
    sheetReferenceType: RangeSheetReferenceType,
    leadingWhitespace: String
  ): CellRangeAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildCellRangeAst")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], sheetReferenceType.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[CellRangeAst]
  
  inline def buildLexerConfig(config: ParserConfig): ILexerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLexerConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ILexerConfig]
  
  inline def buildParsingErrorAst(): ErrorAst = ^.asInstanceOf[js.Dynamic].applyDynamic("buildParsingErrorAst")().asInstanceOf[ErrorAst]
  
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast]): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: Unit, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  inline def buildProcedureAst(procedureName: String, args: js.Array[Ast], leadingWhitespace: IToken, internalWhitespace: IToken): ProcedureAst = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProcedureAst")(procedureName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], leadingWhitespace.asInstanceOf[js.Any], internalWhitespace.asInstanceOf[js.Any])).asInstanceOf[ProcedureAst]
  
  inline def cellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, baseAddress: SimpleCellAddress_): Maybe[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("cellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], baseAddress.asInstanceOf[js.Any])).asInstanceOf[Maybe[typingsJapgolly.hyperformula.typingsParserCellAddressMod.CellAddress]]
  
  inline def collectDependencies(ast: Ast, functionRegistry: FunctionRegistry): js.Array[RelativeDependency] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectDependencies")(ast.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any])).asInstanceOf[js.Array[RelativeDependency]]
  
  inline def simpleCellAddressFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellAddress_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellAddress_]]
  
  inline def simpleCellAddressToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellAddress_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellAddressToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def simpleCellRangeFromString(sheetMapping: SheetMappingFn, stringAddress: String, sheetContext: Double): Maybe[SimpleCellRange_] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeFromString")(sheetMapping.asInstanceOf[js.Any], stringAddress.asInstanceOf[js.Any], sheetContext.asInstanceOf[js.Any])).asInstanceOf[Maybe[SimpleCellRange_]]
  
  inline def simpleCellRangeToString(sheetIndexMapping: SheetIndexMappingFn, address: SimpleCellRange_, sheetIndex: Double): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleCellRangeToString")(sheetIndexMapping.asInstanceOf[js.Any], address.asInstanceOf[js.Any], sheetIndex.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
}
