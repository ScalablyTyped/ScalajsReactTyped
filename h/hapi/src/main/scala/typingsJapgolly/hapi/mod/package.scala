package typingsJapgolly.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CachePolicyOptions[T] = typingsJapgolly.catbox.mod.PolicyOptionVariants[T] with typingsJapgolly.hapi.AnonCache
  type CacheProvider[T /* <: typingsJapgolly.catbox.mod.ClientOptions */] = typingsJapgolly.catbox.mod.EnginePrototype[js.Any] | typingsJapgolly.hapi.AnonConstructor[T]
  type DecorateName = java.lang.String | js.Symbol
  type DecorationMethod[T] = js.ThisFunction1[/* this */ T, /* repeated */ js.Any, js.Any]
  type Dependencies = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LogEventHandler = js.Function2[
    /* event */ typingsJapgolly.hapi.mod.LogEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.hapi.hapiBooleans.`true`], 
    scala.Unit
  ]
  type PayloadCompressionDecoderSettings = js.Object
  type PeekListener = js.Function2[/* chunk */ java.lang.String, /* encoding */ java.lang.String, scala.Unit]
  type Plugin[T] = typingsJapgolly.hapi.mod.PluginBase[T] with (typingsJapgolly.hapi.mod.PluginNameVersion | typingsJapgolly.hapi.mod.PluginPackage)
  type RequestEventHandler = js.Function3[
    /* request */ typingsJapgolly.hapi.mod.Request, 
    /* event */ typingsJapgolly.hapi.mod.RequestEvent, 
    /* tags */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.hapi.hapiBooleans.`true`], 
    scala.Unit
  ]
  type RequestQuery = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ResponseEventHandler = js.Function1[/* request */ typingsJapgolly.hapi.mod.Request, scala.Unit]
  type ResponseValue = java.lang.String | js.Object
  type RouteCompressionEncoderSettings = js.Object
  type RouteEventHandler = js.Function1[/* route */ typingsJapgolly.hapi.mod.RequestRoute, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hapi.mod.RouteOptionsAccessScopeObject
    - typingsJapgolly.hapi.mod.RouteOptionsAccessEntityObject
    - typingsJapgolly.hapi.mod.RouteOptionsAccessScopeObject with typingsJapgolly.hapi.mod.RouteOptionsAccessEntityObject
  */
  type RouteOptionsAccessObject = typingsJapgolly.hapi.mod._RouteOptionsAccessObject | (typingsJapgolly.hapi.mod.RouteOptionsAccessScopeObject with typingsJapgolly.hapi.mod.RouteOptionsAccessEntityObject)
  type RouteOptionsAccessScope = typingsJapgolly.hapi.hapiBooleans.`false` | java.lang.String | js.Array[java.lang.String]
  type RouteOptionsCache = typingsJapgolly.hapi.AnonOtherwise with (typingsJapgolly.hapi.AnonExpiresAt | typingsJapgolly.hapi.AnonExpiresIn | typingsJapgolly.hapi.AnonExpiresAtExpiresIn)
  type RouteOptionsPreAllOptions = typingsJapgolly.hapi.mod.RouteOptionsPreObject | js.Array[typingsJapgolly.hapi.mod.RouteOptionsPreObject] | typingsJapgolly.hapi.mod.Lifecycle.Method
  type RouteOptionsPreArray = js.Array[typingsJapgolly.hapi.mod.RouteOptionsPreAllOptions]
  type RouteOptionsResponseSchema = scala.Boolean | typingsJapgolly.hapi.mod.ValidationObject | typingsJapgolly.joi.mod.Schema | (js.Function2[
    /* value */ js.Object | typingsJapgolly.node.Buffer | java.lang.String, 
    /* options */ typingsJapgolly.joi.mod.ValidationOptions, 
    js.Promise[js.Any]
  ])
  type RouteOptionsSecure = scala.Boolean | typingsJapgolly.hapi.mod.RouteOptionsSecureObject
  type ServerAuthConfig = typingsJapgolly.hapi.mod.RouteOptionsAccess
  type ServerAuthScheme = js.Function2[
    /* server */ typingsJapgolly.hapi.mod.Server, 
    /* options */ js.UndefOr[typingsJapgolly.hapi.mod.ServerAuthSchemeOptions], 
    typingsJapgolly.hapi.mod.ServerAuthSchemeObject
  ]
  type ServerAuthSchemeOptions = js.Object
  type ServerEventsApplication = java.lang.String | typingsJapgolly.hapi.mod.ServerEventsApplicationObject | typingsJapgolly.podium.mod.Podium
  type ServerExtPointFunction = js.Function1[/* server */ typingsJapgolly.hapi.mod.Server, scala.Unit]
  type ServerMethod = js.Function1[/* repeated */ js.Any, js.Any]
  type ServerMethods = typingsJapgolly.hapi.mod.Util.Dictionary[typingsJapgolly.hapi.mod.ServerMethod]
  type StartEventHandler = js.Function0[scala.Unit]
  type StopEventHandler = js.Function0[scala.Unit]
  type ValidationObject = typingsJapgolly.joi.mod.SchemaMap
}
