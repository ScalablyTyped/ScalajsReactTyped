package typingsJapgolly.rcMentions.components

import typingsJapgolly.rcMentions.esOptionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @JSImport("rc-mentions/es/Option", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Option.type): SharedBuilder_OptionProps1642403849 = new SharedBuilder_OptionProps1642403849(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps1642403849 = new SharedBuilder_OptionProps1642403849(js.Array(this.component, p.asInstanceOf[js.Any]))
}
