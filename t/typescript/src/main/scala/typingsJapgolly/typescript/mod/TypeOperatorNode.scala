package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.KeyOfKeyword
import typingsJapgolly.typescript.mod.SyntaxKind.TypeOperator
import typingsJapgolly.typescript.mod.SyntaxKind.UniqueKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOperatorNode
  extends StObject
     with TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_TypeOperatorNode: TypeOperator = js.native
  
  val operator: KeyOfKeyword | UniqueKeyword | typingsJapgolly.typescript.mod.SyntaxKind.ReadonlyKeyword = js.native
  
  val `type`: TypeNode = js.native
}
