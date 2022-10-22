package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
trait XLocalizedAliases
  extends StObject
     with XInterface {
  
  /** registers an alias for a programmatic name. */
  def bindAlias(programmaticName: String, locale: Locale, alias: String): Unit
  
  /**
    * retrieves a list of all registered aliases for a certain language.
    * @param locale specifies the locale scope.
    * @returns a sequence of registered pair of alias and programmatic name.
    */
  def listAliases(locale: Locale): SafeArray[AliasProgrammaticPair]
  
  /** retrieves a registered programmatic name identified by an alias. */
  def lookupAlias(locale: Locale, Alias: String): String
  
  /** retrieves a given alias for a programmatic name. */
  def lookupProgrammatic(locale: Locale, programmatic: String): String
  
  /** rebinds all aliases registered to a given {@link URL} to a new one. */
  def rebindAliases(currentProgrammatic: String, newProgrammatic: String): Unit
  
  /** renames an alias for a programmatic name. */
  def renameAlias(locale: Locale, oldName: String, aNewName: String): Unit
  
  /** revokes an alias for a programmatic name. */
  def unbindAlias(locale: Locale, alias: String): Unit
  
  /** removes all aliases for a programmatic name. */
  def unbindAliases(programmaticName: String): Unit
}
object XLocalizedAliases {
  
  inline def apply(
    acquire: Callback,
    bindAlias: (String, Locale, String) => Callback,
    listAliases: Locale => SafeArray[AliasProgrammaticPair],
    lookupAlias: (Locale, String) => String,
    lookupProgrammatic: (Locale, String) => String,
    queryInterface: `type` => Any,
    rebindAliases: (String, String) => Callback,
    release: Callback,
    renameAlias: (Locale, String, String) => Callback,
    unbindAlias: (Locale, String) => Callback,
    unbindAliases: String => Callback
  ): XLocalizedAliases = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, bindAlias = js.Any.fromFunction3((t0: String, t1: Locale, t2: String) => (bindAlias(t0, t1, t2)).runNow()), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2((t0: String, t1: String) => (rebindAliases(t0, t1)).runNow()), release = release.toJsFn, renameAlias = js.Any.fromFunction3((t0: Locale, t1: String, t2: String) => (renameAlias(t0, t1, t2)).runNow()), unbindAlias = js.Any.fromFunction2((t0: Locale, t1: String) => (unbindAlias(t0, t1)).runNow()), unbindAliases = js.Any.fromFunction1((t0: String) => unbindAliases(t0).runNow()))
    __obj.asInstanceOf[XLocalizedAliases]
  }
  
  extension [Self <: XLocalizedAliases](x: Self) {
    
    inline def setBindAlias(value: (String, Locale, String) => Callback): Self = StObject.set(x, "bindAlias", js.Any.fromFunction3((t0: String, t1: Locale, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setListAliases(value: Locale => SafeArray[AliasProgrammaticPair]): Self = StObject.set(x, "listAliases", js.Any.fromFunction1(value))
    
    inline def setLookupAlias(value: (Locale, String) => String): Self = StObject.set(x, "lookupAlias", js.Any.fromFunction2(value))
    
    inline def setLookupProgrammatic(value: (Locale, String) => String): Self = StObject.set(x, "lookupProgrammatic", js.Any.fromFunction2(value))
    
    inline def setRebindAliases(value: (String, String) => Callback): Self = StObject.set(x, "rebindAliases", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setRenameAlias(value: (Locale, String, String) => Callback): Self = StObject.set(x, "renameAlias", js.Any.fromFunction3((t0: Locale, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setUnbindAlias(value: (Locale, String) => Callback): Self = StObject.set(x, "unbindAlias", js.Any.fromFunction2((t0: Locale, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUnbindAliases(value: String => Callback): Self = StObject.set(x, "unbindAliases", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
