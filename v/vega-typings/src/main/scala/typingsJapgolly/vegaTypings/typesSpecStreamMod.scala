package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.typesSpecExprMod.Expr
import typingsJapgolly.vegaTypings.typesSpecMarktypeMod.MarkType
import typingsJapgolly.vegaTypings.typesSpecOnEventsMod.EventListener
import typingsJapgolly.vegaTypings.vegaTypingsStrings.scope
import typingsJapgolly.vegaTypings.vegaTypingsStrings.view
import typingsJapgolly.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecStreamMod {
  
  trait DerivedStream
    extends StObject
       with StreamParameters
       with Stream {
    
    var stream: Stream
  }
  object DerivedStream {
    
    inline def apply(stream: Stream): DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[DerivedStream]
    }
    
    extension [Self <: DerivedStream](x: Self) {
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  type EventSource = (js.UndefOr[view | scope | window]) & js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.anon.sourceviewscopeundefinedt
    - typingsJapgolly.vegaTypings.anon.sourcewindowtypeWindowEveBetween
  */
  trait EventStream
    extends StObject
       with Stream
  object EventStream {
    
    inline def sourceviewscopeundefinedt(`type`: EventType): typingsJapgolly.vegaTypings.anon.sourceviewscopeundefinedt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.sourceviewscopeundefinedt]
    }
    
    inline def sourcewindowtypeWindowEveBetween(`type`: WindowEventType): typingsJapgolly.vegaTypings.anon.sourcewindowtypeWindowEveBetween = {
      val __obj = js.Dynamic.literal(source = "window")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.sourcewindowtypeWindowEveBetween]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.click
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dblclick
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dragenter
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dragleave
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.dragover
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.keydown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.keypress
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.keyup
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mousedown
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mousemove
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseout
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseover
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseup
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.mousewheel
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.timer
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.touchend
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.touchmove
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.touchstart
    - typingsJapgolly.vegaTypings.vegaTypingsStrings.wheel
  */
  trait EventType extends StObject
  object EventType {
    
    inline def click: typingsJapgolly.vegaTypings.vegaTypingsStrings.click = "click".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.click]
    
    inline def dblclick: typingsJapgolly.vegaTypings.vegaTypingsStrings.dblclick = "dblclick".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dblclick]
    
    inline def dragenter: typingsJapgolly.vegaTypings.vegaTypingsStrings.dragenter = "dragenter".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dragenter]
    
    inline def dragleave: typingsJapgolly.vegaTypings.vegaTypingsStrings.dragleave = "dragleave".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dragleave]
    
    inline def dragover: typingsJapgolly.vegaTypings.vegaTypingsStrings.dragover = "dragover".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.dragover]
    
    inline def keydown: typingsJapgolly.vegaTypings.vegaTypingsStrings.keydown = "keydown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.keydown]
    
    inline def keypress: typingsJapgolly.vegaTypings.vegaTypingsStrings.keypress = "keypress".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.keypress]
    
    inline def keyup: typingsJapgolly.vegaTypings.vegaTypingsStrings.keyup = "keyup".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.keyup]
    
    inline def mousedown: typingsJapgolly.vegaTypings.vegaTypingsStrings.mousedown = "mousedown".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mousedown]
    
    inline def mousemove: typingsJapgolly.vegaTypings.vegaTypingsStrings.mousemove = "mousemove".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mousemove]
    
    inline def mouseout: typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseout = "mouseout".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseout]
    
    inline def mouseover: typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseover = "mouseover".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseover]
    
    inline def mouseup: typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseup = "mouseup".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mouseup]
    
    inline def mousewheel: typingsJapgolly.vegaTypings.vegaTypingsStrings.mousewheel = "mousewheel".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.mousewheel]
    
    inline def timer: typingsJapgolly.vegaTypings.vegaTypingsStrings.timer = "timer".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.timer]
    
    inline def touchend: typingsJapgolly.vegaTypings.vegaTypingsStrings.touchend = "touchend".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.touchend]
    
    inline def touchmove: typingsJapgolly.vegaTypings.vegaTypingsStrings.touchmove = "touchmove".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.touchmove]
    
    inline def touchstart: typingsJapgolly.vegaTypings.vegaTypingsStrings.touchstart = "touchstart".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.touchstart]
    
    inline def wheel: typingsJapgolly.vegaTypings.vegaTypingsStrings.wheel = "wheel".asInstanceOf[typingsJapgolly.vegaTypings.vegaTypingsStrings.wheel]
  }
  
  trait MergedStream
    extends StObject
       with StreamParameters
       with Stream {
    
    var merge: js.Array[Stream]
  }
  object MergedStream {
    
    inline def apply(merge: js.Array[Stream]): MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergedStream]
    }
    
    extension [Self <: MergedStream](x: Self) {
      
      inline def setMerge(value: js.Array[Stream]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeVarargs(value: Stream*): Self = StObject.set(x, "merge", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.typesSpecStreamMod.EventStream
    - typingsJapgolly.vegaTypings.typesSpecStreamMod.DerivedStream
    - typingsJapgolly.vegaTypings.typesSpecStreamMod.MergedStream
  */
  trait Stream
    extends StObject
       with EventListener
  object Stream {
    
    inline def DerivedStream(stream: Stream): typingsJapgolly.vegaTypings.typesSpecStreamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecStreamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typingsJapgolly.vegaTypings.typesSpecStreamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecStreamMod.MergedStream]
    }
    
    inline def sourceviewscopeundefinedt(`type`: EventType): typingsJapgolly.vegaTypings.anon.sourceviewscopeundefinedt = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.sourceviewscopeundefinedt]
    }
    
    inline def sourcewindowtypeWindowEveBetween(`type`: WindowEventType): typingsJapgolly.vegaTypings.anon.sourcewindowtypeWindowEveBetween = {
      val __obj = js.Dynamic.literal(source = "window")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.sourcewindowtypeWindowEveBetween]
    }
  }
  
  trait StreamParameters extends StObject {
    
    var between: js.UndefOr[js.Array[Stream]] = js.undefined
    
    var consume: js.UndefOr[Boolean] = js.undefined
    
    var debounce: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[Expr | js.Array[Expr]] = js.undefined
    
    var markname: js.UndefOr[String] = js.undefined
    
    var marktype: js.UndefOr[MarkType] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object StreamParameters {
    
    inline def apply(): StreamParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamParameters]
    }
    
    extension [Self <: StreamParameters](x: Self) {
      
      inline def setBetween(value: js.Array[Stream]): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setBetweenVarargs(value: Stream*): Self = StObject.set(x, "between", js.Array(value*))
      
      inline def setConsume(value: Boolean): Self = StObject.set(x, "consume", value.asInstanceOf[js.Any])
      
      inline def setConsumeUndefined: Self = StObject.set(x, "consume", js.undefined)
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setFilter(value: Expr | js.Array[Expr]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: Expr*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setMarkname(value: String): Self = StObject.set(x, "markname", value.asInstanceOf[js.Any])
      
      inline def setMarknameUndefined: Self = StObject.set(x, "markname", js.undefined)
      
      inline def setMarktype(value: MarkType): Self = StObject.set(x, "marktype", value.asInstanceOf[js.Any])
      
      inline def setMarktypeUndefined: Self = StObject.set(x, "marktype", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  type WindowEventType = EventType | String
}
