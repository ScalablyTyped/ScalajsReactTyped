package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** supplies information on index entries to generate a "table of; alphabetical index" for a given locale. */
trait XIndexEntrySupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the capital index key for sorting a table of indexes, to a given index entry, to a given {@link com.sun.star.lang.Locale} and to a given sort
    * algorithm.
    *
    * For example, in English locale it returns **"K"** for "keyboard"
    */
  def getIndexCharacter(aIndexEntry: String, aLocale: Locale, aSortAlgorithm: String): String
  
  /**
    * returns the page number word of an index entry, where one page or more pages are combined to one page number entry, for a given {@link
    * com.sun.star.lang.Locale} .
    *
    * For example, in English locale it returns ; **"p."** for **bMorePages** == `FALSE`; **"pp."** for **bMorePages** == `TRUE`
    */
  def getIndexFollowPageWord(bMorePages: Boolean, aLocale: Locale): String
}
object XIndexEntrySupplier {
  
  inline def apply(
    acquire: Callback,
    getIndexCharacter: (String, Locale, String) => String,
    getIndexFollowPageWord: (Boolean, Locale) => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XIndexEntrySupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getIndexCharacter = js.Any.fromFunction3(getIndexCharacter), getIndexFollowPageWord = js.Any.fromFunction2(getIndexFollowPageWord), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIndexEntrySupplier]
  }
  
  extension [Self <: XIndexEntrySupplier](x: Self) {
    
    inline def setGetIndexCharacter(value: (String, Locale, String) => String): Self = StObject.set(x, "getIndexCharacter", js.Any.fromFunction3(value))
    
    inline def setGetIndexFollowPageWord(value: (Boolean, Locale) => String): Self = StObject.set(x, "getIndexFollowPageWord", js.Any.fromFunction2(value))
  }
}
