package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.closable
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeBarPropsTypeMod {
  
  trait NoticeBarPropsType extends StObject {
    
    var action: js.UndefOr[Element] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var mode: js.UndefOr[closable | link] = js.undefined
    
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NoticeBarPropsType {
    
    inline def apply(): NoticeBarPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeBarPropsType]
    }
    
    extension [Self <: NoticeBarPropsType](x: Self) {
      
      inline def setAction(value: VdomElement): Self = StObject.set(x, "action", value.rawElement.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMode(value: closable | link): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    }
  }
}
