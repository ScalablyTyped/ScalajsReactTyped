package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ID
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.Stream
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.expr
import typingsJapgolly.vegaTypings.vegaTypingsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  stream :vega-typings.vega-typings/types/runtime/runtime.ID} & {  id :vega-typings.vega-typings/types/runtime/runtime.ID,   between :[vega-typings.vega-typings/types/runtime/runtime.ID, vega-typings.vega-typings/types/runtime/runtime.ID] | undefined,   filter :vega-typings.vega-typings/types/runtime/runtime.expr | undefined,   throttle :number | undefined,   debounce :number | undefined,   consume :true | undefined} */
trait streamIDidIDbetweenIDIDun
  extends StObject
     with Stream {
  
  /**
    * from parsers/stream.js:streamParameters
    * Currently, only merged or streams that reference another stream use these
    * parameters, but in the vega runtime any stream can have them
    */
  /**
    * Filter this stream for events that happen after an event from the first
    * stream and before an event in the second.
    */
  var between: js.UndefOr[js.Tuple2[ID, ID]] = js.undefined
  
  /**
    * Whether to stop native event propagation
    */
  var consume: js.UndefOr[`true`] = js.undefined
  
  var debounce: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[expr] = js.undefined
  
  var id: ID
  
  var stream: ID
  
  var throttle: js.UndefOr[Double] = js.undefined
}
object streamIDidIDbetweenIDIDun {
  
  inline def apply(id: ID, stream: ID): streamIDidIDbetweenIDIDun = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamIDidIDbetweenIDIDun]
  }
  
  extension [Self <: streamIDidIDbetweenIDIDun](x: Self) {
    
    inline def setBetween(value: js.Tuple2[ID, ID]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setConsume(value: `true`): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setFilter(value: expr): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStream(value: ID): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
  }
}
