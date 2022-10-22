package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeMod.ITreeProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTreeTreeNodeMod.TreeNodeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tree {
  
  inline def apply[T](contents: js.Array[TreeNodeInfo[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ITreeProps[T]]))
  }
  
  @JSImport("@blueprintjs/core", "Tree")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Tree[T]] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def onNodeClick(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeClick", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeCollapse(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeCollapse", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeContextMenu(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeContextMenu", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeDoubleClick(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeDoubleClick", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeExpand(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeExpand", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeMouseEnter(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeMouseEnter", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onNodeMouseLeave(
      value: (/* node */ TreeNodeInfo[T], /* nodePath */ js.Array[Double], /* e */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onNodeMouseLeave", js.Any.fromFunction3((t0: /* node */ TreeNodeInfo[T], t1: /* nodePath */ js.Array[Double], t2: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
  }
  
  def withProps[T](p: ITreeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
