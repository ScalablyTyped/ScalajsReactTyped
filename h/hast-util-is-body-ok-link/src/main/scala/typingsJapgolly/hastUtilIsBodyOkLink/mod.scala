package typingsJapgolly.hastUtilIsBodyOkLink

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-is-body-ok-link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isBodyOkLink(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBodyOkLink")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Node = Root | (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<hast.hast.RootContent>[number] */ js.Any)
  
  type Root = typingsJapgolly.hast.mod.Root
}
