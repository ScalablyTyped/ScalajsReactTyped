package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Radius
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsRectMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Rect", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IRectProps
    extends StObject
       with IBaseProps {
    
    var attrs: Radius
  }
  object IRectProps {
    
    inline def apply(attrs: Radius): IRectProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRectProps]
    }
    
    extension [Self <: IRectProps](x: Self) {
      
      inline def setAttrs(value: Radius): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsRectMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = default
}
