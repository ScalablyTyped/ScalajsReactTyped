package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.libComponentsBridgeStoreMod.BridgeStore
import typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivity
import typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivitySet
import typingsJapgolly.nedb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsUserActivityStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/user-activity-store", "UserActivityStore")
  @js.native
  open class UserActivityStore protected () extends BridgeStore {
    /**
      * Construct a store suitable for user bridging information.
      * @param db The connected NEDB database instance
      */
    def this(db: ^[Any]) = this()
    
    def getActivitySet(): js.Promise[UserActivitySet] = js.native
    
    def storeUserActivity(mxid: String, activity: UserActivity): js.Promise[Unit] = js.native
  }
}
