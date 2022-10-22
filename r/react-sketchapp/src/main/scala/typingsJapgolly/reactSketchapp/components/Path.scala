package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Path {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Path")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Path.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Path] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Path](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Path] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Path](js.Array(this.component, p.asInstanceOf[js.Any]))
}
