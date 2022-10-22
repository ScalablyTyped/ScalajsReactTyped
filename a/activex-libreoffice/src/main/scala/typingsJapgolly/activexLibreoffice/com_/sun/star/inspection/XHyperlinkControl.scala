package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XActionListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for an {@link XPropertyControl} which displays its value in a hyperlink-like way
  *
  * Hyperlink controls exchange their value ( {@link XPropertyControl.Value} ) as strings.
  * @since OOo 2.0.3
  */
trait XHyperlinkControl
  extends StObject
     with XPropertyControl {
  
  /**
    * adds a listener which will be notified when the user clicked the hyperlink text in the control
    * @param listener the listener to notify of hyperlink clicks
    */
  def addActionListener(listener: XActionListener): Unit
  
  /**
    * removes a listener which was previously added via {@link addActionListener()}
    * @param listener the listener to revoke
    */
  def removeActionListener(listener: XActionListener): Unit
}
object XHyperlinkControl {
  
  inline def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    Value: Any,
    ValueType: `type`,
    addActionListener: XActionListener => Callback,
    isModified: CallbackTo[Boolean],
    notifyModifiedValue: Callback,
    removeActionListener: XActionListener => Callback
  ): XHyperlinkControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], addActionListener = js.Any.fromFunction1((t0: XActionListener) => addActionListener(t0).runNow()), isModified = isModified.toJsFn, notifyModifiedValue = notifyModifiedValue.toJsFn, removeActionListener = js.Any.fromFunction1((t0: XActionListener) => removeActionListener(t0).runNow()))
    __obj.asInstanceOf[XHyperlinkControl]
  }
  
  extension [Self <: XHyperlinkControl](x: Self) {
    
    inline def setAddActionListener(value: XActionListener => Callback): Self = StObject.set(x, "addActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
    
    inline def setRemoveActionListener(value: XActionListener => Callback): Self = StObject.set(x, "removeActionListener", js.Any.fromFunction1((t0: XActionListener) => value(t0).runNow()))
  }
}
