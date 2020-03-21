package typingsJapgolly.atlaskitTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitTree.mod.ItemId
import typingsJapgolly.atlaskitTree.mod.Path
import typingsJapgolly.atlaskitTree.mod.RenderItemParams
import typingsJapgolly.atlaskitTree.mod.TreeData
import typingsJapgolly.atlaskitTree.mod.TreeDestinationPosition
import typingsJapgolly.atlaskitTree.mod.TreeProps
import typingsJapgolly.atlaskitTree.mod.TreeSourcePosition
import typingsJapgolly.atlaskitTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  def apply(
    isDragEnabled: Boolean,
    isNestingEnabled: Boolean,
    offsetPerLevel: Double,
    tree: TreeData,
    onCollapse: (ItemId, Path) => Callback,
    onDragEnd: (TreeSourcePosition, js.UndefOr[TreeDestinationPosition]) => Callback,
    onDragStart: ItemId => Callback,
    onExpand: (ItemId, Path) => Callback,
    renderItem: RenderItemParams => CallbackTo[Node],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TreeProps, default, Unit, TreeProps] = {
    val __obj = js.Dynamic.literal(isDragEnabled = isDragEnabled.asInstanceOf[js.Any], isNestingEnabled = isNestingEnabled.asInstanceOf[js.Any], offsetPerLevel = offsetPerLevel.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onCollapse")(js.Any.fromFunction2((t0: typingsJapgolly.atlaskitTree.mod.ItemId, t1: typingsJapgolly.atlaskitTree.mod.Path) => onCollapse(t0, t1).runNow()))
    __obj.updateDynamic("onDragEnd")(js.Any.fromFunction2((t0: typingsJapgolly.atlaskitTree.mod.TreeSourcePosition, t1: js.UndefOr[typingsJapgolly.atlaskitTree.mod.TreeDestinationPosition]) => onDragEnd(t0, t1).runNow()))
    __obj.updateDynamic("onDragStart")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitTree.mod.ItemId) => onDragStart(t0).runNow()))
    __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: typingsJapgolly.atlaskitTree.mod.ItemId, t1: typingsJapgolly.atlaskitTree.mod.Path) => onExpand(t0, t1).runNow()))
    __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: typingsJapgolly.atlaskitTree.mod.RenderItemParams) => renderItem(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atlaskitTree.mod.TreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atlaskitTree.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atlaskitTree.mod.TreeProps])(children: _*)
  }
  @JSImport("@atlaskit/tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

