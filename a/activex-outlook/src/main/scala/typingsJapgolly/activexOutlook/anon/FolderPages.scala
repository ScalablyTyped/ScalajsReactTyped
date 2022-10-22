package typingsJapgolly.activexOutlook.anon

import typingsJapgolly.activexOutlook.Outlook.PropertyPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderPages extends StObject {
  
  val Folder: typingsJapgolly.activexOutlook.Outlook.Folder
  
  val Pages: PropertyPages
}
object FolderPages {
  
  inline def apply(Folder: typingsJapgolly.activexOutlook.Outlook.Folder, Pages: PropertyPages): FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPages]
  }
  
  extension [Self <: FolderPages](x: Self) {
    
    inline def setFolder(value: typingsJapgolly.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setPages(value: PropertyPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
  }
}
