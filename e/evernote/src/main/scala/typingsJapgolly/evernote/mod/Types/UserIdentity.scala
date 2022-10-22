package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.LongIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.UserIdentity")
@js.native
open class UserIdentity () extends StObject {
  def this(args: LongIdentifier) = this()
  
  var longIdentifier: js.UndefOr[Double] = js.native
  
  var stringIdentifier: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[UserIdentityType] = js.native
}
