package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDocSignature
  extends StObject
     with JSDocType
     with Declaration
     with DeclarationWithTypeParameters {
  
  @JSName("kind")
  val kind_JSDocSignature: typingsJapgolly.typescript.mod.SyntaxKind.JSDocSignature = js.native
  
  val parameters: js.Array[JSDocParameterTag] = js.native
  
  val `type`: js.UndefOr[JSDocReturnTag] = js.native
  
  val typeParameters: js.UndefOr[js.Array[JSDocTemplateTag]] = js.native
}
