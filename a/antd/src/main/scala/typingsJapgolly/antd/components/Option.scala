package typingsJapgolly.antd.components

import typingsJapgolly.rcSelect.libOptionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Option {
  
  @JSImport("antd/lib/mentions", "Option")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Option.type): SharedBuilder_OptionProps697812616 = new SharedBuilder_OptionProps697812616(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OptionProps): SharedBuilder_OptionProps697812616 = new SharedBuilder_OptionProps697812616(js.Array(this.component, p.asInstanceOf[js.Any]))
}
