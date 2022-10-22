package typingsJapgolly.angularStrap.mgcrea.ngStrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angular.mod.IRootScopeService
import typingsJapgolly.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Aside
// see http://mgcrea.github.io/angular-strap/#/asides
///////////////////////////////////////////////////////////////////////////
object aside {
  
  trait IAside extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object IAside {
    
    inline def apply($promise: IPromise[Unit], hide: Callback, show: Callback, toggle: Callback): IAside = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = hide.toJsFn, show = show.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[IAside]
    }
    
    extension [Self <: IAside](x: Self) {
      
      inline def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  trait IAsideOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var backdrop: js.UndefOr[Boolean | String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentTemplate: js.UndefOr[String] = js.undefined
    
    var controller: js.UndefOr[Any] = js.undefined
    
    var controllerAs: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[IScope] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IAsideOptions {
    
    inline def apply(): IAsideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAsideOptions]
    }
    
    extension [Self <: IAsideOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentTemplate(value: String): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setOnBeforeHide(value: /* aside */ IAside => Callback): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1((t0: /* aside */ IAside) => value(t0).runNow()))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* aside */ IAside => Callback): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1((t0: /* aside */ IAside) => value(t0).runNow()))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* aside */ IAside => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* aside */ IAside) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* aside */ IAside => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* aside */ IAside) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IAsideProvider extends StObject {
    
    var defaults: IAsideOptions
  }
  object IAsideProvider {
    
    inline def apply(defaults: IAsideOptions): IAsideProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsideProvider]
    }
    
    extension [Self <: IAsideProvider](x: Self) {
      
      inline def setDefaults(value: IAsideOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAsideScope
    extends StObject
       with IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IAsideService = js.Function1[/* config */ js.UndefOr[IAsideOptions], IAside]
}
