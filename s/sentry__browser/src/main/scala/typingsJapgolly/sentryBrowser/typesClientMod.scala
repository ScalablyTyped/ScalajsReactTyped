package typingsJapgolly.sentryBrowser

import typingsJapgolly.sentryBrowser.typesTransportsTypesMod.BrowserTransportOptions
import typingsJapgolly.sentryCore.mod.BaseClient
import typingsJapgolly.sentryCore.mod.Scope
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesEventMod.EventHint
import typingsJapgolly.sentryTypes.typesIntegrationMod.Integration
import typingsJapgolly.sentryTypes.typesOptionsMod.ClientOptions
import typingsJapgolly.sentryTypes.typesOptionsMod.Options
import typingsJapgolly.sentryTypes.typesStackframeMod.StackFrame
import typingsJapgolly.sentryTypes.typesTransportMod.Transport
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClientMod {
  
  @JSImport("@sentry/browser/types/client", "BrowserClient")
  @js.native
  open class BrowserClient protected () extends BaseClient[BrowserClientOptions] {
    /**
      * Creates a new Browser SDK instance.
      *
      * @param options Configuration options for this SDK.
      */
    def this(options: BrowserClientOptions) = this()
    
    /**
      * Sends client reports as an envelope.
      */
    /* private */ var _flushOutcomes: Any = js.native
    
    /* protected */ def _prepareEvent(event: Event, hint: EventHint, scope: Scope): PromiseLike[Event | Null] = js.native
  }
  
  trait BaseBrowserOptions extends StObject {
    
    /**
      * A pattern for error URLs which should exclusively be sent to Sentry.
      * This is the opposite of {@link Options.denyUrls}.
      * By default, all errors will be sent.
      */
    var allowUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    /**
      * A pattern for error URLs which should not be sent to Sentry.
      * To allow certain errors instead, use {@link Options.allowUrls}.
      * By default, all errors will be sent.
      */
    var denyUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  }
  object BaseBrowserOptions {
    
    inline def apply(): BaseBrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBrowserOptions]
    }
    
    extension [Self <: BaseBrowserOptions](x: Self) {
      
      inline def setAllowUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "allowUrls", value.asInstanceOf[js.Any])
      
      inline def setAllowUrlsUndefined: Self = StObject.set(x, "allowUrls", js.undefined)
      
      inline def setAllowUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "allowUrls", js.Array(value*))
      
      inline def setDenyUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "denyUrls", value.asInstanceOf[js.Any])
      
      inline def setDenyUrlsUndefined: Self = StObject.set(x, "denyUrls", js.undefined)
      
      inline def setDenyUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "denyUrls", js.Array(value*))
    }
  }
  
  trait BrowserClientOptions
    extends StObject
       with ClientOptions[BrowserTransportOptions]
       with BaseBrowserOptions
  object BrowserClientOptions {
    
    inline def apply(
      integrations: js.Array[Integration],
      stackParser: (/* stack */ String, /* skipFirst */ js.UndefOr[Double]) => js.Array[StackFrame],
      transport: BrowserTransportOptions => Transport
    ): BrowserClientOptions = {
      val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], stackParser = js.Any.fromFunction2(stackParser), transport = js.Any.fromFunction1(transport))
      __obj.asInstanceOf[BrowserClientOptions]
    }
  }
  
  trait BrowserOptions
    extends StObject
       with Options[BrowserTransportOptions]
       with BaseBrowserOptions
  object BrowserOptions {
    
    inline def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
  }
}
