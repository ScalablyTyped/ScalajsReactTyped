package typingsJapgolly.rcTree.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcTree.mod.InternalTreeNodeProps
import typingsJapgolly.rcTree.mod.TreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TreeNode {
  def apply(
    className: String = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Element | (js.Function1[/* props */ InternalTreeNodeProps, Element]) = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    title: String | Element = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TreeNodeProps, typingsJapgolly.rcTree.mod.TreeNode, Unit, TreeNodeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcTree.mod.TreeNodeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcTree.mod.TreeNode](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTree.mod.TreeNodeProps])(children: _*)
  }
  @JSImport("rc-tree", "TreeNode")
  @js.native
  object componentImport extends js.Object
  
}

