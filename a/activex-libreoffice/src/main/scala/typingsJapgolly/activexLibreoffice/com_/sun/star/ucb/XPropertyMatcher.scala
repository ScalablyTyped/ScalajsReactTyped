package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checks whether a set of properties matches a set of search criteria.
  * @see XPropertyMatcherFactory.
  */
trait XPropertyMatcher
  extends StObject
     with XInterface {
  
  /**
    * Checks whether a set of properties matches the given search criteria.
    * @param Properties A {@link Command} Processor through which the set of properties is accessible.
    * @param Environment The environment to use when accessing the property set via the given {@link Command} Processor. It may be null.
    * @returns `TRUE` if the properties match, `FALSE` otherwise.
    */
  def matches(Properties: XCommandProcessor, Environment: XCommandEnvironment): Boolean
}
object XPropertyMatcher {
  
  inline def apply(
    acquire: Callback,
    matches: (XCommandProcessor, XCommandEnvironment) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertyMatcher = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, matches = js.Any.fromFunction2(matches), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertyMatcher]
  }
  
  extension [Self <: XPropertyMatcher](x: Self) {
    
    inline def setMatches(value: (XCommandProcessor, XCommandEnvironment) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
  }
}
