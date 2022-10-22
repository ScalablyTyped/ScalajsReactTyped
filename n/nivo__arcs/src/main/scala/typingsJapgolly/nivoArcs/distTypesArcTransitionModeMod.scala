package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.anon.Enter
import typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArc
import typingsJapgolly.nivoArcs.nivoArcsStrings.centerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.endAngle
import typingsJapgolly.nivoArcs.nivoArcsStrings.innerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.middleAngle
import typingsJapgolly.nivoArcs.nivoArcsStrings.outerRadius
import typingsJapgolly.nivoArcs.nivoArcsStrings.pushIn
import typingsJapgolly.nivoArcs.nivoArcsStrings.pushOut
import typingsJapgolly.nivoArcs.nivoArcsStrings.startAngle
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcTransitionModeMod {
  
  @JSImport("@nivo/arcs/dist/types/arcTransitionMode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/arcs/dist/types/arcTransitionMode", "arcTransitionModeById")
  @js.native
  val arcTransitionModeById: Record[ArcTransitionMode, ArcTransitionModeConfig] = js.native
  
  @JSImport("@nivo/arcs/dist/types/arcTransitionMode", "arcTransitionModes")
  @js.native
  val arcTransitionModes: js.Tuple8[startAngle, middleAngle, endAngle, innerRadius, centerRadius, outerRadius, pushIn, pushOut] = js.native
  
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode): Enter[Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any]).asInstanceOf[Enter[Datum]]
  inline def useArcTransitionMode[Datum /* <: DatumWithArc */, ExtraProps](mode: ArcTransitionMode, extraTransition: TransitionExtra[Datum, ExtraProps]): Enter[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcTransitionMode")(mode.asInstanceOf[js.Any], extraTransition.asInstanceOf[js.Any])).asInstanceOf[Enter[Datum]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoArcs.nivoArcsStrings.startAngle
    - typingsJapgolly.nivoArcs.nivoArcsStrings.middleAngle
    - typingsJapgolly.nivoArcs.nivoArcsStrings.endAngle
    - typingsJapgolly.nivoArcs.nivoArcsStrings.innerRadius
    - typingsJapgolly.nivoArcs.nivoArcsStrings.centerRadius
    - typingsJapgolly.nivoArcs.nivoArcsStrings.outerRadius
    - typingsJapgolly.nivoArcs.nivoArcsStrings.pushIn
    - typingsJapgolly.nivoArcs.nivoArcsStrings.pushOut
  */
  trait ArcTransitionMode extends StObject
  
  trait ArcTransitionModeConfig extends StObject {
    
    def enter(arc: Arc): Arc
    
    def leave(arc: Arc): Arc
    
    def update(arc: Arc): Arc
  }
  object ArcTransitionModeConfig {
    
    inline def apply(enter: Arc => Arc, leave: Arc => Arc, update: Arc => Arc): ArcTransitionModeConfig = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), leave = js.Any.fromFunction1(leave), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[ArcTransitionModeConfig]
    }
    
    extension [Self <: ArcTransitionModeConfig](x: Self) {
      
      inline def setEnter(value: Arc => Arc): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setLeave(value: Arc => Arc): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Arc => Arc): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait TransitionExtra[Datum /* <: DatumWithArc */, ExtraProps] extends StObject {
    
    def enter(datum: Datum): ExtraProps
    
    def leave(datum: Datum): ExtraProps
    
    def update(datum: Datum): ExtraProps
  }
  object TransitionExtra {
    
    inline def apply[Datum /* <: DatumWithArc */, ExtraProps](enter: Datum => ExtraProps, leave: Datum => ExtraProps, update: Datum => ExtraProps): TransitionExtra[Datum, ExtraProps] = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction1(enter), leave = js.Any.fromFunction1(leave), update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[TransitionExtra[Datum, ExtraProps]]
    }
    
    extension [Self <: TransitionExtra[?, ?], Datum /* <: DatumWithArc */, ExtraProps](x: Self & (TransitionExtra[Datum, ExtraProps])) {
      
      inline def setEnter(value: Datum => ExtraProps): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setLeave(value: Datum => ExtraProps): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Datum => ExtraProps): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
