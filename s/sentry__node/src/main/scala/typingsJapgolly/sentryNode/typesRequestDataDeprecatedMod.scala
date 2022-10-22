package typingsJapgolly.sentryNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryNode.anon.ServerName
import typingsJapgolly.sentryTypes.typesEventMod.Event
import typingsJapgolly.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typingsJapgolly.sentryUtils.anon.Ip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestDataDeprecatedMod {
  
  @JSImport("@sentry/node/types/requestDataDeprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractRequestData(req: StringDictionary[Any]): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: StringDictionary[Any], keys: js.Array[String]): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def parseRequest(event: Event, req: ExpressRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def parseRequest(event: Event, req: ExpressRequest, options: ParseRequestOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  type ExpressRequest = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CrossPlatformRequest */ Any
  
  type ParseRequestOptions = js.UndefOr[Ip] & ServerName
}
