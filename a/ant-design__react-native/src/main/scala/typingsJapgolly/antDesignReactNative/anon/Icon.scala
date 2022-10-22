package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: Element
  
  var text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.number, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.function, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
}
object Icon {
  
  inline def apply(
    icon: VdomElement,
    text: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.number, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.function, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
  ): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.rawElement.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setText(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 420, starting with typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.number, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.function, typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.audio */ Any
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
