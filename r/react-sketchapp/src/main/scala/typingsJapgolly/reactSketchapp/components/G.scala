package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgGMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object G {
  
  @JSImport("react-sketchapp/lib/components/Svg", "G")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: G.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.G] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.G](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.G] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.G](js.Array(this.component, p.asInstanceOf[js.Any]))
}
