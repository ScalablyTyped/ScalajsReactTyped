package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ImportKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.NewKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty
  extends StObject
     with PrimaryExpression {
  
  val keywordToken: NewKeyword | ImportKeyword = js.native
  
  @JSName("kind")
  val kind_MetaProperty: typingsJapgolly.typescript.mod.SyntaxKind.MetaProperty = js.native
  
  val name: Identifier = js.native
}
