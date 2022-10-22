package typingsJapgolly.saslScramSha1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.saslScramSha1.saslScramSha1Booleans.`true`
import typingsJapgolly.saslScramSha1.saslScramSha1Strings.`SCRAM-SHA-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-scram-sha-1", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ScramSha1Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-scram-sha-1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-scram-sha-1", "Mechanism")
  @js.native
  open class Mechanism ()
    extends StObject
       with ScramSha1Mechanism {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1` = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-scram-sha-1", "Mechanism")
  @js.native
  def Mechanism: Instantiable1[/* options */ js.UndefOr[Options], ScramSha1Mechanism] = js.native
  inline def Mechanism_=(x: Instantiable1[/* options */ js.UndefOr[Options], ScramSha1Mechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-scram-sha-1", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-scram-sha-1", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    inline def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-scram-sha-1", "prototype.name")
    @js.native
    def name: `SCRAM-SHA-1` = js.native
    inline def name_=(x: `SCRAM-SHA-1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.undefined
    
    var clientKey: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var salt: js.UndefOr[String] = js.undefined
    
    var saltedPassword: js.UndefOr[String] = js.undefined
    
    var serverKey: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      inline def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
      
      inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setSalt(value: String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setSaltedPassword(value: String): Self = StObject.set(x, "saltedPassword", value.asInstanceOf[js.Any])
      
      inline def setSaltedPasswordUndefined: Self = StObject.set(x, "saltedPassword", js.undefined)
      
      inline def setServerKey(value: String): Self = StObject.set(x, "serverKey", value.asInstanceOf[js.Any])
      
      inline def setServerKeyUndefined: Self = StObject.set(x, "serverKey", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var genNonce: js.UndefOr[js.Function0[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGenNonce(value: CallbackTo[Double]): Self = StObject.set(x, "genNonce", value.toJsFn)
      
      inline def setGenNonceUndefined: Self = StObject.set(x, "genNonce", js.undefined)
    }
  }
  
  trait ScramSha1Mechanism
    extends StObject
       with typingsJapgolly.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true`
    
    @JSName("name")
    var name_ScramSha1Mechanism: `SCRAM-SHA-1`
    
    def response(cred: Credentials): String
  }
  object ScramSha1Mechanism {
    
    inline def apply(challenge: String => Callback, response: Credentials => String): ScramSha1Mechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1((t0: String) => challenge(t0).runNow()), clientFirst = true, name = "SCRAM-SHA-1", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[ScramSha1Mechanism]
    }
    
    extension [Self <: ScramSha1Mechanism](x: Self) {
      
      inline def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      inline def setName(value: `SCRAM-SHA-1`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
