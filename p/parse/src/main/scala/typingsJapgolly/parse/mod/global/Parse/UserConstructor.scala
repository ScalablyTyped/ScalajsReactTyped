package typingsJapgolly.parse.mod.global.Parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserConstructor
  extends StObject
     with ObjectStatic[User[Attributes]]
     with Instantiable0[User[Attributes]]
     with Instantiable1[/* attributes */ Attributes, User[Attributes]] {
  
  def _registerAuthenticationProvider(provider: AuthProvider): Unit = js.native
  
  def allowCustomUserClass(isAllowed: Boolean): Unit = js.native
  
  def become[T /* <: User[Attributes] */](sessionToken: String): js.Promise[T] = js.native
  def become[T /* <: User[Attributes] */](sessionToken: String, options: UseMasterKeyOption): js.Promise[T] = js.native
  
  def current[T /* <: User[Attributes] */](): js.UndefOr[T] = js.native
  
  def currentAsync[T /* <: User[Attributes] */](): js.Promise[T | Null] = js.native
  
  def disableUnsafeCurrentUser(): Unit = js.native
  
  def enableUnsafeCurrentUser(): Unit = js.native
  
  def extend(): Any = js.native
  def extend(protoProps: Any): Any = js.native
  def extend(protoProps: Any, classProps: Any): Any = js.native
  def extend(protoProps: Unit, classProps: Any): Any = js.native
  
  def hydrate[T /* <: User[Attributes] */](userJSON: Any): js.Promise[T] = js.native
  
  def logIn[T /* <: User[Attributes] */](username: String, password: String): js.Promise[T] = js.native
  def logIn[T /* <: User[Attributes] */](username: String, password: String, options: FullOptions): js.Promise[T] = js.native
  
  def logInWith[T /* <: User[Attributes] */](provider: String, options: typingsJapgolly.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: User[Attributes] */](provider: String, options: typingsJapgolly.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  def logInWith[T /* <: User[Attributes] */](provider: AuthProvider, options: typingsJapgolly.parse.anon.AuthData): js.Promise[T] = js.native
  def logInWith[T /* <: User[Attributes] */](provider: AuthProvider, options: typingsJapgolly.parse.anon.AuthData, saveOpts: FullOptions): js.Promise[T] = js.native
  
  def logOut[T /* <: User[Attributes] */](): js.Promise[T] = js.native
  
  def requestEmailVerification[T /* <: User[Attributes] */](email: String): js.Promise[T] = js.native
  def requestEmailVerification[T /* <: User[Attributes] */](email: String, options: UseMasterKeyOption): js.Promise[T] = js.native
  
  def requestPasswordReset[T /* <: User[Attributes] */](email: String): js.Promise[T] = js.native
  def requestPasswordReset[T /* <: User[Attributes] */](email: String, options: SuccessFailureOptions): js.Promise[T] = js.native
  
  def signUp[T /* <: User[Attributes] */](username: String, password: String, attrs: Any): js.Promise[T] = js.native
  def signUp[T /* <: User[Attributes] */](username: String, password: String, attrs: Any, options: SignUpOptions): js.Promise[T] = js.native
}
