package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.ActiveTab
import typingsJapgolly.wixStyleReact.anon.AllowEmpty
import typingsJapgolly.wixStyleReact.anon.IdAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerColorPickerConverterMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverter", JSImport.Default)
  @js.native
  open class default protected () extends ColorPickerConverter {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ColorPicker/ColorPickerConverter", "default.propTypes")
    @js.native
    def propTypes: AllowEmpty = js.native
    inline def propTypes_=(x: AllowEmpty): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorPickerConverter extends PureComponent[Any, Any, Any] {
    
    def changeTab(hasId: IdAny): Unit = js.native
    
    @JSName("state")
    var state_ColorPickerConverter: ActiveTab = js.native
  }
}
