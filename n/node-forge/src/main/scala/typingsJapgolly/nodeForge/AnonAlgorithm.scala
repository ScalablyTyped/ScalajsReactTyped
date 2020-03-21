package typingsJapgolly.nodeForge

import typingsJapgolly.nodeForge.mod.Hex
import typingsJapgolly.nodeForge.nodeForgeStrings.`3des`
import typingsJapgolly.nodeForge.nodeForgeStrings.aes128
import typingsJapgolly.nodeForge.nodeForgeStrings.aes192
import typingsJapgolly.nodeForge.nodeForgeStrings.aes256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[aes128 | aes192 | aes256 | `3des`] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  var generateLocalKeyId: js.UndefOr[Boolean] = js.undefined
  var localKeyId: js.UndefOr[Hex] = js.undefined
  var saltSize: js.UndefOr[Double] = js.undefined
  var useMac: js.UndefOr[Boolean] = js.undefined
}

object AnonAlgorithm {
  @scala.inline
  def apply(
    algorithm: aes128 | aes192 | aes256 | `3des` = null,
    count: Int | Double = null,
    friendlyName: String = null,
    generateLocalKeyId: js.UndefOr[Boolean] = js.undefined,
    localKeyId: Hex = null,
    saltSize: Int | Double = null,
    useMac: js.UndefOr[Boolean] = js.undefined
  ): AnonAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (!js.isUndefined(generateLocalKeyId)) __obj.updateDynamic("generateLocalKeyId")(generateLocalKeyId.asInstanceOf[js.Any])
    if (localKeyId != null) __obj.updateDynamic("localKeyId")(localKeyId.asInstanceOf[js.Any])
    if (saltSize != null) __obj.updateDynamic("saltSize")(saltSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useMac)) __obj.updateDynamic("useMac")(useMac.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

