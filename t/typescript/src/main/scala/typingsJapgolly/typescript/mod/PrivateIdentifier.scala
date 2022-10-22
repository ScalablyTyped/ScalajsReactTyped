package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateIdentifier
  extends StObject
     with PrimaryExpression
     with DeclarationName
     with MemberName
     with PropertyName {
  
  val escapedText: String = js.native
  
  @JSName("kind")
  val kind_PrivateIdentifier: typingsJapgolly.typescript.mod.SyntaxKind.PrivateIdentifier = js.native
  
  val text: java.lang.String = js.native
}
