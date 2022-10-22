package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLObjectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Silverlight control.
  * @see {@link Control}
  * @deprecated The Silverlight WebResource is deprecated on the web client, and is not supported on the new Unified Interface in v9.
  * Instead of silverlight, use custom controls created using the HTML web resources with HTML5 to create UI components to visualize and interact with data.
  */
trait SilverlightControl
  extends StObject
     with Control {
  
  /**
    * Gets the query string value passed to Silverlight.
    * @returns The data.
    * @deprecated Silverlight is no longer supported. These methods won't be available after October 2020.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getData(): String
  
  /**
    * Gets the DOM element containing the control.
    * @returns The container object.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def getObject(): HTMLObjectElement
  
  /**
    * Sets the query string value passed to Silverlight.
    * @param data The data.
    * @deprecated Silverlight is no longer supported. These methods won't be available after October 2020.
    * @remarks Unavailable for Microsoft Dynamics CRM for tablets.
    */
  def setData(data: String): Unit
}
object SilverlightControl {
  
  inline def apply(
    getControlType: CallbackTo[ControlType | String],
    getData: CallbackTo[String],
    getLabel: CallbackTo[String],
    getName: CallbackTo[String],
    getObject: CallbackTo[HTMLObjectElement],
    getParent: CallbackTo[Section],
    getVisible: CallbackTo[Boolean],
    setData: String => Callback,
    setLabel: String => Callback
  ): SilverlightControl = {
    val __obj = js.Dynamic.literal(getControlType = getControlType.toJsFn, getData = getData.toJsFn, getLabel = getLabel.toJsFn, getName = getName.toJsFn, getObject = getObject.toJsFn, getParent = getParent.toJsFn, getVisible = getVisible.toJsFn, setData = js.Any.fromFunction1((t0: String) => setData(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()))
    __obj.asInstanceOf[SilverlightControl]
  }
  
  extension [Self <: SilverlightControl](x: Self) {
    
    inline def setGetData(value: CallbackTo[String]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetObject(value: CallbackTo[HTMLObjectElement]): Self = StObject.set(x, "getObject", value.toJsFn)
    
    inline def setSetData(value: String => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
