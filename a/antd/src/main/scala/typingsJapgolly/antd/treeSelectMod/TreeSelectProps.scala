package typingsJapgolly.antd.treeSelectMod

import typingsJapgolly.antd.sizeContextMod.SizeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any, 'showTreeIcon' | 'treeMotion' | 'inputIcon' | 'mode' | 'getInputElement' | 'backfill'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelectProps<T> * / any[P]} */ trait TreeSelectProps[T] extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object TreeSelectProps {
  @scala.inline
  def apply[T](bordered: js.UndefOr[Boolean] = js.undefined, size: SizeType = null): TreeSelectProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeSelectProps[T]]
  }
}

