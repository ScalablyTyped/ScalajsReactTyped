package typingsJapgolly.voximplantWebsdk.mod.IMEventTypes

import typingsJapgolly.voximplantWebsdk.mod.RosterItemEvent
import typingsJapgolly.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster item changed
  */
trait RosterItemChange
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    User display name
    */
  var displayName: String
  
  /**
    *    Roster item groups
    */
  var groups: js.Array[String]
  
  /**
    *    User id
    */
  var id: String
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    *    Roster item event type. See VoxImplant.RosterItemEvent enum
    */
  var `type`: RosterItemEvent
}
object RosterItemChange {
  
  inline def apply(displayName: String, groups: js.Array[String], id: String, `type`: RosterItemEvent): RosterItemChange = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterItemChange]
  }
  
  extension [Self <: RosterItemChange](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(value: RosterItemEvent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
