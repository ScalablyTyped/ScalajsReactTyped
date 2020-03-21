package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Injector] = js.undefined
  var providers: js.Array[StaticProvider]
}

object AnonName {
  @scala.inline
  def apply(providers: js.Array[StaticProvider], name: String = null, parent: Injector = null): AnonName = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

