package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.anon.Text
import typingsJapgolly.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsTextMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Text", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait ITextProps
    extends StObject
       with IBaseProps {
    
    var attrs: Text
  }
  object ITextProps {
    
    inline def apply(attrs: Text): ITextProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextProps]
    }
    
    extension [Self <: ITextProps](x: Self) {
      
      inline def setAttrs(value: Text): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsTextMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = default
}
