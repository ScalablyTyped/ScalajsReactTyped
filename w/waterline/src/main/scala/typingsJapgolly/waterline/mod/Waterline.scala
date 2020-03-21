package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waterline extends js.Object {
  var collections: js.Any
  def initialize(config: Config, cb: js.Function2[/* err */ js.Error, /* ontology */ Ontology, _]): js.Any
  def loadCollection(collection: CollectionClass): Unit
}

object Waterline {
  @scala.inline
  def apply(
    collections: js.Any,
    initialize: (Config, js.Function2[/* err */ js.Error, /* ontology */ Ontology, js.Any]) => CallbackTo[js.Any],
    loadCollection: CollectionClass => japgolly.scalajs.react.Callback
  ): Waterline = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: typingsJapgolly.waterline.mod.Config, t1: js.Function2[/* err */ js.Error, /* ontology */ typingsJapgolly.waterline.mod.Ontology, js.Any]) => initialize(t0, t1).runNow()))
    __obj.updateDynamic("loadCollection")(js.Any.fromFunction1((t0: typingsJapgolly.waterline.mod.CollectionClass) => loadCollection(t0).runNow()))
    __obj.asInstanceOf[Waterline]
  }
}

