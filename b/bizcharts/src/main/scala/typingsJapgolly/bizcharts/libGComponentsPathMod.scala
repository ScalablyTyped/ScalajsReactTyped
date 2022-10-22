package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Path
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsPathMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Path", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IImageProps
    extends StObject
       with IBaseProps {
    
    var attrs: Path
  }
  object IImageProps {
    
    inline def apply(attrs: Path): IImageProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageProps]
    }
    
    extension [Self <: IImageProps](x: Self) {
      
      inline def setAttrs(value: Path): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsPathMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = default
}
