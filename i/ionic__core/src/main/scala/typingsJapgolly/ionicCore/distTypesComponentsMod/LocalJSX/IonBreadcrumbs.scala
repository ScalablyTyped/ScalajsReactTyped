package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsBreadcrumbBreadcrumbInterfaceMod.BreadcrumbCollapsedClickEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonBreadcrumbsCustomEvent
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonBreadcrumbs extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * The number of breadcrumbs to show after the collapsed indicator. If `itemsBeforeCollapse` + `itemsAfterCollapse` is greater than `maxItems`, the breadcrumbs will not be collapsed.
    */
  var itemsAfterCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of breadcrumbs to show before the collapsed indicator. If `itemsBeforeCollapse` + `itemsAfterCollapse` is greater than `maxItems`, the breadcrumbs will not be collapsed.
    */
  var itemsBeforeCollapse: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of breadcrumbs to show before collapsing.
    */
  var maxItems: js.UndefOr[Double] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * Emitted when the collapsed indicator is clicked on.
    */
  var onIonCollapsedClick: js.UndefOr[
    js.Function1[/* event */ IonBreadcrumbsCustomEvent[BreadcrumbCollapsedClickEventDetail], Unit]
  ] = js.undefined
}
object IonBreadcrumbs {
  
  inline def apply(): IonBreadcrumbs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonBreadcrumbs]
  }
  
  extension [Self <: IonBreadcrumbs](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setItemsAfterCollapse(value: Double): Self = StObject.set(x, "itemsAfterCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsAfterCollapseUndefined: Self = StObject.set(x, "itemsAfterCollapse", js.undefined)
    
    inline def setItemsBeforeCollapse(value: Double): Self = StObject.set(x, "itemsBeforeCollapse", value.asInstanceOf[js.Any])
    
    inline def setItemsBeforeCollapseUndefined: Self = StObject.set(x, "itemsBeforeCollapse", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnIonCollapsedClick(value: /* event */ IonBreadcrumbsCustomEvent[BreadcrumbCollapsedClickEventDetail] => Callback): Self = StObject.set(x, "onIonCollapsedClick", js.Any.fromFunction1((t0: /* event */ IonBreadcrumbsCustomEvent[BreadcrumbCollapsedClickEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonCollapsedClickUndefined: Self = StObject.set(x, "onIonCollapsedClick", js.undefined)
  }
}
