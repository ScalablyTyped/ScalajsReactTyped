package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntaxTree extends StObject {
  
  /* private */ var _allDiagnostics: Any
  
  /* private */ var _fileName: Any
  
  /* private */ var _isDeclaration: Any
  
  /* private */ var _lineMap: Any
  
  /* private */ var _parseOptions: Any
  
  /* private */ var _parserDiagnostics: Any
  
  /* private */ var _sourceUnit: Any
  
  /* private */ def computeDiagnostics(): Any
  
  def diagnostics(): js.Array[Diagnostic]
  
  def fileName(): String
  
  def isDeclaration(): Boolean
  
  def lineMap(): LineMap
  
  def parseOptions(): ParseOptions
  
  def sourceUnit(): SourceUnitSyntax
  
  def structuralEquals(tree: SyntaxTree): Boolean
  
  def toJSON(key: Any): Any
}
object SyntaxTree {
  
  inline def apply(
    _allDiagnostics: Any,
    _fileName: Any,
    _isDeclaration: Any,
    _lineMap: Any,
    _parseOptions: Any,
    _parserDiagnostics: Any,
    _sourceUnit: Any,
    computeDiagnostics: CallbackTo[Any],
    diagnostics: CallbackTo[js.Array[Diagnostic]],
    fileName: CallbackTo[String],
    isDeclaration: CallbackTo[Boolean],
    lineMap: CallbackTo[LineMap],
    parseOptions: CallbackTo[ParseOptions],
    sourceUnit: CallbackTo[SourceUnitSyntax],
    structuralEquals: SyntaxTree => Boolean,
    toJSON: Any => Any
  ): SyntaxTree = {
    val __obj = js.Dynamic.literal(_allDiagnostics = _allDiagnostics.asInstanceOf[js.Any], _fileName = _fileName.asInstanceOf[js.Any], _isDeclaration = _isDeclaration.asInstanceOf[js.Any], _lineMap = _lineMap.asInstanceOf[js.Any], _parseOptions = _parseOptions.asInstanceOf[js.Any], _parserDiagnostics = _parserDiagnostics.asInstanceOf[js.Any], _sourceUnit = _sourceUnit.asInstanceOf[js.Any], computeDiagnostics = computeDiagnostics.toJsFn, diagnostics = diagnostics.toJsFn, fileName = fileName.toJsFn, isDeclaration = isDeclaration.toJsFn, lineMap = lineMap.toJsFn, parseOptions = parseOptions.toJsFn, sourceUnit = sourceUnit.toJsFn, structuralEquals = js.Any.fromFunction1(structuralEquals), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[SyntaxTree]
  }
  
  extension [Self <: SyntaxTree](x: Self) {
    
    inline def setComputeDiagnostics(value: CallbackTo[Any]): Self = StObject.set(x, "computeDiagnostics", value.toJsFn)
    
    inline def setDiagnostics(value: CallbackTo[js.Array[Diagnostic]]): Self = StObject.set(x, "diagnostics", value.toJsFn)
    
    inline def setFileName(value: CallbackTo[String]): Self = StObject.set(x, "fileName", value.toJsFn)
    
    inline def setIsDeclaration(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDeclaration", value.toJsFn)
    
    inline def setLineMap(value: CallbackTo[LineMap]): Self = StObject.set(x, "lineMap", value.toJsFn)
    
    inline def setParseOptions(value: CallbackTo[ParseOptions]): Self = StObject.set(x, "parseOptions", value.toJsFn)
    
    inline def setSourceUnit(value: CallbackTo[SourceUnitSyntax]): Self = StObject.set(x, "sourceUnit", value.toJsFn)
    
    inline def setStructuralEquals(value: SyntaxTree => Boolean): Self = StObject.set(x, "structuralEquals", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: Any => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction1(value))
    
    inline def set_allDiagnostics(value: Any): Self = StObject.set(x, "_allDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_fileName(value: Any): Self = StObject.set(x, "_fileName", value.asInstanceOf[js.Any])
    
    inline def set_isDeclaration(value: Any): Self = StObject.set(x, "_isDeclaration", value.asInstanceOf[js.Any])
    
    inline def set_lineMap(value: Any): Self = StObject.set(x, "_lineMap", value.asInstanceOf[js.Any])
    
    inline def set_parseOptions(value: Any): Self = StObject.set(x, "_parseOptions", value.asInstanceOf[js.Any])
    
    inline def set_parserDiagnostics(value: Any): Self = StObject.set(x, "_parserDiagnostics", value.asInstanceOf[js.Any])
    
    inline def set_sourceUnit(value: Any): Self = StObject.set(x, "_sourceUnit", value.asInstanceOf[js.Any])
  }
}
