package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsContentContentInterfaceMod.ScrollBaseDetail
import typingsJapgolly.ionicCore.distTypesComponentsContentContentInterfaceMod.ScrollDetail
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonContentCustomEvent
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonContent extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true` and the content does not cause an overflow scroll, the scroll interaction will cause a bounce. If the content exceeds the bounds of ionContent, nothing will change. Note, the does not disable the system bounce on iOS. That is an OS level setting.
    */
  var forceOverscroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the content will scroll behind the headers and footers. This effect can easily be seen by setting the toolbar to transparent.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Emitted while scrolling. This event is disabled by default. Set `scrollEvents` to `true` to enable.
    */
  var onIonScroll: js.UndefOr[js.Function1[/* event */ IonContentCustomEvent[ScrollDetail], Unit]] = js.undefined
  
  /**
    * Emitted when the scroll has ended. This event is disabled by default. Set `scrollEvents` to `true` to enable.
    */
  var onIonScrollEnd: js.UndefOr[js.Function1[/* event */ IonContentCustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  
  /**
    * Emitted when the scroll has started. This event is disabled by default. Set `scrollEvents` to `true` to enable.
    */
  var onIonScrollStart: js.UndefOr[js.Function1[/* event */ IonContentCustomEvent[ScrollBaseDetail], Unit]] = js.undefined
  
  /**
    * Because of performance reasons, ionScroll events are disabled by default, in order to enable them and start listening from (ionScroll), set this property to `true`.
    */
  var scrollEvents: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you want to enable the content scrolling in the X axis, set this property to `true`.
    */
  var scrollX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If you want to disable the content scrolling in the Y axis, set this property to `false`.
    */
  var scrollY: js.UndefOr[Boolean] = js.undefined
}
object IonContent {
  
  inline def apply(): IonContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonContent]
  }
  
  extension [Self <: IonContent](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setForceOverscroll(value: Boolean): Self = StObject.set(x, "forceOverscroll", value.asInstanceOf[js.Any])
    
    inline def setForceOverscrollUndefined: Self = StObject.set(x, "forceOverscroll", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setOnIonScroll(value: /* event */ IonContentCustomEvent[ScrollDetail] => Callback): Self = StObject.set(x, "onIonScroll", js.Any.fromFunction1((t0: /* event */ IonContentCustomEvent[ScrollDetail]) => value(t0).runNow()))
    
    inline def setOnIonScrollEnd(value: /* event */ IonContentCustomEvent[ScrollBaseDetail] => Callback): Self = StObject.set(x, "onIonScrollEnd", js.Any.fromFunction1((t0: /* event */ IonContentCustomEvent[ScrollBaseDetail]) => value(t0).runNow()))
    
    inline def setOnIonScrollEndUndefined: Self = StObject.set(x, "onIonScrollEnd", js.undefined)
    
    inline def setOnIonScrollStart(value: /* event */ IonContentCustomEvent[ScrollBaseDetail] => Callback): Self = StObject.set(x, "onIonScrollStart", js.Any.fromFunction1((t0: /* event */ IonContentCustomEvent[ScrollBaseDetail]) => value(t0).runNow()))
    
    inline def setOnIonScrollStartUndefined: Self = StObject.set(x, "onIonScrollStart", js.undefined)
    
    inline def setOnIonScrollUndefined: Self = StObject.set(x, "onIonScroll", js.undefined)
    
    inline def setScrollEvents(value: Boolean): Self = StObject.set(x, "scrollEvents", value.asInstanceOf[js.Any])
    
    inline def setScrollEventsUndefined: Self = StObject.set(x, "scrollEvents", js.undefined)
    
    inline def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    inline def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
  }
}
