package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the controls of a {@link FilePicker} .
  *
  * A {@link FilePicker} may contain additional elements according to the needs of the different applications. These additional elements can be addressed
  * by this interface.
  * @see com.sun.star.ui.dialogs.FilePicker
  */
trait XFilePickerControlAccess
  extends StObject
     with XFilePicker {
  
  /**
    * Enables or disables a control.
    * @param ControlId Identifies the control.
    * @param bEnable  If `TRUE` the specified control will be enabled.  If `FALSE` the specified control will be disabled.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def enableControl(ControlId: Double, bEnable: Boolean): Unit
  
  /**
    * Returns the label of the specified element.
    * @param aControlId Identifies the element for which the label should be returned.
    * @returns The label of the specified element or an empty string if the specified element has no or supports no label or the specified element doesn't exist.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def getLabel(aControlId: Double): String
  
  /**
    * Get the value of an additional element within a {@link FilePicker}
    * @param aControlId Identifies the element for which value is requested.
    * @param aControlAction Specifies which value to retrieve. aControlAction has to be one of the values defined in {@link ControlActions} . Not all of the v
    * @returns The value of the specified element. If the specified control is a checkbox the returned value is a boolean that is `TRUE` if the checkbox is chec
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def getValue(aControlId: Double, aControlAction: Double): Any
  
  /**
    * Set the label of the specified element. If the specified element doesn't support setting a label, this method has no effect.
    * @param aControlId Identifies the element for which the label should be set.
    * @param aLabel The label to be set.
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    */
  def setLabel(aControlId: Double, aLabel: String): Unit
  
  /**
    * Set the value of an additional element within a {@link FilePicker} .
    * @param ControlId Identifies the element which value is to be set.
    * @param aControlAction Specifies an action to perform with the given value. aControlAction has to be one of the values defined in {@link ControlActions}
    * @param aValue The value to set. For checkboxes aValue should be a boolean value that should be `TRUE` if the checkbox should be checked and `FALSE` othe
    * @see com.sun.star.ui.dialogs.CommonFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ExtendedFilePickerElementIds
    * @see com.sun.star.ui.dialogs.ControlActions
    */
  def setValue(ControlId: Double, aControlAction: Double, aValue: Any): Unit
}
object XFilePickerControlAccess {
  
  inline def apply(
    DisplayDirectory: String,
    Files: SafeArray[String],
    acquire: Callback,
    enableControl: (Double, Boolean) => Callback,
    execute: CallbackTo[Double],
    getDisplayDirectory: CallbackTo[String],
    getFiles: CallbackTo[SafeArray[String]],
    getLabel: Double => String,
    getValue: (Double, Double) => Any,
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultName: String => Callback,
    setDisplayDirectory: String => Callback,
    setLabel: (Double, String) => Callback,
    setMultiSelectionMode: Boolean => Callback,
    setTitle: String => Callback,
    setValue: (Double, Double, Any) => Callback
  ): XFilePickerControlAccess = {
    val __obj = js.Dynamic.literal(DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], acquire = acquire.toJsFn, enableControl = js.Any.fromFunction2((t0: Double, t1: Boolean) => (enableControl(t0, t1)).runNow()), execute = execute.toJsFn, getDisplayDirectory = getDisplayDirectory.toJsFn, getFiles = getFiles.toJsFn, getLabel = js.Any.fromFunction1(getLabel), getValue = js.Any.fromFunction2(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultName = js.Any.fromFunction1((t0: String) => setDefaultName(t0).runNow()), setDisplayDirectory = js.Any.fromFunction1((t0: String) => setDisplayDirectory(t0).runNow()), setLabel = js.Any.fromFunction2((t0: Double, t1: String) => (setLabel(t0, t1)).runNow()), setMultiSelectionMode = js.Any.fromFunction1((t0: Boolean) => setMultiSelectionMode(t0).runNow()), setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()), setValue = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (setValue(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XFilePickerControlAccess]
  }
  
  extension [Self <: XFilePickerControlAccess](x: Self) {
    
    inline def setEnableControl(value: (Double, Boolean) => Callback): Self = StObject.set(x, "enableControl", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setGetLabel(value: Double => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
    
    inline def setGetValue(value: (Double, Double) => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
    
    inline def setSetLabel(value: (Double, String) => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: (Double, Double, Any) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
