package typingsJapgolly.reactAuthKit

import typingsJapgolly.reactAuthKit.distTypesMod.AuthKitStateInterface
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.AuthActions
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.RefreshTokenAction
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.RefreshTokenActionPayload
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.SignInAction
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.SignInActionPayload
import typingsJapgolly.reactAuthKit.distUtilsActionsMod.SignOutAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsReducersMod {
  
  @JSImport("react-auth-kit/dist/utils/reducers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authReducer(state: AuthKitStateInterface, action: AuthActions): AuthKitStateInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("authReducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[AuthKitStateInterface]
  
  inline def doRefresh(refreshTokenParam: RefreshTokenActionPayload): RefreshTokenAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doRefresh")(refreshTokenParam.asInstanceOf[js.Any]).asInstanceOf[RefreshTokenAction]
  
  inline def doSignIn(signInParams: SignInActionPayload): SignInAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignIn")(signInParams.asInstanceOf[js.Any]).asInstanceOf[SignInAction]
  
  inline def doSignOut(): SignOutAction = ^.asInstanceOf[js.Dynamic].applyDynamic("doSignOut")().asInstanceOf[SignOutAction]
}
