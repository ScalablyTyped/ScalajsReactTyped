package typingsJapgolly.reactSketchapp.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSketchapp.libComponentsSvgImageMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVGImage {
  
  @JSImport("react-sketchapp/lib/components/Svg/Image", "SVGImage")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SVGImage.type): Default[typingsJapgolly.reactSketchapp.libComponentsSvgImageMod.SVGImage] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgImageMod.SVGImage](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[typingsJapgolly.reactSketchapp.libComponentsSvgImageMod.SVGImage] = new Default[typingsJapgolly.reactSketchapp.libComponentsSvgImageMod.SVGImage](js.Array(this.component, p.asInstanceOf[js.Any]))
}
