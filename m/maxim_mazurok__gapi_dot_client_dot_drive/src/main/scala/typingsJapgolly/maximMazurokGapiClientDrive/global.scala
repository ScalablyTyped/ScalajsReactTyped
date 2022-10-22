package typingsJapgolly.maximMazurokGapiClientDrive

import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.AboutResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.ChangesResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.ChannelsResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.CommentsResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.DrivesResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.FilesResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.PermissionsResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.RepliesResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.RevisionsResource
import typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive.TeamdrivesResource
import typingsJapgolly.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.drive
import typingsJapgolly.maximMazurokGapiClientDrive.maximMazurokGapiClientDriveStrings.v3
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
      
      object drive {
        
        @JSGlobal("gapi.client.drive.about")
        @js.native
        val about: AboutResource = js.native
        
        @JSGlobal("gapi.client.drive.changes")
        @js.native
        val changes: ChangesResource = js.native
        
        @JSGlobal("gapi.client.drive.channels")
        @js.native
        val channels: ChannelsResource = js.native
        
        @JSGlobal("gapi.client.drive.comments")
        @js.native
        val comments: CommentsResource = js.native
        
        @JSGlobal("gapi.client.drive.drives")
        @js.native
        val drives: DrivesResource = js.native
        
        @JSGlobal("gapi.client.drive.files")
        @js.native
        val files: FilesResource = js.native
        
        @JSGlobal("gapi.client.drive.permissions")
        @js.native
        val permissions: PermissionsResource = js.native
        
        @JSGlobal("gapi.client.drive.replies")
        @js.native
        val replies: RepliesResource = js.native
        
        @JSGlobal("gapi.client.drive.revisions")
        @js.native
        val revisions: RevisionsResource = js.native
        
        @JSGlobal("gapi.client.drive.teamdrives")
        @js.native
        val teamdrives: TeamdrivesResource = js.native
      }
      
      /** Load Drive API v3 */
      inline def load(name: drive, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: drive, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
