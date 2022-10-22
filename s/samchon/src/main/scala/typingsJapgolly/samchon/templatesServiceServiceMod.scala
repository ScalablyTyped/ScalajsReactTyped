package typingsJapgolly.samchon

import typingsJapgolly.samchon.protocolInvokeInvokeMod.Invoke
import typingsJapgolly.samchon.protocolInvokeIprotocolMod.IProtocol
import typingsJapgolly.samchon.templatesServiceClientMod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesServiceServiceMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/service/Service", "Service")
  @js.native
  open class Service protected ()
    extends StObject
       with IProtocol {
    /**
      * Construct from parent {@link Client} and requested path.
      *
      * @param client Driver of remote client.
      * @param path Requested path that identifies this {@link Service}.
      */
    def this(client: Client, path: String) = this()
    
    /**
      * @hidden
      */
    /* private */ var client_ : Any = js.native
    
    /**
      * Default Destructor.
      *
      * This {@link destructor destructor()} method is call when the {@link Service} object is destructed and the
      * {@link Service} object is destructed when its parent {@link Client} object has
      * {@link Client.destructor destructed} or the {@link Client} object {@link Client.changeService changed} its
      * child {@link Service service} object to another one.
      *
      * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
      * by those *destruction* cases. Also, if your derived {@link Service} class has something to do on the
      * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
      */
    /* protected */ def destructor(): Unit = js.native
    
    /**
      * Get client.
      */
    def getClient(): Client = js.native
    
    /**
      * Get requested path.
      */
    def getPath(): String = js.native
    
    /**
      * @hidden
      */
    /* private */ var path_ : Any = js.native
    
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
  }
}
