package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XLocalizable
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.AliasProgrammaticPair
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XLocalizedAliases
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the context for data access beans. It allows to register aliases for database access beans. It is possible to have different aliases for different
  * locales.
  *
  * A {@link DatabaseContext} stores an alias for the URL of a database access component for a given locale. It is also allowed to work with a default
  * locale. This is useful in connection with Enumeration or NameAccess to the context. In common use, the default language is set during the
  * initialization of the component.
  *
  * The service also provides a default handling for locales, where an alias isn't set. The first time an alias is registered for a programmatic name, the
  * alias becomes the default for all other known locales.
  * @deprecated Deprecated
  * @see com.sun.star.util.XLocalizedAliases
  */
trait DatabaseAccessContext
  extends StObject
     with XEnumerationAccess
     with XNameAccess
     with XLocalizedAliases
     with XLocalizable
object DatabaseAccessContext {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    Locale: Locale,
    acquire: Callback,
    bindAlias: (String, Locale, String) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    getLocale: CallbackTo[Locale],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    listAliases: Locale => SafeArray[AliasProgrammaticPair],
    lookupAlias: (Locale, String) => String,
    lookupProgrammatic: (Locale, String) => String,
    queryInterface: `type` => Any,
    rebindAliases: (String, String) => Callback,
    release: Callback,
    renameAlias: (Locale, String, String) => Callback,
    setLocale: Locale => Callback,
    unbindAlias: (Locale, String) => Callback,
    unbindAliases: String => Callback
  ): DatabaseAccessContext = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], acquire = acquire.toJsFn, bindAlias = js.Any.fromFunction3((t0: String, t1: Locale, t2: String) => (bindAlias(t0, t1, t2)).runNow()), createEnumeration = createEnumeration.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, getLocale = getLocale.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2((t0: String, t1: String) => (rebindAliases(t0, t1)).runNow()), release = release.toJsFn, renameAlias = js.Any.fromFunction3((t0: Locale, t1: String, t2: String) => (renameAlias(t0, t1, t2)).runNow()), setLocale = js.Any.fromFunction1((t0: Locale) => setLocale(t0).runNow()), unbindAlias = js.Any.fromFunction2((t0: Locale, t1: String) => (unbindAlias(t0, t1)).runNow()), unbindAliases = js.Any.fromFunction1((t0: String) => unbindAliases(t0).runNow()))
    __obj.asInstanceOf[DatabaseAccessContext]
  }
}
