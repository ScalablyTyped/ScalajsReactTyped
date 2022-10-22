package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgStopMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stop {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Stop")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Stop.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Stop] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Stop](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Stop] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Stop](js.Array(this.component, p.asInstanceOf[js.Any]))
}
