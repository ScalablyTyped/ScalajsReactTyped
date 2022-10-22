package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a source for an image. */
trait XImageProducer
  extends StObject
     with XInterface {
  
  /**
    * registers an image consumer with the image producer for accessing the image data during a later reconstruction of the image.
    *
    * The image producer may, at its discretion, start delivering the image data to the consumer using the {@link XImageConsumer} interface immediately, or
    * when the next available image reconstruction is triggered by a call to the startProduction method.
    */
  def addConsumer(xConsumer: XImageConsumer): Unit
  
  /**
    * removes the given {@link com.sun.star.awt.XImageConsumer} callback from the list of consumers currently registered to receive image data.
    *
    * It is not considered an error to remove a consumer that is not currently registered. The image producer should stop sending data to this consumer as
    * soon as it is feasible.
    */
  def removeConsumer(xConsumer: XImageConsumer): Unit
  
  /**
    * registers the given image consumer as a consumer and starts an immediate reconstruction of the image data.
    *
    * The image data will then be delivered to this consumer and any other consumer which may have already been registered with the producer. This method
    * differs from the addConsumer method in that a reproduction of the image data should be triggered as soon as possible.
    */
  def startProduction(): Unit
}
object XImageProducer {
  
  inline def apply(
    acquire: Callback,
    addConsumer: XImageConsumer => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeConsumer: XImageConsumer => Callback,
    startProduction: Callback
  ): XImageProducer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addConsumer = js.Any.fromFunction1((t0: XImageConsumer) => addConsumer(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeConsumer = js.Any.fromFunction1((t0: XImageConsumer) => removeConsumer(t0).runNow()), startProduction = startProduction.toJsFn)
    __obj.asInstanceOf[XImageProducer]
  }
  
  extension [Self <: XImageProducer](x: Self) {
    
    inline def setAddConsumer(value: XImageConsumer => Callback): Self = StObject.set(x, "addConsumer", js.Any.fromFunction1((t0: XImageConsumer) => value(t0).runNow()))
    
    inline def setRemoveConsumer(value: XImageConsumer => Callback): Self = StObject.set(x, "removeConsumer", js.Any.fromFunction1((t0: XImageConsumer) => value(t0).runNow()))
    
    inline def setStartProduction(value: Callback): Self = StObject.set(x, "startProduction", value.toJsFn)
  }
}
