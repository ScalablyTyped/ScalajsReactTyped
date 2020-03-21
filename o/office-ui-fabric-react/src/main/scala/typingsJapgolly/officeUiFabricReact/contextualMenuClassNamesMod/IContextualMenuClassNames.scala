package typingsJapgolly.officeUiFabricReact.contextualMenuClassNamesMod

import typingsJapgolly.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSubComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuClassNames extends js.Object {
  var container: String
  var header: String
  var list: String
  var root: String
  var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.undefined
  var title: String
}

object IContextualMenuClassNames {
  @scala.inline
  def apply(
    container: String,
    header: String,
    list: String,
    root: String,
    title: String,
    subComponentStyles: IContextualMenuSubComponentStyles = null
  ): IContextualMenuClassNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (subComponentStyles != null) __obj.updateDynamic("subComponentStyles")(subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuClassNames]
  }
}

