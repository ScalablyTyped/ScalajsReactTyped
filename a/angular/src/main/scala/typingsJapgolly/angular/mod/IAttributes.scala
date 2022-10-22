package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Attributes
// see http://docs.angularjs.org/api/ng/type/$compile.directive.Attributes
///////////////////////////////////////////////////////////////////////////
trait IAttributes
  extends StObject
     with /**
  * Indexer which should return ng.INgModelController for most properties but cannot because of "All named properties must be assignable to string indexer type" constraint - see https://github.com/Microsoft/TypeScript/issues/272
  */
/* name */ StringDictionary[Any] {
  
  /**
    * Adds the CSS class value specified by the classVal parameter to the
    * element. If animations are enabled then an animation will be triggered
    * for the class addition.
    */
  @JSName("$addClass")
  def $addClass(classVal: String): Unit
  
  /**
    * A map of DOM element attribute names to the normalized name. This is needed
    * to do reverse lookup from normalized name back to actual name.
    */
  @JSName("$attr")
  var $attr: js.Object
  
  /**
    * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
    *
    * Also there is special case for Moz prefix starting with upper case letter.
    *
    * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
    */
  @JSName("$normalize")
  def $normalize(name: String): String
  
  /**
    * Observes an interpolated attribute.
    * The observer function will be invoked once during the next $digest
    * following compilation. The observer is then invoked whenever the
    * interpolated value changes.
    */
  @JSName("$observe")
  def $observe[T](name: String, fn: js.Function1[/* value */ js.UndefOr[T], Any]): Function
  
  /**
    * Removes the CSS class value specified by the classVal parameter from the
    * element. If animations are enabled then an animation will be triggered for
    * the class removal.
    */
  @JSName("$removeClass")
  def $removeClass(classVal: String): Unit
  
  /**
    * Set DOM element attribute value.
    */
  @JSName("$set")
  def $set(key: String, value: Any): Unit
  
  /**
    * Adds and removes the appropriate CSS class values to the element based on the difference between
    * the new and old CSS class values (specified as newClasses and oldClasses).
    */
  @JSName("$updateClass")
  def $updateClass(newClasses: String, oldClasses: String): Unit
}
object IAttributes {
  
  inline def apply(
    $addClass: String => Callback,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[Any], Any]) => Function,
    $removeClass: String => Callback,
    $set: (String, Any) => Callback,
    $updateClass: (String, String) => Callback
  ): IAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1((t0: String) => $addClass(t0).runNow()), $attr = $attr.asInstanceOf[js.Any], $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1((t0: String) => $removeClass(t0).runNow()), $set = js.Any.fromFunction2((t0: String, t1: Any) => ($set(t0, t1)).runNow()), $updateClass = js.Any.fromFunction2((t0: String, t1: String) => ($updateClass(t0, t1)).runNow()))
    __obj.asInstanceOf[IAttributes]
  }
  
  extension [Self <: IAttributes](x: Self) {
    
    inline def set$addClass(value: String => Callback): Self = StObject.set(x, "$addClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def set$attr(value: js.Object): Self = StObject.set(x, "$attr", value.asInstanceOf[js.Any])
    
    inline def set$normalize(value: String => String): Self = StObject.set(x, "$normalize", js.Any.fromFunction1(value))
    
    inline def set$observe(value: (String, js.Function1[/* value */ js.UndefOr[Any], Any]) => Function): Self = StObject.set(x, "$observe", js.Any.fromFunction2(value))
    
    inline def set$removeClass(value: String => Callback): Self = StObject.set(x, "$removeClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def set$set(value: (String, Any) => Callback): Self = StObject.set(x, "$set", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def set$updateClass(value: (String, String) => Callback): Self = StObject.set(x, "$updateClass", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
