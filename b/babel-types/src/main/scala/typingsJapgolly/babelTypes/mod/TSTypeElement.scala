package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration
  - typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration
  - typingsJapgolly.babelTypes.mod.TSIndexSignature
  - typingsJapgolly.babelTypes.mod.TSMethodSignature
  - typingsJapgolly.babelTypes.mod.TSPropertySignature
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration]
  }
  
  inline def TSConstructSignatureDeclaration(end: Double, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration]
  }
  
  inline def TSIndexSignature(end: Double, loc: SourceLocation, parameters: js.Array[Identifier_], start: Double): typingsJapgolly.babelTypes.mod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSIndexSignature]
  }
  
  inline def TSMethodSignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, optional = null, parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSMethodSignature]
  }
  
  inline def TSPropertySignature(end: Double, key: Expression, loc: SourceLocation, start: Double): typingsJapgolly.babelTypes.mod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], computed = null, initializer = null, optional = null, readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSPropertySignature]
  }
}
