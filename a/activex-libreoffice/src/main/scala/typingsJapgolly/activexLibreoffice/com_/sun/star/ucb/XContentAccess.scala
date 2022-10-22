package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies methods for obtaining information on a content in different levels.
  *
  * For example, if there is a cursor which points to XContents, this interface could be used to give the user access to the content under the cursor. If
  * the client only needs the identifier string of the content, there is no need to first create the content object, then to obtain the string from it and
  * after that to release the content.
  * @author Kai Sommerfeld
  * @see XContent
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentAccess
  extends StObject
     with XInterface {
  
  /**
    * returns the content ( "most expensive method" ).
    * @returns the content.
    */
  def queryContent(): XContent
  
  /**
    * returns the identifier object of the content.
    * @returns the identifier object.
    */
  def queryContentIdentifier(): XContentIdentifier
  
  /**
    * returns the identifier string of the content ( "cheap method" ).
    *
    * Note that this string can be used later to recreate the content.
    * @returns the identifier string.
    */
  def queryContentIdentifierString(): String
}
object XContentAccess {
  
  inline def apply(
    acquire: Callback,
    queryContent: CallbackTo[XContent],
    queryContentIdentifier: CallbackTo[XContentIdentifier],
    queryContentIdentifierString: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XContentAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryContent = queryContent.toJsFn, queryContentIdentifier = queryContentIdentifier.toJsFn, queryContentIdentifierString = queryContentIdentifierString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentAccess]
  }
  
  extension [Self <: XContentAccess](x: Self) {
    
    inline def setQueryContent(value: CallbackTo[XContent]): Self = StObject.set(x, "queryContent", value.toJsFn)
    
    inline def setQueryContentIdentifier(value: CallbackTo[XContentIdentifier]): Self = StObject.set(x, "queryContentIdentifier", value.toJsFn)
    
    inline def setQueryContentIdentifierString(value: CallbackTo[String]): Self = StObject.set(x, "queryContentIdentifierString", value.toJsFn)
  }
}
