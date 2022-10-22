package typingsJapgolly.passwordHashAndSalt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(password: String): Password = ^.asInstanceOf[js.Dynamic].apply(password.asInstanceOf[js.Any]).asInstanceOf[Password]
  
  @JSImport("password-hash-and-salt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Password extends StObject {
    
    def hash(cb: js.Function2[/* error */ String, /* hash */ String, Unit]): Unit
    
    def verifyAgainst(hash: String, cb: js.Function2[/* error */ String, /* verified */ Boolean, Unit]): Unit
  }
  object Password {
    
    inline def apply(
      hash: js.Function2[/* error */ String, /* hash */ String, Unit] => Callback,
      verifyAgainst: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Callback
    ): Password = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1((t0: js.Function2[/* error */ String, /* hash */ String, Unit]) => hash(t0).runNow()), verifyAgainst = js.Any.fromFunction2((t0: String, t1: js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => (verifyAgainst(t0, t1)).runNow()))
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setHash(value: js.Function2[/* error */ String, /* hash */ String, Unit] => Callback): Self = StObject.set(x, "hash", js.Any.fromFunction1((t0: js.Function2[/* error */ String, /* hash */ String, Unit]) => value(t0).runNow()))
      
      inline def setVerifyAgainst(value: (String, js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => Callback): Self = StObject.set(x, "verifyAgainst", js.Any.fromFunction2((t0: String, t1: js.Function2[/* error */ String, /* verified */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
