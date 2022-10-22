package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsSketchSketchMod.SketchPickerProps
import typingsJapgolly.reactColor.libComponentsSketchSketchMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sketch {
  
  @JSImport("react-color/lib/components/sketch/Sketch", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Sketch.type): SharedBuilder_SketchPickerProps1987338939[default] = new SharedBuilder_SketchPickerProps1987338939[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SketchPickerProps): SharedBuilder_SketchPickerProps1987338939[default] = new SharedBuilder_SketchPickerProps1987338939[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
