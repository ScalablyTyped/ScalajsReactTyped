package typingsJapgolly.devexpressWeb.global

import typingsJapgolly.devexpressWeb.ASPxClientAfterCheckEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientBeforeCheckEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientCancelEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientEventHandler
import typingsJapgolly.devexpressWeb.ASPxClientWordChangedEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxSpellChecker class.
  */
@JSGlobal("ASPxClientSpellChecker")
@js.native
open class ASPxClientSpellChecker ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientSpellChecker {
  
  /**
    * Modifies the control's size against the control's container.
    */
  /* CompleteClass */
  override def AdjustControl(): Unit = js.native
  
  /**
    * Client-side event that occurs when a spell check is finished.
    */
  /* CompleteClass */
  var AfterCheck: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientAfterCheckEventHandler[typingsJapgolly.devexpressWeb.ASPxClientSpellChecker]
  ] = js.native
  
  /**
    * Client-side event that occurs before the spell check starts.
    */
  /* CompleteClass */
  var BeforeCheck: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientBeforeCheckEventHandler[typingsJapgolly.devexpressWeb.ASPxClientSpellChecker]
  ] = js.native
  
  /**
    * Starts the spelling check of the text contained within the element specified by the ASPxSpellChecker.CheckedElementID value.
    */
  /* CompleteClass */
  override def Check(): Unit = js.native
  
  /**
    * Client-side event that occurs before a message box informing about process completion is shown.
    */
  /* CompleteClass */
  var CheckCompleteFormShowing: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientCancelEventHandler[typingsJapgolly.devexpressWeb.ASPxClientSpellChecker]
  ] = js.native
  
  /**
    * Starts checking contents of the specified element.
    * @param element An object representing the element being checked.
    */
  /* CompleteClass */
  override def CheckElement(element: Any): Unit = js.native
  
  /**
    * Starts checking contents of the specified element.
    * @param id A string representing the identifier of the element being checked.
    */
  /* CompleteClass */
  override def CheckElementById(id: String): Unit = js.native
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerElement An object representing a control which contains elements being checked.
    */
  /* CompleteClass */
  override def CheckElementsInContainer(containerElement: Any): Unit = js.native
  
  /**
    * Starts checking the contents of controls in the specified container.
    * @param containerId A string, specifying the control's identifier.
    */
  /* CompleteClass */
  override def CheckElementsInContainerById(containerId: String): Unit = js.native
  
  /** @deprecated Use the GetVisible method instead. */
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetClientVisible(): Boolean = js.native
  
  /**
    * Returns the control's height.
    */
  /* CompleteClass */
  override def GetHeight(): Double = js.native
  
  /**
    * Returns an HTML element that is the root of the control's hierarchy.
    */
  /* CompleteClass */
  override def GetMainElement(): Any = js.native
  
  /**
    * Returns a client instance of the control that is the parent for a specified control.
    */
  /* CompleteClass */
  override def GetParentControl(): Any = js.native
  
  /**
    * Returns a value specifying whether a control is displayed.
    */
  /* CompleteClass */
  override def GetVisible(): Boolean = js.native
  
  /**
    * Returns the control's width.
    */
  /* CompleteClass */
  override def GetWidth(): Double = js.native
  
  /**
    * Returns a value that determines whether a callback request sent by a web control is being currently processed on the server side.
    */
  /* CompleteClass */
  override def InCallback(): Boolean = js.native
  
  /**
    * Occurs on the client side after the control has been initialized.
    */
  /* CompleteClass */
  var Init: typingsJapgolly.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typingsJapgolly.devexpressWeb.ASPxClientControlBase]] = js.native
  
  /**
    * Specifies the text that Assistive Technologies (screen readers or braille display, for example) will provide to a user.
    * @param message A String value that specifies a text.
    */
  /* CompleteClass */
  override def SendMessageToAssistiveTechnology(message: String): Unit = js.native
  
  /** @deprecated Use the SetVisible method instead. */
  /**
    * Specifies whether a control is displayed.
    */
  /* CompleteClass */
  override def SetClientVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's height.  Note that this method is not in effect for some controls.
    * @param height An integer value that specifies the control's height.
    */
  /* CompleteClass */
  override def SetHeight(height: Double): Unit = js.native
  
  /**
    * Specifies whether a control is displayed.
    * @param visible true to make a control visible; false to make it hidden.
    */
  /* CompleteClass */
  override def SetVisible(visible: Boolean): Unit = js.native
  
  /**
    * Specifies the control's width in pixels.
    * @param width An integer value that specifies the control's width, in pixels.
    */
  /* CompleteClass */
  override def SetWidth(width: Double): Unit = js.native
  
  /**
    * Occurs after a word is changed in a checked text.
    */
  /* CompleteClass */
  var WordChanged: typingsJapgolly.devexpressWeb.ASPxClientEvent[
    ASPxClientWordChangedEventHandler[typingsJapgolly.devexpressWeb.ASPxClientSpellChecker]
  ] = js.native
  
  /**
    * Gets the unique, hierarchically-qualified identifier for the control.
    */
  /* CompleteClass */
  var name: String = js.native
}
object ASPxClientSpellChecker {
  
  @JSGlobal("ASPxClientSpellChecker")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts the specified object to the ASPxClientSpellChecker type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  /* static member */
  inline def Cast(obj: Any): typingsJapgolly.devexpressWeb.ASPxClientSpellChecker = ^.asInstanceOf[js.Dynamic].applyDynamic("Cast")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.devexpressWeb.ASPxClientSpellChecker]
}
