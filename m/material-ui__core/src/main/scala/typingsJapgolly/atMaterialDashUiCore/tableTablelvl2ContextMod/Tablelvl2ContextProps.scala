package typingsJapgolly.atMaterialDashUiCore.tableTablelvl2ContextMod

import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.body
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.footer
import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tablelvl2ContextProps extends js.Object {
  var variant: head | body | footer
}

object Tablelvl2ContextProps {
  @scala.inline
  def apply(variant: head | body | footer): Tablelvl2ContextProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tablelvl2ContextProps]
  }
}

