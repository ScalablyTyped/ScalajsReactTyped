package typingsJapgolly.reactLoaderSpinner

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactLoaderSpinner.distEsmTypeMod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmLoaderLineWaveMod extends Shortcut {
  
  @JSImport("react-loader-spinner/dist/esm/loader/LineWave", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var firstLineColor: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var lastLineColor: js.UndefOr[String] = js.undefined
    
    var middleLineColor: js.UndefOr[String] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var wrapperClass: js.UndefOr[String] = js.undefined
    
    var wrapperStyle: js.UndefOr[Style] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFirstLineColor(value: String): Self = StObject.set(x, "firstLineColor", value.asInstanceOf[js.Any])
      
      inline def setFirstLineColorUndefined: Self = StObject.set(x, "firstLineColor", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLastLineColor(value: String): Self = StObject.set(x, "lastLineColor", value.asInstanceOf[js.Any])
      
      inline def setLastLineColorUndefined: Self = StObject.set(x, "lastLineColor", js.undefined)
      
      inline def setMiddleLineColor(value: String): Self = StObject.set(x, "middleLineColor", value.asInstanceOf[js.Any])
      
      inline def setMiddleLineColorUndefined: Self = StObject.set(x, "middleLineColor", js.undefined)
      
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
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `distEsmLoaderLineWaveMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
