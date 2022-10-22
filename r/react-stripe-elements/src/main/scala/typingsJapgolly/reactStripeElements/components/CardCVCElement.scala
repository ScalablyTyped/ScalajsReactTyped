package typingsJapgolly.reactStripeElements.components

import typingsJapgolly.reactStripeElements.mod.CardCVCElement_
import typingsJapgolly.reactStripeElements.mod.ReactStripeElements.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardCVCElement {
  
  @JSImport("react-stripe-elements", "CardCVCElement")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardCVCElement.type): SharedBuilder_ElementProps_1851865827[CardCVCElement_] = new SharedBuilder_ElementProps_1851865827[CardCVCElement_](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ElementProps): SharedBuilder_ElementProps_1851865827[CardCVCElement_] = new SharedBuilder_ElementProps_1851865827[CardCVCElement_](js.Array(this.component, p.asInstanceOf[js.Any]))
}
