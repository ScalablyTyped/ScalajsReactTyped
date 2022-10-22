package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgLinearGradientMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("react-sketchapp/lib/components/Svg", "LinearGradient")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: LinearGradient.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.LinearGradient] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.LinearGradient](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.LinearGradient] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.LinearGradient](js.Array(this.component, p.asInstanceOf[js.Any]))
}
