package typingsJapgolly.gaeaModel.FitGaea

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __React.ComponentClass<any> * / any */ trait Plugin extends js.Object {
  var Action: js.UndefOr[js.Any] = js.undefined
  var Store: js.UndefOr[js.Any] = js.undefined
  // 插件安放位置
  var position: String
}

object Plugin {
  @scala.inline
  def apply(position: String, Action: js.Any = null, Store: js.Any = null): Plugin = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Store != null) __obj.updateDynamic("Store")(Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
}

