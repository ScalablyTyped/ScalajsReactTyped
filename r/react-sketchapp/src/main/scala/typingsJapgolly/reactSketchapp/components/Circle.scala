package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgCircleMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circle {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Circle")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Circle.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Circle] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Circle](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Circle] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Circle](js.Array(this.component, p.asInstanceOf[js.Any]))
}
