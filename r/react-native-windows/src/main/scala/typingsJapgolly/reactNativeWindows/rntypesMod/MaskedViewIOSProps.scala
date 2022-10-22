package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedViewIOSProps
  extends StObject
     with ViewProps {
  
  var maskElement: Element
}
object MaskedViewIOSProps {
  
  inline def apply(maskElement: VdomElement): MaskedViewIOSProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewIOSProps]
  }
  
  extension [Self <: MaskedViewIOSProps](x: Self) {
    
    inline def setMaskElement(value: VdomElement): Self = StObject.set(x, "maskElement", value.rawElement.asInstanceOf[js.Any])
  }
}
