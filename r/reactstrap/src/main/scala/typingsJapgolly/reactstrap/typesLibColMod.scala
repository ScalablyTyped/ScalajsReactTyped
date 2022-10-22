package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.anon.Offset
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibColMod {
  
  @JSImport("reactstrap/types/lib/Col", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ColProps, js.Object, Any]
  
  type Col = japgolly.scalajs.react.facade.React.Component[ColProps & js.Object, js.Object]
  
  trait ColProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var lg: js.UndefOr[ColumnProps] = js.undefined
    
    var md: js.UndefOr[ColumnProps] = js.undefined
    
    var sm: js.UndefOr[ColumnProps] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    // custom widths
    var widths: js.UndefOr[js.Array[String]] = js.undefined
    
    var xl: js.UndefOr[ColumnProps] = js.undefined
    
    var xs: js.UndefOr[ColumnProps] = js.undefined
    
    var xxl: js.UndefOr[ColumnProps] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    extension [Self <: ColProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setLg(value: ColumnProps): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: ColumnProps): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: ColumnProps): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value*))
      
      inline def setXl(value: ColumnProps): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: ColumnProps): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: ColumnProps): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  type ColumnProps = String | Boolean | Double | Offset
}
