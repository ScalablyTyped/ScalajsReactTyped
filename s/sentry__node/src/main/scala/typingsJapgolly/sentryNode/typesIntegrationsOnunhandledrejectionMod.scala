package typingsJapgolly.sentryNode

import typingsJapgolly.sentryNode.anon.Mode
import typingsJapgolly.sentryTypes.typesEventprocessorMod.EventProcessor
import typingsJapgolly.sentryTypes.typesHubMod.Hub
import typingsJapgolly.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsOnunhandledrejectionMod {
  
  @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection")
  @js.native
  /**
    * @inheritDoc
    */
  open class OnUnhandledRejection ()
    extends StObject
       with Integration {
    def this(_options: Mode) = this()
    
    /**
      * Handler for `mode` option
      */
    /* private */ var _handleRejection: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /**
      * Returns {@link IntegrationClass.id}
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Send an exception with reason
      * @param reason string
      * @param promise promise
      */
    def sendUnhandledPromise(reason: Any, promise: Any): Unit = js.native
    
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
  object OnUnhandledRejection {
    
    @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/node/types/integrations/onunhandledrejection", "OnUnhandledRejection.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryNode.sentryNodeStrings.none
    - typingsJapgolly.sentryNode.sentryNodeStrings.warn
    - typingsJapgolly.sentryNode.sentryNodeStrings.strict
  */
  trait UnhandledRejectionMode extends StObject
  object UnhandledRejectionMode {
    
    inline def none: typingsJapgolly.sentryNode.sentryNodeStrings.none = "none".asInstanceOf[typingsJapgolly.sentryNode.sentryNodeStrings.none]
    
    inline def strict: typingsJapgolly.sentryNode.sentryNodeStrings.strict = "strict".asInstanceOf[typingsJapgolly.sentryNode.sentryNodeStrings.strict]
    
    inline def warn: typingsJapgolly.sentryNode.sentryNodeStrings.warn = "warn".asInstanceOf[typingsJapgolly.sentryNode.sentryNodeStrings.warn]
  }
}
