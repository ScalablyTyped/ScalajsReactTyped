package typingsJapgolly.reactMdTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetTreeItemIdMod {
  
  @JSImport("@react-md/tree/types/getTreeItemId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTreeItemId(treeId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeItemId")(treeId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTreeItemId(treeId: String, index: Double, parentIndexes: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTreeItemId")(treeId.asInstanceOf[js.Any], index.asInstanceOf[js.Any], parentIndexes.asInstanceOf[js.Any])).asInstanceOf[String]
}
