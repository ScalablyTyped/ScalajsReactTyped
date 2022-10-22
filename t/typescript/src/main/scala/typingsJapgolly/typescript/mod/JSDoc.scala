package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSDoc
  extends StObject
     with Node {
  
  val comment: js.UndefOr[java.lang.String | NodeArray[JSDocComment]] = js.native
  
  @JSName("kind")
  val kind_JSDoc: typingsJapgolly.typescript.mod.SyntaxKind.JSDoc = js.native
  
  @JSName("parent")
  val parent_JSDoc: HasJSDoc = js.native
  
  val tags: js.UndefOr[NodeArray[JSDocTag]] = js.native
}
