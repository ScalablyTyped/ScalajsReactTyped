package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.libMod.TSCallSignatureDeclaration__
  - typingsJapgolly.babelTypes.libMod.TSConstructSignatureDeclaration__
  - typingsJapgolly.babelTypes.libMod.TSPropertySignature__
  - typingsJapgolly.babelTypes.libMod.TSMethodSignature__
  - typingsJapgolly.babelTypes.libMod.TSIndexSignature__
*/
trait TSTypeElement extends StObject
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.libMod.TSCallSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSCallSignatureDeclaration__]
  }
  
  inline def TSConstructSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.libMod.TSConstructSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSConstructSignatureDeclaration__]
  }
  
  inline def TSIndexSignature__(parameters: js.Array[Identifier_]): typingsJapgolly.babelTypes.libMod.TSIndexSignature__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSIndexSignature__]
  }
  
  inline def TSMethodSignature__(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.libMod.TSMethodSignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSMethodSignature__]
  }
  
  inline def TSPropertySignature__(key: Expression, kind: get | set): typingsJapgolly.babelTypes.libMod.TSPropertySignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.libMod.TSPropertySignature__]
  }
}
