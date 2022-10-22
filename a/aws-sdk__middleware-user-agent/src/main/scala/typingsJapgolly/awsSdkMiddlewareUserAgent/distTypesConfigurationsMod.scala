package typingsJapgolly.awsSdkMiddlewareUserAgent

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgent
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.UserAgentPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist-types/configurations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveUserAgentConfig[T](input: T & PreviouslyResolved & UserAgentInputConfig): T & UserAgentResolvedConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveUserAgentConfig")(input.asInstanceOf[js.Any]).asInstanceOf[T & UserAgentResolvedConfig]
  
  trait PreviouslyResolved extends StObject {
    
    def defaultUserAgentProvider(): js.Promise[UserAgent]
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent]
    
    var runtime: String
  }
  object PreviouslyResolved {
    
    inline def apply(defaultUserAgentProvider: CallbackTo[js.Promise[UserAgent]], runtime: String): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(defaultUserAgentProvider = defaultUserAgentProvider.toJsFn, runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    extension [Self <: PreviouslyResolved](x: Self) {
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgentInputConfig extends StObject {
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[String | UserAgent] = js.undefined
  }
  object UserAgentInputConfig {
    
    inline def apply(): UserAgentInputConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgentInputConfig]
    }
    
    extension [Self <: UserAgentInputConfig](x: Self) {
      
      inline def setCustomUserAgent(value: String | UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
    }
  }
  
  trait UserAgentResolvedConfig extends StObject {
    
    /**
      * The custom user agent header that would be appended to default one
      */
    var customUserAgent: js.UndefOr[UserAgent] = js.undefined
    
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header.
      * @internal
      */
    def defaultUserAgentProvider(): js.Promise[UserAgent]
    /**
      * The provider populating default tracking information to be sent with `user-agent`, `x-amz-user-agent` header.
      * @internal
      */
    @JSName("defaultUserAgentProvider")
    var defaultUserAgentProvider_Original: Provider[UserAgent]
    
    /**
      * The runtime environment
      */
    var runtime: String
  }
  object UserAgentResolvedConfig {
    
    inline def apply(defaultUserAgentProvider: CallbackTo[js.Promise[UserAgent]], runtime: String): UserAgentResolvedConfig = {
      val __obj = js.Dynamic.literal(defaultUserAgentProvider = defaultUserAgentProvider.toJsFn, runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentResolvedConfig]
    }
    
    extension [Self <: UserAgentResolvedConfig](x: Self) {
      
      inline def setCustomUserAgent(value: UserAgent): Self = StObject.set(x, "customUserAgent", value.asInstanceOf[js.Any])
      
      inline def setCustomUserAgentUndefined: Self = StObject.set(x, "customUserAgent", js.undefined)
      
      inline def setCustomUserAgentVarargs(value: UserAgentPair*): Self = StObject.set(x, "customUserAgent", js.Array(value*))
      
      inline def setDefaultUserAgentProvider(value: CallbackTo[js.Promise[UserAgent]]): Self = StObject.set(x, "defaultUserAgentProvider", value.toJsFn)
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
}
