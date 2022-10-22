package typingsJapgolly.rcPicker

import typingsJapgolly.rcPicker.esInterfaceMod.PanelSharedProps
import typingsJapgolly.rcPicker.esPanelsMonthPanelMonthBodyMod.MonthCellRender
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsMonthPanelMod {
  
  @JSImport("rc-picker/es/panels/MonthPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: MonthPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait MonthPanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var monthCellContentRender: js.UndefOr[MonthCellRender[DateType]] = js.native
  }
}
