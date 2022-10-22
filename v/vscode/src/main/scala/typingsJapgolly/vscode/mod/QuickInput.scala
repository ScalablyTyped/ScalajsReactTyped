package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickInput extends StObject {
  
  /**
    * If the UI should show a progress indicator. Defaults to false.
    *
    * Change this to true, e.g., while loading more data or validating
    * user input.
    */
  var busy: Boolean
  
  /**
    * Dispose of this input UI and any associated resources. If it is still
    * visible, it is first hidden. After this call the input UI is no longer
    * functional and no additional methods or properties on it should be
    * accessed. Instead a new input UI should be created.
    */
  def dispose(): Unit
  
  /**
    * If the UI should allow for user input. Defaults to true.
    *
    * Change this to false, e.g., while validating user input or
    * loading data for the next step in user input.
    */
  var enabled: Boolean
  
  /**
    * Hides this input UI. This will also fire an {@link QuickInput.onDidHide}
    * event.
    */
  def hide(): Unit
  
  /**
    * If the UI should stay open even when loosing UI focus. Defaults to false.
    * This setting is ignored on iPad and is always false.
    */
  var ignoreFocusOut: Boolean
  
  /**
    * An event signaling when this input UI is hidden.
    *
    * There are several reasons why this UI might have to be hidden and
    * the extension will be notified through {@link QuickInput.onDidHide}.
    * (Examples include: an explicit call to {@link QuickInput.hide},
    * the user pressing Esc, some other input UI opening, etc.)
    */
  def onDidHide(listener: js.Function1[/* e */ Unit, Any]): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable
  def onDidHide(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable
  /**
    * An event signaling when this input UI is hidden.
    *
    * There are several reasons why this UI might have to be hidden and
    * the extension will be notified through {@link QuickInput.onDidHide}.
    * (Examples include: an explicit call to {@link QuickInput.hide},
    * the user pressing Esc, some other input UI opening, etc.)
    */
  @JSName("onDidHide")
  var onDidHide_Original: Event[Unit]
  
  /**
    * Makes the input UI visible in its current configuration. Any other input
    * UI will first fire an {@link QuickInput.onDidHide} event.
    */
  def show(): Unit
  
  /**
    * An optional current step count.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional title.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * An optional total step count.
    */
  var totalSteps: js.UndefOr[Double] = js.undefined
}
object QuickInput {
  
  inline def apply(
    busy: Boolean,
    dispose: Callback,
    enabled: Boolean,
    hide: Callback,
    ignoreFocusOut: Boolean,
    onDidHide: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable,
    show: Callback
  ): QuickInput = {
    val __obj = js.Dynamic.literal(busy = busy.asInstanceOf[js.Any], dispose = dispose.toJsFn, enabled = enabled.asInstanceOf[js.Any], hide = hide.toJsFn, ignoreFocusOut = ignoreFocusOut.asInstanceOf[js.Any], onDidHide = js.Any.fromFunction3(onDidHide), show = show.toJsFn)
    __obj.asInstanceOf[QuickInput]
  }
  
  extension [Self <: QuickInput](x: Self) {
    
    inline def setBusy(value: Boolean): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setIgnoreFocusOut(value: Boolean): Self = StObject.set(x, "ignoreFocusOut", value.asInstanceOf[js.Any])
    
    inline def setOnDidHide(
      value: (/* listener */ js.Function1[Unit, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
    ): Self = StObject.set(x, "onDidHide", js.Any.fromFunction3(value))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
    
    inline def setTotalStepsUndefined: Self = StObject.set(x, "totalSteps", js.undefined)
  }
}
