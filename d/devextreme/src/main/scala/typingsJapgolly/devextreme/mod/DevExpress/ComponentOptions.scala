package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions[TDisposingEvent, TInitializedEvent, TOptionChangedEvent] extends StObject {
  
  /**
    * A function that is executed before the UI component is disposed of.
    */
  var onDisposing: js.UndefOr[js.Function1[/* e */ TDisposingEvent, Unit]] = js.undefined
  
  /**
    * A function used in JavaScript frameworks to save the UI component instance.
    */
  var onInitialized: js.UndefOr[js.Function1[/* e */ TInitializedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after a UI component property is changed.
    */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ TOptionChangedEvent, Unit]] = js.undefined
}
object ComponentOptions {
  
  inline def apply[TDisposingEvent, TInitializedEvent, TOptionChangedEvent](): ComponentOptions[TDisposingEvent, TInitializedEvent, TOptionChangedEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[TDisposingEvent, TInitializedEvent, TOptionChangedEvent]]
  }
  
  extension [Self <: ComponentOptions[?, ?, ?], TDisposingEvent, TInitializedEvent, TOptionChangedEvent](x: Self & (ComponentOptions[TDisposingEvent, TInitializedEvent, TOptionChangedEvent])) {
    
    inline def setOnDisposing(value: /* e */ TDisposingEvent => Callback): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1((t0: /* e */ TDisposingEvent) => value(t0).runNow()))
    
    inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
    
    inline def setOnInitialized(value: /* e */ TInitializedEvent => Callback): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1((t0: /* e */ TInitializedEvent) => value(t0).runNow()))
    
    inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
    
    inline def setOnOptionChanged(value: /* e */ TOptionChangedEvent => Callback): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1((t0: /* e */ TOptionChangedEvent) => value(t0).runNow()))
    
    inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
  }
}
