package typingsJapgolly.reactCurrencyFormat.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactCurrencyFormat.mod.Props
import typingsJapgolly.reactCurrencyFormat.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object ReactCurrencyFormat {
  
  def apply(p: Props): Default[^] = new Default[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-currency-format", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactCurrencyFormat.type): Default[^] = new Default[^](js.Array(this.component, js.Dictionary.empty))()
}
