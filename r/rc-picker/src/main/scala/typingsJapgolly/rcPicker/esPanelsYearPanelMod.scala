package typingsJapgolly.rcPicker

import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.rcPicker.esInterfaceMod.PanelSharedProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsYearPanelMod {
  
  @JSImport("rc-picker/es/panels/YearPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: YearPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-picker/es/panels/YearPanel", "YEAR_DECADE_COUNT")
  @js.native
  val YEAR_DECADE_COUNT: /* 10 */ Double = js.native
  
  @js.native
  trait YearPanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var sourceMode: PanelMode = js.native
  }
}
