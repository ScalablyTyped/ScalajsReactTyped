package typingsJapgolly.reactMdTree

import typingsJapgolly.reactMdTree.typesTypesMod.BaseTreeItem
import typingsJapgolly.reactMdTree.typesTypesMod.TreeData
import typingsJapgolly.reactMdTree.typesTypesMod.TreeItemId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetItemsFromMod {
  
  @JSImport("@react-md/tree/types/getItemsFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getItemsFrom[T /* <: BaseTreeItem */](data: TreeData[T], itemId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getItemsFrom")(data.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
