package typingsJapgolly.angularStrap.mgcrea.ngStrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angularStrap.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Dropdowsn
// see http://mgcrea.github.io/angular-strap/#/dropdowns
///////////////////////////////////////////////////////////////////////////
object dropdown {
  
  trait IDropdown extends StObject {
    
    def destroy(): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IDropdown {
    
    inline def apply(destroy: Callback, hide: Callback, show: Callback): IDropdown = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, show = show.toJsFn)
      __obj.asInstanceOf[IDropdown]
    }
    
    extension [Self <: IDropdown](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  trait IDropdownOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
  }
  object IDropdownOptions {
    
    inline def apply(): IDropdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropdownOptions]
    }
    
    extension [Self <: IDropdownOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setOnBeforeHide(value: /* dropdown */ IDropdown => Callback): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1((t0: /* dropdown */ IDropdown) => value(t0).runNow()))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* dropdown */ IDropdown => Callback): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1((t0: /* dropdown */ IDropdown) => value(t0).runNow()))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* dropdown */ IDropdown => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* dropdown */ IDropdown) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* dropdown */ IDropdown => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* dropdown */ IDropdown) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait IDropdownProvider extends StObject {
    
    var defaults: IDropdownOptions
  }
  object IDropdownProvider {
    
    inline def apply(defaults: IDropdownOptions): IDropdownProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownProvider]
    }
    
    extension [Self <: IDropdownProvider](x: Self) {
      
      inline def setDefaults(value: IDropdownOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IDropdownService = js.Function2[/* element */ IAugmentedJQuery, /* config */ IDropdownOptions, IDropdown]
}
