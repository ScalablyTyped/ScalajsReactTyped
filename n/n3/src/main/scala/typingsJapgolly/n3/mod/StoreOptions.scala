package typingsJapgolly.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreOptions extends js.Object {
  var factory: js.UndefOr[typingsJapgolly.rdfJs.mod.DataFactory[typingsJapgolly.rdfJs.mod.Quad]] = js.undefined
}

object StoreOptions {
  @scala.inline
  def apply(factory: typingsJapgolly.rdfJs.mod.DataFactory[typingsJapgolly.rdfJs.mod.Quad] = null): StoreOptions = {
    val __obj = js.Dynamic.literal()
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
}

