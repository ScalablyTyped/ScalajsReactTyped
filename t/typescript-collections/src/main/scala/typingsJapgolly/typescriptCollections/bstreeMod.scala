package typingsJapgolly.typescriptCollections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-collections/dist/lib/BSTree", JSImport.Namespace)
@js.native
object bstreeMod extends js.Object {
  @js.native
  class default[T] ()
    extends typingsJapgolly.typescriptCollections.bstreekvMod.default[T, T]
  
  type BSTree[T] = typingsJapgolly.typescriptCollections.bstreekvMod.default[T, T]
}

