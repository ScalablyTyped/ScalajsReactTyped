package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a range of cells that can be merged. */
trait XMergeable
  extends StObject
     with XInterface {
  
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  val IsMerged: Boolean
  
  /** @returns `TRUE` if the area specified by this object is merged, or `FALSE` otherwise. */
  def getIsMerged(): Boolean
  
  /** merges/unmerges the area specified by this object. */
  def merge(bMerge: Boolean): Unit
}
object XMergeable {
  
  inline def apply(
    IsMerged: Boolean,
    acquire: Callback,
    getIsMerged: CallbackTo[Boolean],
    merge: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XMergeable = {
    val __obj = js.Dynamic.literal(IsMerged = IsMerged.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIsMerged = getIsMerged.toJsFn, merge = js.Any.fromFunction1((t0: Boolean) => merge(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMergeable]
  }
  
  extension [Self <: XMergeable](x: Self) {
    
    inline def setGetIsMerged(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsMerged", value.toJsFn)
    
    inline def setIsMerged(value: Boolean): Self = StObject.set(x, "IsMerged", value.asInstanceOf[js.Any])
    
    inline def setMerge(value: Boolean => Callback): Self = StObject.set(x, "merge", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
