package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsInteractionManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", JSImport.Default)
  @js.native
  /* private */ open class default ()
    extends StObject
       with InteractionManager {
    
    /* CompleteClass */
    override def configureInteractions(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      config: Config
    ): Unit = js.native
    
    /* CompleteClass */
    override def dropRelationsForHandlerWithTag(handlerTag: Double): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def shouldHandlerBeCancelledBy(
      _handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldRecognizeSimultaneously(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldRequireHandlerToWaitForFailure(
      _handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* CompleteClass */
    override def shouldWaitForHandlerFailure(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override val simultaneousRelations: Any = js.native
    
    /* private */ /* CompleteClass */
    override val waitForRelations: Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(): InteractionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[InteractionManager]
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/InteractionManager", "default.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait InteractionManager extends StObject {
    
    def configureInteractions(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      config: Config
    ): Unit
    
    def dropRelationsForHandlerWithTag(handlerTag: Double): Unit
    
    def reset(): Unit
    
    def shouldHandlerBeCancelledBy(
      _handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldRecognizeSimultaneously(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldRequireHandlerToWaitForFailure(
      _handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      _otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    def shouldWaitForHandlerFailure(
      handler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default,
      otherHandler: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default
    ): Boolean
    
    /* private */ val simultaneousRelations: Any
    
    /* private */ val waitForRelations: Any
  }
  object InteractionManager {
    
    inline def apply(
      configureInteractions: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, Config) => Callback,
      dropRelationsForHandlerWithTag: Double => Callback,
      reset: Callback,
      shouldHandlerBeCancelledBy: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldRecognizeSimultaneously: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldRequireHandlerToWaitForFailure: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      shouldWaitForHandlerFailure: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean,
      simultaneousRelations: Any,
      waitForRelations: Any
    ): InteractionManager = {
      val __obj = js.Dynamic.literal(configureInteractions = js.Any.fromFunction2((t0: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, t1: Config) => (configureInteractions(t0, t1)).runNow()), dropRelationsForHandlerWithTag = js.Any.fromFunction1((t0: Double) => dropRelationsForHandlerWithTag(t0).runNow()), reset = reset.toJsFn, shouldHandlerBeCancelledBy = js.Any.fromFunction2(shouldHandlerBeCancelledBy), shouldRecognizeSimultaneously = js.Any.fromFunction2(shouldRecognizeSimultaneously), shouldRequireHandlerToWaitForFailure = js.Any.fromFunction2(shouldRequireHandlerToWaitForFailure), shouldWaitForHandlerFailure = js.Any.fromFunction2(shouldWaitForHandlerFailure), simultaneousRelations = simultaneousRelations.asInstanceOf[js.Any], waitForRelations = waitForRelations.asInstanceOf[js.Any])
      __obj.asInstanceOf[InteractionManager]
    }
    
    extension [Self <: InteractionManager](x: Self) {
      
      inline def setConfigureInteractions(
        value: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, Config) => Callback
      ): Self = StObject.set(x, "configureInteractions", js.Any.fromFunction2((t0: typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, t1: Config) => (value(t0, t1)).runNow()))
      
      inline def setDropRelationsForHandlerWithTag(value: Double => Callback): Self = StObject.set(x, "dropRelationsForHandlerWithTag", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setShouldHandlerBeCancelledBy(
        value: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldHandlerBeCancelledBy", js.Any.fromFunction2(value))
      
      inline def setShouldRecognizeSimultaneously(
        value: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldRecognizeSimultaneously", js.Any.fromFunction2(value))
      
      inline def setShouldRequireHandlerToWaitForFailure(
        value: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldRequireHandlerToWaitForFailure", js.Any.fromFunction2(value))
      
      inline def setShouldWaitForHandlerFailure(
        value: (typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default, typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersGestureHandlerMod.default) => Boolean
      ): Self = StObject.set(x, "shouldWaitForHandlerFailure", js.Any.fromFunction2(value))
      
      inline def setSimultaneousRelations(value: Any): Self = StObject.set(x, "simultaneousRelations", value.asInstanceOf[js.Any])
      
      inline def setWaitForRelations(value: Any): Self = StObject.set(x, "waitForRelations", value.asInstanceOf[js.Any])
    }
  }
}
