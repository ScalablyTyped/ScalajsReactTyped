package typingsJapgolly.typeFest

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.typeFest.sourceExceptMod.Except
import typingsJapgolly.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetOptionalMod {
  
  type SetOptional[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are readonly from the base type.
  Except[BaseType, Keys]) & (// Pick the keys that should be mutable from the base type and make them mutable.
  Partial[Pick[BaseType, Keys]])
  ]
}
