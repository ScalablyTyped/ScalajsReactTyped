package typingsJapgolly.emberObject.mod

import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertyGetter
import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertySetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object", "set")
@js.native
object set extends js.Object {
  def apply[T, K /* <: String */](
    obj: T,
    key: K,
    value: UnwrapComputedPropertySetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}

