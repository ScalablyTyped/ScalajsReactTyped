package typingsJapgolly.matrixAppserviceBridge.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserActivityStore")
@js.native
open class UserActivityStore protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityStoreMod.UserActivityStore {
  /**
    * Construct a store suitable for user bridging information.
    * @param db The connected NEDB database instance
    */
  def this(db: typingsJapgolly.nedb.mod.^[Any]) = this()
}
