package typingsJapgolly.reactDaumPostcode.components

import typingsJapgolly.reactDaumPostcode.libDaumPostcodeEmbedMod.DaumPostcodeEmbedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DaumPostcodeEmbed {
  
  @JSImport("react-daum-postcode", "DaumPostcodeEmbed")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DaumPostcodeEmbed.type): SharedBuilder_DaumPostcodeEmbedProps_1474577793[typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeEmbed] = new SharedBuilder_DaumPostcodeEmbedProps_1474577793[typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeEmbed](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DaumPostcodeEmbedProps): SharedBuilder_DaumPostcodeEmbedProps_1474577793[typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeEmbed] = new SharedBuilder_DaumPostcodeEmbedProps_1474577793[typingsJapgolly.reactDaumPostcode.mod.DaumPostcodeEmbed](js.Array(this.component, p.asInstanceOf[js.Any]))
}
