package typingsJapgolly.reactGravatar.components

import typingsJapgolly.reactGravatar.mod.Props
import typingsJapgolly.reactGravatar.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGravatar {
  
  @JSImport("react-gravatar", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactGravatar.type): SharedBuilder_Props_1615333234[^] = new SharedBuilder_Props_1615333234[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props_1615333234[^] = new SharedBuilder_Props_1615333234[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
