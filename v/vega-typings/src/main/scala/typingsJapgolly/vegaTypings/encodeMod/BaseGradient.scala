package typingsJapgolly.vegaTypings.encodeMod

import typingsJapgolly.vegaTypings.vegaTypingsStrings.linear
import typingsJapgolly.vegaTypings.vegaTypingsStrings.radial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseGradient extends js.Object {
  /**
    * The type of gradient.
    */
  var gradient: linear | radial
}

object BaseGradient {
  @scala.inline
  def apply(gradient: linear | radial): BaseGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseGradient]
  }
}

