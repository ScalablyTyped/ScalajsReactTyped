package typingsJapgolly.nivoCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoCore.mod.Def
import typingsJapgolly.nivoCore.mod.DefsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Defs {
  
  inline def apply(defs: js.Array[Def]): Default[js.Object] = {
    val __props = js.Dynamic.literal(defs = defs.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[DefsProps]))
  }
  
  @JSImport("@nivo/core", "Defs")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DefsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
