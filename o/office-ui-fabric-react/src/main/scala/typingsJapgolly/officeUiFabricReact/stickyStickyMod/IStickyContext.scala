package typingsJapgolly.officeUiFabricReact.stickyStickyMod

import typingsJapgolly.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyContext extends js.Object {
  var scrollablePane: Requireable[js.Object]
}

object IStickyContext {
  @scala.inline
  def apply(scrollablePane: Requireable[js.Object]): IStickyContext = {
    val __obj = js.Dynamic.literal(scrollablePane = scrollablePane.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStickyContext]
  }
}

