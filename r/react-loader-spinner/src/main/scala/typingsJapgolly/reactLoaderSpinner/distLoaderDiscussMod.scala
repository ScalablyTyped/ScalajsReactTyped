package typingsJapgolly.reactLoaderSpinner

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactLoaderSpinner.distTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoaderDiscussMod {
  
  @JSImport("react-loader-spinner/dist/loader/Discuss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasVisibleWidthHeightWrapperClassWrapperStyleAriaLabelColors: DiscussProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasVisibleWidthHeightWrapperClassWrapperStyleAriaLabelColors.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  /* Inlined parent std.Omit<react-loader-spinner.react-loader-spinner/dist/type.BaseProps, 'color'> */
  trait DiscussProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var colors: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[Style] = js.undefined
  }
  object DiscussProps {
    
    inline def apply(): DiscussProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiscussProps]
    }
    
    extension [Self <: DiscussProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setColors(value: js.Tuple2[String, String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
      
      inline def setWrapperStyle(value: Style): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
    }
  }
}
