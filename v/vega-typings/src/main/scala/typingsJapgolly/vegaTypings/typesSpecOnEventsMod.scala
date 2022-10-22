package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.typesSpecExprMod.Expr
import typingsJapgolly.vegaTypings.typesSpecSelectorMod.EventSelector
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalValue
import typingsJapgolly.vegaTypings.typesSpecStreamMod.EventType
import typingsJapgolly.vegaTypings.typesSpecStreamMod.Stream
import typingsJapgolly.vegaTypings.typesSpecStreamMod.WindowEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSpecOnEventsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
    - typingsJapgolly.vegaTypings.anon.ScaleString
    - typingsJapgolly.vegaTypings.typesSpecStreamMod.Stream
  */
  trait EventListener extends StObject
  object EventListener {
    
    inline def DerivedStream(stream: Stream): typingsJapgolly.vegaTypings.typesSpecStreamMod.DerivedStream = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecStreamMod.DerivedStream]
    }
    
    inline def MergedStream(merge: js.Array[Stream]): typingsJapgolly.vegaTypings.typesSpecStreamMod.MergedStream = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecStreamMod.MergedStream]
    }
    
    inline def ScaleString(scale: String): typingsJapgolly.vegaTypings.anon.ScaleString = {
      val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.ScaleString]
    }
    
    inline def SignalRef(signal: String): typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef]
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
  
  type Events = EventSelector | EventListener
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.anon.encodestringeventsEventsA
    - typingsJapgolly.vegaTypings.anon.updateUpdateeventsEventsA
  */
  trait OnEvent extends StObject
  object OnEvent {
    
    inline def encodestringeventsEventsA(encode: String, events: Events | js.Array[EventListener]): typingsJapgolly.vegaTypings.anon.encodestringeventsEventsA = {
      val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.encodestringeventsEventsA]
    }
    
    inline def updateUpdateeventsEventsA(events: Events | js.Array[EventListener], update: Update): typingsJapgolly.vegaTypings.anon.updateUpdateeventsEventsA = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.updateUpdateeventsEventsA]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.typesSpecExprMod.Expr
    - typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef
    - typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
    - typingsJapgolly.vegaTypings.anon.ValueSignalValue
  */
  type Update = _Update | Expr
  
  trait _Update extends StObject
  object _Update {
    
    inline def ExprRef(expr: Expr): typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef = {
      val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecExprMod.ExprRef]
    }
    
    inline def SignalRef(signal: String): typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef = {
      val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef]
    }
    
    inline def ValueSignalValue(value: SignalValue): typingsJapgolly.vegaTypings.anon.ValueSignalValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaTypings.anon.ValueSignalValue]
    }
  }
}
