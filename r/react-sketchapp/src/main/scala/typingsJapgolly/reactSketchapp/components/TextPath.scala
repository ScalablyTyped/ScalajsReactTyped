package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgTextPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextPath {
  
  @JSImport("react-sketchapp/lib/components/Svg", "TextPath")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextPath.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TextPath] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TextPath](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TextPath] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TextPath](js.Array(this.component, p.asInstanceOf[js.Any]))
}
