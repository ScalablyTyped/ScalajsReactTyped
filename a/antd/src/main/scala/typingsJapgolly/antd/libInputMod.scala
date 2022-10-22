package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libInputGroupMod.GroupProps
import typingsJapgolly.antd.libInputInputMod.InputProps
import typingsJapgolly.antd.libInputPasswordMod.PasswordProps
import typingsJapgolly.antd.libInputSearchMod.SearchProps
import typingsJapgolly.antd.libInputTextAreaMod.TextAreaProps
import typingsJapgolly.antd.libInputTextAreaMod.TextAreaRef
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputMod extends Shortcut {
  
  @JSImport("antd/lib/input", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] {
    
    var Group: FC[GroupProps] = js.native
    
    var Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[InputRef]] = js.native
    
    var Search: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = js.native
    
    var TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libInputMod.foo` */
  override def _to: CompoundedComponent = default
}
