package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Points
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsPolygonMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Polygon", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IPolygonProps
    extends StObject
       with IBaseProps {
    
    var attrs: Points
  }
  object IPolygonProps {
    
    inline def apply(attrs: Points): IPolygonProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPolygonProps]
    }
    
    extension [Self <: IPolygonProps](x: Self) {
      
      inline def setAttrs(value: Points): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsPolygonMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = default
}
