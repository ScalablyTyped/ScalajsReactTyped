package typingsJapgolly.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDnsKeySpec extends js.Object {
  var algorithm: js.UndefOr[String] = js.native
  var keyLength: js.UndefOr[Double] = js.native
  var keyType: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#dnsKeySpec&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDnsKeySpec {
  @scala.inline
  def apply(
    algorithm: String = null,
    keyLength: Int | Double = null,
    keyType: String = null,
    kind: String = null
  ): SchemaDnsKeySpec = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (keyLength != null) __obj.updateDynamic("keyLength")(keyLength.asInstanceOf[js.Any])
    if (keyType != null) __obj.updateDynamic("keyType")(keyType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDnsKeySpec]
  }
}

