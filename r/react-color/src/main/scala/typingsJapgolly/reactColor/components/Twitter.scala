package typingsJapgolly.reactColor.components

import typingsJapgolly.reactColor.libComponentsTwitterTwitterMod.TwitterPickerProps
import typingsJapgolly.reactColor.libComponentsTwitterTwitterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Twitter {
  
  @JSImport("react-color/lib/components/twitter/Twitter", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Twitter.type): SharedBuilder_TwitterPickerProps1012543526[default] = new SharedBuilder_TwitterPickerProps1012543526[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TwitterPickerProps): SharedBuilder_TwitterPickerProps1012543526[default] = new SharedBuilder_TwitterPickerProps1012543526[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
