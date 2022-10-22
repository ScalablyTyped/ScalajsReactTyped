package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.AriaAttributes
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsNativePropsMod {
  
  @JSImport("antd-mobile/es/utils/native-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withNativeProps[P /* <: NativeProps[scala.Nothing] */](props: P, element: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("withNativeProps")(props.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  trait NativeProps[S /* <: String */]
    extends StObject
       with AriaAttributes {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties & (Partial[Record[S, String]])] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
  }
  object NativeProps {
    
    inline def apply[S /* <: String */](): NativeProps[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps[S]]
    }
    
    extension [Self <: NativeProps[?], S /* <: String */](x: Self & NativeProps[S]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties & (Partial[Record[S, String]])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
