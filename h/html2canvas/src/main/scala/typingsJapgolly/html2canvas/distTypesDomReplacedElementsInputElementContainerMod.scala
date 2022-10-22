package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesDomElementContainerMod.ElementContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomReplacedElementsInputElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/input-element-container", "CHECKBOX")
  @js.native
  val CHECKBOX: /* "checkbox" */ String = js.native
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/input-element-container", "INPUT_COLOR")
  @js.native
  val INPUT_COLOR: /* 707406591 */ Double = js.native
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/input-element-container", "InputElementContainer")
  @js.native
  open class InputElementContainer protected () extends ElementContainer {
    def this(context: Context, input: HTMLInputElement) = this()
    
    val checked: Boolean = js.native
    
    val `type`: String = js.native
    
    val value: String = js.native
  }
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/input-element-container", "PASSWORD")
  @js.native
  val PASSWORD: /* "password" */ String = js.native
  
  @JSImport("html2canvas/dist/types/dom/replaced-elements/input-element-container", "RADIO")
  @js.native
  val RADIO: /* "radio" */ String = js.native
}
