package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows to store and retrieve URLs. URLs can be stored persistently or until end of OOo session.
  * @since OOo 3.2
  */
trait XUrlContainer
  extends StObject
     with XInterface {
  
  /**
    * Add a URL to the container.
    * @param Url URL to add to the container
    * @param MakePersistent indicates whether the URL shall be stored persistently or just in memory (until end of OOo session)
    */
  def addUrl(Url: String, MakePersistent: Boolean): Unit
  
  /**
    * Lookup a URL in the container.
    * @param Url URL to lookup.
    * @returns Best matched URL or empty string.
    */
  def findUrl(Url: String): String
  
  /**
    * Get all URLs.
    * @param OnlyPersistent Only URLs that are stored persistently shall be returned.
    * @returns List of URLs.
    */
  def getUrls(OnlyPersistent: Boolean): SafeArray[String]
  
  /**
    * Remove a URL from the container.
    * @param Url URL to remove.
    */
  def removeUrl(Url: String): Unit
}
object XUrlContainer {
  
  inline def apply(
    acquire: Callback,
    addUrl: (String, Boolean) => Callback,
    findUrl: String => String,
    getUrls: Boolean => SafeArray[String],
    queryInterface: `type` => Any,
    release: Callback,
    removeUrl: String => Callback
  ): XUrlContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addUrl = js.Any.fromFunction2((t0: String, t1: Boolean) => (addUrl(t0, t1)).runNow()), findUrl = js.Any.fromFunction1(findUrl), getUrls = js.Any.fromFunction1(getUrls), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeUrl = js.Any.fromFunction1((t0: String) => removeUrl(t0).runNow()))
    __obj.asInstanceOf[XUrlContainer]
  }
  
  extension [Self <: XUrlContainer](x: Self) {
    
    inline def setAddUrl(value: (String, Boolean) => Callback): Self = StObject.set(x, "addUrl", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setFindUrl(value: String => String): Self = StObject.set(x, "findUrl", js.Any.fromFunction1(value))
    
    inline def setGetUrls(value: Boolean => SafeArray[String]): Self = StObject.set(x, "getUrls", js.Any.fromFunction1(value))
    
    inline def setRemoveUrl(value: String => Callback): Self = StObject.set(x, "removeUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
