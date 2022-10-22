package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.action
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.focus
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddKeyedListener extends StObject {
  
  var addKeyedListener: js.UndefOr[
    typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddKeyedListener
  ] = js.undefined
  
  var addListener: js.UndefOr[
    typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddListener
  ] = js.undefined
  
  var onAction: js.UndefOr[
    js.Function2[
      /* action */ NavigationAction, 
      /* visitedNavigators */ js.UndefOr[Set[String]], 
      Boolean
    ]
  ] = js.undefined
  
  def onDispatchAction(action: NavigationAction, noop: Boolean): Unit
  
  def onOptionsChange(options: js.Object): Unit
  
  var onRouteFocus: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  
  var stackRef: js.UndefOr[MutableRefObject[js.UndefOr[String]]] = js.undefined
}
object AddKeyedListener {
  
  inline def apply(onDispatchAction: (NavigationAction, Boolean) => Callback, onOptionsChange: js.Object => Callback): AddKeyedListener = {
    val __obj = js.Dynamic.literal(onDispatchAction = js.Any.fromFunction2((t0: NavigationAction, t1: Boolean) => (onDispatchAction(t0, t1)).runNow()), onOptionsChange = js.Any.fromFunction1((t0: js.Object) => onOptionsChange(t0).runNow()))
    __obj.asInstanceOf[AddKeyedListener]
  }
  
  extension [Self <: AddKeyedListener](x: Self) {
    
    inline def setAddKeyedListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Callback
    ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, t1: /* key */ String, t2: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAddKeyedListenerUndefined: Self = StObject.set(x, "addKeyedListener", js.undefined)
    
    inline def setAddListener(
      value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Callback
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, t1: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => (value(t0, t1)).runNow()))
    
    inline def setAddListenerUndefined: Self = StObject.set(x, "addListener", js.undefined)
    
    inline def setOnAction(value: (/* action */ NavigationAction, /* visitedNavigators */ js.UndefOr[Set[String]]) => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction2(value))
    
    inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
    
    inline def setOnDispatchAction(value: (NavigationAction, Boolean) => Callback): Self = StObject.set(x, "onDispatchAction", js.Any.fromFunction2((t0: NavigationAction, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setOnOptionsChange(value: js.Object => Callback): Self = StObject.set(x, "onOptionsChange", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setOnRouteFocus(value: /* key */ String => Callback): Self = StObject.set(x, "onRouteFocus", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
    
    inline def setOnRouteFocusUndefined: Self = StObject.set(x, "onRouteFocus", js.undefined)
    
    inline def setStackRef(value: MutableRefObject[js.UndefOr[String]]): Self = StObject.set(x, "stackRef", value.asInstanceOf[js.Any])
    
    inline def setStackRefUndefined: Self = StObject.set(x, "stackRef", js.undefined)
  }
}
