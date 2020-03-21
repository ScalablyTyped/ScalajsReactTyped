package typingsJapgolly.jscodeshift.coreMod

import typingsJapgolly.jscodeshift.jsxelementMod.FilterMethods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  var JSXElement: FilterMethods
  var VariableDeclarator: typingsJapgolly.jscodeshift.variableDeclaratorMod.FilterMethods
}

object Filters {
  @scala.inline
  def apply(
    JSXElement: FilterMethods,
    VariableDeclarator: typingsJapgolly.jscodeshift.variableDeclaratorMod.FilterMethods
  ): Filters = {
    val __obj = js.Dynamic.literal(JSXElement = JSXElement.asInstanceOf[js.Any], VariableDeclarator = VariableDeclarator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filters]
  }
}

