package typingsJapgolly.reactMosaicComponent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactMosaicComponent.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonsMosaicButtonMod {
  
  @JSImport("react-mosaic-component/lib/buttons/MosaicButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DefaultToolbarButton(hasTitleClassNameOnClickText: ClassName): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultToolbarButton")(hasTitleClassNameOnClickText.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element], Any]
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultToolbarButton")(title.asInstanceOf[js.Any], className.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def createDefaultToolbarButton(
    title: String,
    className: String,
    onClick: js.Function1[/* event */ ReactMouseEventFrom[Any & org.scalajs.dom.Element], Any],
    text: String
  ): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultToolbarButton")(title.asInstanceOf[js.Any], className.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  trait MosaicButtonProps extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object MosaicButtonProps {
    
    inline def apply(): MosaicButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MosaicButtonProps]
    }
    
    extension [Self <: MosaicButtonProps](x: Self) {
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
