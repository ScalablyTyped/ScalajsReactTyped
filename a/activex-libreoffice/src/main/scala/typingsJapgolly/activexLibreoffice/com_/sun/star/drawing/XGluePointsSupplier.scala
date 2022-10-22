package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** must be supported to provide access to a container of {@link GluePoint2} . */
trait XGluePointsSupplier
  extends StObject
     with XInterface {
  
  /** @returns a container of {@link GluePoint2} structs. */
  val GluePoints: XIndexContainer
  
  /** @returns a container of {@link GluePoint2} structs. */
  def getGluePoints(): XIndexContainer
}
object XGluePointsSupplier {
  
  inline def apply(
    GluePoints: XIndexContainer,
    acquire: Callback,
    getGluePoints: CallbackTo[XIndexContainer],
    queryInterface: `type` => Any,
    release: Callback
  ): XGluePointsSupplier = {
    val __obj = js.Dynamic.literal(GluePoints = GluePoints.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGluePoints = getGluePoints.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGluePointsSupplier]
  }
  
  extension [Self <: XGluePointsSupplier](x: Self) {
    
    inline def setGetGluePoints(value: CallbackTo[XIndexContainer]): Self = StObject.set(x, "getGluePoints", value.toJsFn)
    
    inline def setGluePoints(value: XIndexContainer): Self = StObject.set(x, "GluePoints", value.asInstanceOf[js.Any])
  }
}
