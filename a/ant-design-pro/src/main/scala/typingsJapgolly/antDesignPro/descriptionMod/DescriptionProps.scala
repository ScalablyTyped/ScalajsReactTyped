package typingsJapgolly.antDesignPro.descriptionMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColProps * / any */ trait DescriptionProps extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var term: js.UndefOr[Node] = js.undefined
}

object DescriptionProps {
  @scala.inline
  def apply(
    column: Int | Double = null,
    key: String | Double = null,
    style: CSSProperties = null,
    term: VdomNode = null
  ): DescriptionProps = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (term != null) __obj.updateDynamic("term")(term.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionProps]
  }
}

