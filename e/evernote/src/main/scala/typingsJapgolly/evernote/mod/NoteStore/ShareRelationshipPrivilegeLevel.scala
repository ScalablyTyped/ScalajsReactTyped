package typingsJapgolly.evernote.mod.NoteStore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ShareRelationshipPrivilegeLevel extends StObject
@JSImport("evernote", "NoteStore.ShareRelationshipPrivilegeLevel")
@js.native
object ShareRelationshipPrivilegeLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShareRelationshipPrivilegeLevel & Double] = js.native
  
  @js.native
  sealed trait FULL_ACCESS
    extends StObject
       with ShareRelationshipPrivilegeLevel
  /* 30 */ val FULL_ACCESS: typingsJapgolly.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.FULL_ACCESS & Double = js.native
  
  @js.native
  sealed trait MODIFY_NOTEBOOK_PLUS_ACTIVITY
    extends StObject
       with ShareRelationshipPrivilegeLevel
  /* 20 */ val MODIFY_NOTEBOOK_PLUS_ACTIVITY: typingsJapgolly.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.MODIFY_NOTEBOOK_PLUS_ACTIVITY & Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK
    extends StObject
       with ShareRelationshipPrivilegeLevel
  /* 0 */ val READ_NOTEBOOK: typingsJapgolly.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.READ_NOTEBOOK & Double = js.native
  
  @js.native
  sealed trait READ_NOTEBOOK_PLUS_ACTIVITY
    extends StObject
       with ShareRelationshipPrivilegeLevel
  /* 10 */ val READ_NOTEBOOK_PLUS_ACTIVITY: typingsJapgolly.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel.READ_NOTEBOOK_PLUS_ACTIVITY & Double = js.native
}
