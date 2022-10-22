package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeMatcher extends StObject {
  
  /**
    * Find an element satisfying all the matchers
    * @example await element(by.text('Product').and(by.id('product_name'));
    */
  def and(by: NativeMatcher): NativeMatcher
  
  /**
    * Find an element by a matcher with a parent matcher
    * @example await element(by.id('Grandson883').withAncestor(by.id('Son883')));
    */
  def withAncestor(parentBy: NativeMatcher): NativeMatcher
  
  /**
    * Find an element by a matcher with a child matcher
    * @example await element(by.id('Son883').withDescendant(by.id('Grandson883')));
    */
  def withDescendant(childBy: NativeMatcher): NativeMatcher
}
object NativeMatcher {
  
  inline def apply(
    and: NativeMatcher => NativeMatcher,
    withAncestor: NativeMatcher => NativeMatcher,
    withDescendant: NativeMatcher => NativeMatcher
  ): NativeMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), withAncestor = js.Any.fromFunction1(withAncestor), withDescendant = js.Any.fromFunction1(withDescendant))
    __obj.asInstanceOf[NativeMatcher]
  }
  
  extension [Self <: NativeMatcher](x: Self) {
    
    inline def setAnd(value: NativeMatcher => NativeMatcher): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
    
    inline def setWithAncestor(value: NativeMatcher => NativeMatcher): Self = StObject.set(x, "withAncestor", js.Any.fromFunction1(value))
    
    inline def setWithDescendant(value: NativeMatcher => NativeMatcher): Self = StObject.set(x, "withDescendant", js.Any.fromFunction1(value))
  }
}
