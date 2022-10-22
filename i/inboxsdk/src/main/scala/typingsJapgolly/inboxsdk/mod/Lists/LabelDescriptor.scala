package typingsJapgolly.inboxsdk.mod.Lists

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorHtml
  - typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorUrl
*/
trait LabelDescriptor extends StObject
object LabelDescriptor {
  
  inline def LabelDescriptorHtml(iconHtml: String, title: String): typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorHtml = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorHtml]
  }
  
  inline def LabelDescriptorUrl(iconUrl: String, title: String): typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorUrl = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.inboxsdk.mod.Lists.LabelDescriptorUrl]
  }
}
