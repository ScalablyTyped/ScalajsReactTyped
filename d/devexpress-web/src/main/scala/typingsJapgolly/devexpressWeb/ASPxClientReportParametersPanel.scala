package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxClientDocumentViewer control's Parameters Panel.
  */
trait ASPxClientReportParametersPanel
  extends StObject
     with ASPxClientControl {
  
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param path A System.String specifying the parameter's path.
    * @param value An object specifying the parameter value.
    */
  def AssignParameter(path: String, value: Any): Unit
  
  /**
    * Assigns a value to a parameter of the report displayed in the document viewer.
    * @param parametersInfo An array of ASPxClientReportParameterInfo values specifying parameters and values to assign.
    */
  def AssignParameters(parametersInfo: js.Array[ASPxClientReportParameterInfo]): Unit
  
  /**
    * Returns a value editor that is associated with a parameter with the specified name. An editor.
    * @param parameterName A String value, specifying the parameter name.
    */
  def GetEditorByParameterName(parameterName: String): ASPxClientControl
  
  /**
    * Returns an array storing the names of parameters available in a report.
    */
  def GetParameterNames(): js.Array[String]
}
object ASPxClientReportParametersPanel {
  
  inline def apply(
    AdjustControl: Callback,
    AssignParameter: (String, Any) => Callback,
    AssignParameters: js.Array[ASPxClientReportParameterInfo] => Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetEditorByParameterName: String => ASPxClientControl,
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
    GetParameterNames: CallbackTo[js.Array[String]],
    GetParentControl: CallbackTo[Any],
    GetVisible: CallbackTo[Boolean],
    GetWidth: CallbackTo[Double],
    InCallback: CallbackTo[Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Callback,
    SetClientVisible: Boolean => Callback,
    SetHeight: Double => Callback,
    SetVisible: Boolean => Callback,
    SetWidth: Double => Callback,
    name: String
  ): ASPxClientReportParametersPanel = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AssignParameter = js.Any.fromFunction2((t0: String, t1: Any) => (AssignParameter(t0, t1)).runNow()), AssignParameters = js.Any.fromFunction1((t0: js.Array[ASPxClientReportParameterInfo]) => AssignParameters(t0).runNow()), GetClientVisible = GetClientVisible.toJsFn, GetEditorByParameterName = js.Any.fromFunction1(GetEditorByParameterName), GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParameterNames = GetParameterNames.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportParametersPanel]
  }
  
  extension [Self <: ASPxClientReportParametersPanel](x: Self) {
    
    inline def setAssignParameter(value: (String, Any) => Callback): Self = StObject.set(x, "AssignParameter", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAssignParameters(value: js.Array[ASPxClientReportParameterInfo] => Callback): Self = StObject.set(x, "AssignParameters", js.Any.fromFunction1((t0: js.Array[ASPxClientReportParameterInfo]) => value(t0).runNow()))
    
    inline def setGetEditorByParameterName(value: String => ASPxClientControl): Self = StObject.set(x, "GetEditorByParameterName", js.Any.fromFunction1(value))
    
    inline def setGetParameterNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "GetParameterNames", value.toJsFn)
  }
}
