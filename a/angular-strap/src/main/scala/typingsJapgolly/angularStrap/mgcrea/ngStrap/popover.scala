package typingsJapgolly.angularStrap.mgcrea.ngStrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.angularStrap.anon.Hide
import typingsJapgolly.angularStrap.anon.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Popover
// see http://mgcrea.github.io/angular-strap/#/popovers
///////////////////////////////////////////////////////////////////////////
object popover {
  
  trait IPopover extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object IPopover {
    
    inline def apply($promise: IPromise[Unit], hide: Callback, show: Callback, toggle: Callback): IPopover = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = hide.toJsFn, show = show.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[IPopover]
    }
    
    extension [Self <: IPopover](x: Self) {
      
      inline def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  trait IPopoverOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentTemplate: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var viewport: js.UndefOr[String | Padding] = js.undefined
  }
  object IPopoverOptions {
    
    inline def apply(): IPopoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopoverOptions]
    }
    
    extension [Self <: IPopoverOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentTemplate(value: String): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnBeforeHide(value: /* popover */ IPopover => Callback): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1((t0: /* popover */ IPopover) => value(t0).runNow()))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* popover */ IPopover => Callback): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1((t0: /* popover */ IPopover) => value(t0).runNow()))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* popover */ IPopover => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* popover */ IPopover) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* popover */ IPopover => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* popover */ IPopover) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTarget(value: String | IAugmentedJQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setViewport(value: String | Padding): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait IPopoverProvider extends StObject {
    
    var defaults: IPopoverOptions
  }
  object IPopoverProvider {
    
    inline def apply(defaults: IPopoverOptions): IPopoverProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverProvider]
    }
    
    extension [Self <: IPopoverProvider](x: Self) {
      
      inline def setDefaults(value: IPopoverOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPopoverScope
    extends StObject
       with IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IPopoverService = js.Function2[/* element */ IAugmentedJQuery, /* config */ js.UndefOr[IPopoverOptions], IPopover]
}
