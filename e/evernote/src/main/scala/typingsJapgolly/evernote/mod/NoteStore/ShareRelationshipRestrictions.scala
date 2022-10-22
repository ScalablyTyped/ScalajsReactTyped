package typingsJapgolly.evernote.mod.NoteStore

import typingsJapgolly.evernote.anon.NoSetModify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "NoteStore.ShareRelationshipRestrictions")
@js.native
open class ShareRelationshipRestrictions () extends StObject {
  def this(args: NoSetModify) = this()
  
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  
  var noSetModify: js.UndefOr[Boolean] = js.native
  
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}
