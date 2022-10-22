package typingsJapgolly.sentryNode

import typingsJapgolly.sentryNode.anon.Key
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesHubMod.Hub
import typingsJapgolly.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsLinkederrorsMod {
  
  @JSImport("@sentry/node/types/integrations/linkederrors", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends StObject
       with Integration {
    def this(options: Key) = this()
    
    /**
      * @inheritDoc
      */
    /* private */ var _handler: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _key: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ val _limit: Any = js.native
    
    /**
      * @inheritDoc
      */
    /* private */ var _walkErrorTree: Any = js.native
    
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
  object LinkedErrors {
    
    @JSImport("@sentry/node/types/integrations/linkederrors", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/linkederrors", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
