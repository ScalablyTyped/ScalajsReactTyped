package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsxAttribute
  extends StObject
     with ObjectLiteralElement
     with HasInitializer
     with JsxAttributeLike
     with VariableLikeDeclaration {
  
  val initializer: js.UndefOr[JsxAttributeValue] = js.native
  
  @JSName("kind")
  val kind_JsxAttribute: typingsJapgolly.typescript.mod.SyntaxKind.JsxAttribute = js.native
  
  @JSName("name")
  val name_JsxAttribute: Identifier = js.native
  
  @JSName("parent")
  val parent_JsxAttribute: JsxAttributes = js.native
}
