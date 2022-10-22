package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.anon.Visible
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonSplitPaneCustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSplitPane extends StObject {
  
  /**
    * The `id` of the main content. When using a router this is typically `ion-router-outlet`. When not using a router, this is typically your main view's `ion-content`. This is not the id of the `ion-content` inside of your `ion-menu`.
    */
  var contentId: js.UndefOr[String] = js.undefined
  
  /**
    * If `true`, the split pane will be hidden.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Expression to be called when the split-pane visibility has changed
    */
  var onIonSplitPaneVisible: js.UndefOr[js.Function1[/* event */ IonSplitPaneCustomEvent[Visible], Unit]] = js.undefined
  
  /**
    * When the split-pane should be shown. Can be a CSS media query expression, or a shortcut expression. Can also be a boolean expression.
    */
  var when: js.UndefOr[String | Boolean] = js.undefined
}
object IonSplitPane {
  
  inline def apply(): IonSplitPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSplitPane]
  }
  
  extension [Self <: IonSplitPane](x: Self) {
    
    inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setOnIonSplitPaneVisible(value: /* event */ IonSplitPaneCustomEvent[Visible] => Callback): Self = StObject.set(x, "onIonSplitPaneVisible", js.Any.fromFunction1((t0: /* event */ IonSplitPaneCustomEvent[Visible]) => value(t0).runNow()))
    
    inline def setOnIonSplitPaneVisibleUndefined: Self = StObject.set(x, "onIonSplitPaneVisible", js.undefined)
    
    inline def setWhen(value: String | Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
