package typingsJapgolly.activexOutlook.anon

import typingsJapgolly.activexOutlook.Outlook.AttachmentSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachments extends StObject {
  
  val Attachments: AttachmentSelection
  
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
}
object Attachments {
  
  inline def apply(
    Attachments: AttachmentSelection,
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
  ): Attachments = {
    val __obj = js.Dynamic.literal(Attachments = Attachments.asInstanceOf[js.Any], CommandBar = CommandBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachments]
  }
  
  extension [Self <: Attachments](x: Self) {
    
    inline def setAttachments(value: AttachmentSelection): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ Any
    ): Self = StObject.set(x, "CommandBar", value.asInstanceOf[js.Any])
  }
}
