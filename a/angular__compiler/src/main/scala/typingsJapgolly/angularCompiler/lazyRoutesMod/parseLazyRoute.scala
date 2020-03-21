package typingsJapgolly.angularCompiler.lazyRoutesMod

import typingsJapgolly.angularCompiler.staticReflectorMod.StaticReflector
import typingsJapgolly.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/lazy_routes", "parseLazyRoute")
@js.native
object parseLazyRoute extends js.Object {
  def apply(route: String, reflector: StaticReflector): LazyRoute = js.native
  def apply(route: String, reflector: StaticReflector, module: StaticSymbol): LazyRoute = js.native
}

