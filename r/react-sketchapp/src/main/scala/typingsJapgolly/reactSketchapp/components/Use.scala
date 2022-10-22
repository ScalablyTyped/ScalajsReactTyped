package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgUseMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Use {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Use")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Use.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Use] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Use](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Use] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Use](js.Array(this.component, p.asInstanceOf[js.Any]))
}
