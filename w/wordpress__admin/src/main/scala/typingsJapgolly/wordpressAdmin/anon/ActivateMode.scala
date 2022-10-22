package typingsJapgolly.wordpressAdmin.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.backbone.mod.Collection
import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateMode extends StObject {
  
  /**
    * Activate a mode on the frame.
    */
  def activateMode(mode: String): typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame
  
  /**
    * Deactivate a mode on the frame.
    */
  def deactivateMode(mode: String): typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame
  
  def initialize(): Unit
  
  /**
    * Check if a mode is enabled on the frame.
    */
  def isModeActive(mode: String): Boolean
  
  /**
    * Reset all states on the frame to their defaults.
    */
  def reset(): typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame
  
  def triggerModeEvents(
    model: Model[Any, ModelSetOptions, Any],
    collection: Collection[Model[Any, ModelSetOptions, Any]],
    options: StringDictionary[String]
  ): Unit
}
object ActivateMode {
  
  inline def apply(
    activateMode: String => typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame,
    deactivateMode: String => typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame,
    initialize: Callback,
    isModeActive: String => Boolean,
    reset: CallbackTo[typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame],
    triggerModeEvents: (Model[Any, ModelSetOptions, Any], Collection[Model[Any, ModelSetOptions, Any]], StringDictionary[String]) => Callback
  ): ActivateMode = {
    val __obj = js.Dynamic.literal(activateMode = js.Any.fromFunction1(activateMode), deactivateMode = js.Any.fromFunction1(deactivateMode), initialize = initialize.toJsFn, isModeActive = js.Any.fromFunction1(isModeActive), reset = reset.toJsFn, triggerModeEvents = js.Any.fromFunction3((t0: Model[Any, ModelSetOptions, Any], t1: Collection[Model[Any, ModelSetOptions, Any]], t2: StringDictionary[String]) => (triggerModeEvents(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ActivateMode]
  }
  
  extension [Self <: ActivateMode](x: Self) {
    
    inline def setActivateMode(value: String => typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "activateMode", js.Any.fromFunction1(value))
    
    inline def setDeactivateMode(value: String => typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame): Self = StObject.set(x, "deactivateMode", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setIsModeActive(value: String => Boolean): Self = StObject.set(x, "isModeActive", js.Any.fromFunction1(value))
    
    inline def setReset(value: CallbackTo[typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.Frame]): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setTriggerModeEvents(
      value: (Model[Any, ModelSetOptions, Any], Collection[Model[Any, ModelSetOptions, Any]], StringDictionary[String]) => Callback
    ): Self = StObject.set(x, "triggerModeEvents", js.Any.fromFunction3((t0: Model[Any, ModelSetOptions, Any], t1: Collection[Model[Any, ModelSetOptions, Any]], t2: StringDictionary[String]) => (value(t0, t1, t2)).runNow()))
  }
}
