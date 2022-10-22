package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgTspanMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TSpan {
  
  @JSImport("react-sketchapp/lib/components/Svg", "TSpan")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TSpan.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TSpan] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TSpan](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TSpan] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.TSpan](js.Array(this.component, p.asInstanceOf[js.Any]))
}
