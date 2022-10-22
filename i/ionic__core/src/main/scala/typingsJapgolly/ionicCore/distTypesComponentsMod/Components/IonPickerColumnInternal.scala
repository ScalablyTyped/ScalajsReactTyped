package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import typingsJapgolly.ionicCore.distTypesComponentsPickerColumnInternalPickerColumnInternalInterfacesMod.PickerColumnItem
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPickerColumnInternal extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.native
  
  /**
    * A list of options to be displayed in the picker
    */
  var items: js.Array[PickerColumnItem] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * If `true`, tapping the picker will reveal a number input keyboard that lets the user type in values for each picker column. This is useful when working with time pickers.
    */
  var numericInput: Boolean = js.native
  
  def scrollActiveItemIntoView(): js.Promise[Unit] = js.native
  
  /**
    * Sets the value prop and fires the ionChange event. This is used when we need to fire ionChange from user-generated events that cannot be caught with normal input/change event listeners.
    */
  def setValue(): js.Promise[Unit] = js.native
  def setValue(value: String): js.Promise[Unit] = js.native
  def setValue(value: Double): js.Promise[Unit] = js.native
  
  /**
    * The selected option in the picker.
    */
  var value: js.UndefOr[String | Double] = js.native
}
