package typingsJapgolly.bizcharts

import typingsJapgolly.bizcharts.bizchartsStrings.`line-advance`
import typingsJapgolly.bizcharts.bizchartsStrings.area
import typingsJapgolly.bizcharts.bizchartsStrings.edge
import typingsJapgolly.bizcharts.bizchartsStrings.heatmap
import typingsJapgolly.bizcharts.bizchartsStrings.interval
import typingsJapgolly.bizcharts.bizchartsStrings.line
import typingsJapgolly.bizcharts.bizchartsStrings.point
import typingsJapgolly.bizcharts.bizchartsStrings.polygon
import typingsJapgolly.bizcharts.libInterfaceMod.IBaseGemoProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryMod {
  
  @JSImport("bizcharts/lib/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: IGemo): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IGemo
    extends StObject
       with IBaseGemoProps {
    
    /** 几何标记类型 */
    var `type`: area | edge | heatmap | interval | line | point | polygon | `line-advance`
  }
  object IGemo {
    
    inline def apply(
      position: String,
      `type`: area | edge | heatmap | interval | line | point | polygon | `line-advance`
    ): IGemo = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGemo]
    }
    
    extension [Self <: IGemo](x: Self) {
      
      inline def setType(value: area | edge | heatmap | interval | line | point | polygon | `line-advance`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
