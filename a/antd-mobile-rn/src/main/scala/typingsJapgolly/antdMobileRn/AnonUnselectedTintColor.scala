package typingsJapgolly.antdMobileRn

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnselectedTintColor extends js.Object {
  var barTintColor: String
  var styles: StringDictionary[RegisteredStyle[_]]
  var tintColor: String
  var unselectedTintColor: String
}

object AnonUnselectedTintColor {
  @scala.inline
  def apply(
    barTintColor: String,
    styles: StringDictionary[RegisteredStyle[_]],
    tintColor: String,
    unselectedTintColor: String
  ): AnonUnselectedTintColor = {
    val __obj = js.Dynamic.literal(barTintColor = barTintColor.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], unselectedTintColor = unselectedTintColor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUnselectedTintColor]
  }
}

