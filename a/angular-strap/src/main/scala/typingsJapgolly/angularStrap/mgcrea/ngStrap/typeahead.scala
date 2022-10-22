package typingsJapgolly.angularStrap.mgcrea.ngStrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQuery
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angularStrap.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Typeahead
// see http://mgcrea.github.io/angular-strap/#/typeaheads
///////////////////////////////////////////////////////////////////////////
object typeahead {
  
  trait ITypeahead extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object ITypeahead {
    
    inline def apply($promise: IPromise[Unit], hide: Callback, show: Callback, toggle: Callback): ITypeahead = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = hide.toJsFn, show = show.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[ITypeahead]
    }
    
    extension [Self <: ITypeahead](x: Self) {
      
      inline def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  trait ITypeaheadOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var comparator: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var trimValue: js.UndefOr[Boolean] = js.undefined
    
    var watchOptions: js.UndefOr[Boolean] = js.undefined
  }
  object ITypeaheadOptions {
    
    inline def apply(): ITypeaheadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITypeaheadOptions]
    }
    
    extension [Self <: ITypeaheadOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnBeforeHide(value: /* typeahead */ ITypeahead => Callback): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1((t0: /* typeahead */ ITypeahead) => value(t0).runNow()))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* typeahead */ ITypeahead => Callback): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1((t0: /* typeahead */ ITypeahead) => value(t0).runNow()))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* typeahead */ ITypeahead => Callback): Self = StObject.set(x, "onHide", js.Any.fromFunction1((t0: /* typeahead */ ITypeahead) => value(t0).runNow()))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnSelect(value: /* typeahead */ ITypeahead => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* typeahead */ ITypeahead) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: /* typeahead */ ITypeahead => Callback): Self = StObject.set(x, "onShow", js.Any.fromFunction1((t0: /* typeahead */ ITypeahead) => value(t0).runNow()))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTrimValue(value: Boolean): Self = StObject.set(x, "trimValue", value.asInstanceOf[js.Any])
      
      inline def setTrimValueUndefined: Self = StObject.set(x, "trimValue", js.undefined)
      
      inline def setWatchOptions(value: Boolean): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    }
  }
  
  trait ITypeaheadProvider extends StObject {
    
    var defaults: ITypeaheadOptions
  }
  object ITypeaheadProvider {
    
    inline def apply(defaults: ITypeaheadOptions): ITypeaheadProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITypeaheadProvider]
    }
    
    extension [Self <: ITypeaheadProvider](x: Self) {
      
      inline def setDefaults(value: ITypeaheadOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ITypeaheadService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ Any, 
    /* config */ js.UndefOr[ITypeaheadOptions], 
    ITypeahead
  ]
}
