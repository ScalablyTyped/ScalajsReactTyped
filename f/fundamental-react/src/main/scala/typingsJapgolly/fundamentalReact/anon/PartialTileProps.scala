package typingsJapgolly.fundamentalReact.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
trait PartialTileProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var isDouble: js.UndefOr[Boolean] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLButtonElement], Unit]] = js.undefined
  
  var size: js.UndefOr[s] = js.undefined
}
object PartialTileProps {
  
  inline def apply(): PartialTileProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileProps]
  }
  
  extension [Self <: PartialTileProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsDouble(value: Boolean): Self = StObject.set(x, "isDouble", value.asInstanceOf[js.Any])
    
    inline def setIsDoubleUndefined: Self = StObject.set(x, "isDouble", js.undefined)
    
    inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSize(value: s): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
