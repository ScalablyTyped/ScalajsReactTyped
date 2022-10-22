package typingsJapgolly.firebaseAuth.internalMod

import typingsJapgolly.firebaseAuth.distSrcCorePersistenceMod.PersistedBlob
import typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AuthInternal
import typingsJapgolly.firebaseAuth.distSrcModelIdTokenMod.IdTokenResponse
import typingsJapgolly.firebaseAuth.distSrcModelUserMod.UserInternal
import typingsJapgolly.firebaseAuth.distSrcModelUserMod.UserParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth/internal", "UserImpl")
@js.native
open class UserImpl protected ()
  extends typingsJapgolly.firebaseAuth.distInternalMod.UserImpl {
  def this(hasUidAuthStsTokenManagerOpt: UserParameters) = this()
}
/* static members */
object UserImpl {
  
  @JSImport("@firebase/auth/internal", "UserImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize a User from an idToken server response
    * @param auth
    * @param idTokenResponse
    */
  inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
  inline def _fromIdTokenResponse(auth: AuthInternal, idTokenResponse: IdTokenResponse, isAnonymous: Boolean): js.Promise[UserInternal] = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromIdTokenResponse")(auth.asInstanceOf[js.Any], idTokenResponse.asInstanceOf[js.Any], isAnonymous.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UserInternal]]
  
  inline def _fromJSON(auth: AuthInternal, `object`: PersistedBlob): UserInternal = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromJSON")(auth.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[UserInternal]
}
