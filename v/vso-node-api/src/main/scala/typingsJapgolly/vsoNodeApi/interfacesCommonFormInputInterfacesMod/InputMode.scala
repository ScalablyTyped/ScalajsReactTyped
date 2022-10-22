package typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputMode extends StObject
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputMode")
@js.native
object InputMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputMode & Double] = js.native
  
  /**
    * Checkbox should be shown(for true/false values)
    */
  @js.native
  sealed trait CheckBox
    extends StObject
       with InputMode
  /* 50 */ val CheckBox: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.CheckBox & Double = js.native
  
  /**
    * A select/combo control should be shown
    */
  @js.native
  sealed trait Combo
    extends StObject
       with InputMode
  /* 30 */ val Combo: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.Combo & Double = js.native
  
  /**
    * This input should not be shown in the UI
    */
  @js.native
  sealed trait None
    extends StObject
       with InputMode
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.None & Double = js.native
  
  /**
    * An password input box should be shown
    */
  @js.native
  sealed trait PasswordBox
    extends StObject
       with InputMode
  /* 20 */ val PasswordBox: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.PasswordBox & Double = js.native
  
  /**
    * Radio buttons should be shown
    */
  @js.native
  sealed trait RadioButtons
    extends StObject
       with InputMode
  /* 40 */ val RadioButtons: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.RadioButtons & Double = js.native
  
  /**
    * A multi-line text area should be shown
    */
  @js.native
  sealed trait TextArea
    extends StObject
       with InputMode
  /* 60 */ val TextArea: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.TextArea & Double = js.native
  
  /**
    * An input text box should be shown
    */
  @js.native
  sealed trait TextBox
    extends StObject
       with InputMode
  /* 10 */ val TextBox: typingsJapgolly.vsoNodeApi.interfacesCommonFormInputInterfacesMod.InputMode.TextBox & Double = js.native
}
