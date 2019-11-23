package typingsJapgolly.atStorybookTheming.distTypesMod

import typingsJapgolly.atStorybookTheming.Anon_Base
import typingsJapgolly.atStorybookTheming.Anon_Black
import typingsJapgolly.atStorybookTheming.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typography extends js.Object {
  var fonts: Anon_Base
  var size: Anon_Code
  var weight: Anon_Black
}

object Typography {
  @scala.inline
  def apply(fonts: Anon_Base, size: Anon_Code, weight: Anon_Black): Typography = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typography]
  }
}

