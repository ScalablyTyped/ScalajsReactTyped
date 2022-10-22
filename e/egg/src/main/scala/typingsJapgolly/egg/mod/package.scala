package typingsJapgolly.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.egg.mod.^
import typingsJapgolly.eggCore.mod.EggCore
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.urllib.mod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def start(): js.Promise[Application] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[js.Promise[Application]]
inline def start(options: StartOptions): js.Promise[Application] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Application]]

inline def startCluster(options: ClusterOptions, callback: js.Function1[/* repeated */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startCluster")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

type EggContextHttpClient = HttpClient

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.egg.eggStrings.local
  - typingsJapgolly.egg.eggStrings.unittest
  - typingsJapgolly.egg.eggStrings.prod
  - java.lang.String
*/
type EggEnvType = _EggEnvType | String

type EggHttpClient = HttpClient

type EggLoader = typingsJapgolly.eggCore.mod.EggLoader[
EggCore[typingsJapgolly.eggCore.mod.PlainObject[Any]], 
Any, 
typingsJapgolly.eggCore.mod.EggLoaderOptions]

type EggLoaderOptions = typingsJapgolly.eggCore.mod.EggLoaderOptions

type EggLogger = typingsJapgolly.eggLogger.mod.EggLogger

type EggPluginItem = IEggPluginItem | Boolean

type IApplicationLocals = PlainObject[Any]

type IContextLocals = PlainObject[Any]

type IController = PlainObject[Any]

type IMiddleware = PlainObject[Any]

type IService = PlainObject[Any]

type IgnoreItem = String | js.RegExp | (js.Function1[/* ctx */ Context[Any], Boolean])

type IgnoreOrMatch = IgnoreItem | js.Array[IgnoreItem]

type LoggerLevel = typingsJapgolly.eggLogger.mod.LoggerLevel

// plain object
type PlainObject[T] = StringDictionary[T]

// Remove specific property from the specific class
type RemoveSpecProp[T, P] = Pick[T, Exclude[/* keyof T */ String, P]]

type RequestArrayBody = js.Array[Any]

type RequestObjectBody = PlainObject[Any]

type RouterPath = String | js.RegExp
