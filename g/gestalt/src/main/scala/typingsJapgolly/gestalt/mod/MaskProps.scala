package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltInts.`0`
import typingsJapgolly.gestalt.gestaltInts.`1`
import typingsJapgolly.gestalt.gestaltInts.`2`
import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltInts.`7`
import typingsJapgolly.gestalt.gestaltInts.`8`
import typingsJapgolly.gestalt.gestaltStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var rounding: js.UndefOr[circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  
  var wash: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var willChangeTransform: js.UndefOr[Boolean] = js.undefined
}
object MaskProps {
  
  inline def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  
  extension [Self <: MaskProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setRoundingUndefined: Self = StObject.set(x, "rounding", js.undefined)
    
    inline def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
    
    inline def setWashUndefined: Self = StObject.set(x, "wash", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWillChangeTransform(value: Boolean): Self = StObject.set(x, "willChangeTransform", value.asInstanceOf[js.Any])
    
    inline def setWillChangeTransformUndefined: Self = StObject.set(x, "willChangeTransform", js.undefined)
  }
}
