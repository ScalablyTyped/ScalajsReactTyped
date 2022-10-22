package typingsJapgolly.reactFns.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typingsJapgolly.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeviceOrientation {
  
  @JSImport("react-fns", "DeviceOrientation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFns.mod.DeviceOrientation] {
    
    inline def children(value: (js.Function1[DeviceOrientationProps, Node]) | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: DeviceOrientationProps => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def component(value: ComponentType[DeviceOrientationProps | Unit]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def render(value: DeviceOrientationProps => Node): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: DeviceOrientation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SharedRenderProps[DeviceOrientationProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
