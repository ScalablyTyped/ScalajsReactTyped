package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgPatternMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pattern {
  
  @JSImport("react-sketchapp/lib/components/Svg", "Pattern")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Pattern.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Pattern] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Pattern](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Pattern] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgMod.Pattern](js.Array(this.component, p.asInstanceOf[js.Any]))
}
