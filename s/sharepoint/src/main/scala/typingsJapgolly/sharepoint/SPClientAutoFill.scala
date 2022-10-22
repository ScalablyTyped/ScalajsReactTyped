package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientAutoFill extends StObject {
  
  var AllOptionData: StringDictionary[ISPClientAutoFillData]
  
  var AutoFillCallbackTimeoutID: String
  
  var AutoFillContainerId: String
  
  var AutoFillMenuId: String
  
  var AutoFillMinTextLength: Double
  
  var AutoFillTimeout: Double
  
  def BlurAutoFill(): Unit
  
  def CloseAutoFill(ojData: ISPClientAutoFillData): Unit
  
  var CurrentFocusOption: Double
  
  def FocusAutoFill(): Unit
  
  def FuncOnAutoFillClose(elmTextId: String, ojData: ISPClientAutoFillData): Unit
  
  def FuncPopulateAutoFill(targetElement: HTMLElement): Unit
  
  def IsAutoFillOpen(): Boolean
  
  def PopulateAutoFill(
    jsonObjSuggestions: js.Array[ISPClientAutoFillData],
    fnOnAutoFillCloseFuncName: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]
  ): Unit
  
  def SelectAutoFillOption(elemOption: HTMLElement): Unit
  
  def SetAutoFillHeight(): Unit
  
  var TextElementId: String
  
  def UpdateAutoFillMenuFocus(bMoveNextLink: Boolean): Unit
  
  def UpdateAutoFillPosition(): Unit
  
  var VisibleItemCount: Double
}
object SPClientAutoFill {
  
