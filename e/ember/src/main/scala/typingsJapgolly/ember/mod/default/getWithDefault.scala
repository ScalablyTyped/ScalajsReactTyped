package typingsJapgolly.ember.mod.default

import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "getWithDefault")
@js.native
object getWithDefault extends js.Object {
  def apply[T, K /* <: java.lang.String */](
    obj: T,
    key: K,
    defaultValue: UnwrapComputedPropertyGetter[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): UnwrapComputedPropertyGetter[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
}

