package typingsJapgolly.ember.mod.Ember

import typingsJapgolly.emberObject.typesMod.UnwrapComputedPropertyGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.getWithDefault")
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

