package typingsJapgolly.hapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typingsJapgolly.hapiCatbox.mod.PolicyOptionVariants[T] with typingsJapgolly.hapiHapi.AnonCache
  type CacheProvider[T /* <: typingsJapgolly.hapiCatbox.mod.ClientOptions */] = typingsJapgolly.hapiCatbox.mod.EnginePrototype[js.Any] | typingsJapgolly.hapiHapi.AnonConstructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ typingsJapgolly.hapiHapi.mod.LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = typingsJapgolly.hapiHapi.mod.PluginBase[T] with (typingsJapgolly.hapiHapi.mod.PluginNameVersion | typingsJapgolly.hapiHapi.mod.PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ typingsJapgolly.hapiHapi.mod.Request, 
    /* event */ typingsJapgolly.hapiHapi.mod.RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.hapiHapi.hapiHapiBooleans.`true`], 
    scala.Unit
  ]
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResponseEventHandler = js.Function1[/* request */ typingsJapgolly.hapiHapi.mod.Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typingsJapgolly.hapiHapi.mod.RequestRoute, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapiHapi.mod.RouteOptionsAccessScopeObject
    - typingsJapgolly.hapiHapi.mod.RouteOptionsAccessEntityObject
    - typingsJapgolly.hapiHapi.mod.RouteOptionsAccessScopeObject with typingsJapgolly.hapiHapi.mod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = typingsJapgolly.hapiHapi.mod._RouteOptionsAccessObject | (typingsJapgolly.hapiHapi.mod.RouteOptionsAccessScopeObject with typingsJapgolly.hapiHapi.mod.RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = typingsJapgolly.hapiHapi.hapiHapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = typingsJapgolly.hapiHapi.AnonOtherwise with (typingsJapgolly.hapiHapi.AnonExpiresAt | typingsJapgolly.hapiHapi.AnonExpiresIn | typingsJapgolly.hapiHapi.AnonExpiresAtExpiresIn)
  type RouteOptionsPreAllOptions = typingsJapgolly.hapiHapi.mod.RouteOptionsPreObject | js.Array[typingsJapgolly.hapiHapi.mod.RouteOptionsPreObject] | typingsJapgolly.hapiHapi.mod.Lifecycle.Method
  type RouteOptionsPreArray = js.Array[typingsJapgolly.hapiHapi.mod.RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | typingsJapgolly.hapiHapi.mod.ValidationObject | typingsJapgolly.hapiJoi.mod.Schema | (js.Function2[
    /* value */ js.Object | typingsJapgolly.node.Buffer | java.lang.String, 
    /* options */ typingsJapgolly.hapiJoi.mod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | typingsJapgolly.hapiHapi.mod.RouteOptionsSecureObject
  type ServerAuthConfig = typingsJapgolly.hapiHapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typingsJapgolly.hapiHapi.mod.Server, 
    /* options */ js.UndefOr[typingsJapgolly.hapiHapi.mod.ServerAuthSchemeOptions], 
    typingsJapgolly.hapiHapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | typingsJapgolly.hapiHapi.mod.ServerEventsApplicationObject | typingsJapgolly.hapiPodium.mod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ typingsJapgolly.hapiHapi.mod.Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typingsJapgolly.hapiHapi.mod.Util.Dictionary[typingsJapgolly.hapiHapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typingsJapgolly.hapiJoi.mod.SchemaMap[js.Any]
}
