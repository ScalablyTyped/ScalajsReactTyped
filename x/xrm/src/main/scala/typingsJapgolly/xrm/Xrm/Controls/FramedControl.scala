package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.xrm.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a framed control, which is either a Web Resource or an Iframe.
  * @see {@link Control}
  * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
  *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
  */
trait FramedControl
  extends StObject
     with Control {
  
  /**
    * Returns the content window that represents an IFRAME or web resource.
    * @returns A promise that contains a content window instance representing an IFRAME or web resource.
    * @remarks This method is supported only on Unified Interface.  The implementer is expected to call
    * a custom function within the returned window that will receive the Xrm and formContext objects as
    * parameters.
    */
  def getContentWindow(): js.Promise[Window]
  
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLIFrameElement
  
  /**
    * Gets the URL value of the control.
    * @returns The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getSrc(): String
  
  /**
    * Sets the URL value of the control.
    * @param src The source URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setSrc(src: String): Unit
}
object FramedControl {
  
  inline def apply(
    getContentWindow: CallbackTo[js.Promise[Window]],
    getControlType: CallbackTo[ControlType | String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLIFrameElement],
    getParent: CallbackTo[Section],
    getSrc: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setSrc: String => Callback
  ): FramedControl = {
    val __obj = js.Dynamic.literal(getContentWindow = getContentWindow.toJsFn, getControlType = getControlType.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getObject = getObject.toJsFn, getParent = getParent.toJsFn, getSrc = getSrc.toJsFn, getVisible = getVisible.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setSrc = js.Any.fromFunction1((t0: String) => setSrc(t0).runNow()))
    __obj.asInstanceOf[FramedControl]
  }
  
  extension [Self <: FramedControl](x: Self) {
    
    inline def setGetContentWindow(value: CallbackTo[js.Promise[Window]]): Self = StObject.set(x, "getContentWindow", value.toJsFn)
    
    inline def setGetObject(value: CallbackTo[HTMLIFrameElement]): Self = StObject.set(x, "getObject", value.toJsFn)
    
    inline def setGetSrc(value: CallbackTo[String]): Self = StObject.set(x, "getSrc", value.toJsFn)
    
    inline def setSetSrc(value: String => Callback): Self = StObject.set(x, "setSrc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
