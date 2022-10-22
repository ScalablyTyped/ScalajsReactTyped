package typingsJapgolly.rcInput.components

import typingsJapgolly.rcInput.esInterfaceMod.InputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcInput {
  
  @JSImport("rc-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcInput.type): SharedBuilder_InputPropsRefAttributes1328539901[InputRef] = new SharedBuilder_InputPropsRefAttributes1328539901[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputProps & RefAttributes[InputRef]): SharedBuilder_InputPropsRefAttributes1328539901[InputRef] = new SharedBuilder_InputPropsRefAttributes1328539901[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
