package typingsJapgolly.activexOutlook.anon

import typingsJapgolly.activexOutlook.Outlook.OutlookBarGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var Cancel: Boolean
  
  val Group: OutlookBarGroup
}
object Group {
  
  inline def apply(Cancel: Boolean, Group: OutlookBarGroup): Group = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Group = Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: OutlookBarGroup): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
  }
}
