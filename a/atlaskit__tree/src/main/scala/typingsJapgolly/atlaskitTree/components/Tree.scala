package typingsJapgolly.atlaskitTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeItemTreeItemTypesMod.RenderItemParams
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeTreeTypesMod.Props
import typingsJapgolly.atlaskitTree.distTypesTypesMod.ItemId
import typingsJapgolly.atlaskitTree.distTypesTypesMod.Path
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeData
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeDestinationPosition
import typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeSourcePosition
import typingsJapgolly.atlaskitTree.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  inline def apply(
    isDragEnabled: Boolean | (js.Function1[/* item */ typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeItem, Boolean]),
    isNestingEnabled: Boolean,
    offsetPerLevel: Double,
    onCollapse: (ItemId, Path) => Callback,
    onDragEnd: (TreeSourcePosition, js.UndefOr[TreeDestinationPosition]) => Callback,
    onDragStart: ItemId => Callback,
    onExpand: (ItemId, Path) => Callback,
    renderItem: RenderItemParams => Node,
    tree: TreeData
  ): Default[default] = {
    val __props = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction2((t0: ItemId, t1: Path) => (onCollapse(t0, t1)).runNow()), onDragEnd = js.Any.fromFunction2((t0: TreeSourcePosition, t1: js.UndefOr[TreeDestinationPosition]) => (onDragEnd(t0, t1)).runNow()), onDragStart = js.Any.fromFunction1((t0: ItemId) => onDragStart(t0).runNow()), onExpand = js.Any.fromFunction2((t0: ItemId, t1: Path) => (onExpand(t0, t1)).runNow()), renderItem = js.Any.fromFunction1(renderItem), tree = tree.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@atlaskit/tree", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
