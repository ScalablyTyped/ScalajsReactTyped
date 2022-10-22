package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Dictkey
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsCircleMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Circle", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[ICircleProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait ICircleProps
    extends StObject
       with IBaseProps {
    
    var attrs: Dictkey
  }
  object ICircleProps {
    
    inline def apply(attrs: Dictkey): ICircleProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICircleProps]
    }
    
    extension [Self <: ICircleProps](x: Self) {
      
      inline def setAttrs(value: Dictkey): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[ICircleProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsCircleMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[ICircleProps, String | Double]) & RefAttributes[Any]] = default
}
