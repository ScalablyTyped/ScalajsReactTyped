package typingsJapgolly.reactTextareaAutosize.components

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactTextareaAutosize.distDeclarationsSrcMod.TextareaAutosizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTextareaAutosizeDotcjs {
  
  @JSImport("react-textarea-autosize/dist/react-textarea-autosize.cjs", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactTextareaAutosizeDotcjs.type): SharedBuilder_TextareaAutosizePropsRefAttributes_395642423[HTMLTextAreaElement] = new SharedBuilder_TextareaAutosizePropsRefAttributes_395642423[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextareaAutosizeProps & RefAttributes[HTMLTextAreaElement]): SharedBuilder_TextareaAutosizePropsRefAttributes_395642423[HTMLTextAreaElement] = new SharedBuilder_TextareaAutosizePropsRefAttributes_395642423[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
