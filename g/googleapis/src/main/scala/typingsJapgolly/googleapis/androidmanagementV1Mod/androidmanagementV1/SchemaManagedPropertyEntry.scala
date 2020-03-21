package typingsJapgolly.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry of a managed property.
  */
@js.native
trait SchemaManagedPropertyEntry extends js.Object {
  /**
    * The human-readable name of the value. Localized.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The machine-readable value of the entry, which should be used in the
    * configuration. Not localized.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaManagedPropertyEntry {
  @scala.inline
  def apply(name: String = null, value: String = null): SchemaManagedPropertyEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedPropertyEntry]
  }
}

