package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgDefsMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Defs {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Defs")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Defs.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Defs] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Defs](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Defs] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Defs](js.Array(this.component, p.asInstanceOf[js.Any]))
}
