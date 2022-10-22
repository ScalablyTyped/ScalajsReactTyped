package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgClipPathMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClipPath {
  
  @JSImport("react-sketchapp/lib/components/Svg", "ClipPath")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClipPath.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.ClipPath] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.ClipPath](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.ClipPath] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.ClipPath](js.Array(this.component, p.asInstanceOf[js.Any]))
}
