package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSize
import typingsJapgolly.reactMdUtils.typesSizingUseAppSizeMediaMod.AppSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSizingAppSizeListenerMod {
  
  @JSImport("@react-md/utils/types/sizing/AppSizeListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AppSizeListener(
    hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize: AppSizeListenerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AppSizeListener")(hasChildrenOnChangePhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSize.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AppSizeListenerProps
    extends StObject
       with AppSizeOptions {
    
    var children: Node
    
    /**
      * An change handler for the app size. This will be called each time the app
      * size changes based on a window resize event and will be provided the next
      * size and the previous size.
      */
    var onChange: js.UndefOr[js.Function2[/* nextSize */ AppSize, /* lastSize */ AppSize, Unit]] = js.undefined
  }
  object AppSizeListenerProps {
    
    inline def apply(): AppSizeListenerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[AppSizeListenerProps]
    }
    
    extension [Self <: AppSizeListenerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnChange(value: (/* nextSize */ AppSize, /* lastSize */ AppSize) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* nextSize */ AppSize, t1: /* lastSize */ AppSize) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
