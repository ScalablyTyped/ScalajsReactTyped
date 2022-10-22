package typingsJapgolly.ink.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ink.buildComponentsErrorOverviewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorOverview {
  
  inline def apply(error: js.Error): Default[js.Object] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("ink/build/components/ErrorOverview", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
