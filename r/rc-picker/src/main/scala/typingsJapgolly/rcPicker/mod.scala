package typingsJapgolly.rcPicker

import typingsJapgolly.rcPicker.esPickerPanelMod.PickerPanelProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-picker", JSImport.Default)
  @js.native
  open class default[DateType] ()
    extends typingsJapgolly.rcPicker.esPickerMod.default[DateType]
  
  inline def PickerPanel[DateType](props: PickerPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PickerPanel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker", "RangePicker")
  @js.native
  open class RangePicker[DateType] ()
    extends typingsJapgolly.rcPicker.esRangePickerMod.default[DateType]
}
