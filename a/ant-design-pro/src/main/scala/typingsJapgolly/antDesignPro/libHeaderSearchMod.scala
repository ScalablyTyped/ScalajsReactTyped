package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderSearchMod {
  
  @JSImport("ant-design-pro/lib/HeaderSearch", JSImport.Default)
  @js.native
  open class default () extends Component[HeaderSearchProps, Any, Any]
  
  type HeaderSearch = japgolly.scalajs.react.facade.React.Component[HeaderSearchProps & js.Object, js.Object]
  
  trait HeaderSearchProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataSource: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onPressEnter: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HeaderSearchProps {
    
    inline def apply(): HeaderSearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderSearchProps]
    }
    
    extension [Self <: HeaderSearchProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataSource(value: js.Array[String]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: String*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnPressEnter(value: /* value */ String => Callback): Self = StObject.set(x, "onPressEnter", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnPressEnterUndefined: Self = StObject.set(x, "onPressEnter", js.undefined)
      
      inline def setOnSearch(value: /* value */ String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
