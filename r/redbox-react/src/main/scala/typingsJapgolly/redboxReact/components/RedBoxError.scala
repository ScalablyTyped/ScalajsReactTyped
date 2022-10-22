package typingsJapgolly.redboxReact.components

import typingsJapgolly.redboxReact.mod.RedBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RedBoxError {
  
  inline def apply(error: js.Error): SharedBuilder_RedBoxProps_815841036[typingsJapgolly.redboxReact.mod.RedBoxError] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new SharedBuilder_RedBoxProps_815841036[typingsJapgolly.redboxReact.mod.RedBoxError](js.Array(this.component, __props.asInstanceOf[RedBoxProps]))
  }
  
  @JSImport("redbox-react", "RedBoxError")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RedBoxProps): SharedBuilder_RedBoxProps_815841036[typingsJapgolly.redboxReact.mod.RedBoxError] = new SharedBuilder_RedBoxProps_815841036[typingsJapgolly.redboxReact.mod.RedBoxError](js.Array(this.component, p.asInstanceOf[js.Any]))
}
