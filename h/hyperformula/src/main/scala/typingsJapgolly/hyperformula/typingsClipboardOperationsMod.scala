package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellContentParserMod.RawCellContent
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.EMPTY
import typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.FORMULA
import typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.PARSING_ERROR
import typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.VALUE
import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsDependencyGraphValueCellVertexMod.ValueCellVertexValue
import typingsJapgolly.hyperformula.typingsOperationsMod.Operations
import typingsJapgolly.hyperformula.typingsParserAstMod.ParsingError_
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsClipboardOperationsMod {
  
  @js.native
  sealed trait ClipboardCellType extends StObject
  @JSImport("hyperformula/typings/ClipboardOperations", "ClipboardCellType")
  @js.native
  object ClipboardCellType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ClipboardCellType & Double] = js.native
    
    @js.native
    sealed trait EMPTY
      extends StObject
         with ClipboardCellType
    /* 1 */ val EMPTY: typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.EMPTY & Double = js.native
    
    @js.native
    sealed trait FORMULA
      extends StObject
         with ClipboardCellType
    /* 2 */ val FORMULA: typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.FORMULA & Double = js.native
    
    @js.native
    sealed trait PARSING_ERROR
      extends StObject
         with ClipboardCellType
    /* 3 */ val PARSING_ERROR: typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.PARSING_ERROR & Double = js.native
    
    @js.native
    sealed trait VALUE
      extends StObject
         with ClipboardCellType
    /* 0 */ val VALUE: typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellType.VALUE & Double = js.native
  }
  
  @js.native
  sealed trait ClipboardOperationType extends StObject
  @JSImport("hyperformula/typings/ClipboardOperations", "ClipboardOperationType")
  @js.native
  object ClipboardOperationType extends StObject {
    
    @js.native
    sealed trait COPY
      extends StObject
         with ClipboardOperationType
    
    @js.native
    sealed trait CUT
      extends StObject
         with ClipboardOperationType
  }
  
  @JSImport("hyperformula/typings/ClipboardOperations", "ClipboardOperations")
  @js.native
  open class ClipboardOperations protected () extends StObject {
    def this(config: Config, dependencyGraph: DependencyGraph, operations: Operations) = this()
    
    def abortCut(): Unit = js.native
    
    def clear(): Unit = js.native
    
    var clipboard: js.UndefOr[Clipboard] = js.native
    
    def copy(leftCorner: SimpleCellAddress_, width: Double, height: Double): Unit = js.native
    
    def cut(leftCorner: SimpleCellAddress_, width: Double, height: Double): Unit = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    def ensureItIsPossibleToCopyPaste(destinationLeftCorner: SimpleCellAddress_): Unit = js.native
    
    def isCopyClipboard(): Boolean = js.native
    
    def isCutClipboard(): Boolean = js.native
    
    /* private */ var maxColumns: Any = js.native
    
    /* private */ var maxRows: Any = js.native
    
    /* private */ val operations: Any = js.native
  }
  
  trait Clipboard extends StObject {
    
    val content: js.UndefOr[js.Array[js.Array[ClipboardCell]]] = js.undefined
    
    def getContent(leftCorner: SimpleCellAddress_): IterableIterator[js.Tuple2[SimpleCellAddress_, ClipboardCell]]
    
    val height: Double
    
    val sourceLeftCorner: SimpleCellAddress_
    
    val `type`: ClipboardOperationType
    
    val width: Double
  }
  object Clipboard {
    
    inline def apply(
      getContent: SimpleCellAddress_ => IterableIterator[js.Tuple2[SimpleCellAddress_, ClipboardCell]],
      height: Double,
      sourceLeftCorner: SimpleCellAddress_,
      `type`: ClipboardOperationType,
      width: Double
    ): Clipboard = {
      val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction1(getContent), height = height.asInstanceOf[js.Any], sourceLeftCorner = sourceLeftCorner.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clipboard]
    }
    
    extension [Self <: Clipboard](x: Self) {
      
      inline def setContent(value: js.Array[js.Array[ClipboardCell]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: js.Array[ClipboardCell]*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setGetContent(value: SimpleCellAddress_ => IterableIterator[js.Tuple2[SimpleCellAddress_, ClipboardCell]]): Self = StObject.set(x, "getContent", js.Any.fromFunction1(value))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setSourceLeftCorner(value: SimpleCellAddress_): Self = StObject.set(x, "sourceLeftCorner", value.asInstanceOf[js.Any])
      
      inline def setType(value: ClipboardOperationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellValue
    - typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellFormula
    - typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellEmpty
    - typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellParsingError
  */
  trait ClipboardCell extends StObject
  object ClipboardCell {
    
    inline def ClipboardCellEmpty(`type`: EMPTY): typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellEmpty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellEmpty]
    }
    
    inline def ClipboardCellFormula(hash: String, `type`: FORMULA): typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellFormula = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellFormula]
    }
    
    inline def ClipboardCellParsingError(errors: js.Array[ParsingError_], rawInput: String, `type`: PARSING_ERROR): typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellParsingError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellParsingError]
    }
    
    inline def ClipboardCellValue(parsedValue: ValueCellVertexValue, `type`: VALUE): typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellValue = {
      val __obj = js.Dynamic.literal(parsedValue = parsedValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.hyperformula.typingsClipboardOperationsMod.ClipboardCellValue]
    }
  }
  
  trait ClipboardCellEmpty
    extends StObject
       with ClipboardCell {
    
    var `type`: EMPTY
  }
  object ClipboardCellEmpty {
    
    inline def apply(`type`: EMPTY): ClipboardCellEmpty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardCellEmpty]
    }
    
    extension [Self <: ClipboardCellEmpty](x: Self) {
      
      inline def setType(value: EMPTY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClipboardCellFormula
    extends StObject
       with ClipboardCell {
    
    var hash: String
    
    var `type`: FORMULA
  }
  object ClipboardCellFormula {
    
    inline def apply(hash: String, `type`: FORMULA): ClipboardCellFormula = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardCellFormula]
    }
    
    extension [Self <: ClipboardCellFormula](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setType(value: FORMULA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClipboardCellParsingError
    extends StObject
       with ClipboardCell {
    
    var errors: js.Array[ParsingError_]
    
    var rawInput: String
    
    var `type`: PARSING_ERROR
  }
  object ClipboardCellParsingError {
    
    inline def apply(errors: js.Array[ParsingError_], rawInput: String, `type`: PARSING_ERROR): ClipboardCellParsingError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardCellParsingError]
    }
    
    extension [Self <: ClipboardCellParsingError](x: Self) {
      
      inline def setErrors(value: js.Array[ParsingError_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParsingError_ *): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setRawInput(value: String): Self = StObject.set(x, "rawInput", value.asInstanceOf[js.Any])
      
      inline def setType(value: PARSING_ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClipboardCellValue
    extends StObject
       with ClipboardCell {
    
    var parsedValue: ValueCellVertexValue
    
    var rawValue: RawCellContent
    
    var `type`: VALUE
  }
  object ClipboardCellValue {
    
    inline def apply(parsedValue: ValueCellVertexValue, `type`: VALUE): ClipboardCellValue = {
      val __obj = js.Dynamic.literal(parsedValue = parsedValue.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipboardCellValue]
    }
    
    extension [Self <: ClipboardCellValue](x: Self) {
      
      inline def setParsedValue(value: ValueCellVertexValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
      
      inline def setRawValue(value: RawCellContent): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      inline def setRawValueNull: Self = StObject.set(x, "rawValue", null)
      
      inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
      
      inline def setType(value: VALUE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
