package typingsJapgolly.feathersjsFeathers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // tslint:disable-next-line void-return
  type Hook = js.Function1[
    /* hook */ typingsJapgolly.feathersjsFeathers.mod.HookContext[js.Any], 
    (js.Promise[
      typingsJapgolly.feathersjsFeathers.mod.HookContext[js.Any] | typingsJapgolly.feathersjsFeathers.mod.SkipSymbol | scala.Unit
    ]) | typingsJapgolly.feathersjsFeathers.mod.HookContext[js.Any] | typingsJapgolly.feathersjsFeathers.mod.SkipSymbol | scala.Unit
  ]
  type Id = scala.Double | java.lang.String
  type NullableId = typingsJapgolly.feathersjsFeathers.mod.Id | scala.Null
  type Query = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ServerSideParams = typingsJapgolly.feathersjsFeathers.mod.Params
  type Service[T] = typingsJapgolly.feathersjsFeathers.mod.ServiceOverloads[T] with typingsJapgolly.feathersjsFeathers.mod.ServiceAddons[T] with typingsJapgolly.feathersjsFeathers.mod.ServiceMethods[T]
  type SkipSymbol = js.Symbol | typingsJapgolly.feathersjsFeathers.feathersjsFeathersStrings.__feathersSkipHooks
}
