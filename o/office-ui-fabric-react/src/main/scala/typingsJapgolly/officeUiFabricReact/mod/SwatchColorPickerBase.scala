package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.SelectedIndex
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerSwatchColorPickerDotbaseMod.ISwatchColorPickerState
import typingsJapgolly.officeUiFabricReact.libComponentsSwatchColorPickerSwatchColorPickerDottypesMod.ISwatchColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "SwatchColorPickerBase")
@js.native
open class SwatchColorPickerBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libSwatchColorPickerMod.SwatchColorPickerBase {
  def this(props: ISwatchColorPickerProps) = this()
}
/* static members */
object SwatchColorPickerBase {
  
  @JSImport("office-ui-fabric-react", "SwatchColorPickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "SwatchColorPickerBase.defaultProps")
  @js.native
  def defaultProps: ISwatchColorPickerProps = js.native
  inline def defaultProps_=(x: ISwatchColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(newProps: ISwatchColorPickerProps, state: ISwatchColorPickerState): SelectedIndex | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SelectedIndex | Null]
}
