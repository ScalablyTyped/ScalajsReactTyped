package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.get
import typingsJapgolly.babelTypes.babelTypesStrings.method_
import typingsJapgolly.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration_
  - typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration_
  - typingsJapgolly.babelTypes.mod.TSPropertySignature_
  - typingsJapgolly.babelTypes.mod.TSMethodSignature_
  - typingsJapgolly.babelTypes.mod.TSIndexSignature_
*/
trait TSTypeElement
  extends StObject
     with _Node
object TSTypeElement {
  
  inline def TSCallSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSCallSignatureDeclaration_]
  }
  
  inline def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSConstructSignatureDeclaration_]
  }
  
  inline def TSIndexSignature_(parameters: js.Array[Identifier_]): typingsJapgolly.babelTypes.mod.TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, static = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSIndexSignature_]
  }
  
  inline def TSMethodSignature_(
    computed: Boolean,
    key: Expression,
    kind: method_ | get | set,
    parameters: js.Array[Identifier_ | RestElement_]
  ): typingsJapgolly.babelTypes.mod.TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSMethodSignature_]
  }
  
  inline def TSPropertySignature_(computed: Boolean, key: Expression, kind: get | set): typingsJapgolly.babelTypes.mod.TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typingsJapgolly.babelTypes.mod.TSPropertySignature_]
  }
}
