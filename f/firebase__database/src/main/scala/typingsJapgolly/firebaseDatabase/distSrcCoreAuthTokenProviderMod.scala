package typingsJapgolly.firebaseDatabase

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreAuthTokenProviderMod {
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider")
  @js.native
  open class EmulatorTokenProvider protected ()
    extends StObject
       with AuthTokenProvider {
    def this(accessToken: String) = this()
    
    /* private */ var accessToken: Any = js.native
    
    /* CompleteClass */
    override def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    
    /* CompleteClass */
    override def notifyForInvalidToken(): Unit = js.native
    
    /* CompleteClass */
    override def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  /* static members */
  object EmulatorTokenProvider {
    
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /** A string that is treated as an admin access token by the RTDB emulator. Used by Admin SDK. */
    @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "EmulatorTokenProvider.OWNER")
    @js.native
    def OWNER: String = js.native
    inline def OWNER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OWNER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
  @js.native
  open class FirebaseAuthTokenProvider protected ()
    extends StObject
       with AuthTokenProvider {
    def this(
      appName_ : String,
      firebaseOptions_ : js.Object,
      authProvider_ : Provider[FirebaseAuthInternalName]
    ) = this()
    
    /* CompleteClass */
    override def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    /* private */ var appName_ : Any = js.native
    
    /* private */ var authProvider_ : Any = js.native
    
    /* private */ var auth_ : Any = js.native
    
    /* private */ var firebaseOptions_ : Any = js.native
    
    /* CompleteClass */
    override def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData] = js.native
    
    /* CompleteClass */
    override def notifyForInvalidToken(): Unit = js.native
    
    /* CompleteClass */
    override def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
  trait AuthTokenProvider extends StObject {
    
    def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
    
    def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData]
    
    def notifyForInvalidToken(): Unit
    
    def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
  }
  object AuthTokenProvider {
    
    inline def apply(
      addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Callback,
      getToken: Boolean => js.Promise[FirebaseAuthTokenData],
      notifyForInvalidToken: Callback,
      removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Callback
    ): AuthTokenProvider = {
      val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => addTokenChangeListener(t0).runNow()), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = notifyForInvalidToken.toJsFn, removeTokenChangeListener = js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => removeTokenChangeListener(t0).runNow()))
      __obj.asInstanceOf[AuthTokenProvider]
    }
    
    extension [Self <: AuthTokenProvider](x: Self) {
      
      inline def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Callback): Self = StObject.set(x, "addTokenChangeListener", js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => value(t0).runNow()))
      
      inline def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
      
      inline def setNotifyForInvalidToken(value: Callback): Self = StObject.set(x, "notifyForInvalidToken", value.toJsFn)
      
      inline def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Callback): Self = StObject.set(x, "removeTokenChangeListener", js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => value(t0).runNow()))
    }
  }
}
