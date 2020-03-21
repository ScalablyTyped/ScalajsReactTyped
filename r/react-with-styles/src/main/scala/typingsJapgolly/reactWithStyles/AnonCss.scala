package typingsJapgolly.reactWithStyles

import typingsJapgolly.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCss[TStyles /* <: Styles */] extends js.Object {
  var css: js.Function
  var styles: TStyles
}

object AnonCss {
  @scala.inline
  def apply[TStyles /* <: Styles */](css: js.Function, styles: TStyles): AnonCss[TStyles] = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCss[TStyles]]
  }
}

