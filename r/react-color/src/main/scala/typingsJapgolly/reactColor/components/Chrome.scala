package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsChromeChromeMod.ChromePickerProps
import typingsJapgolly.reactColor.libComponentsChromeChromeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chrome {
  
  @JSImport("react-color/lib/components/chrome/Chrome", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Chrome.type): SharedBuilder_ChromePickerProps1743727706[default] = new SharedBuilder_ChromePickerProps1743727706[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChromePickerProps): SharedBuilder_ChromePickerProps1743727706[default] = new SharedBuilder_ChromePickerProps1743727706[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
