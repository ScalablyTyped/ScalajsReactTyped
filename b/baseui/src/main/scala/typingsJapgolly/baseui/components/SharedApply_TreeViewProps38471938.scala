package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.treeViewMod.TreeNode
import typingsJapgolly.baseui.treeViewMod.TreeViewOverrides
import typingsJapgolly.baseui.treeViewMod.TreeViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TreeViewProps38471938 () {
  val componentImport: js.Any
  def apply(
    data: js.Array[TreeNode],
    onToggle: /* node */ TreeNode => Callback = null,
    overrides: TreeViewOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    singleExpanded: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TreeViewProps, 
    MountedWithRawType[TreeViewProps, js.Object, RawMounted[TreeViewProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.baseui.treeViewMod.TreeNode) => onToggle(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(singleExpanded)) __obj.updateDynamic("singleExpanded")(singleExpanded.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.treeViewMod.TreeViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.treeViewMod.TreeViewProps])(children: _*)
  }
}

