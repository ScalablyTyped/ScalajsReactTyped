package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeNode
  extends StObject
     with TypeNode
     with UnionOrIntersectionTypeNode {
  
  @JSName("kind")
  val kind_UnionTypeNode: typingsJapgolly.typescript.mod.SyntaxKind.UnionType = js.native
  
  val types: NodeArray[TypeNode] = js.native
}
