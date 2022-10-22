package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.OnAdd
import typingsJapgolly.wixStyleReact.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerConverterHsbMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHsb", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerConverterHsb {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHsb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverterHsb", "default.propTypes")
    @js.native
    def propTypes: OnAdd = js.native
    inline def propTypes_=(x: OnAdd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorPickerConverterHsb extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MColorPickerConverterHsb(props: Any): Unit = js.native
    
    def change(part: Any, hasHasValue: Target): Unit = js.native
    
    def isInputsEmpty(): Boolean = js.native
  }
}
