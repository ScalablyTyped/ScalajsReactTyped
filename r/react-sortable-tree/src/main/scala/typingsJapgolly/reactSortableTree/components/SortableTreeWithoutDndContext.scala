package typingsJapgolly.reactSortableTree.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactSortableTree.mod.ReactSortableTreeProps
import typingsJapgolly.reactSortableTree.mod.TreeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SortableTreeWithoutDndContext {
  
  inline def apply[T](onChange: js.Array[TreeItem[T]] => Callback, treeData: js.Array[TreeItem[T]]): SharedBuilder_PropsWithChildren_1594358745[T] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.Array[TreeItem[T]]) => onChange(t0).runNow()), treeData = treeData.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren_1594358745[T](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[ReactSortableTreeProps[T]]]))
  }
  
  @JSImport("react-sortable-tree", "SortableTreeWithoutDndContext")
  @js.native
  val component: js.Object = js.native
  
  def withProps[T](p: PropsWithChildren[ReactSortableTreeProps[T]]): SharedBuilder_PropsWithChildren_1594358745[T] = new SharedBuilder_PropsWithChildren_1594358745[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
