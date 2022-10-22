package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBreadcrumbElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsBreadcrumbBreadcrumbInterfaceMod {
  
  trait BreadcrumbCollapsedClickEventDetail extends StObject {
    
    var collapsedBreadcrumbs: js.UndefOr[js.Array[HTMLIonBreadcrumbElement]] = js.undefined
    
    var ionShadowTarget: js.UndefOr[HTMLElement] = js.undefined
  }
  object BreadcrumbCollapsedClickEventDetail {
    
    inline def apply(): BreadcrumbCollapsedClickEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbCollapsedClickEventDetail]
    }
    
    extension [Self <: BreadcrumbCollapsedClickEventDetail](x: Self) {
      
      inline def setCollapsedBreadcrumbs(value: js.Array[HTMLIonBreadcrumbElement]): Self = StObject.set(x, "collapsedBreadcrumbs", value.asInstanceOf[js.Any])
      
      inline def setCollapsedBreadcrumbsUndefined: Self = StObject.set(x, "collapsedBreadcrumbs", js.undefined)
      
      inline def setCollapsedBreadcrumbsVarargs(value: HTMLIonBreadcrumbElement*): Self = StObject.set(x, "collapsedBreadcrumbs", js.Array(value*))
      
      inline def setIonShadowTarget(value: HTMLElement): Self = StObject.set(x, "ionShadowTarget", value.asInstanceOf[js.Any])
      
      inline def setIonShadowTargetUndefined: Self = StObject.set(x, "ionShadowTarget", js.undefined)
    }
  }
  
  @js.native
  trait BreadcrumbCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_BreadcrumbCustomEvent: BreadcrumbCollapsedClickEventDetail = js.native
    
    @JSName("target")
    var target_BreadcrumbCustomEvent: HTMLIonBreadcrumbElement = js.native
  }
}
