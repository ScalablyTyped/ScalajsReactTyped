package typingsJapgolly.atAngularCore

import typingsJapgolly.atAngularCore.atAngularCoreMod.Injector
import typingsJapgolly.atAngularCore.atAngularCoreMod.StaticProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Injector] = js.undefined
  var providers: js.Array[StaticProvider]
}

object Anon_Name {
  @scala.inline
  def apply(providers: js.Array[StaticProvider], name: String = null, parent: Injector = null): Anon_Name = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Name]
  }
}

