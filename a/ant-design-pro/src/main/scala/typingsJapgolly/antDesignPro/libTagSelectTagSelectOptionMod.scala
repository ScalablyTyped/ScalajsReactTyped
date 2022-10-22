package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTagSelectTagSelectOptionMod {
  
  @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
  @js.native
  open class default () extends Component[TagSelectOptionProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/TagSelect/TagSelectOption", "default.isTagSelectOption")
    @js.native
    def isTagSelectOption: js.UndefOr[Boolean] = js.native
    inline def isTagSelectOption_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTagSelectOption")(x.asInstanceOf[js.Any])
  }
  
  type TagSelectOption = japgolly.scalajs.react.facade.React.Component[TagSelectOptionProps & js.Object, js.Object]
  
  trait TagSelectOptionProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ String | Double, /* state */ Boolean, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object TagSelectOptionProps {
    
    inline def apply(): TagSelectOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSelectOptionProps]
    }
    
    extension [Self <: TagSelectOptionProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setOnChange(value: (/* value */ String | Double, /* state */ Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* value */ String | Double, t1: /* state */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
