package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typingsJapgolly.hyperformula.typingsArraySizeMod.ArraySize
import typingsJapgolly.hyperformula.typingsCellContentParserMod.RawCellContent
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingChooseAddressMappingPolicyMod.ChooseAddressMapping
import typingsJapgolly.hyperformula.typingsDependencyGraphGraphMod.DependencyQuery
import typingsJapgolly.hyperformula.typingsDependencyGraphValueCellVertexMod.ValueCellVertexValue
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.CellVertex
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typingsJapgolly.hyperformula.typingsI18nMod.TranslationPackage
import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typingsJapgolly.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserAstMod.ParsingError_
import typingsJapgolly.hyperformula.typingsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDependencyGraphMod {
  
  @JSImport("hyperformula/typings/DependencyGraph", "AddressMapping")
  @js.native
  open class AddressMapping protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingAddressMappingMod.AddressMapping {
    def this(policy: ChooseAddressMapping) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayMapping")
  @js.native
  open class ArrayMapping ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphArrayMappingMod.ArrayMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "ArrayVertex")
  @js.native
  open class ArrayVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphFormulaCellVertexMod.ArrayVertex {
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize) = this()
    def this(formula: Ast, cellAddress: SimpleCellAddress_, size: ArraySize, version: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DenseStrategy")
  @js.native
  open class DenseStrategy protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingDenseStrategyMod.DenseStrategy {
    /**
      * @param width - width of the stored sheet
      * @param height - height of the stored sheet
      */
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "DependencyGraph")
  @js.native
  open class DependencyGraph protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph {
    def this(
      addressMapping: typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingAddressMappingMod.AddressMapping,
      rangeMapping: typingsJapgolly.hyperformula.typingsDependencyGraphRangeMappingMod.RangeMapping,
      sheetMapping: typingsJapgolly.hyperformula.typingsDependencyGraphSheetMappingMod.SheetMapping,
      arrayMapping: typingsJapgolly.hyperformula.typingsDependencyGraphArrayMappingMod.ArrayMapping,
      stats: Statistics,
      lazilyTransformingAstService: LazilyTransformingAstService,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions
    ) = this()
  }
  /* static members */
  object DependencyGraph {
    
    @JSImport("hyperformula/typings/DependencyGraph", "DependencyGraph")
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
    ): typingsJapgolly.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEmpty")(lazilyTransformingAstService.asInstanceOf[js.Any], config.asInstanceOf[js.Any], functionRegistry.asInstanceOf[js.Any], namedExpressions.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsDependencyGraphDependencyGraphMod.DependencyGraph]
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "EmptyCellVertex")
  @js.native
  open class EmptyCellVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphEmptyCellVertexMod.EmptyCellVertex
       with CellVertex {
    def this(address: SimpleCellAddress_) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "FormulaCellVertex")
  @js.native
  open class FormulaCellVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphFormulaCellVertexMod.FormulaCellVertex {
    def this(
      /** Formula in AST format */
    formula: Ast,
      /** Address which this vertex represents */
    address: SimpleCellAddress_,
      version: Double
    ) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "Graph")
  @js.native
  open class Graph[T] protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphGraphMod.Graph[T] {
    def this(dependencyQuery: DependencyQuery[T]) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ParsingErrorVertex")
  @js.native
  open class ParsingErrorVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphParsingErrorVertexMod.ParsingErrorVertex
       with CellVertex {
    def this(errors: js.Array[ParsingError_], rawInput: String) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeMapping")
  @js.native
  open class RangeMapping ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphRangeMappingMod.RangeMapping
  
  @JSImport("hyperformula/typings/DependencyGraph", "RangeVertex")
  @js.native
  open class RangeVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphRangeVertexMod.RangeVertex
       with Vertex {
    def this(range: AbsoluteCellRange) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SheetMapping")
  @js.native
  open class SheetMapping protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphSheetMappingMod.SheetMapping {
    def this(languages: TranslationPackage) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "SparseStrategy")
  @js.native
  open class SparseStrategy protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphAddressMappingSparseStrategyMod.SparseStrategy {
    def this(width: Double, height: Double) = this()
  }
  
  @JSImport("hyperformula/typings/DependencyGraph", "ValueCellVertex")
  @js.native
  open class ValueCellVertex protected ()
    extends typingsJapgolly.hyperformula.typingsDependencyGraphValueCellVertexMod.ValueCellVertex
       with CellVertex {
    /** Static cell value. */
    def this(parsedValue: ValueCellVertexValue, rawValue: RawCellContent) = this()
  }
}
