package typingsJapgolly.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformCaller extends js.Object {
  // the only required property
  var name: String
  var supportsDynamicImport: js.UndefOr[Boolean] = js.undefined
  // e.g. set to true by `babel-loader` and false by `babel-jest`
  var supportsStaticESM: js.UndefOr[Boolean] = js.undefined
}

object TransformCaller {
  @scala.inline
  def apply(
    name: String,
    supportsDynamicImport: js.UndefOr[Boolean] = js.undefined,
    supportsStaticESM: js.UndefOr[Boolean] = js.undefined
  ): TransformCaller = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsDynamicImport)) __obj.updateDynamic("supportsDynamicImport")(supportsDynamicImport.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsStaticESM)) __obj.updateDynamic("supportsStaticESM")(supportsStaticESM.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCaller]
  }
}

