package typingsJapgolly.tizenTvWebapis.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AVPlaySoundAnalysisCallback extends StObject {
  
  /**
    * Provide the Band Array[32] having sound effect information.
    *
    * @param band long Band Array[32] having sound effect information
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def ongetbandsarray(band: js.Array[Double]): Unit
  
  /**
    * Required forerror handling.
    *
    * @param err WebAPIError
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def ongetexception(err: WebAPIError): Unit
  
  /**
    * set for error handling.
    *
    * @param err WebAPIError
    *
    * @returns void
    *
    * @version 1.0
    *
    * @note `deprecated` 2.4
    *
    * @since 2.3
    */
  def onsetexception(err: WebAPIError): Unit
}
object AVPlaySoundAnalysisCallback {
  
  inline def apply(
    ongetbandsarray: js.Array[Double] => Callback,
    ongetexception: WebAPIError => Callback,
    onsetexception: WebAPIError => Callback
  ): AVPlaySoundAnalysisCallback = {
    val __obj = js.Dynamic.literal(ongetbandsarray = js.Any.fromFunction1((t0: js.Array[Double]) => ongetbandsarray(t0).runNow()), ongetexception = js.Any.fromFunction1((t0: WebAPIError) => ongetexception(t0).runNow()), onsetexception = js.Any.fromFunction1((t0: WebAPIError) => onsetexception(t0).runNow()))
    __obj.asInstanceOf[AVPlaySoundAnalysisCallback]
  }
  
  extension [Self <: AVPlaySoundAnalysisCallback](x: Self) {
    
    inline def setOngetbandsarray(value: js.Array[Double] => Callback): Self = StObject.set(x, "ongetbandsarray", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setOngetexception(value: WebAPIError => Callback): Self = StObject.set(x, "ongetexception", js.Any.fromFunction1((t0: WebAPIError) => value(t0).runNow()))
    
    inline def setOnsetexception(value: WebAPIError => Callback): Self = StObject.set(x, "onsetexception", js.Any.fromFunction1((t0: WebAPIError) => value(t0).runNow()))
  }
}
