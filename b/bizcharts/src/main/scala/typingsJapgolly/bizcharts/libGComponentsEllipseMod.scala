package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Rx
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsEllipseMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Ellipse", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IEllipseProps
    extends StObject
       with IBaseProps {
    
    var attrs: Rx
  }
  object IEllipseProps {
    
    inline def apply(attrs: Rx): IEllipseProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEllipseProps]
    }
    
    extension [Self <: IEllipseProps](x: Self) {
      
      inline def setAttrs(value: Rx): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsEllipseMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = default
}
