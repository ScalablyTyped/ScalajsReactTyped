package typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSS.CreateStyleSheetOptions<ClassKey> * / any */ trait WithStylesOptions[ClassKey /* <: String */] extends js.Object {
  var flip: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var withTheme: js.UndefOr[Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply[ClassKey /* <: String */](
    flip: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    withTheme: js.UndefOr[Boolean] = js.undefined
  ): WithStylesOptions[ClassKey] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(withTheme)) __obj.updateDynamic("withTheme")(withTheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesOptions[ClassKey]]
  }
}

