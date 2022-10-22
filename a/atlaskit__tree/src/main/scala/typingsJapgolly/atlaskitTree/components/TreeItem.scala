package typingsJapgolly.atlaskitTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeItemMod.default
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeItemTreeItemTypesMod.Props
import typingsJapgolly.atlaskitTree.distTypesComponentsTreeItemTreeItemTypesMod.RenderItemParams
import typingsJapgolly.atlaskitTree.distTypesTypesMod.ItemId
import typingsJapgolly.atlaskitTree.distTypesTypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeItem {
  
  inline def apply(
    item: typingsJapgolly.atlaskitTree.distTypesTypesMod.TreeItem,
    itemRef: (ItemId, js.UndefOr[HTMLElement]) => Callback,
    offsetPerLevel: Double,
    onCollapse: (ItemId, Path) => Callback,
    onExpand: (ItemId, Path) => Callback,
    path: Path,
    provided: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableProvided */ Any,
    renderItem: RenderItemParams => Node,
    snapshot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraggableStateSnapshot */ Any
  ): Default[default] = {
    val __props = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemRef = js.Any.fromFunction2((t0: ItemId, t1: js.UndefOr[HTMLElement]) => (itemRef(t0, t1)).runNow()), offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], onCollapse = js.Any.fromFunction2((t0: ItemId, t1: Path) => (onCollapse(t0, t1)).runNow()), onExpand = js.Any.fromFunction2((t0: ItemId, t1: Path) => (onExpand(t0, t1)).runNow()), path = path.asInstanceOf[js.Any], provided = provided.asInstanceOf[js.Any], renderItem = js.Any.fromFunction1(renderItem), snapshot = snapshot.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@atlaskit/tree/dist/types/components/TreeItem", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
