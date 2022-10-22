package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows transacted access to an object. */
trait XTransactedObject
  extends StObject
     with XInterface {
  
  /** commits the changes made for object. */
  def commit(): Unit
  
  /** removes all the changes made for the object after last commit or loading. */
  def revert(): Unit
}
object XTransactedObject {
  
  inline def apply(
    acquire: Callback,
    commit: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    revert: Callback
  ): XTransactedObject = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, commit = commit.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, revert = revert.toJsFn)
    __obj.asInstanceOf[XTransactedObject]
  }
  
  extension [Self <: XTransactedObject](x: Self) {
    
    inline def setCommit(value: Callback): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setRevert(value: Callback): Self = StObject.set(x, "revert", value.toJsFn)
  }
}
