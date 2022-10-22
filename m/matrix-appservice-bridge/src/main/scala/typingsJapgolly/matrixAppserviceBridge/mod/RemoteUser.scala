package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "RemoteUser")
@js.native
open class RemoteUser protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libModelsUsersRemoteMod.RemoteUser {
  /**
    * @param identifier The unique ID for this user.
    * @param data The serialized key-value data object to assign to this user.
    * @throws If identifier is not supplied.
    */
  def this(id: String) = this()
  def this(id: String, data: Record[String, Any]) = this()
}
