package typingsJapgolly.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveInterfaceMod {
  type CustomAsyncPolicy = js.Function1[/* data */ js.Any, js.Promise[js.Any]]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.uirouterCore.uirouterCoreStrings.WAIT
    - typingsJapgolly.uirouterCore.uirouterCoreStrings.NOWAIT
    - typingsJapgolly.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
  */
  type PolicyAsync = typingsJapgolly.uirouterCore.resolveInterfaceMod._PolicyAsync | typingsJapgolly.uirouterCore.resolveInterfaceMod.CustomAsyncPolicy
}
