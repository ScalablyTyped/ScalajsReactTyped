package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to change the settings of a DDE link.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.DDELink
  */
trait XDDELink
  extends StObject
     with XInterface {
  
  /** returns the application from which data are requested (the DDE server application). */
  val Application: String
  
  /** returns the DDE item from which data are requested. */
  val Item: String
  
  /** returns the DDE topic from which data are requested. */
  val Topic: String
  
  /** returns the application from which data are requested (the DDE server application). */
  def getApplication(): String
  
  /** returns the DDE item from which data are requested. */
  def getItem(): String
  
  /** returns the DDE topic from which data are requested. */
  def getTopic(): String
}
object XDDELink {
  
  inline def apply(
    Application: String,
    Item: String,
    Topic: String,
    acquire: Callback,
    getApplication: CallbackTo[String],
    getItem: CallbackTo[String],
    getTopic: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XDDELink = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Topic = Topic.asInstanceOf[js.Any], acquire = acquire.toJsFn, getApplication = getApplication.toJsFn, getItem = getItem.toJsFn, getTopic = getTopic.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDDELink]
  }
  
  extension [Self <: XDDELink](x: Self) {
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setGetApplication(value: CallbackTo[String]): Self = StObject.set(x, "getApplication", value.toJsFn)
    
    inline def setGetItem(value: CallbackTo[String]): Self = StObject.set(x, "getItem", value.toJsFn)
    
    inline def setGetTopic(value: CallbackTo[String]): Self = StObject.set(x, "getTopic", value.toJsFn)
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "Topic", value.asInstanceOf[js.Any])
  }
}
