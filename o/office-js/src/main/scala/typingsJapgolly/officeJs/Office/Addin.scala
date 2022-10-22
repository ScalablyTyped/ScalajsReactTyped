package typingsJapgolly.officeJs.Office

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents add-in level functionality for operating or configuring various aspects of the add-in.
  * 
  * @remarks
  *
  * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
  */
trait Addin extends StObject {
  
  /**
    * Gets the current startup behavior for the add-in.
    * 
    * @remarks
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    */
  def getStartupBehavior(): js.Promise[StartupBehavior]
  
  /**
    * Hides the task pane.
    * @returns A promise that is resolved when the UI is hidden.
    * 
    * @remarks
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    */
  def hide(): js.Promise[Unit]
  
  /**
    * Adds a handler for the `onVisibilityModeChanged` event.
    * @param handler - The handler function that is called when the event is emitted. This function takes in a message for the receiving component.
    * @returns A promise that resolves to a function when the handler is added. Calling it removes the handler.
    * 
    * @remarks
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    */
  def onVisibilityModeChanged(handler: js.Function1[/* message */ VisibilityModeChangedMessage, Unit]): js.Promise[js.Function0[js.Promise[Unit]]]
  
  /**
    * Sets the startup behavior for the add-in for when the document is opened next time.
    * @param behavior - Specifies startup behavior of the add-in.
    * 
    * @remarks
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    */
  def setStartupBehavior(behavior: StartupBehavior): js.Promise[Unit]
  
  /**
    * Shows the task pane associated with the add-in.
    * @returns A promise that is resolved when the UI is shown.
    * 
    * @remarks
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/shared-runtime-requirement-sets | SharedRuntime 1.1}
    */
  def showAsTaskpane(): js.Promise[Unit]
}
object Addin {
  
  inline def apply(
    getStartupBehavior: CallbackTo[js.Promise[StartupBehavior]],
    hide: CallbackTo[js.Promise[Unit]],
    onVisibilityModeChanged: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[js.Function0[js.Promise[Unit]]],
    setStartupBehavior: StartupBehavior => js.Promise[Unit],
    showAsTaskpane: CallbackTo[js.Promise[Unit]]
  ): Addin = {
    val __obj = js.Dynamic.literal(getStartupBehavior = getStartupBehavior.toJsFn, hide = hide.toJsFn, onVisibilityModeChanged = js.Any.fromFunction1(onVisibilityModeChanged), setStartupBehavior = js.Any.fromFunction1(setStartupBehavior), showAsTaskpane = showAsTaskpane.toJsFn)
    __obj.asInstanceOf[Addin]
  }
  
  extension [Self <: Addin](x: Self) {
    
    inline def setGetStartupBehavior(value: CallbackTo[js.Promise[StartupBehavior]]): Self = StObject.set(x, "getStartupBehavior", value.toJsFn)
    
    inline def setHide(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOnVisibilityModeChanged(
      value: js.Function1[/* message */ VisibilityModeChangedMessage, Unit] => js.Promise[js.Function0[js.Promise[Unit]]]
    ): Self = StObject.set(x, "onVisibilityModeChanged", js.Any.fromFunction1(value))
    
    inline def setSetStartupBehavior(value: StartupBehavior => js.Promise[Unit]): Self = StObject.set(x, "setStartupBehavior", js.Any.fromFunction1(value))
    
    inline def setShowAsTaskpane(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "showAsTaskpane", value.toJsFn)
  }
}
