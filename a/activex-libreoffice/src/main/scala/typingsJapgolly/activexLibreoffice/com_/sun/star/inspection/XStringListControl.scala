package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for an {@link XPropertyControl} which, additionally to the basic behavior, supports a list of strings interpreted as possible
  * property values.
  *
  * A control which would canonically implement this interface is a list box control: The string list defined by {@link XStringListControl} would in the
  * control be represented as drop-down list containing all the strings.
  * @since OOo 2.0.3
  */
trait XStringListControl
  extends StObject
     with XPropertyControl {
  
  /** gets all list entries */
  val ListEntries: SafeArray[String]
  
  /** appends a new entry to the end of the list */
  def appendListEntry(NewEntry: String): Unit
  
  /** clears the whole list */
  def clearList(): Unit
  
  /** gets all list entries */
  def getListEntries(): SafeArray[String]
  
  /** prepends a new entry to the beginning of the list */
  def prependListEntry(NewEntry: String): Unit
}
object XStringListControl {
  
  inline def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    ListEntries: SafeArray[String],
    Value: Any,
    ValueType: `type`,
    appendListEntry: String => Callback,
    clearList: Callback,
    getListEntries: CallbackTo[SafeArray[String]],
    isModified: CallbackTo[Boolean],
    notifyModifiedValue: Callback,
    prependListEntry: String => Callback
  ): XStringListControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], appendListEntry = js.Any.fromFunction1((t0: String) => appendListEntry(t0).runNow()), clearList = clearList.toJsFn, getListEntries = getListEntries.toJsFn, isModified = isModified.toJsFn, notifyModifiedValue = notifyModifiedValue.toJsFn, prependListEntry = js.Any.fromFunction1((t0: String) => prependListEntry(t0).runNow()))
    __obj.asInstanceOf[XStringListControl]
  }
  
  extension [Self <: XStringListControl](x: Self) {
    
    inline def setAppendListEntry(value: String => Callback): Self = StObject.set(x, "appendListEntry", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClearList(value: Callback): Self = StObject.set(x, "clearList", value.toJsFn)
    
    inline def setGetListEntries(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getListEntries", value.toJsFn)
    
    inline def setListEntries(value: SafeArray[String]): Self = StObject.set(x, "ListEntries", value.asInstanceOf[js.Any])
    
    inline def setPrependListEntry(value: String => Callback): Self = StObject.set(x, "prependListEntry", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
