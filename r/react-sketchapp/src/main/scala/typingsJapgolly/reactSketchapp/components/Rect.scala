package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgRectMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Rect")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Rect.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Rect] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Rect](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Rect] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Rect](js.Array(this.component, p.asInstanceOf[js.Any]))
}
