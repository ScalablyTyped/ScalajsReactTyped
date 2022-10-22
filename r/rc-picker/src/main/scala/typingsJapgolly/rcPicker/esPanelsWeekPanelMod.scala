package typingsJapgolly.rcPicker

import typingsJapgolly.rcPicker.esInterfaceMod.PanelSharedProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelsWeekPanelMod {
  
  @JSImport("rc-picker/es/panels/WeekPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](props: WeekPanelProps[DateType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type WeekPanelProps[DateType] = PanelSharedProps[DateType]
}
