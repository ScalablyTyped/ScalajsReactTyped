package typingsJapgolly.winrt.Windows.Graphics.Printing

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCoreUIConfiguration extends js.Object {
  var displayedOptions: IVector[String]
}

object IPrintTaskOptionsCoreUIConfiguration {
  @scala.inline
  def apply(displayedOptions: IVector[String]): IPrintTaskOptionsCoreUIConfiguration = {
    val __obj = js.Dynamic.literal(displayedOptions = displayedOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintTaskOptionsCoreUIConfiguration]
  }
}

