package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentDidDisappearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ComponentWillAppearEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalAttemptedToDismissEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ModalDismissedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.NavigationButtonPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.PreviewCompletedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.ScreenPoppedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarCancelPressedEvent
import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesComponentEventsMod.SearchBarUpdatedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcInterfacesNavigationComponentListenerMod {
  
  trait NavigationComponentListener extends StObject {
    
    var componentDidAppear: js.UndefOr[js.Function1[/* _event */ ComponentDidAppearEvent, Unit]] = js.undefined
    
    var componentDidDisappear: js.UndefOr[js.Function1[/* _event */ ComponentDidDisappearEvent, Unit]] = js.undefined
    
    var componentWillAppear: js.UndefOr[js.Function1[/* _event */ ComponentWillAppearEvent, Unit]] = js.undefined
    
    var modalAttemptedToDismiss: js.UndefOr[js.Function1[/* _event */ ModalAttemptedToDismissEvent, Unit]] = js.undefined
    
    var modalDismissed: js.UndefOr[js.Function1[/* _event */ ModalDismissedEvent, Unit]] = js.undefined
    
    var navigationButtonPressed: js.UndefOr[js.Function1[/* _event */ NavigationButtonPressedEvent, Unit]] = js.undefined
    
    var previewCompleted: js.UndefOr[js.Function1[/* _event */ PreviewCompletedEvent, Unit]] = js.undefined
    
    var screenPopped: js.UndefOr[js.Function1[/* _event */ ScreenPoppedEvent, Unit]] = js.undefined
    
    var searchBarCancelPressed: js.UndefOr[js.Function1[/* _event */ SearchBarCancelPressedEvent, Unit]] = js.undefined
    
    var searchBarUpdated: js.UndefOr[js.Function1[/* _event */ SearchBarUpdatedEvent, Unit]] = js.undefined
  }
  object NavigationComponentListener {
    
    inline def apply(): NavigationComponentListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationComponentListener]
    }
    
    extension [Self <: NavigationComponentListener](x: Self) {
      
      inline def setComponentDidAppear(value: /* _event */ ComponentDidAppearEvent => Callback): Self = StObject.set(x, "componentDidAppear", js.Any.fromFunction1((t0: /* _event */ ComponentDidAppearEvent) => value(t0).runNow()))
      
      inline def setComponentDidAppearUndefined: Self = StObject.set(x, "componentDidAppear", js.undefined)
      
      inline def setComponentDidDisappear(value: /* _event */ ComponentDidDisappearEvent => Callback): Self = StObject.set(x, "componentDidDisappear", js.Any.fromFunction1((t0: /* _event */ ComponentDidDisappearEvent) => value(t0).runNow()))
      
      inline def setComponentDidDisappearUndefined: Self = StObject.set(x, "componentDidDisappear", js.undefined)
      
      inline def setComponentWillAppear(value: /* _event */ ComponentWillAppearEvent => Callback): Self = StObject.set(x, "componentWillAppear", js.Any.fromFunction1((t0: /* _event */ ComponentWillAppearEvent) => value(t0).runNow()))
      
      inline def setComponentWillAppearUndefined: Self = StObject.set(x, "componentWillAppear", js.undefined)
      
      inline def setModalAttemptedToDismiss(value: /* _event */ ModalAttemptedToDismissEvent => Callback): Self = StObject.set(x, "modalAttemptedToDismiss", js.Any.fromFunction1((t0: /* _event */ ModalAttemptedToDismissEvent) => value(t0).runNow()))
      
      inline def setModalAttemptedToDismissUndefined: Self = StObject.set(x, "modalAttemptedToDismiss", js.undefined)
      
      inline def setModalDismissed(value: /* _event */ ModalDismissedEvent => Callback): Self = StObject.set(x, "modalDismissed", js.Any.fromFunction1((t0: /* _event */ ModalDismissedEvent) => value(t0).runNow()))
      
      inline def setModalDismissedUndefined: Self = StObject.set(x, "modalDismissed", js.undefined)
      
      inline def setNavigationButtonPressed(value: /* _event */ NavigationButtonPressedEvent => Callback): Self = StObject.set(x, "navigationButtonPressed", js.Any.fromFunction1((t0: /* _event */ NavigationButtonPressedEvent) => value(t0).runNow()))
      
      inline def setNavigationButtonPressedUndefined: Self = StObject.set(x, "navigationButtonPressed", js.undefined)
      
      inline def setPreviewCompleted(value: /* _event */ PreviewCompletedEvent => Callback): Self = StObject.set(x, "previewCompleted", js.Any.fromFunction1((t0: /* _event */ PreviewCompletedEvent) => value(t0).runNow()))
      
      inline def setPreviewCompletedUndefined: Self = StObject.set(x, "previewCompleted", js.undefined)
      
      inline def setScreenPopped(value: /* _event */ ScreenPoppedEvent => Callback): Self = StObject.set(x, "screenPopped", js.Any.fromFunction1((t0: /* _event */ ScreenPoppedEvent) => value(t0).runNow()))
      
      inline def setScreenPoppedUndefined: Self = StObject.set(x, "screenPopped", js.undefined)
      
      inline def setSearchBarCancelPressed(value: /* _event */ SearchBarCancelPressedEvent => Callback): Self = StObject.set(x, "searchBarCancelPressed", js.Any.fromFunction1((t0: /* _event */ SearchBarCancelPressedEvent) => value(t0).runNow()))
      
      inline def setSearchBarCancelPressedUndefined: Self = StObject.set(x, "searchBarCancelPressed", js.undefined)
      
      inline def setSearchBarUpdated(value: /* _event */ SearchBarUpdatedEvent => Callback): Self = StObject.set(x, "searchBarUpdated", js.Any.fromFunction1((t0: /* _event */ SearchBarUpdatedEvent) => value(t0).runNow()))
      
      inline def setSearchBarUpdatedUndefined: Self = StObject.set(x, "searchBarUpdated", js.undefined)
    }
  }
}
