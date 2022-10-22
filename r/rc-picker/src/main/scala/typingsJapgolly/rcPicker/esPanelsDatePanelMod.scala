package typingsJapgolly.rcPicker

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcPicker.esInterfaceMod.PanelSharedProps
import typingsJapgolly.rcPicker.esPanelsDatePanelDateBodyMod.DateRender
import typingsJapgolly.rcPicker.esUtilsUiUtilMod.KeyboardConfig
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsDatePanelMod {
  
  @JSImport("rc-picker/es/panels/DatePanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: DatePanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.rcPicker.esPanelsDatePanelDateBodyMod.DateBodyPassProps because var conflicts: disabledDate. Inlined dateRender, prefixColumn, rowClassName */ @js.native
  trait DatePanelProps[DateType]
    extends StObject
       with PanelSharedProps[DateType] {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var dateRender: js.UndefOr[DateRender[DateType]] = js.native
    
    var keyboardConfig: js.UndefOr[KeyboardConfig] = js.native
    
    var panelName: js.UndefOr[String] = js.native
    
    var prefixColumn: js.UndefOr[js.Function1[DateType, Node]] = js.native
    
    var rowClassName: js.UndefOr[js.Function1[DateType, String]] = js.native
  }
}
