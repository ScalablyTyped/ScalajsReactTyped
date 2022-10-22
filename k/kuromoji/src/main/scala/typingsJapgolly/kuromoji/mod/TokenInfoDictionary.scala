package typingsJapgolly.kuromoji.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenInfoDictionary extends StObject {
  
  def addMapping(source: Double, target: Double): Unit
  
  def buildDictionary(entries: js.Array[js.Array[Any]]): NumberDictionary[String]
  
  def getFeatures(token_info_id_str: String): String
  
  def loadDictionary(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary
  
  def loadPosVector(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary
  
  def loadTargetMap(array_buffer: js.typedarray.Uint8Array): TokenInfoDictionary
  
  def put(left_id: Double, right_id: Double, word_cost: Double, surface_form: String, feature: String): Double
  
  def targetMapToBuffer(): js.typedarray.Uint8Array
}
object TokenInfoDictionary {
  
  inline def apply(
    addMapping: (Double, Double) => Callback,
    buildDictionary: js.Array[js.Array[Any]] => NumberDictionary[String],
    getFeatures: String => String,
    loadDictionary: js.typedarray.Uint8Array => TokenInfoDictionary,
    loadPosVector: js.typedarray.Uint8Array => TokenInfoDictionary,
    loadTargetMap: js.typedarray.Uint8Array => TokenInfoDictionary,
    put: (Double, Double, Double, String, String) => Double,
    targetMapToBuffer: CallbackTo[js.typedarray.Uint8Array]
  ): TokenInfoDictionary = {
    val __obj = js.Dynamic.literal(addMapping = js.Any.fromFunction2((t0: Double, t1: Double) => (addMapping(t0, t1)).runNow()), buildDictionary = js.Any.fromFunction1(buildDictionary), getFeatures = js.Any.fromFunction1(getFeatures), loadDictionary = js.Any.fromFunction1(loadDictionary), loadPosVector = js.Any.fromFunction1(loadPosVector), loadTargetMap = js.Any.fromFunction1(loadTargetMap), put = js.Any.fromFunction5(put), targetMapToBuffer = targetMapToBuffer.toJsFn)
    __obj.asInstanceOf[TokenInfoDictionary]
  }
  
  extension [Self <: TokenInfoDictionary](x: Self) {
    
    inline def setAddMapping(value: (Double, Double) => Callback): Self = StObject.set(x, "addMapping", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setBuildDictionary(value: js.Array[js.Array[Any]] => NumberDictionary[String]): Self = StObject.set(x, "buildDictionary", js.Any.fromFunction1(value))
    
    inline def setGetFeatures(value: String => String): Self = StObject.set(x, "getFeatures", js.Any.fromFunction1(value))
    
    inline def setLoadDictionary(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadDictionary", js.Any.fromFunction1(value))
    
    inline def setLoadPosVector(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadPosVector", js.Any.fromFunction1(value))
    
    inline def setLoadTargetMap(value: js.typedarray.Uint8Array => TokenInfoDictionary): Self = StObject.set(x, "loadTargetMap", js.Any.fromFunction1(value))
    
    inline def setPut(value: (Double, Double, Double, String, String) => Double): Self = StObject.set(x, "put", js.Any.fromFunction5(value))
    
    inline def setTargetMapToBuffer(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "targetMapToBuffer", value.toJsFn)
  }
}
