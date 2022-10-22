package typingsJapgolly.firebaseAuth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreUserUserMetadataMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/user/user_metadata", "UserMetadata")
  @js.native
  open class UserMetadata ()
    extends StObject
       with typingsJapgolly.firebaseAuth.distCordovaSrcModelPublicTypesMod.UserMetadata {
    def this(createdAt: String) = this()
    def this(createdAt: Double) = this()
    def this(createdAt: String, lastLoginAt: String) = this()
    def this(createdAt: String, lastLoginAt: Double) = this()
    def this(createdAt: Double, lastLoginAt: String) = this()
    def this(createdAt: Double, lastLoginAt: Double) = this()
    def this(createdAt: Unit, lastLoginAt: String) = this()
    def this(createdAt: Unit, lastLoginAt: Double) = this()
    
    def _copy(metadata: UserMetadata): Unit = js.native
    
    /* private */ var _initializeTime: Any = js.native
    
    /* private */ var createdAt: Any = js.native
    
    /* private */ var lastLoginAt: Any = js.native
    
    def toJSON(): js.Object = js.native
  }
}
