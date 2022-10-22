package typingsJapgolly.saslExternal

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.saslExternal.saslExternalBooleans.`true`
import typingsJapgolly.saslExternal.saslExternalStrings.EXTERNAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sasl-external", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ExternalMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ExternalMechanism: EXTERNAL = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  @JSImport("sasl-external", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sasl-external", "Mechanism")
  @js.native
  open class Mechanism ()
    extends StObject
       with ExternalMechanism {
    
    /* CompleteClass */
    override def challenge(chal: String): Unit = js.native
    
    /* CompleteClass */
    var clientFirst: `true` = js.native
    
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_ExternalMechanism: EXTERNAL = js.native
    
    /* CompleteClass */
    override def response(cred: StringDictionary[Any]): String = js.native
    /* CompleteClass */
    override def response(cred: Credentials): String = js.native
  }
  /* static member */
  @JSImport("sasl-external", "Mechanism")
  @js.native
  def Mechanism: Instantiable0[ExternalMechanism] = js.native
  inline def Mechanism_=(x: Instantiable0[ExternalMechanism]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mechanism")(x.asInstanceOf[js.Any])
  
  /* static member */
  object prototype {
    
    @JSImport("sasl-external", "prototype")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sasl-external", "prototype.clientFirst")
    @js.native
    def clientFirst: `true` = js.native
    inline def clientFirst_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("sasl-external", "prototype.name")
    @js.native
    def name: EXTERNAL = js.native
    inline def name_=(x: EXTERNAL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
  
  trait Credentials extends StObject {
    
    var authzid: js.UndefOr[String] = js.undefined
  }
  object Credentials {
    
    inline def apply(): Credentials = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setAuthzid(value: String): Self = StObject.set(x, "authzid", value.asInstanceOf[js.Any])
      
      inline def setAuthzidUndefined: Self = StObject.set(x, "authzid", js.undefined)
    }
  }
  
  trait ExternalMechanism
    extends StObject
       with typingsJapgolly.saslmechanisms.mod.Mechanism {
    
    var clientFirst: `true`
    
    @JSName("name")
    var name_ExternalMechanism: EXTERNAL
    
    def response(cred: Credentials): String
  }
  object ExternalMechanism {
    
    inline def apply(challenge: String => Callback, response: Credentials => String): ExternalMechanism = {
      val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1((t0: String) => challenge(t0).runNow()), clientFirst = true, name = "EXTERNAL", response = js.Any.fromFunction1(response))
      __obj.asInstanceOf[ExternalMechanism]
    }
    
    extension [Self <: ExternalMechanism](x: Self) {
      
      inline def setClientFirst(value: `true`): Self = StObject.set(x, "clientFirst", value.asInstanceOf[js.Any])
      
      inline def setName(value: EXTERNAL): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Credentials => String): Self = StObject.set(x, "response", js.Any.fromFunction1(value))
    }
  }
}
