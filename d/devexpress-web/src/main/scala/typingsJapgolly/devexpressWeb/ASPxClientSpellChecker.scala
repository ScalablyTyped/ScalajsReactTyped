package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
trait ASPxClientSpellChecker
  extends StObject
     with ASPxClientControl {
  
  /**
    * Client-side event that occurs when a spell check is finished.
    */
  var AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Client-side event that occurs before the spell check starts.
    */
  var BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Starts the spelling check of the text contained within the element specified by the ASPxSpellChecker.CheckedElementID value.
    */
  def Check(): Unit
  
  /**
    * Client-side event that occurs before a message box informing about process completion is shown.
    */
  var CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]
  
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  def CheckElement(element: Any): Unit
  
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  def CheckElementById(id: String): Unit
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  def CheckElementsInContainer(containerElement: Any): Unit
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  def CheckElementsInContainerById(containerId: String): Unit
  
  /**
    * Occurs after a word is changed in a checked text.
    */
  var WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]
}
object ASPxClientSpellChecker {
  
  inline def apply(
    AdjustControl: Callback,
    AfterCheck: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]],
    BeforeCheck: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]],
    Check: Callback,
    CheckCompleteFormShowing: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]],
    CheckElement: Any => Callback,
    CheckElementById: String => Callback,
    CheckElementsInContainer: Any => Callback,
    CheckElementsInContainerById: String => Callback,
    GetClientVisible: CallbackTo[Boolean],
    GetHeight: CallbackTo[Double],
    GetMainElement: CallbackTo[Any],
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
    WordChanged: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]],
    name: String
  ): ASPxClientSpellChecker = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl.toJsFn, AfterCheck = AfterCheck.asInstanceOf[js.Any], BeforeCheck = BeforeCheck.asInstanceOf[js.Any], Check = Check.toJsFn, CheckCompleteFormShowing = CheckCompleteFormShowing.asInstanceOf[js.Any], CheckElement = js.Any.fromFunction1((t0: Any) => CheckElement(t0).runNow()), CheckElementById = js.Any.fromFunction1((t0: String) => CheckElementById(t0).runNow()), CheckElementsInContainer = js.Any.fromFunction1((t0: Any) => CheckElementsInContainer(t0).runNow()), CheckElementsInContainerById = js.Any.fromFunction1((t0: String) => CheckElementsInContainerById(t0).runNow()), GetClientVisible = GetClientVisible.toJsFn, GetHeight = GetHeight.toJsFn, GetMainElement = GetMainElement.toJsFn, GetParentControl = GetParentControl.toJsFn, GetVisible = GetVisible.toJsFn, GetWidth = GetWidth.toJsFn, InCallback = InCallback.toJsFn, Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1((t0: String) => SendMessageToAssistiveTechnology(t0).runNow()), SetClientVisible = js.Any.fromFunction1((t0: Boolean) => SetClientVisible(t0).runNow()), SetHeight = js.Any.fromFunction1((t0: Double) => SetHeight(t0).runNow()), SetVisible = js.Any.fromFunction1((t0: Boolean) => SetVisible(t0).runNow()), SetWidth = js.Any.fromFunction1((t0: Double) => SetWidth(t0).runNow()), WordChanged = WordChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpellChecker]
  }
  
  extension [Self <: ASPxClientSpellChecker](x: Self) {
    
    inline def setAfterCheck(value: ASPxClientEvent[ASPxClientAfterCheckEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "AfterCheck", value.asInstanceOf[js.Any])
    
    inline def setBeforeCheck(value: ASPxClientEvent[ASPxClientBeforeCheckEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "BeforeCheck", value.asInstanceOf[js.Any])
    
    inline def setCheck(value: Callback): Self = StObject.set(x, "Check", value.toJsFn)
    
    inline def setCheckCompleteFormShowing(value: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "CheckCompleteFormShowing", value.asInstanceOf[js.Any])
    
    inline def setCheckElement(value: Any => Callback): Self = StObject.set(x, "CheckElement", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCheckElementById(value: String => Callback): Self = StObject.set(x, "CheckElementById", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCheckElementsInContainer(value: Any => Callback): Self = StObject.set(x, "CheckElementsInContainer", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCheckElementsInContainerById(value: String => Callback): Self = StObject.set(x, "CheckElementsInContainerById", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWordChanged(value: ASPxClientEvent[ASPxClientWordChangedEventHandler[ASPxClientSpellChecker]]): Self = StObject.set(x, "WordChanged", value.asInstanceOf[js.Any])
  }
}
