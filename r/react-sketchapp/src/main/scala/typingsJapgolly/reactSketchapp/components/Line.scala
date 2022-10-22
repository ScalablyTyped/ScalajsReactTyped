package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgLineMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Line {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Line")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Line.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Line] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Line](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Line] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Line](js.Array(this.component, p.asInstanceOf[js.Any]))
}
