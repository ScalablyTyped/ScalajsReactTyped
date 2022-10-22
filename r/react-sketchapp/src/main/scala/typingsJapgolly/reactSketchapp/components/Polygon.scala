package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgPolygonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Polygon {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Polygon")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Polygon.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Polygon] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Polygon](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Polygon] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Polygon](js.Array(this.component, p.asInstanceOf[js.Any]))
}
