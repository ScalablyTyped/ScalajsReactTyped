package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsCircleCircleMod.CirclePickerProps
import typingsJapgolly.reactColor.libComponentsCircleCircleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Circle {
  
  @JSImport("react-color/lib/components/circle/Circle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Circle.type): SharedBuilder_CirclePickerProps1396351656[default] = new SharedBuilder_CirclePickerProps1396351656[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CirclePickerProps): SharedBuilder_CirclePickerProps1396351656[default] = new SharedBuilder_CirclePickerProps1396351656[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
