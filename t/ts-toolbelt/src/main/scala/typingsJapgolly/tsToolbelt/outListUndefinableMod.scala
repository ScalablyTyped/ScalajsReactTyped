package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyCastMod.Cast
import typingsJapgolly.tsToolbelt.outAnyXMod.x
import typingsJapgolly.tsToolbelt.outListInternalMod.Key
import typingsJapgolly.tsToolbelt.outObjectUpdateMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outListUndefinableMod {
  
  type Undefinable[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, K /* <: Key */] = Cast[
    Update[L, (/* template literal string: ${K&number} */ String) | K, js.UndefOr[x]], 
    typingsJapgolly.tsToolbelt.outListListMod.List[Any]
  ]
}
