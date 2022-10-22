package typingsJapgolly.firebaseAuthTypes.mod

import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAuthTypes.anon.LOCAL
import typingsJapgolly.firebaseAuthTypes.anon.`0`
import typingsJapgolly.firebaseUtil.mod.Observer
import typingsJapgolly.firebaseUtil.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "FirebaseAuth")
@js.native
/* private */ open class FirebaseAuth () extends StObject {
  
  var app: FirebaseApp = js.native
  
  def applyActionCode(code: String): js.Promise[Unit] = js.native
  
  def checkActionCode(code: String): js.Promise[ActionCodeInfo] = js.native
  
  def confirmPasswordReset(code: String, newPassword: String): js.Promise[Unit] = js.native
  
  def createUserWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  
  var currentUser: User | Null = js.native
  
  val emulatorConfig: EmulatorConfig | Null = js.native
  
  def fetchSignInMethodsForEmail(email: String): js.Promise[js.Array[String]] = js.native
  
  def getRedirectResult(): js.Promise[UserCredential] = js.native
  
  def isSignInWithEmailLink(emailLink: String): Boolean = js.native
  
  var languageCode: String | Null = js.native
  
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any], error: js.Function1[/* a */ Error, Any]): Unsubscribe = js.native
  def onAuthStateChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, Any],
    error: js.Function1[/* a */ Error, Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[Any]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[Any], error: js.Function1[/* a */ Error, Any]): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[Any], error: js.Function1[/* a */ Error, Any], completed: Unsubscribe): Unsubscribe = js.native
  def onAuthStateChanged(nextOrObserver: Observer[Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any], error: js.Function1[/* a */ Error, Any]): Unsubscribe = js.native
  def onIdTokenChanged(
    nextOrObserver: js.Function1[/* a */ User | Null, Any],
    error: js.Function1[/* a */ Error, Any],
    completed: Unsubscribe
  ): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: js.Function1[/* a */ User | Null, Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[Any]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[Any], error: js.Function1[/* a */ Error, Any]): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[Any], error: js.Function1[/* a */ Error, Any], completed: Unsubscribe): Unsubscribe = js.native
  def onIdTokenChanged(nextOrObserver: Observer[Any], error: Unit, completed: Unsubscribe): Unsubscribe = js.native
  
  def sendPasswordResetEmail(email: String): js.Promise[Unit] = js.native
  def sendPasswordResetEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  
  def sendSignInLinkToEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  
  def setPersistence(persistence: Persistence): js.Promise[Unit] = js.native
  
  var settings: AuthSettings = js.native
  
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  
  def signInAnonymously(): js.Promise[UserCredential] = js.native
  
  def signInWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  
  def signInWithCustomToken(token: String): js.Promise[UserCredential] = js.native
  
  def signInWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  
  def signInWithEmailLink(email: String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: String, emailLink: String): js.Promise[UserCredential] = js.native
  
  def signInWithPhoneNumber(phoneNumber: String, applicationVerifier: ApplicationVerifier): js.Promise[ConfirmationResult] = js.native
  
  def signInWithPopup(provider: AuthProvider): js.Promise[UserCredential] = js.native
  
  def signInWithRedirect(provider: AuthProvider): js.Promise[Unit] = js.native
  
  def signOut(): js.Promise[Unit] = js.native
  
  var tenantId: String | Null = js.native
  
  def updateCurrentUser(): js.Promise[Unit] = js.native
  def updateCurrentUser(user: User): js.Promise[Unit] = js.native
  
  def useDeviceLanguage(): Unit = js.native
  
  def useEmulator(url: String): Unit = js.native
  def useEmulator(url: String, options: `0`): Unit = js.native
  
  def verifyPasswordResetCode(code: String): js.Promise[String] = js.native
}
/* static members */
object FirebaseAuth {
  
  @JSImport("@firebase/auth-types", "FirebaseAuth")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "FirebaseAuth.Persistence")
  @js.native
  def Persistence: LOCAL = js.native
  inline def Persistence_=(x: LOCAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Persistence")(x.asInstanceOf[js.Any])
}
