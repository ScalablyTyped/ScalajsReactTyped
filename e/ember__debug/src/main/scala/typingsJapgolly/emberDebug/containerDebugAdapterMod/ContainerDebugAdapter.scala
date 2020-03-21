package typingsJapgolly.emberDebug.containerDebugAdapterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerDebugAdapter extends Object {
  var resolver: typingsJapgolly.emberEngine.resolverMod.default
  def canCatalogEntriesByType(`type`: String): Boolean
  def catalogEntriesByType(`type`: String): js.Array[String]
}

object ContainerDebugAdapter {
  @scala.inline
  def apply(
    canCatalogEntriesByType: String => CallbackTo[Boolean],
    catalogEntriesByType: String => CallbackTo[js.Array[String]],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    resolver: typingsJapgolly.emberEngine.resolverMod.default
  ): ContainerDebugAdapter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.updateDynamic("canCatalogEntriesByType")(js.Any.fromFunction1((t0: java.lang.String) => canCatalogEntriesByType(t0).runNow()))
    __obj.updateDynamic("catalogEntriesByType")(js.Any.fromFunction1((t0: java.lang.String) => catalogEntriesByType(t0).runNow()))
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ContainerDebugAdapter]
  }
}

