package typingsJapgolly.reactSpinner.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSpinner.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSpinner {
  
  @JSImport("react-spinner", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactSpinner.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
