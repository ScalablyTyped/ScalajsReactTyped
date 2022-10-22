package typingsJapgolly.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Groups {
  
  /**
    * Possible roles of a user within a group, such as owner or ordinary member. Users subscribed to a
    * group have exactly one role within the context of that group.
    * See also
    *
    * Group.getRole(email)
    */
  @JSGlobal("GoogleAppsScript.Groups.Role")
  @js.native
  object Role extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role & Double] = js.native
    
    /* 3 */ val INVITED: typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role.INVITED & Double = js.native
    
    /* 1 */ val MANAGER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role.MANAGER & Double = js.native
    
    /* 2 */ val MEMBER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role.MEMBER & Double = js.native
    
    /* 0 */ val OWNER: typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role.OWNER & Double = js.native
    
    /* 4 */ val PENDING: typingsJapgolly.googleAppsScript.GoogleAppsScript.Groups.Role.PENDING & Double = js.native
  }
}
