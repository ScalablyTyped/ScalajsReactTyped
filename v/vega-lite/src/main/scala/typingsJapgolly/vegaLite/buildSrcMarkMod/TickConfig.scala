package typingsJapgolly.vegaLite.buildSrcMarkMod

import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.vegaLite.buildSrcMarkMod.AnyMarkConfig because Already inherited */ trait TickConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with MarkConfig[ES]
     with TickThicknessMixins {
  
  /**
    * The width of the ticks.
    *
    * __Default value:__  3/4 of step (width step for horizontal ticks and height step for vertical ticks).
    * @minimum 0
    */
  var bandSize: js.UndefOr[Double] = js.undefined
}
object TickConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): TickConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickConfig[ES]]
  }
  
  extension [Self <: TickConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & TickConfig[ES]) {
    
    inline def setBandSize(value: Double): Self = StObject.set(x, "bandSize", value.asInstanceOf[js.Any])
    
    inline def setBandSizeUndefined: Self = StObject.set(x, "bandSize", js.undefined)
  }
}
