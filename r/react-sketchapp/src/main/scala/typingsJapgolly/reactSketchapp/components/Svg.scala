package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgSvgMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Svg {
  
  @JSImport("react-sketchapp", "Svg")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Svg.type): Default[typingsJapgolly.reactSketchapp.mod.Svg] = new Default[typingsJapgolly.reactSketchapp.mod.Svg](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.mod.Svg] = new Default[typingsJapgolly.reactSketchapp.mod.Svg](js.Array(this.component, p.asInstanceOf[js.Any]))
}
