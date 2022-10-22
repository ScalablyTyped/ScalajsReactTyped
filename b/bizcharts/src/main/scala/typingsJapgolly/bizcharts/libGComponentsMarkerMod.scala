package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.R
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsMarkerMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Marker", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IMarkerProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IMarkerProps
    extends StObject
       with IBaseProps {
    
    var attrs: R
  }
  object IMarkerProps {
    
    inline def apply(attrs: R): IMarkerProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMarkerProps]
    }
    
    extension [Self <: IMarkerProps](x: Self) {
      
      inline def setAttrs(value: R): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IMarkerProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsMarkerMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IMarkerProps, String | Double]) & RefAttributes[Any]] = default
}
