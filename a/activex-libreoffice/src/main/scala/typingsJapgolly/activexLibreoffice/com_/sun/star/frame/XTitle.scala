package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** an interface representing an entity with a modifyable title. */
trait XTitle
  extends StObject
     with XInterface {
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  var Title: String
  
  /**
    * Returns the title of the object.
    * @returns The title.
    */
  def getTitle(): String
  
  /**
    * Sets the title of the object.
    * @param sTitle The title.
    */
  def setTitle(sTitle: String): Unit
}
object XTitle {
  
  inline def apply(
    Title: String,
    acquire: Callback,
    getTitle: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setTitle: String => Callback
  ): XTitle = {
    val __obj = js.Dynamic.literal(Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTitle = getTitle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
    __obj.asInstanceOf[XTitle]
  }
  
  extension [Self <: XTitle](x: Self) {
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setSetTitle(value: String => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
