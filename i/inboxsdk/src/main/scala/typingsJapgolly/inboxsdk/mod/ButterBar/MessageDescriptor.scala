package typingsJapgolly.inboxsdk.mod.ButterBar

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorText
  - typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtml
  - typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement
*/
trait MessageDescriptor extends StObject
object MessageDescriptor {
  
  inline def MessageDescriptorHtml(html: String): typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtml = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtml]
  }
  
  inline def MessageDescriptorHtmlElement(el: HTMLElement): typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorHtmlElement]
  }
  
  inline def MessageDescriptorText(text: String): typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.ButterBar.MessageDescriptorText]
  }
}
