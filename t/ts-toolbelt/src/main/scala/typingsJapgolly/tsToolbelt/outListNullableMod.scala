package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyCastMod.Cast
import typingsJapgolly.tsToolbelt.outAnyXMod.x
import typingsJapgolly.tsToolbelt.outListInternalMod.Key
import typingsJapgolly.tsToolbelt.outObjectUpdateMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListNullableMod {
  
  type Nullable[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = Cast[
    Update[L, (/* template literal string: ${K&number} */ String) | K, js.UndefOr[x | Null]], 
    typingsJapgolly.tsToolbelt.outListListMod.List[Any]
  ]
}
