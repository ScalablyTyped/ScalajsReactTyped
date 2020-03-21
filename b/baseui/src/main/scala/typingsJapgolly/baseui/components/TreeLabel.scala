package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsJapgolly.baseui.treeViewMod.TreeLabelOverrides
import typingsJapgolly.baseui.treeViewMod.TreeLabelProps
import typingsJapgolly.baseui.treeViewMod.TreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeLabel {
  def apply(
    hasChildren: Boolean,
    label: (js.Function1[/* node */ TreeNode, Node]) | String,
    node: TreeNode,
    isExpanded: js.UndefOr[Boolean] = js.undefined,
    overrides: TreeLabelOverrides = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TreeLabelProps, 
    MountedWithRawType[TreeLabelProps, js.Object, RawMounted[TreeLabelProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(hasChildren = hasChildren.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
      if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.treeViewMod.TreeLabelProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.treeViewMod.TreeLabelProps])(children: _*)
  }
  @JSImport("baseui/tree-view", "TreeLabel")
  @js.native
  object componentImport extends js.Object
  
}

