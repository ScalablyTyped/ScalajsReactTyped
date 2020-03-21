package typingsJapgolly.wordpressNux.dotTipMod.DotTip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Any React element or elements can be passed as children. They will be rendered within the
    * tip bubble.
    */
  var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  /**
    * A string that uniquely identifies the tip. Identifiers should be prefixed with the name
    * of the plugin, followed by a `/`. For example, `acme/add-to-cart`.
    */
  var tipId: String
}

object Props {
  @scala.inline
  def apply(
    children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    tipId: String
  ): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], tipId = tipId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props]
  }
}

