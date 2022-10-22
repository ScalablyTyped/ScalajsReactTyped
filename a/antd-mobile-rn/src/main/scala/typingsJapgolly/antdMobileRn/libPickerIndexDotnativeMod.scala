package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.AntLocale
import typingsJapgolly.antdMobileRn.anon.Cascade
import typingsJapgolly.antdMobileRn.libPickerPropsTypeMod.PickerData
import typingsJapgolly.antdMobileRn.libPickerPropsTypeMod.PickerPropsType
import typingsJapgolly.antdMobileRn.libPickerStyleIndexDotnativeMod.IPickerStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/picker/index.native", JSImport.Default)
  @js.native
  open class default () extends Picker
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/picker/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Cascade = js.native
    inline def defaultProps_=(x: Cascade): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Picker
    extends typingsJapgolly.antdMobileRn.libPickerAbstractPickerMod.default
  
  trait PickerNativeProps
    extends StObject
       with PickerPropsType {
    
    @JSName("styles")
    var styles_PickerNativeProps: js.UndefOr[IPickerStyle] = js.undefined
  }
  object PickerNativeProps {
    
    inline def apply(data: js.Array[js.Array[PickerData] | PickerData]): PickerNativeProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerNativeProps]
    }
    
    extension [Self <: PickerNativeProps](x: Self) {
      
      inline def setStyles(value: IPickerStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
