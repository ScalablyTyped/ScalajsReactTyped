package typingsJapgolly.reactQuery.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Entry {
  
  object Explorer {
    
    @JSImport("react-query/types/devtools/Explorer", "Entry.^")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Explorer.type): SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement] = new SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HTMLAttributes[HTMLDivElement] & RefAttributes[HTMLDivElement]): SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement] = new SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-query/types/devtools/Explorer", "Entry")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Entry.type): SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement] = new SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributes[HTMLDivElement] & RefAttributes[HTMLDivElement]): SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement] = new SharedBuilder_HTMLAttributesRefAttributes_1417115160[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
