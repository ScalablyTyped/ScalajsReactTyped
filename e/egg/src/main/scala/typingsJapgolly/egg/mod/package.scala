package typingsJapgolly.egg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EggContextHttpClient = typingsJapgolly.urllib.mod.HttpClient[typingsJapgolly.urllib.mod.RequestOptions2]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.egg.eggStrings.local
    - typingsJapgolly.egg.eggStrings.unittest
    - typingsJapgolly.egg.eggStrings.prod
    - java.lang.String
  */
  type EggEnvType = typingsJapgolly.egg.mod._EggEnvType | java.lang.String
  type EggHttpClient = typingsJapgolly.urllib.mod.HttpClient[typingsJapgolly.urllib.mod.RequestOptions2]
  type EggLoader = typingsJapgolly.eggCore.mod.EggLoader[
    typingsJapgolly.eggCore.mod.EggCore[typingsJapgolly.eggCore.mod.PlainObject[js.Any]], 
    js.Any
  ]
  type EggLoaderOptions = typingsJapgolly.eggCore.mod.EggLoaderOptions
  type EggPluginItem = typingsJapgolly.egg.mod.IEggPluginItem | scala.Boolean
  type IApplicationLocals = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type IContextLocals = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type IController = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type IMiddleware = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type IService = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type IgnoreItem = java.lang.String | js.RegExp | (js.Function1[/* ctx */ typingsJapgolly.egg.mod.Context, scala.Boolean])
  type IgnoreOrMatch = typingsJapgolly.egg.mod.IgnoreItem | js.Array[typingsJapgolly.egg.mod.IgnoreItem]
  type LoggerLevel = typingsJapgolly.eggLogger.mod.LoggerLevel
  // plain object
  type PlainObject[T] = org.scalablytyped.runtime.StringDictionary[T]
  type PowerPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ U in keyof T ]:? T[U] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias egg.egg.PowerPartial<T[U]> * / object : T[U]}
    */ typingsJapgolly.egg.eggStrings.PowerPartial with js.Any
  // Remove specific property from the specific class
  type RemoveSpecProp[T, P] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, P]]
  type RequestArrayBody = js.Array[js.Any]
  type RequestObjectBody = typingsJapgolly.egg.mod.PlainObject[js.Any]
  type RouterPath = java.lang.String | js.RegExp
}
