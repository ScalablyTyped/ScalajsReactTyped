package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.mount
import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenKey
  extends StObject
     with Operation {
  
  var children: Node
  
  var key: Double
  
  var `type`: mount
}
object ChildrenKey {
  
  inline def apply(key: Double): ChildrenKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], children = null)
    __obj.updateDynamic("type")("mount")
    __obj.asInstanceOf[ChildrenKey]
  }
  
  extension [Self <: ChildrenKey](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: mount): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
