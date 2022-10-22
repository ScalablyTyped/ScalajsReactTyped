package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocCallbackTag
  extends StObject
     with JSDocTag
     with NamedDeclaration
     with DeclarationWithTypeParameters {
  
  val fullName: js.UndefOr[JSDocNamespaceDeclaration | Identifier] = js.native
  
  @JSName("kind")
  val kind_JSDocCallbackTag: typingsJapgolly.typescript.mod.SyntaxKind.JSDocCallbackTag = js.native
  
  @JSName("name")
  val name_JSDocCallbackTag: js.UndefOr[Identifier] = js.native
  
  @JSName("parent")
  val parent_JSDocCallbackTag: JSDoc = js.native
  
  val typeExpression: JSDocSignature = js.native
}
