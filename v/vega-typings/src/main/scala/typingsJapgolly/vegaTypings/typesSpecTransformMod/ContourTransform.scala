package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaTypings.anon.countnumberSignalRefundef
  - typingsJapgolly.vegaTypings.anon.thresholdsArraynumberSign
*/
trait ContourTransform
  extends StObject
     with Transforms
object ContourTransform {
  
  inline def countnumberSignalRefundef(size: (js.Array[Double | SignalRef]) | SignalRef): typingsJapgolly.vegaTypings.anon.countnumberSignalRefundef = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.countnumberSignalRefundef]
  }
  
  inline def thresholdsArraynumberSign(size: (js.Array[Double | SignalRef]) | SignalRef): typingsJapgolly.vegaTypings.anon.thresholdsArraynumberSign = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("contour")
    __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.thresholdsArraynumberSign]
  }
}
