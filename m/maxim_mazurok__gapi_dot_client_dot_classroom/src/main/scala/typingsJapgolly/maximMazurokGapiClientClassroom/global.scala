package typingsJapgolly.maximMazurokGapiClientClassroom

import typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom.CoursesResource
import typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom.InvitationsResource
import typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom.RegistrationsResource
import typingsJapgolly.maximMazurokGapiClientClassroom.gapi.client.classroom.UserProfilesResource
import typingsJapgolly.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.classroom
import typingsJapgolly.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.v1
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object classroom {
        
        @JSGlobal("gapi.client.classroom.courses")
        @js.native
        val courses: CoursesResource = js.native
        
        @JSGlobal("gapi.client.classroom.invitations")
        @js.native
        val invitations: InvitationsResource = js.native
        
        @JSGlobal("gapi.client.classroom.registrations")
        @js.native
        val registrations: RegistrationsResource = js.native
        
        @JSGlobal("gapi.client.classroom.userProfiles")
        @js.native
        val userProfiles: UserProfilesResource = js.native
      }
      
      /** Load Google Classroom API v1 */
      inline def load(name: classroom, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: classroom, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
