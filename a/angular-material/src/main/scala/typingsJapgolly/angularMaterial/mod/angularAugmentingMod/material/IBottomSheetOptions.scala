package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.angular.JQuery
import typingsJapgolly.angular.mod.IController
import typingsJapgolly.angular.mod.IControllerConstructor
import typingsJapgolly.angular.mod.IScope
import typingsJapgolly.angular.mod.Injectable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBottomSheetOptions extends StObject {
  
  var bindToController: js.UndefOr[Boolean] = js.undefined
  
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  
  var controllerAs: js.UndefOr[String] = js.undefined
  
  // default: false
  var disableBackdrop: js.UndefOr[Boolean] = js.undefined
  
  // default: root node
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
  
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
  
  var locals: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var parent: js.UndefOr[
    (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
  ] = js.undefined
  
  // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.undefined
  
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  
  var scope: js.UndefOr[IScope] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
}
object IBottomSheetOptions {
  
  inline def apply(): IBottomSheetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBottomSheetOptions]
  }
  
  extension [Self <: IBottomSheetOptions](x: Self) {
    
    inline def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    inline def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    inline def setClickOutsideToClose(value: Boolean): Self = StObject.set(x, "clickOutsideToClose", value.asInstanceOf[js.Any])
    
    inline def setClickOutsideToCloseUndefined: Self = StObject.set(x, "clickOutsideToClose", js.undefined)
    
    inline def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerFunction1(value: /* repeated */ Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setDisableBackdrop(value: Boolean): Self = StObject.set(x, "disableBackdrop", value.asInstanceOf[js.Any])
    
    inline def setDisableBackdropUndefined: Self = StObject.set(x, "disableBackdrop", js.undefined)
    
    inline def setDisableParentScroll(value: Boolean): Self = StObject.set(x, "disableParentScroll", value.asInstanceOf[js.Any])
    
    inline def setDisableParentScrollUndefined: Self = StObject.set(x, "disableParentScroll", js.undefined)
    
    inline def setEscapeToClose(value: Boolean): Self = StObject.set(x, "escapeToClose", value.asInstanceOf[js.Any])
    
    inline def setEscapeToCloseUndefined: Self = StObject.set(x, "escapeToClose", js.undefined)
    
    inline def setLocals(value: StringDictionary[Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setParent(
      value: (js.Function2[/* scope */ IScope, /* element */ JQuery, Element | JQuery]) | String | Element | JQuery
    ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentFunction2(value: (/* scope */ IScope, /* element */ JQuery) => Element | JQuery): Self = StObject.set(x, "parent", js.Any.fromFunction2(value))
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPreserveScope(value: Boolean): Self = StObject.set(x, "preserveScope", value.asInstanceOf[js.Any])
    
    inline def setPreserveScopeUndefined: Self = StObject.set(x, "preserveScope", js.undefined)
    
    inline def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
  }
}
