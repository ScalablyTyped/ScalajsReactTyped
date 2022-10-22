package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Key Collector.
  *
  * This interface is used to manipulate key materials.
  */
trait XKeyCollector
  extends StObject
     with XInterface {
  
  /**
    * Set the keeper id of the key element.
    * @param id the keeper id of the key element. If the id is 0, then it represents that this security entity has included its key material internally.
    */
  def setKeyId(id: Double): Unit
}
object XKeyCollector {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, setKeyId: Double => Callback): XKeyCollector = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setKeyId = js.Any.fromFunction1((t0: Double) => setKeyId(t0).runNow()))
    __obj.asInstanceOf[XKeyCollector]
  }
  
  extension [Self <: XKeyCollector](x: Self) {
    
    inline def setSetKeyId(value: Double => Callback): Self = StObject.set(x, "setKeyId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
