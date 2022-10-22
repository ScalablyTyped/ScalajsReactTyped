package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cascader extends StObject {
  
  var cascader: js.Object | Element
}
object Cascader {
  
  inline def apply(cascader: js.Object | Element): Cascader = {
    val __obj = js.Dynamic.literal(cascader = cascader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascader]
  }
  
  extension [Self <: Cascader](x: Self) {
    
    inline def setCascader(value: js.Object | Element): Self = StObject.set(x, "cascader", value.asInstanceOf[js.Any])
    
    inline def setCascaderVdomElement(value: VdomElement): Self = StObject.set(x, "cascader", value.rawElement.asInstanceOf[js.Any])
  }
}
