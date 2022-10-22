package typingsJapgolly.reactDaumPostcode.components

import typingsJapgolly.reactDaumPostcode.libDaumPostcodeEmbedMod.DaumPostcodeEmbedProps
import typingsJapgolly.reactDaumPostcode.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDaumPostcode {
  
  @JSImport("react-daum-postcode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactDaumPostcode.type): SharedBuilder_DaumPostcodeEmbedProps_1474577793[default] = new SharedBuilder_DaumPostcodeEmbedProps_1474577793[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DaumPostcodeEmbedProps): SharedBuilder_DaumPostcodeEmbedProps_1474577793[default] = new SharedBuilder_DaumPostcodeEmbedProps_1474577793[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
