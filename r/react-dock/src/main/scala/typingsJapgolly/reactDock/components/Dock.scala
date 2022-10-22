package typingsJapgolly.reactDock.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactDock.anon.IsResizing
import typingsJapgolly.reactDock.libTypesDockMod.Props
import typingsJapgolly.reactDock.reactDockStrings.bottom
import typingsJapgolly.reactDock.reactDockStrings.left
import typingsJapgolly.reactDock.reactDockStrings.none
import typingsJapgolly.reactDock.reactDockStrings.opaque
import typingsJapgolly.reactDock.reactDockStrings.right
import typingsJapgolly.reactDock.reactDockStrings.top
import typingsJapgolly.reactDock.reactDockStrings.transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dock {
  
  inline def apply(
    defaultSize: Double,
    dimMode: none | transparent | opaque,
    duration: Double,
    fluid: Boolean,
    position: left | right | top | bottom,
    zIndex: Double
  ): Builder = {
    val __props = js.Dynamic.literal(defaultSize = defaultSize.asInstanceOf[js.Any], dimMode = dimMode.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], fluid = fluid.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-dock", "Dock")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactDock.mod.Dock] {
    
    inline def children(value: FunctionComponent[IsResizing] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def dimStyle(value: CSSProperties): this.type = set("dimStyle", value.asInstanceOf[js.Any])
    
    inline def dimStyleNull: this.type = set("dimStyle", null)
    
    inline def dockHiddenStyle(value: CSSProperties): this.type = set("dockHiddenStyle", value.asInstanceOf[js.Any])
    
    inline def dockHiddenStyleNull: this.type = set("dockHiddenStyle", null)
    
    inline def dockStyle(value: CSSProperties): this.type = set("dockStyle", value.asInstanceOf[js.Any])
    
    inline def dockStyleNull: this.type = set("dockStyle", null)
    
    inline def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    inline def onSizeChange(value: /* size */ Double => Callback): this.type = set("onSizeChange", js.Any.fromFunction1((t0: /* size */ Double) => value(t0).runNow()))
    
    inline def onVisibleChange(value: /* isVisible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* isVisible */ Boolean) => value(t0).runNow()))
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
