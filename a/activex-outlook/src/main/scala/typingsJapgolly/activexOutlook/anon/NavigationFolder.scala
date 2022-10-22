package typingsJapgolly.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFolder extends StObject {
  
  val NavigationFolder: typingsJapgolly.activexOutlook.Outlook.NavigationFolder
}
object NavigationFolder {
  
  inline def apply(NavigationFolder: typingsJapgolly.activexOutlook.Outlook.NavigationFolder): NavigationFolder = {
    val __obj = js.Dynamic.literal(NavigationFolder = NavigationFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  
  extension [Self <: NavigationFolder](x: Self) {
    
    inline def setNavigationFolder(value: typingsJapgolly.activexOutlook.Outlook.NavigationFolder): Self = StObject.set(x, "NavigationFolder", value.asInstanceOf[js.Any])
  }
}
