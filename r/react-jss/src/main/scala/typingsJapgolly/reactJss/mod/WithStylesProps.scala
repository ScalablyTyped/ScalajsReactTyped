package typingsJapgolly.reactJss.mod

import typingsJapgolly.jss.mod.Classes
import typingsJapgolly.jss.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends js.Object {
  var classes: Classes[String]
}

object WithStylesProps {
  @scala.inline
  def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[String]): WithStylesProps[S] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStylesProps[S]]
  }
}

