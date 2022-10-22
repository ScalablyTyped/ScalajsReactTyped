package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigationCore.anon.Handled
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpers
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.action
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.focus
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigationBuilderContextMod extends Shortcut {
  
  /**
    * Context which holds the required helpers needed to build nested navigators.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationBuilderContext", JSImport.Default)
  @js.native
  val default: Context[typingsJapgolly.reactNavigationCore.anon.AddKeyedListener] = js.native
  
  type AddKeyedListener = js.Function3[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, 
    /* key */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any, 
    Unit
  ]
  
  type AddListener = js.Function2[
    /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, 
    /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any, 
    Unit
  ]
  
  type ChildActionListener = js.Function2[
    /* action */ NavigationAction, 
    /* visitedNavigators */ js.UndefOr[Set[String]], 
    Boolean
  ]
  
  type ChildBeforeRemoveListener = js.Function1[/* action */ NavigationAction, Boolean]
  
  type FocusedNavigationCallback[T] = js.Function1[/* navigation */ NavigationHelpers[ParamListBase, js.Object], T]
  
  type FocusedNavigationListener = js.Function1[/* callback */ FocusedNavigationCallback[Any], Handled[Any]]
  
  type GetStateListener = js.Function0[NavigationState[ParamListBase]]
  
  trait KeyedListenerMap extends StObject {
    
    var beforeRemove: ChildBeforeRemoveListener
    
    var getState: GetStateListener
  }
  object KeyedListenerMap {
    
    inline def apply(
      beforeRemove: /* action */ NavigationAction => Boolean,
      getState: CallbackTo[NavigationState[ParamListBase]]
    ): KeyedListenerMap = {
      val __obj = js.Dynamic.literal(beforeRemove = js.Any.fromFunction1(beforeRemove), getState = getState.toJsFn)
      __obj.asInstanceOf[KeyedListenerMap]
    }
    
    extension [Self <: KeyedListenerMap](x: Self) {
      
      inline def setBeforeRemove(value: /* action */ NavigationAction => Boolean): Self = StObject.set(x, "beforeRemove", js.Any.fromFunction1(value))
      
      inline def setGetState(value: CallbackTo[NavigationState[ParamListBase]]): Self = StObject.set(x, "getState", value.toJsFn)
    }
  }
  
  trait ListenerMap extends StObject {
    
    var action: ChildActionListener
    
    var focus: FocusedNavigationListener
  }
  object ListenerMap {
    
    inline def apply(
      action: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean,
      focus: /* callback */ FocusedNavigationCallback[Any] => Handled[Any]
    ): ListenerMap = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), focus = js.Any.fromFunction1(focus))
      __obj.asInstanceOf[ListenerMap]
    }
    
    extension [Self <: ListenerMap](x: Self) {
      
      inline def setAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      inline def setFocus(value: /* callback */ FocusedNavigationCallback[Any] => Handled[Any]): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[typingsJapgolly.reactNavigationCore.anon.AddKeyedListener]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcNavigationBuilderContextMod.foo` */
  override def _to: Context[typingsJapgolly.reactNavigationCore.anon.AddKeyedListener] = default
}
