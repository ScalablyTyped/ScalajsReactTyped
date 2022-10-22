package typingsJapgolly.antd.components

import typingsJapgolly.antd.libInputTextAreaMod.TextAreaProps
import typingsJapgolly.antd.libInputTextAreaMod.TextAreaRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  @JSImport("antd/lib/input/TextArea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextArea.type): SharedBuilder_TextAreaPropsRefAttributes668919691[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes668919691[TextAreaRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextAreaProps & RefAttributes[TextAreaRef]): SharedBuilder_TextAreaPropsRefAttributes668919691[TextAreaRef] = new SharedBuilder_TextAreaPropsRefAttributes668919691[TextAreaRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
