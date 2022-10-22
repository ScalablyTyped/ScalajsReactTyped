package typingsJapgolly.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupsOnLabel extends StObject {
  
  /**
    * Whether the client groups edits with equal labels into tree nodes,
    * for instance all edits labelled with "Changes in Strings" would
    * be a tree node.
    */
  var groupsOnLabel: js.UndefOr[Boolean] = js.undefined
}
object GroupsOnLabel {
  
  inline def apply(): GroupsOnLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsOnLabel]
  }
  
  extension [Self <: GroupsOnLabel](x: Self) {
    
    inline def setGroupsOnLabel(value: Boolean): Self = StObject.set(x, "groupsOnLabel", value.asInstanceOf[js.Any])
    
    inline def setGroupsOnLabelUndefined: Self = StObject.set(x, "groupsOnLabel", js.undefined)
  }
}
