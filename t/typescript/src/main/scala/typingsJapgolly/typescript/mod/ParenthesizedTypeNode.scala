package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesizedTypeNode
  extends StObject
     with TypeNode
     with HasType {
  
  @JSName("kind")
  val kind_ParenthesizedTypeNode: ParenthesizedType = js.native
  
  val `type`: TypeNode = js.native
}
