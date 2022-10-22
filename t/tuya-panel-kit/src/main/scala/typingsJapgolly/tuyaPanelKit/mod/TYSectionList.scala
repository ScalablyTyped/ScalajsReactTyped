package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tuya-panel-kit", "TYSectionList")
@js.native
open class TYSectionList protected ()
  extends Component[TYSectionListProps, js.Object, Any] {
  def this(props: TYSectionListProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TYSectionListProps, context: Any) = this()
}
/* static members */
object TYSectionList {
  
  @JSImport("tuya-panel-kit", "TYSectionList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tuya-panel-kit", "TYSectionList.CheckboxItem")
  @js.native
  def CheckboxItem: ElementType = js.native
  inline def CheckboxItem_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckboxItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.InputItem")
  @js.native
  def InputItem: ElementType = js.native
  inline def InputItem_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InputItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.Item")
  @js.native
  def Item: ElementType = js.native
  inline def Item_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.SliderItem")
  @js.native
  def SliderItem: ElementType = js.native
  inline def SliderItem_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SliderItem")(x.asInstanceOf[js.Any])
  
  @JSImport("tuya-panel-kit", "TYSectionList.SwitchItem")
  @js.native
  def SwitchItem: ElementType = js.native
  inline def SwitchItem_=(x: ElementType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SwitchItem")(x.asInstanceOf[js.Any])
}
