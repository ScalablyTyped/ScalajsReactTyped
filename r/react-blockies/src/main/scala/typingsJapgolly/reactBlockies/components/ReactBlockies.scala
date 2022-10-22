package typingsJapgolly.reactBlockies.components

import typingsJapgolly.reactBlockies.mod.IdenticonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBlockies {
  
  inline def apply(seed: String): SharedBuilder_IdenticonProps118137870 = {
    val __props = js.Dynamic.literal(seed = seed.asInstanceOf[js.Any])
    new SharedBuilder_IdenticonProps118137870(js.Array(this.component, __props.asInstanceOf[IdenticonProps]))
  }
  
  @JSImport("react-blockies", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IdenticonProps): SharedBuilder_IdenticonProps118137870 = new SharedBuilder_IdenticonProps118137870(js.Array(this.component, p.asInstanceOf[js.Any]))
}
