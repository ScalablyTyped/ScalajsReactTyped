package typingsJapgolly.sentryNode

import typingsJapgolly.sentryCore.mod.Integrations.FunctionToString
import typingsJapgolly.sentryCore.mod.Integrations.InboundFilters
import typingsJapgolly.sentryNode.anon.Include
import typingsJapgolly.sentryNode.anon.OmitAddRequestDataToEvent
import typingsJapgolly.sentryNode.typesClientMod.NodeClient
import typingsJapgolly.sentryNode.typesIntegrationsMod.Console
import typingsJapgolly.sentryNode.typesIntegrationsMod.Context
import typingsJapgolly.sentryNode.typesIntegrationsMod.ContextLines
import typingsJapgolly.sentryNode.typesIntegrationsMod.Http
import typingsJapgolly.sentryNode.typesIntegrationsMod.LinkedErrors
import typingsJapgolly.sentryNode.typesIntegrationsMod.Modules
import typingsJapgolly.sentryNode.typesIntegrationsMod.OnUncaughtException
import typingsJapgolly.sentryNode.typesIntegrationsMod.OnUnhandledRejection
import typingsJapgolly.sentryNode.typesTypesMod.NodeOptions
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typingsJapgolly.sentryTypes.typesStacktraceMod.StackParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSdkMod {
  
  @JSImport("@sentry/node/types/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addRequestDataToEvent(
    event: Event,
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(
    event: Event,
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any,
    options: OmitAddRequestDataToEvent
  ): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def close(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[js.Promise[Boolean]]
  inline def close(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@sentry/node/types/sdk", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    Console | Http | OnUncaughtException | OnUnhandledRejection | ContextLines | LinkedErrors | Modules | Context | InboundFilters | FunctionToString
  ] = js.native
  
  @JSImport("@sentry/node/types/sdk", "defaultStackParser")
  @js.native
  val defaultStackParser: StackParser = js.native
  
  inline def extractRequestData(
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any
  ): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(
    req: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any,
    options: Include
  ): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def flush(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[js.Promise[Boolean]]
  inline def flush(timeout: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def getSentryRelease(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")().asInstanceOf[js.UndefOr[String]]
  inline def getSentryRelease(fallback: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSentryRelease")(fallback.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: NodeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isAutoSessionTrackingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoSessionTrackingEnabled")().asInstanceOf[Boolean]
  inline def isAutoSessionTrackingEnabled(client: NodeClient): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoSessionTrackingEnabled")(client.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
}
