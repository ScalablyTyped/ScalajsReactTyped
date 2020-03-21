package typingsJapgolly.jscodeshift.jsxelementMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MappingMethods extends js.Object {
  /**
    * Given a JSXElement, returns its "root" name. E.g. it would return "Foo" for
    * both <Foo /> and <Foo.Bar />.
    */
  def getRootName(path: ASTPath[_]): String
}

object MappingMethods {
  @scala.inline
  def apply(getRootName: ASTPath[js.Any] => CallbackTo[String]): MappingMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRootName")(js.Any.fromFunction1((t0: typingsJapgolly.jscodeshift.jsxelementMod.ASTPath[js.Any]) => getRootName(t0).runNow()))
    __obj.asInstanceOf[MappingMethods]
  }
}

