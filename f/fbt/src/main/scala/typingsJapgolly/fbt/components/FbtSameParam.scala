package typingsJapgolly.fbt.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.fbt.mod.FbtSameParamProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FbtSameParam {
  
  inline def apply(name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[FbtSameParamProps]))
  }
  
  @JSImport("fbt", "FbtSameParam")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FbtSameParamProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
