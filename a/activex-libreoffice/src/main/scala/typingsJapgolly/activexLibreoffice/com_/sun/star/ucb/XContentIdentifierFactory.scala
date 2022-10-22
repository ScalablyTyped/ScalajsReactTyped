package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A factory for content identifiers.
  * @author Kai Sommerfeld
  * @see XContentIdentifier
  * @version 1.0
  */
trait XContentIdentifierFactory
  extends StObject
     with XInterface {
  
  /**
    * creates an identifier.
    * @param ContentId the content identifier string.
    * @returns the identifier.
    */
  def createContentIdentifier(ContentId: String): XContentIdentifier
}
object XContentIdentifierFactory {
  
  inline def apply(
    acquire: Callback,
    createContentIdentifier: String => XContentIdentifier,
    queryInterface: `type` => Any,
    release: Callback
  ): XContentIdentifierFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentIdentifierFactory]
  }
  
  extension [Self <: XContentIdentifierFactory](x: Self) {
    
    inline def setCreateContentIdentifier(value: String => XContentIdentifier): Self = StObject.set(x, "createContentIdentifier", js.Any.fromFunction1(value))
  }
}
