package typingsJapgolly.reactFloater

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFloater.libTypesMod.HandlerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterCloseButtonMod {
  
  @JSImport("react-floater/lib/components/Floater/CloseButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOnClickStyles: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnClickStyles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var onClick: HandlerFunction[HTMLButtonElement]
    
    var styles: CSSProperties
  }
  object Props {
    
    inline def apply(
      onClick: /* event */ ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback,
      styles: CSSProperties
    ): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => onClick(t0).runNow()), styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnClick(value: /* event */ ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}
