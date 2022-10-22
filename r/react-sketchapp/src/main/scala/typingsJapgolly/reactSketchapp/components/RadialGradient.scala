package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgRadialGradientMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadialGradient {
  
  @JSImport("react-sketchapp/lib/components/Svg", "RadialGradient")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadialGradient.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.RadialGradient] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.RadialGradient](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.RadialGradient] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.RadialGradient](js.Array(this.component, p.asInstanceOf[js.Any]))
}
