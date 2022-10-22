package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.ID
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.Stream
import typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod.expr
import typingsJapgolly.vegaTypings.typesSpecStreamMod.WindowEventType
import typingsJapgolly.vegaTypings.vegaTypingsBooleans.`true`
import typingsJapgolly.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  source :'window',   type :vega-typings.vega-typings.WindowEventType} & {  id :vega-typings.vega-typings/types/runtime/runtime.ID,   between :[vega-typings.vega-typings/types/runtime/runtime.ID, vega-typings.vega-typings/types/runtime/runtime.ID] | undefined,   filter :vega-typings.vega-typings/types/runtime/runtime.expr | undefined,   throttle :number | undefined,   debounce :number | undefined,   consume :true | undefined} */
trait sourcewindowtypeWindowEve
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
  
  var source: window
  
  var throttle: js.UndefOr[Double] = js.undefined
  
  var `type`: WindowEventType
}
object sourcewindowtypeWindowEve {
  
  inline def apply(id: ID, `type`: WindowEventType): sourcewindowtypeWindowEve = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], source = "window")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[sourcewindowtypeWindowEve]
  }
  
  extension [Self <: sourcewindowtypeWindowEve](x: Self) {
    
    inline def setBetween(value: js.Tuple2[ID, ID]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
    
    inline def setConsume(value: `true`): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
    
    inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setFilter(value: expr): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: window): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setType(value: WindowEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
