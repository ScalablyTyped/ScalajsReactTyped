package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPicker")
  @js.native
  val ColorPicker: FunctionComponent[IColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase")
  @js.native
  open class ColorPickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsColorPickerMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    inline def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
