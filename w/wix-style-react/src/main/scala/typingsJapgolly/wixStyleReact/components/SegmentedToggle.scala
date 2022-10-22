package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSegmentedToggleMod.SegmentedToggleProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedToggle {
  
  inline def apply(children: js.Array[Any]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SegmentedToggleProps]))
  }
  
  @JSImport("wix-style-react", "SegmentedToggle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SegmentedToggle] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def defaultSelected(value: VdomNode): this.type = set("defaultSelected", value.rawNode.asInstanceOf[js.Any])
    
    inline def defaultSelectedNull: this.type = set("defaultSelected", null)
    
    inline def defaultSelectedVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("defaultSelected", js.Array(value*))
    
    inline def defaultSelectedVdomElement(value: VdomElement): this.type = set("defaultSelected", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onClick(value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ String) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ String) => (value(t0, t1)).runNow()))
    
    inline def selected(value: VdomNode): this.type = set("selected", value.rawNode.asInstanceOf[js.Any])
    
    inline def selectedNull: this.type = set("selected", null)
    
    inline def selectedVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("selected", js.Array(value*))
    
    inline def selectedVdomElement(value: VdomElement): this.type = set("selected", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentedToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
