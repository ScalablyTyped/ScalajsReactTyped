package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.SimpleCellRange_
import typingsJapgolly.hyperformula.typingsArraySizeMod.ArraySize
import typingsJapgolly.hyperformula.typingsCellContentParserMod.RawCellContent
import typingsJapgolly.hyperformula.typingsCellDependencyMod.CellDependency
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsContentChangesMod.ContentChanges
import typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingAddressMappingMod.AddressMapping
import typingsJapgolly.hyperformula.typingsDependencyGraphArrayMappingMod.ArrayMapping
import typingsJapgolly.hyperformula.typingsDependencyGraphGraphMod.Graph
import typingsJapgolly.hyperformula.typingsDependencyGraphGraphMod.TopSortResult
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.ArrayVertex
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.ParsingErrorVertex
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.RangeVertex
import typingsJapgolly.hyperformula.typingsDependencyGraphRangeMappingMod.RangeMapping
import typingsJapgolly.hyperformula.typingsDependencyGraphSheetMappingMod.SheetMapping
import typingsJapgolly.hyperformula.typingsDependencyGraphValueCellVertexMod.RawAndParsedValue
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.CellVertex
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawScalarValue
import typingsJapgolly.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typingsJapgolly.hyperformula.typingsMaybeMod.Maybe
import typingsJapgolly.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsSpanMod.ColumnsSpan
import typingsJapgolly.hyperformula.typingsSpanMod.RowsSpan
import typingsJapgolly.hyperformula.typingsStatisticsMod.Statistics
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphDependencyGraphMod {
  
  @JSImport("hyperformula/typings/DependencyGraph/DependencyGraph", "DependencyGraph")
  @js.native
  open class DependencyGraph protected () extends StObject {
    def this(
      addressMapping: AddressMapping,
      rangeMapping: RangeMapping,
      sheetMapping: SheetMapping,
      arrayMapping: ArrayMapping,
      stats: Statistics,
      lazilyTransformingAstService: LazilyTransformingAstService,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions
    ) = this()
    
    /* private */ var addAllFromRange: Any = js.native
    
    def addArrayVertex(address: SimpleCellAddress_, vertex: ArrayVertex): Unit = js.native
    
    def addColumns(addedColumns: ColumnsSpan): EagerChangesGraphChangeResult = js.native
    
    def addRows(addedRows: RowsSpan): ArrayAffectingGraphChangeResult = js.native
    
    /* private */ var addStructuralNodesToChangeSet: Any = js.native
    
    def addVertex(address: SimpleCellAddress_, vertex: CellVertex): Unit = js.native
    
    val addressMapping: AddressMapping = js.native
    
    /* private */ var adjacentArrayVertices: Any = js.native
    
    def arrayFormulaNodes(): IterableIterator[ArrayVertex] = js.native
    
    val arrayMapping: ArrayMapping = js.native
    
    /* private */ var changes: Any = js.native
    
    /* private */ var cleanAddressMappingUnderArray: Any = js.native
    
    def clearRecentlyChangedVertices(): Unit = js.native
    
    def clearSheet(sheetId: Double): Unit = js.native
    
    def computeListOfValuesInRange(range: AbsoluteCellRange): js.Array[InternalScalarValue] = js.native
    
    /* private */ var correctInfiniteRangesDependenciesByRangeVertex: Any = js.native
    
    def correctInfiniteRangesDependency(address: SimpleCellAddress_): Unit = js.native
    
    def dependencyQueryAddresses(vertex: Vertex): js.Array[SimpleCellAddress_ | SimpleCellRange_] = js.native
    
    def dependencyQueryVertices(vertex: Vertex): js.Array[Vertex] = js.native
    
    def ensureNoArrayInRange(range: AbsoluteCellRange): Unit = js.native
    
    def ensureThatVertexIsNonArrayCellVertex(vertex: Maybe[CellVertex]): Unit = js.native
    
    def entriesFromColumnsSpan(columnsSpan: ColumnsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    def entriesFromRange(range: AbsoluteCellRange): IterableIterator[js.Tuple2[SimpleCellAddress_, Maybe[CellVertex]]] = js.native
    
    def entriesFromRowsSpan(rowsSpan: RowsSpan): IterableIterator[js.Tuple2[SimpleCellAddress_, CellVertex]] = js.native
    
    def exchangeGraphNode(oldNode: Vertex, newNode: Vertex): Unit = js.native
    
    def exchangeNode(addressFrom: SimpleCellAddress_, addressTo: SimpleCellAddress_): Unit = js.native
    
    /* private */ var exchangeOrAddFormulaVertex: Any = js.native
    
    def exchangeOrAddGraphNode(oldNode: Maybe[Vertex], newNode: Vertex): Unit = js.native
    
    def existsEdge(fromNode: Vertex, toNode: Vertex): Boolean = js.native
    
    def existsVertex(address: SimpleCellAddress_): Boolean = js.native
    
    def fetchCell(address: SimpleCellAddress_): CellVertex = js.native
    
    def fetchCellOrCreateEmpty(address: SimpleCellAddress_): CellVertex = js.native
    
    def fetchNamedExpressionVertex(expressionName: String, sheetId: Double): CellVertex = js.native
    
    /* private */ var fixArraysAfterAddingColumn: Any = js.native
    
    /* private */ var fixArraysAfterAddingRow: Any = js.native
    
    /* private */ var fixArraysAfterRemovingColumns: Any = js.native
    
    /* private */ var fixArraysAfterRemovingRows: Any = js.native
    
    /* private */ var fixRangesWhenAddingColumns: Any = js.native
    
    /* private */ var fixRangesWhenAddingRows: Any = js.native
    
    def forceApplyPostponedTransformations(): Unit = js.native
    
    /* private */ var formulaDependencyQuery: Any = js.native
    
    /* private */ var formulaDirectDependenciesToArray: Any = js.native
    
    val functionRegistry: FunctionRegistry = js.native
    
    def getAdjacentNodesAddresses(inputVertex: Vertex): js.Array[SimpleCellRange_ | SimpleCellAddress_] = js.native
    
    def getAndClearContentChanges(): ContentChanges = js.native
    
    def getArray(range: AbsoluteCellRange): Maybe[ArrayVertex] = js.native
    
    def getArrayVerticesRelatedToRanges(ranges: js.Array[RangeVertex]): Set[ArrayVertex] = js.native
    
    def getCell(address: SimpleCellAddress_): Maybe[CellVertex] = js.native
    
    def getCellValue(address: SimpleCellAddress_): InterpreterValue = js.native
    
    def getRange(start: SimpleCellAddress_, end: SimpleCellAddress_): Maybe[RangeVertex] = js.native
    
    def getRawValue(address: SimpleCellAddress_): RawCellContent = js.native
    
    def getScalarValue(address: SimpleCellAddress_): InternalScalarValue = js.native
    
    def getSheetHeight(sheet: Double): Double = js.native
    
    def getSheetId(sheetName: String): Double = js.native
    
    def getSheetWidth(sheet: Double): Double = js.native
    
    val graph: Graph[Vertex] = js.native
    
    def isArrayInternalCell(address: SimpleCellAddress_): Boolean = js.native
    
    def isThereSpaceForArray(arrayVertex: ArrayVertex): Boolean = js.native
    
    val lazilyTransformingAstService: LazilyTransformingAstService = js.native
    
    def markAsDependentOnStructureChange(vertex: Vertex): Unit = js.native
    
    def markAsVolatile(vertex: Vertex): Unit = js.native
    
    /* private */ var mergeRangeVertices: Any = js.native
    
    def moveCells(sourceRange: AbsoluteCellRange, toRight: Double, toBottom: Double, toSheet: Double): Unit = js.native
    
    val namedExpressions: NamedExpressions = js.native
    
    def processCellDependencies(cellDependencies: js.Array[CellDependency], endVertex: Vertex): Unit = js.native
    
    /* private */ var rangeDependencyQuery: Any = js.native
    
    /* private */ var rangeDirectDependenciesToArray: Any = js.native
    
    val rangeMapping: RangeMapping = js.native
    
    def rawValuesFromRange(range: AbsoluteCellRange): IterableIterator[js.Tuple2[RawScalarValue, SimpleCellAddress_]] = js.native
    
    def removeColumns(removedColumns: ColumnsSpan): EagerChangesGraphChangeResult = js.native
    
    def removeRows(removedRows: RowsSpan): EagerChangesGraphChangeResult = js.native
    
    def removeSheet(removedSheetId: Double): Unit = js.native
    
    /* private */ var removeVertex: Any = js.native
    
    /* private */ var removeVertexAndCleanupDependencies: Any = js.native
    
    /* private */ var setAddressMappingForArrayVertex: Any = js.native
    
    def setArray(range: AbsoluteCellRange, vertex: ArrayVertex): Unit = js.native
    
    def setArrayEmpty(arrayVertex: ArrayVertex): Unit = js.native
    
    def setCellEmpty(address: SimpleCellAddress_): ContentChanges = js.native
    
    def setFormulaToCell(
      address: SimpleCellAddress_,
      ast: Ast,
      dependencies: js.Array[CellDependency],
      size: ArraySize,
      hasVolatileFunction: Boolean,
      hasStructuralChangeFunction: Boolean
    ): ContentChanges = js.native
    
    /* private */ var setNoSpaceIfArray: Any = js.native
    
    def setParsingErrorToCell(address: SimpleCellAddress_, errorVertex: ParsingErrorVertex): ContentChanges = js.native
    
    def setValueToCell(address: SimpleCellAddress_, value: RawAndParsedValue): ContentChanges = js.native
    
    val sheetMapping: SheetMapping = js.native
    
    def shrinkArrayToCorner(array: ArrayVertex): Unit = js.native
    
    /* private */ var shrinkPossibleArrayAndGetCell: Any = js.native
    
    val stats: Statistics = js.native
    
    def topSortWithScc(): TopSortResult[Vertex] = js.native
    
    /* private */ var truncateRanges: Any = js.native
    
    def verticesToRecompute(): Set[Vertex] = js.native
    
    def volatileVertices(): Set[Vertex] = js.native
  }
  /* static members */
  object DependencyGraph {
    
    @JSImport("hyperformula/typings/DependencyGraph/DependencyGraph", "DependencyGraph")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Invariants:
      * - empty cell has associated EmptyCellVertex if and only if it is a dependency (possibly indirect, through range) to some formula
      */
    inline def buildEmpty(
      lazilyTransformingAstService: LazilyTransformingAstService,
      config: Config,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions,
      stats: Statistics
    ): DependencyGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(lazilyTransformingAstService.asInstanceOf[js.Any], config.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[DependencyGraph]
  }
  
  trait ArrayAffectingGraphChangeResult extends StObject {
    
    var affectedArrays: Set[ArrayVertex]
  }
  object ArrayAffectingGraphChangeResult {
    
    inline def apply(affectedArrays: Set[ArrayVertex]): ArrayAffectingGraphChangeResult = {
      val __obj = js.Dynamic.literal(affectedArrays = affectedArrays.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayAffectingGraphChangeResult]
    }
    
    extension [Self <: ArrayAffectingGraphChangeResult](x: Self) {
      
      inline def setAffectedArrays(value: Set[ArrayVertex]): Self = StObject.set(x, "affectedArrays", value.asInstanceOf[js.Any])
    }
  }
  
  trait EagerChangesGraphChangeResult
    extends StObject
       with ArrayAffectingGraphChangeResult {
    
    var contentChanges: ContentChanges
  }
  object EagerChangesGraphChangeResult {
    
    inline def apply(affectedArrays: Set[ArrayVertex], contentChanges: ContentChanges): EagerChangesGraphChangeResult = {
      val __obj = js.Dynamic.literal(affectedArrays = affectedArrays.asInstanceOf[js.Any], contentChanges = contentChanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[EagerChangesGraphChangeResult]
    }
    
    extension [Self <: EagerChangesGraphChangeResult](x: Self) {
      
      inline def setContentChanges(value: ContentChanges): Self = StObject.set(x, "contentChanges", value.asInstanceOf[js.Any])
    }
  }
}
