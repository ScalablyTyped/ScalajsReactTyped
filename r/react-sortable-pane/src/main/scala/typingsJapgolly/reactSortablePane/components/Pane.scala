package typingsJapgolly.reactSortablePane.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSortablePane.anon.Height
import typingsJapgolly.reactSortablePane.libPaneMod.IsPaneResizable
import typingsJapgolly.reactSortablePane.libPaneMod.PaneProps
import typingsJapgolly.reactSortablePane.libPaneMod.PaneSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pane {
  
  @JSImport("react-sortable-pane", "Pane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSortablePane.mod.Pane] {
    
    inline def children(value: String | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultSize(value: Height): this.type = set("defaultSize", value.asInstanceOf[js.Any])
    
    inline def grid(value: js.Tuple2[Double, Double]): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: PaneSize): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: PaneSize): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: PaneSize): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: PaneSize): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def onSizeChange(value: Callback): this.type = set("onSizeChange", value.toJsFn)
    
    inline def resizable(value: IsPaneResizable): this.type = set("resizable", value.asInstanceOf[js.Any])
    
    inline def size(value: Height): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
