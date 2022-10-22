package typingsJapgolly.sentryBrowser

import typingsJapgolly.sentryBrowser.anon.PartialBreadcrumbsOptions
import typingsJapgolly.sentryBrowser.anon.PartialLinkedErrorsOption
import typingsJapgolly.sentryBrowser.anon.PartialTryCatchOptions
import typingsJapgolly.sentryBrowser.typesIntegrationsGlobalhandlersMod.GlobalHandlersIntegrations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntegrationsMod {
  
  @JSImport("@sentry/browser/types/integrations", "Breadcrumbs")
  @js.native
  /**
    * @inheritDoc
    */
  open class Breadcrumbs ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsBreadcrumbsMod.Breadcrumbs {
    def this(options: PartialBreadcrumbsOptions) = this()
  }
  /* static members */
  object Breadcrumbs {
    
    @JSImport("@sentry/browser/types/integrations", "Breadcrumbs")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "Breadcrumbs.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/integrations", "Dedupe")
  @js.native
  open class Dedupe ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsDedupeMod.Dedupe
  /* static members */
  object Dedupe {
    
    @JSImport("@sentry/browser/types/integrations", "Dedupe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "Dedupe.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/integrations", "GlobalHandlers")
  @js.native
  /** JSDoc */
  open class GlobalHandlers ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsGlobalhandlersMod.GlobalHandlers {
    def this(options: GlobalHandlersIntegrations) = this()
  }
  /* static members */
  object GlobalHandlers {
    
    @JSImport("@sentry/browser/types/integrations", "GlobalHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "GlobalHandlers.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/integrations", "HttpContext")
  @js.native
  open class HttpContext ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsHttpcontextMod.HttpContext
  /* static members */
  object HttpContext {
    
    @JSImport("@sentry/browser/types/integrations", "HttpContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "HttpContext.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/integrations", "LinkedErrors")
  @js.native
  /**
    * @inheritDoc
    */
  open class LinkedErrors ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsLinkederrorsMod.LinkedErrors {
    def this(options: PartialLinkedErrorsOption) = this()
  }
  /* static members */
  object LinkedErrors {
    
    @JSImport("@sentry/browser/types/integrations", "LinkedErrors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "LinkedErrors.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@sentry/browser/types/integrations", "TryCatch")
  @js.native
  /**
    * @inheritDoc
    */
  open class TryCatch ()
    extends typingsJapgolly.sentryBrowser.typesIntegrationsTrycatchMod.TryCatch {
    def this(options: PartialTryCatchOptions) = this()
  }
  /* static members */
  object TryCatch {
    
    @JSImport("@sentry/browser/types/integrations", "TryCatch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSImport("@sentry/browser/types/integrations", "TryCatch.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  }
}
