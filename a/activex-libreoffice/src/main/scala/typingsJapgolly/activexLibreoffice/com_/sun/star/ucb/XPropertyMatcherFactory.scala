package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates an {@link XPropertyMatcher} , given a set of search criteria. */
trait XPropertyMatcherFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an {@link XPropertyMatcher} .
    * @param Criteria The set of search criteria the returned {@link XPropertyMatcher} will use.
    * @returns An {@link XPropertyMatcher} with the given search criteria.
    */
  def createPropertyMatcher(Criteria: SeqEquiv[SearchCriterium]): XPropertyMatcher
}
object XPropertyMatcherFactory {
  
  inline def apply(
    acquire: Callback,
    createPropertyMatcher: SeqEquiv[SearchCriterium] => XPropertyMatcher,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertyMatcherFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createPropertyMatcher = js.Any.fromFunction1(createPropertyMatcher), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertyMatcherFactory]
  }
  
  extension [Self <: XPropertyMatcherFactory](x: Self) {
    
    inline def setCreatePropertyMatcher(value: SeqEquiv[SearchCriterium] => XPropertyMatcher): Self = StObject.set(x, "createPropertyMatcher", js.Any.fromFunction1(value))
  }
}
