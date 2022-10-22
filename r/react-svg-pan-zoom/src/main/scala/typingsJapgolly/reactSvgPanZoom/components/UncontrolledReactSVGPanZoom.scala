package typingsJapgolly.reactSvgPanZoom.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactSvgPanZoom.anon.Background
import typingsJapgolly.reactSvgPanZoom.anon.Position
import typingsJapgolly.reactSvgPanZoom.mod.Tool
import typingsJapgolly.reactSvgPanZoom.mod.UncontrolledProps
import typingsJapgolly.reactSvgPanZoom.mod.Value
import typingsJapgolly.reactSvgPanZoom.mod.ViewerMouseEvent
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UncontrolledReactSVGPanZoom {
  
  inline def apply(height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UncontrolledProps]))
  }
  
  @JSImport("react-svg-pan-zoom", "UncontrolledReactSVGPanZoom")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSvgPanZoom.mod.UncontrolledReactSVGPanZoom] {
    
    inline def SVGBackground(value: String): this.type = set("SVGBackground", value.asInstanceOf[js.Any])
    
    inline def background(value: String): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def customMiniature(value: Element | ComponentType[js.Object]): this.type = set("customMiniature", value.asInstanceOf[js.Any])
    
    inline def customMiniatureVdomElement(value: VdomElement): this.type = set("customMiniature", value.rawElement.asInstanceOf[js.Any])
    
    inline def customToolbar(value: (Component[Any & js.Object, js.Object]) | FunctionComponent[Any]): this.type = set("customToolbar", value.asInstanceOf[js.Any])
    
    inline def defaultTool(value: Exclude[Tool, /* "auto" */ String]): this.type = set("defaultTool", value.asInstanceOf[js.Any])
    
    inline def detectAutoPan(value: Boolean): this.type = set("detectAutoPan", value.asInstanceOf[js.Any])
    
    inline def detectPinchGesture(value: Boolean): this.type = set("detectPinchGesture", value.asInstanceOf[js.Any])
    
    inline def detectWheel(value: Boolean): this.type = set("detectWheel", value.asInstanceOf[js.Any])
    
    inline def disableDoubleClickZoomWithToolAuto(value: Boolean): this.type = set("disableDoubleClickZoomWithToolAuto", value.asInstanceOf[js.Any])
    
    inline def miniatureProps(value: Background): this.type = set("miniatureProps", value.asInstanceOf[js.Any])
    
    inline def modifierKeys(value: js.Array[String]): this.type = set("modifierKeys", value.asInstanceOf[js.Any])
    
    inline def modifierKeysVarargs(value: String*): this.type = set("modifierKeys", js.Array(value*))
    
    inline def onChangeTool(value: /* tool */ Tool => Callback): this.type = set("onChangeTool", js.Any.fromFunction1((t0: /* tool */ Tool) => value(t0).runNow()))
    
    inline def onChangeValue(value: /* value */ Value => Callback): this.type = set("onChangeValue", js.Any.fromFunction1((t0: /* value */ Value) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onDoubleClick(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onMouseDown(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onMouseMove(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onMouseUp(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onPan(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onPan", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def onZoom(value: /* event */ ViewerMouseEvent[Any] => Callback): this.type = set("onZoom", js.Any.fromFunction1((t0: /* event */ ViewerMouseEvent[Any]) => value(t0).runNow()))
    
    inline def preventPanOutside(value: Boolean): this.type = set("preventPanOutside", value.asInstanceOf[js.Any])
    
    inline def scaleFactor(value: Double): this.type = set("scaleFactor", value.asInstanceOf[js.Any])
    
    inline def scaleFactorMax(value: Double): this.type = set("scaleFactorMax", value.asInstanceOf[js.Any])
    
    inline def scaleFactorMin(value: Double): this.type = set("scaleFactorMin", value.asInstanceOf[js.Any])
    
    inline def scaleFactorOnWheel(value: Double): this.type = set("scaleFactorOnWheel", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tool(value: Tool): this.type = set("tool", value.asInstanceOf[js.Any])
    
    inline def toolbarProps(value: Position): this.type = set("toolbarProps", value.asInstanceOf[js.Any])
    
    inline def value(value: Value): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: UncontrolledProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
