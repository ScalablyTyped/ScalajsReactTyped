package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInstanceIdInstanceIdNamespaceMod {
  
  object instanceId {
    
    inline def apply(): InstanceId = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[InstanceId]
    inline def apply(app: App): InstanceId = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[InstanceId]
    
    @JSImport("firebase-admin/lib/instance-id/instance-id-namespace", "instanceId")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.instance-id#InstanceId}.
      */
    type InstanceId = typingsJapgolly.firebaseAdmin.libInstanceIdInstanceIdMod.InstanceId
  }
}
