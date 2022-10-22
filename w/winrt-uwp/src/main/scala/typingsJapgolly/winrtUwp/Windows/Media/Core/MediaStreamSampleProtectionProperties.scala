package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
trait MediaStreamSampleProtectionProperties extends StObject {
  
  /**
    * Gets the Digital Rights Management (DRM) initialization vector from the MediaStreamSample .
    * @return The initialization vector.
    */
  def getInitializationVector(): js.Array[Double]
  
  /**
    * Gets the Digital Rights Management (DRM) key identifier from the MediaStreamSample .
    * @return Receives the key identifier used to decrypt the data.
    */
  def getKeyIdentifier(): js.Array[Double]
  
  /**
    * Gets the Digital Rights Management (DRM) sub-sample mapping from the MediaStreamSample .
    * @return Receives the sub-sample mapping.
    */
  def getSubSampleMapping(): js.Array[Double]
  
  /**
    * Sets the Digital Rights Management (DRM) initialization vector for the MediaStreamSample .
    * @param value The value to set the DRM initialization vector to.
    */
  def setInitializationVector(value: js.Array[Double]): Unit
  
  /**
    * Sets the Digital Rights Management (DRM) key identifier for the MediaStreamSample .
    * @param value The value to set the DRM key identifier to.
    */
  def setKeyIdentifier(value: js.Array[Double]): Unit
  
  /**
    * Sets the Digital Rights Management (DRM) sub-sample mapping for the MediaStreamSample .
    * @param value The value to set the DRM sub-sample mapping to.
    */
  def setSubSampleMapping(value: js.Array[Double]): Unit
}
object MediaStreamSampleProtectionProperties {
  
  inline def apply(
    getInitializationVector: CallbackTo[js.Array[Double]],
    getKeyIdentifier: CallbackTo[js.Array[Double]],
    getSubSampleMapping: CallbackTo[js.Array[Double]],
    setInitializationVector: js.Array[Double] => Callback,
    setKeyIdentifier: js.Array[Double] => Callback,
    setSubSampleMapping: js.Array[Double] => Callback
  ): MediaStreamSampleProtectionProperties = {
    val __obj = js.Dynamic.literal(getInitializationVector = getInitializationVector.toJsFn, getKeyIdentifier = getKeyIdentifier.toJsFn, getSubSampleMapping = getSubSampleMapping.toJsFn, setInitializationVector = js.Any.fromFunction1((t0: js.Array[Double]) => setInitializationVector(t0).runNow()), setKeyIdentifier = js.Any.fromFunction1((t0: js.Array[Double]) => setKeyIdentifier(t0).runNow()), setSubSampleMapping = js.Any.fromFunction1((t0: js.Array[Double]) => setSubSampleMapping(t0).runNow()))
    __obj.asInstanceOf[MediaStreamSampleProtectionProperties]
  }
  
  extension [Self <: MediaStreamSampleProtectionProperties](x: Self) {
    
    inline def setGetInitializationVector(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getInitializationVector", value.toJsFn)
    
    inline def setGetKeyIdentifier(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getKeyIdentifier", value.toJsFn)
    
    inline def setGetSubSampleMapping(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getSubSampleMapping", value.toJsFn)
    
    inline def setSetInitializationVector(value: js.Array[Double] => Callback): Self = StObject.set(x, "setInitializationVector", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSetKeyIdentifier(value: js.Array[Double] => Callback): Self = StObject.set(x, "setKeyIdentifier", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSetSubSampleMapping(value: js.Array[Double] => Callback): Self = StObject.set(x, "setSubSampleMapping", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
  }
}
