package typingsJapgolly.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object r3SymbolsMod {
  /**
    * Describes how the `Injector` should be configured as static (that is, without reflection).
    * @see ["Dependency Injection Guide"](guide/dependency-injection).
    *
    * @publicApi
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCore.r3SymbolsMod.ValueProvider
    - typingsJapgolly.angularCore.r3SymbolsMod.ExistingProvider
    - typingsJapgolly.angularCore.r3SymbolsMod.StaticClassProvider
    - typingsJapgolly.angularCore.r3SymbolsMod.ConstructorProvider
    - typingsJapgolly.angularCore.r3SymbolsMod.FactoryProvider
    - js.Array[js.Any]
  */
  type StaticProvider = typingsJapgolly.angularCore.r3SymbolsMod._StaticProvider | js.Array[js.Any]
  type ɵɵNgModuleDefWithMeta[T, Declarations, Imports, Exports] = typingsJapgolly.angularCore.r3SymbolsMod.NgModuleDef[T]
}
