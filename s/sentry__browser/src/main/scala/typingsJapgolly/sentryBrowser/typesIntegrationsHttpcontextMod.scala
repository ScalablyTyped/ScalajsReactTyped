package typingsJapgolly.sentryBrowser

import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesHubMod.Hub
import typingsJapgolly.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsHttpcontextMod {
  
  @JSImport("@sentry/browser/types/integrations/httpcontext", "HttpContext")
  @js.native
  open class HttpContext ()
    extends StObject
       with Integration {
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * @inheritDoc
      */
    def setupOnce(): Unit = js.native
    /**
      * Sets the integration up only once.
      * This takes no options on purpose, options should be passed in the constructor
      */
    /* CompleteClass */
    override def setupOnce(
      addGlobalEventProcessor: js.Function1[/* callback */ EventProcessor, Unit],
      getCurrentHub: js.Function0[Hub]
    ): Unit = js.native
  }
  /* static members */
  object HttpContext {
    
    @JSImport("@sentry/browser/types/integrations/httpcontext", "HttpContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations/httpcontext", "HttpContext.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
