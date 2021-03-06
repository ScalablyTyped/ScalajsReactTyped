package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  var files: js.Array[scala.Nothing]
  var selectable: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onChange(): Unit
  def onFail(): Unit
}

object AnonFiles {
  @scala.inline
  def apply(
    files: js.Array[scala.Nothing],
    onChange: Callback,
    onFail: Callback,
    selectable: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): AnonFiles = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onFail")(onFail.toJsFn)
    __obj.asInstanceOf[AnonFiles]
  }
}

