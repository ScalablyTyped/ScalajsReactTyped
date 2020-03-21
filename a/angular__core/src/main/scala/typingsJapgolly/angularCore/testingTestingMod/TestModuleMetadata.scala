package typingsJapgolly.angularCore.testingTestingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.mod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestModuleMetadata extends js.Object {
  var aotSummaries: js.UndefOr[js.Function0[js.Array[_]]] = js.undefined
  var declarations: js.UndefOr[js.Array[_]] = js.undefined
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  var schemas: js.UndefOr[js.Array[SchemaMetadata | js.Array[_]]] = js.undefined
}

object TestModuleMetadata {
  @scala.inline
  def apply(
    aotSummaries: js.UndefOr[CallbackTo[js.Array[js.Any]]] = js.undefined,
    declarations: js.Array[_] = null,
    imports: js.Array[_] = null,
    providers: js.Array[_] = null,
    schemas: js.Array[SchemaMetadata | js.Array[_]] = null
  ): TestModuleMetadata = {
    val __obj = js.Dynamic.literal()
    aotSummaries.foreach(p => __obj.updateDynamic("aotSummaries")(p.toJsFn))
    if (declarations != null) __obj.updateDynamic("declarations")(declarations.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestModuleMetadata]
  }
}

