package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.InvitationsToUnshare
import typingsJapgolly.evernote.mod.Types.IdentityID
import typingsJapgolly.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ManageNoteSharesParameters")
@js.native
open class ManageNoteSharesParameters () extends StObject {
  def this(args: InvitationsToUnshare) = this()
  
  var invitationsToUnshare: js.UndefOr[js.Array[IdentityID]] = js.native
  
  var invitationsToUpdate: js.UndefOr[js.Array[NoteInvitationShareRelationship]] = js.native
  
  var membershipsToUnshare: js.UndefOr[js.Array[UserID]] = js.native
  
  var membershipsToUpdate: js.UndefOr[js.Array[NoteMemberShareRelationship]] = js.native
  
  var noteGuid: js.UndefOr[String] = js.native
}
