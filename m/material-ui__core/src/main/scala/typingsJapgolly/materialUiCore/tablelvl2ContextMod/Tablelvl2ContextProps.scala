package typingsJapgolly.materialUiCore.tablelvl2ContextMod

import typingsJapgolly.materialUiCore.materialUiCoreStrings.body
import typingsJapgolly.materialUiCore.materialUiCoreStrings.footer
import typingsJapgolly.materialUiCore.materialUiCoreStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tablelvl2ContextProps extends js.Object {
  var variant: head | body | footer = js.native
}

object Tablelvl2ContextProps {
  @scala.inline
  def apply(variant: head | body | footer): Tablelvl2ContextProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tablelvl2ContextProps]
  }
}

