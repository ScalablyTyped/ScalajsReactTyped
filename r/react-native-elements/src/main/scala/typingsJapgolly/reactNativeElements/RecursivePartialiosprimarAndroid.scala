package typingsJapgolly.reactNativeElements

import typingsJapgolly.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<{  ios  :{  primary  :string,   secondary  :string,   success  :string,   error  :string,   warning  :string},   android  :{  primary  :string,   secondary  :string,   success  :string,   error  :string,   warning  :string}}> */
trait RecursivePartialiosprimarAndroid extends js.Object {
  var android: js.UndefOr[RecursivePartial[AnonError]] = js.undefined
  var ios: js.UndefOr[RecursivePartial[AnonError]] = js.undefined
}

object RecursivePartialiosprimarAndroid {
  @scala.inline
  def apply(android: RecursivePartial[AnonError] = null, ios: RecursivePartial[AnonError] = null): RecursivePartialiosprimarAndroid = {
    val __obj = js.Dynamic.literal()
    if (android != null) __obj.updateDynamic("android")(android.asInstanceOf[js.Any])
    if (ios != null) __obj.updateDynamic("ios")(ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialiosprimarAndroid]
  }
}

