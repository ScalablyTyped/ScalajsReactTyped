package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XImageProducer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the access to an image producer.
  * @see com.sun.star.awt.XImageProducer
  */
trait XImageProducerSupplier
  extends StObject
     with XInterface {
  
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  val ImageProducer: XImageProducer
  
  /**
    * accesses the image producer.
    * @returns the image producer.
    */
  def getImageProducer(): XImageProducer
}
object XImageProducerSupplier {
  
  inline def apply(
    ImageProducer: XImageProducer,
    acquire: Callback,
    getImageProducer: CallbackTo[XImageProducer],
    queryInterface: `type` => Any,
    release: Callback
  ): XImageProducerSupplier = {
    val __obj = js.Dynamic.literal(ImageProducer = ImageProducer.asInstanceOf[js.Any], acquire = acquire.toJsFn, getImageProducer = getImageProducer.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XImageProducerSupplier]
  }
  
  extension [Self <: XImageProducerSupplier](x: Self) {
    
    inline def setGetImageProducer(value: CallbackTo[XImageProducer]): Self = StObject.set(x, "getImageProducer", value.toJsFn)
    
    inline def setImageProducer(value: XImageProducer): Self = StObject.set(x, "ImageProducer", value.asInstanceOf[js.Any])
  }
}
