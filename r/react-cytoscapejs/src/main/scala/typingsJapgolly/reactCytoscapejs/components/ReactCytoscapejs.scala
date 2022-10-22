package typingsJapgolly.reactCytoscapejs.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cytoscape.mod.Core
import typingsJapgolly.cytoscape.mod.ElementDefinition
import typingsJapgolly.cytoscape.mod.LayoutOptions
import typingsJapgolly.cytoscape.mod.Position
import typingsJapgolly.cytoscape.mod.Stylesheet
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCytoscapejs.mod.CytoscapeComponentProps
import typingsJapgolly.reactCytoscapejs.mod.default
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCytoscapejs {
  
  inline def apply(elements: js.Array[ElementDefinition]): Builder = {
    val __props = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CytoscapeComponentProps]))
  }
  
  @JSImport("react-cytoscapejs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autolock(value: Boolean): this.type = set("autolock", value.asInstanceOf[js.Any])
    
    inline def autoungrabify(value: Boolean): this.type = set("autoungrabify", value.asInstanceOf[js.Any])
    
    inline def autounselectify(value: Boolean): this.type = set("autounselectify", value.asInstanceOf[js.Any])
    
    inline def boxSelectionEnabled(value: Boolean): this.type = set("boxSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cy(value: /* cy */ Core => Callback): this.type = set("cy", js.Any.fromFunction1((t0: /* cy */ Core) => value(t0).runNow()))
    
    inline def diff(value: (/* objA */ Record[String, Any], /* objB */ Record[String, Any]) => Boolean): this.type = set("diff", js.Any.fromFunction2(value))
    
    inline def forEach(
      value: (/* list */ js.Array[Any], /* iterator */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]) => Callback
    ): this.type = set("forEach", js.Any.fromFunction2((t0: /* list */ js.Array[Any], t1: /* iterator */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]) => (value(t0, t1)).runNow()))
    
    inline def get(value: (/* obj */ Record[String, Any], /* key */ String) => Any): this.type = set("get", js.Any.fromFunction2(value))
    
    inline def headless(value: Boolean): this.type = set("headless", value.asInstanceOf[js.Any])
    
    inline def hideEdgesOnViewport(value: Boolean): this.type = set("hideEdgesOnViewport", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def layout(value: LayoutOptions): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
    
    inline def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
    
    inline def motionBlur(value: Boolean): this.type = set("motionBlur", value.asInstanceOf[js.Any])
    
    inline def motionBlurOpacity(value: Double): this.type = set("motionBlurOpacity", value.asInstanceOf[js.Any])
    
    inline def pan(value: Position): this.type = set("pan", value.asInstanceOf[js.Any])
    
    inline def panningEnabled(value: Boolean): this.type = set("panningEnabled", value.asInstanceOf[js.Any])
    
    inline def pixelRatio(value: Double | String): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleEnabled(value: Boolean): this.type = set("styleEnabled", value.asInstanceOf[js.Any])
    
    inline def stylesheet(value: Stylesheet | js.Array[Stylesheet] | String): this.type = set("stylesheet", value.asInstanceOf[js.Any])
    
    inline def stylesheetVarargs(value: Stylesheet*): this.type = set("stylesheet", js.Array(value*))
    
    inline def textureOnViewport(value: Boolean): this.type = set("textureOnViewport", value.asInstanceOf[js.Any])
    
    inline def toJson(value: /* obj */ Record[String, Any] => Any): this.type = set("toJson", js.Any.fromFunction1(value))
    
    inline def userPanningEnabled(value: Boolean): this.type = set("userPanningEnabled", value.asInstanceOf[js.Any])
    
    inline def userZoomingEnabled(value: Boolean): this.type = set("userZoomingEnabled", value.asInstanceOf[js.Any])
    
    inline def wheelSensitivity(value: Double): this.type = set("wheelSensitivity", value.asInstanceOf[js.Any])
    
    inline def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
    
    inline def zoomingEnabled(value: Boolean): this.type = set("zoomingEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CytoscapeComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
