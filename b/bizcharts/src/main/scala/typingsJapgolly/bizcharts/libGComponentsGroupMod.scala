package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsGroupMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Group", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IGroupProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IGroupProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var translate: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object IGroupProps {
    
    inline def apply(): IGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGroupProps]
    }
    
    extension [Self <: IGroupProps](x: Self) {
      
      inline def setTranslate(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IGroupProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsGroupMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IGroupProps, String | Double]) & RefAttributes[Any]] = default
}
