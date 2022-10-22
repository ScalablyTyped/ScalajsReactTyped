package typingsJapgolly.antd.components

import typingsJapgolly.antd.libInputPasswordMod.PasswordProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Password {
  
  @JSImport("antd/lib/input/Password", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Password.type): SharedBuilder_PasswordPropsRefAttributes1908377722[InputRef] = new SharedBuilder_PasswordPropsRefAttributes1908377722[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PasswordProps & RefAttributes[InputRef]): SharedBuilder_PasswordPropsRefAttributes1908377722[InputRef] = new SharedBuilder_PasswordPropsRefAttributes1908377722[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
