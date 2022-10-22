package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XModel} instead of this
  * @deprecated Deprecated
  */
trait XFrameSetModel
  extends StObject
     with XInterface {
  
  var Source: String
  
  def getSource(): String
  
  def setSource(Source: String): Unit
}
object XFrameSetModel {
  
  inline def apply(
    Source: String,
    acquire: Callback,
    getSource: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setSource: String => Callback
  ): XFrameSetModel = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSource = getSource.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setSource = js.Any.fromFunction1((t0: String) => setSource(t0).runNow()))
    __obj.asInstanceOf[XFrameSetModel]
  }
  
  extension [Self <: XFrameSetModel](x: Self) {
    
    inline def setGetSource(value: CallbackTo[String]): Self = StObject.set(x, "getSource", value.toJsFn)
    
    inline def setSetSource(value: String => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
