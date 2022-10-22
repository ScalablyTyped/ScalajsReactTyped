package typingsJapgolly.reactToolbox.components

import typingsJapgolly.reactToolbox.componentsRadioMod.default
import typingsJapgolly.reactToolbox.componentsRadioRadioButtonMod.RadioButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Radio {
  
  @JSImport("react-toolbox/components/radio", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Radio.type): SharedBuilder_RadioButtonProps198233501[default] = new SharedBuilder_RadioButtonProps198233501[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioButtonProps): SharedBuilder_RadioButtonProps198233501[default] = new SharedBuilder_RadioButtonProps198233501[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
