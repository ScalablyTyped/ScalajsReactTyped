package typingsJapgolly.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
class MKRadioButton ()
  extends MKComponent[MKRadioButtonProperties, js.Any]

@JSImport("react-native-material-kit", "MKRadioButton")
@js.native
object MKRadioButton extends js.Object {
  @js.native
  class Group () extends MKRadioButtonGroup {
    def this(onAdd: js.Function1[
            /* btn */ typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ]) = this()
    def this(
      onAdd: js.Function1[
            /* btn */ typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ],
      onRemove: js.Function1[
            /* btn */ typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, 
            Unit
          ]
    ) = this()
    /* CompleteClass */
    override var buttons: js.Array[_] = js.native
    def add(btn: typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
    def onChecked(btn: typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton, checked: Boolean): Unit = js.native
    def onRemoved(btn: typingsJapgolly.reactNativeMaterialKit.mod.MKRadioButton.MKRadioButton): Unit = js.native
  }
  
  @js.native
  class MKRadioButton () extends js.Object
  
}

