package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about an internet connection type that can be targeted
  * by ads. Clients can use the connection type to target mobile vs. broadband
  * users.
  */
@js.native
trait SchemaConnectionType extends js.Object {
  /**
    * ID of this connection type.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#connectionType&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this connection type.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaConnectionType {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): SchemaConnectionType = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConnectionType]
  }
}

