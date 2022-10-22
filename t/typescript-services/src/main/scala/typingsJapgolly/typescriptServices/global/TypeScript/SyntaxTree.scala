package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SyntaxTree")
@js.native
open class SyntaxTree protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.SyntaxTree {
  def this(
    sourceUnit: typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax,
    isDeclaration: Boolean,
    diagnostics: js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic],
    fileName: String,
    lineMap: typingsJapgolly.typescriptServices.TypeScript.LineMap,
    parseOtions: typingsJapgolly.typescriptServices.TypeScript.ParseOptions
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allDiagnostics: Any = js.native
  
  /* private */ /* CompleteClass */
  var _fileName: Any = js.native
  
  /* private */ /* CompleteClass */
  var _isDeclaration: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineMap: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parseOptions: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parserDiagnostics: Any = js.native
  
  /* private */ /* CompleteClass */
  var _sourceUnit: Any = js.native
  
  /* private */ /* CompleteClass */
  override def computeDiagnostics(): Any = js.native
  
  /* CompleteClass */
  override def diagnostics(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Diagnostic] = js.native
  
  /* CompleteClass */
  override def fileName(): String = js.native
  
  /* CompleteClass */
  override def isDeclaration(): Boolean = js.native
  
  /* CompleteClass */
  override def lineMap(): typingsJapgolly.typescriptServices.TypeScript.LineMap = js.native
  
  /* CompleteClass */
  override def parseOptions(): typingsJapgolly.typescriptServices.TypeScript.ParseOptions = js.native
  
  /* CompleteClass */
  override def sourceUnit(): typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax = js.native
  
  /* CompleteClass */
  override def structuralEquals(tree: typingsJapgolly.typescriptServices.TypeScript.SyntaxTree): Boolean = js.native
  
  /* CompleteClass */
  override def toJSON(key: Any): Any = js.native
}
