package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.xrm.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an Iframe control.
  * @see {@link FramedControl}
  */
trait IframeControl
  extends StObject
     with FramedControl
     with UiCanSetVisibleElement {
  
  /**
    * Gets initial URL defined for the Iframe.
    * @returns The initial URL.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getInitialUrl(): String
}
object IframeControl {
  
  inline def apply(
    getContentWindow: CallbackTo[js.Promise[Window]],
    getControlType: CallbackTo[ControlType | String],
    getInitialUrl: CallbackTo[String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLIFrameElement],
    getParent: CallbackTo[Section],
    getSrc: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setSrc: String => Callback,
    setVisible: Boolean => Callback
  ): IframeControl = {
    val __obj = js.Dynamic.literal(getContentWindow = getContentWindow.toJsFn, getControlType = getControlType.toJsFn, getInitialUrl = getInitialUrl.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getObject = getObject.toJsFn, getParent = getParent.toJsFn, getSrc = getSrc.toJsFn, getVisible = getVisible.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setSrc = js.Any.fromFunction1((t0: String) => setSrc(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[IframeControl]
  }
  
  extension [Self <: IframeControl](x: Self) {
    
    inline def setGetInitialUrl(value: CallbackTo[String]): Self = StObject.set(x, "getInitialUrl", value.toJsFn)
  }
}
