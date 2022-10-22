package typingsJapgolly.reactIcofont

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactIcofont.reactIcofontStrings.`10`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`180`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`1`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`270`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`2`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`3`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`4`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`5`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`6`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`7`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`8`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`90`
import typingsJapgolly.reactIcofont.reactIcofontStrings.`9`
import typingsJapgolly.reactIcofont.reactIcofontStrings.h
import typingsJapgolly.reactIcofont.reactIcofontStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-icofont", JSImport.Default)
  @js.native
  open class default ()
    extends Component[IcofontProps, js.Object, Any]
  
  type Icofont = japgolly.scalajs.react.facade.React.Component[IcofontProps & js.Object, js.Object]
  
  trait IcofontProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var flip: js.UndefOr[h | v] = js.undefined
    
    var icon: String
    
    var rotate: js.UndefOr[`90` | `180` | `270`] = js.undefined
    
    var size: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`] = js.undefined
    
    var spin: js.UndefOr[Boolean] = js.undefined
  }
  object IcofontProps {
    
    inline def apply(icon: String): IcofontProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IcofontProps]
    }
    
    extension [Self <: IcofontProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFlip(value: h | v): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: `90` | `180` | `270`): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
}
