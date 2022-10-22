package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.anon.Style
import typingsJapgolly.antvG2.libGeometryBaseMod.GeometryCfg
import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryIntervalMod {
  
  @JSImport("@antv/g2/lib/geometry/interval", JSImport.Default)
  @js.native
  open class default protected () extends Interval {
    def this(cfg: IntervalCfg) = this()
  }
  
  @js.native
  trait Interval
    extends typingsJapgolly.antvG2.libGeometryBaseMod.default[ShapePoint] {
    
    /** shape 背景。目前只对 interval-rect shape 生效。 */
    /* protected */ var background: js.UndefOr[Style] = js.native
  }
  
  trait IntervalCfg
    extends StObject
       with GeometryCfg {
    
    /** shape 背景，只对 Interval Geometry 生效，目前只对 interval-rect shape 生效。 */
    var background: js.UndefOr[Style] = js.undefined
  }
  object IntervalCfg {
    
    inline def apply(container: IGroup): IntervalCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalCfg]
    }
    
    extension [Self <: IntervalCfg](x: Self) {
      
      inline def setBackground(value: Style): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    }
  }
}
