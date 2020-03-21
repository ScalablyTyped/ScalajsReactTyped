package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.treeMod.ITreeProps
import typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tree {
  def apply[T](
    contents: js.Array[ITreeNode[T]],
    className: String = null,
    onNodeClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeCollapse: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeContextMenu: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeDoubleClick: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeExpand: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeMouseEnter: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onNodeMouseLeave: (/* node */ ITreeNode[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITreeProps[T], typingsJapgolly.blueprintjsCore.mod.Tree[T], Unit, ITreeProps[T]] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onNodeClick != null) __obj.updateDynamic("onNodeClick")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeClick(t0, t1, t2).runNow()))
    if (onNodeCollapse != null) __obj.updateDynamic("onNodeCollapse")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeCollapse(t0, t1, t2).runNow()))
    if (onNodeContextMenu != null) __obj.updateDynamic("onNodeContextMenu")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeContextMenu(t0, t1, t2).runNow()))
    if (onNodeDoubleClick != null) __obj.updateDynamic("onNodeDoubleClick")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeDoubleClick(t0, t1, t2).runNow()))
    if (onNodeExpand != null) __obj.updateDynamic("onNodeExpand")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeExpand(t0, t1, t2).runNow()))
    if (onNodeMouseEnter != null) __obj.updateDynamic("onNodeMouseEnter")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeMouseEnter(t0, t1, t2).runNow()))
    if (onNodeMouseLeave != null) __obj.updateDynamic("onNodeMouseLeave")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.blueprintjsCore.treeNodeMod.ITreeNode[T], t1: /* nodePath */ js.Array[scala.Double], t2: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onNodeMouseLeave(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.treeMod.ITreeProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Tree[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.treeMod.ITreeProps[T]])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Tree")
  @js.native
  object componentImport extends js.Object
  
}

