package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyBaseEllipsisMod {
  
  object default {
    
    inline def apply(hasEnabledMeasureChildrenTextWidthFontSizeRowsOnEllipsis: EllipsisProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasEnabledMeasureChildrenTextWidthFontSizeRowsOnEllipsis.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/typography/Base/Ellipsis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/typography/Base/Ellipsis", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait EllipsisProps extends StObject {
    
    def children(cutChildren: js.Array[Node], needEllipsis: Boolean): Node
    
    var enabledMeasure: js.UndefOr[Boolean] = js.undefined
    
    var fontSize: Double
    
    def onEllipsis(isEllipsis: Boolean): Unit
    
    var rows: Double
    
    var text: js.UndefOr[Node] = js.undefined
    
    var width: Double
  }
  object EllipsisProps {
    
    inline def apply(
      children: (js.Array[Node], Boolean) => Node,
      fontSize: Double,
      onEllipsis: Boolean => Callback,
      rows: Double,
      width: Double
    ): EllipsisProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), fontSize = fontSize.asInstanceOf[js.Any], onEllipsis = js.Any.fromFunction1((t0: Boolean) => onEllipsis(t0).runNow()), rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[EllipsisProps]
    }
    
    extension [Self <: EllipsisProps](x: Self) {
      
      inline def setChildren(value: (js.Array[Node], Boolean) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setEnabledMeasure(value: Boolean): Self = StObject.set(x, "enabledMeasure", value.asInstanceOf[js.Any])
      
      inline def setEnabledMeasureUndefined: Self = StObject.set(x, "enabledMeasure", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setOnEllipsis(value: Boolean => Callback): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