  inline def apply(
    AllOptionData: StringDictionary[ISPClientAutoFillData],
    AutoFillCallbackTimeoutID: String,
    AutoFillContainerId: String,
    AutoFillMenuId: String,
    AutoFillMinTextLength: Double,
    AutoFillTimeout: Double,
    BlurAutoFill: Callback,
    CloseAutoFill: ISPClientAutoFillData => Callback,
    CurrentFocusOption: Double,
    FocusAutoFill: Callback,
    FuncOnAutoFillClose: (String, ISPClientAutoFillData) => Callback,
    FuncPopulateAutoFill: HTMLElement => Callback,
    IsAutoFillOpen: CallbackTo[Boolean],
    PopulateAutoFill: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Callback,
    SelectAutoFillOption: HTMLElement => Callback,
    SetAutoFillHeight: Callback,
    TextElementId: String,
    UpdateAutoFillMenuFocus: Boolean => Callback,
    UpdateAutoFillPosition: Callback,
    VisibleItemCount: Double
  ): SPClientAutoFill = {
    val __obj = js.Dynamic.literal(AllOptionData = AllOptionData.asInstanceOf[js.Any], AutoFillCallbackTimeoutID = AutoFillCallbackTimeoutID.asInstanceOf[js.Any], AutoFillContainerId = AutoFillContainerId.asInstanceOf[js.Any], AutoFillMenuId = AutoFillMenuId.asInstanceOf[js.Any], AutoFillMinTextLength = AutoFillMinTextLength.asInstanceOf[js.Any], AutoFillTimeout = AutoFillTimeout.asInstanceOf[js.Any], BlurAutoFill = BlurAutoFill.toJsFn, CloseAutoFill = js.Any.fromFunction1((t0: ISPClientAutoFillData) => CloseAutoFill(t0).runNow()), CurrentFocusOption = CurrentFocusOption.asInstanceOf[js.Any], FocusAutoFill = FocusAutoFill.toJsFn, FuncOnAutoFillClose = js.Any.fromFunction2((t0: String, t1: ISPClientAutoFillData) => (FuncOnAutoFillClose(t0, t1)).runNow()), FuncPopulateAutoFill = js.Any.fromFunction1((t0: HTMLElement) => FuncPopulateAutoFill(t0).runNow()), IsAutoFillOpen = IsAutoFillOpen.toJsFn, PopulateAutoFill = js.Any.fromFunction2((t0: js.Array[ISPClientAutoFillData], t1: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => (PopulateAutoFill(t0, t1)).runNow()), SelectAutoFillOption = js.Any.fromFunction1((t0: HTMLElement) => SelectAutoFillOption(t0).runNow()), SetAutoFillHeight = SetAutoFillHeight.toJsFn, TextElementId = TextElementId.asInstanceOf[js.Any], UpdateAutoFillMenuFocus = js.Any.fromFunction1((t0: Boolean) => UpdateAutoFillMenuFocus(t0).runNow()), UpdateAutoFillPosition = UpdateAutoFillPosition.toJsFn, VisibleItemCount = VisibleItemCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SPClientAutoFill]
  }
  
  extension [Self <: SPClientAutoFill](x: Self) {
    
    inline def setAllOptionData(value: StringDictionary[ISPClientAutoFillData]): Self = StObject.set(x, "AllOptionData", value.asInstanceOf[js.Any])
    
    inline def setAutoFillCallbackTimeoutID(value: String): Self = StObject.set(x, "AutoFillCallbackTimeoutID", value.asInstanceOf[js.Any])
    
    inline def setAutoFillContainerId(value: String): Self = StObject.set(x, "AutoFillContainerId", value.asInstanceOf[js.Any])
    
    inline def setAutoFillMenuId(value: String): Self = StObject.set(x, "AutoFillMenuId", value.asInstanceOf[js.Any])
    
    inline def setAutoFillMinTextLength(value: Double): Self = StObject.set(x, "AutoFillMinTextLength", value.asInstanceOf[js.Any])
    
    inline def setAutoFillTimeout(value: Double): Self = StObject.set(x, "AutoFillTimeout", value.asInstanceOf[js.Any])
    
    inline def setBlurAutoFill(value: Callback): Self = StObject.set(x, "BlurAutoFill", value.toJsFn)
    
    inline def setCloseAutoFill(value: ISPClientAutoFillData => Callback): Self = StObject.set(x, "CloseAutoFill", js.Any.fromFunction1((t0: ISPClientAutoFillData) => value(t0).runNow()))
    
    inline def setCurrentFocusOption(value: Double): Self = StObject.set(x, "CurrentFocusOption", value.asInstanceOf[js.Any])
    
    inline def setFocusAutoFill(value: Callback): Self = StObject.set(x, "FocusAutoFill", value.toJsFn)
    
    inline def setFuncOnAutoFillClose(value: (String, ISPClientAutoFillData) => Callback): Self = StObject.set(x, "FuncOnAutoFillClose", js.Any.fromFunction2((t0: String, t1: ISPClientAutoFillData) => (value(t0, t1)).runNow()))
    
    inline def setFuncPopulateAutoFill(value: HTMLElement => Callback): Self = StObject.set(x, "FuncPopulateAutoFill", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setIsAutoFillOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsAutoFillOpen", value.toJsFn)
    
    inline def setPopulateAutoFill(
      value: (js.Array[ISPClientAutoFillData], js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => Callback
    ): Self = StObject.set(x, "PopulateAutoFill", js.Any.fromFunction2((t0: js.Array[ISPClientAutoFillData], t1: js.Function2[/* elmTextId */ String, /* objData */ ISPClientAutoFillData, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSelectAutoFillOption(value: HTMLElement => Callback): Self = StObject.set(x, "SelectAutoFillOption", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setSetAutoFillHeight(value: Callback): Self = StObject.set(x, "SetAutoFillHeight", value.toJsFn)
    
    inline def setTextElementId(value: String): Self = StObject.set(x, "TextElementId", value.asInstanceOf[js.Any])
    
    inline def setUpdateAutoFillMenuFocus(value: Boolean => Callback): Self = StObject.set(x, "UpdateAutoFillMenuFocus", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setUpdateAutoFillPosition(value: Callback): Self = StObject.set(x, "UpdateAutoFillPosition", value.toJsFn)
    
    inline def setVisibleItemCount(value: Double): Self = StObject.set(x, "VisibleItemCount", value.asInstanceOf[js.Any])
  }
}
