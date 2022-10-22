package typingsJapgolly.reactTextareaAutosize

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactTextareaAutosize.distDeclarationsSrcMod.TextareaAutosizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReactTextareaAutosizeDotcjsMod extends Shortcut {
  
  @JSImport("react-textarea-autosize/dist/react-textarea-autosize.cjs", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextareaAutosizeProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  type _To = ForwardRefExoticComponent[TextareaAutosizeProps & RefAttributes[HTMLTextAreaElement]]
  
  /* This means you don't have to write `default`, but can instead just say `distReactTextareaAutosizeDotcjsMod.foo` */
  override def _to: ForwardRefExoticComponent[TextareaAutosizeProps & RefAttributes[HTMLTextAreaElement]] = default
}
