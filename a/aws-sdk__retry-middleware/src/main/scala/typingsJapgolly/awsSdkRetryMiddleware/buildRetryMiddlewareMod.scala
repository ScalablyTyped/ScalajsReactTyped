package typingsJapgolly.awsSdkRetryMiddleware

import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRetryMiddlewareMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ Any,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: Unit,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
}
