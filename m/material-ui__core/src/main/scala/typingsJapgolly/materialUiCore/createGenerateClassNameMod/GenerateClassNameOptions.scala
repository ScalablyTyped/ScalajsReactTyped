package typingsJapgolly.materialUiCore.createGenerateClassNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateClassNameOptions extends js.Object {
  var dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.native
  var productionPrefix: js.UndefOr[String] = js.native
  var seed: js.UndefOr[String] = js.native
}

object GenerateClassNameOptions {
  @scala.inline
  def apply(
    dangerouslyUseGlobalCSS: js.UndefOr[Boolean] = js.undefined,
    productionPrefix: String = null,
    seed: String = null
  ): GenerateClassNameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dangerouslyUseGlobalCSS)) __obj.updateDynamic("dangerouslyUseGlobalCSS")(dangerouslyUseGlobalCSS.asInstanceOf[js.Any])
    if (productionPrefix != null) __obj.updateDynamic("productionPrefix")(productionPrefix.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateClassNameOptions]
  }
}

