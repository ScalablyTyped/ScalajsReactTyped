package typingsJapgolly.typeformEmbed

import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.ParentNode
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsIsOpenMod {
  
  @JSImport("@typeform/embed/types/utils/is-open", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isInPage(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInPage")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isOpen(element: HTMLElement): /* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @typeform/embed.@typeform/embed/types/utils/is-open.HTMLElementWithParentNode */ Boolean]
  
  inline def isVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait HTMLElementWithParentNode
    extends StObject
       with typingsJapgolly.std.HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    @JSName("parentNode")
    var parentNode_HTMLElementWithParentNode: Node & ParentNode = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
