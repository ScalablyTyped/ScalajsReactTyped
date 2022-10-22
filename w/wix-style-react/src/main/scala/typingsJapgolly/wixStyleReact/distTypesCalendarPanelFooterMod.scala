package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesCalendarPanelMod.SelectedDaysType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelFooterMod {
  
  @JSImport("wix-style-react/dist/types/CalendarPanelFooter", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CalendarPanelFooterProps, js.Object, Any]
  
  type CalendarPanelFooter = japgolly.scalajs.react.facade.React.Component[CalendarPanelFooterProps & js.Object, js.Object]
  
  trait CalendarPanelFooterItem extends StObject {
    
    var buttonType: js.UndefOr[CalendarPanelFooterItemButtonType] = js.undefined
    
    var collapseLabel: js.UndefOr[Node] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var expandLabel: js.UndefOr[Node] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object CalendarPanelFooterItem {
    
    inline def apply(): CalendarPanelFooterItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalendarPanelFooterItem]
    }
    
    extension [Self <: CalendarPanelFooterItem](x: Self) {
      
      inline def setButtonType(value: CalendarPanelFooterItemButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setCollapseLabel(value: VdomNode): Self = StObject.set(x, "collapseLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCollapseLabelNull: Self = StObject.set(x, "collapseLabel", null)
      
      inline def setCollapseLabelUndefined: Self = StObject.set(x, "collapseLabel", js.undefined)
      
      inline def setCollapseLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "collapseLabel", js.Array(value*))
      
      inline def setCollapseLabelVdomElement(value: VdomElement): Self = StObject.set(x, "collapseLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpandLabel(value: VdomNode): Self = StObject.set(x, "expandLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpandLabelNull: Self = StObject.set(x, "expandLabel", null)
      
      inline def setExpandLabelUndefined: Self = StObject.set(x, "expandLabel", js.undefined)
      
      inline def setExpandLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandLabel", js.Array(value*))
      
      inline def setExpandLabelVdomElement(value: VdomElement): Self = StObject.set(x, "expandLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.button
  */
  trait CalendarPanelFooterItemButtonType extends StObject
  object CalendarPanelFooterItemButtonType {
    
    inline def button: typingsJapgolly.wixStyleReact.wixStyleReactStrings.button = "button".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.button]
    
    inline def textButton: typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton = "textButton".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.textButton]
  }
  
  trait CalendarPanelFooterProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    def dateToString(selectedDays: SelectedDaysType): String
    
    var primaryActionDisabled: Boolean
    
    var primaryActionLabel: String
    
    var primaryActionOnClick: MouseEventHandler[HTMLButtonElement]
    
    var secondaryActionLabel: String
    
    var secondaryActionOnClick: MouseEventHandler[HTMLButtonElement]
    
    var selectedDays: js.UndefOr[SelectedDaysType] = js.undefined
  }
  object CalendarPanelFooterProps {
    
    inline def apply(
      dateToString: SelectedDaysType => String,
      primaryActionDisabled: Boolean,
      primaryActionLabel: String,
      primaryActionOnClick: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback,
      secondaryActionLabel: String,
      secondaryActionOnClick: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback
    ): CalendarPanelFooterProps = {
      val __obj = js.Dynamic.literal(dateToString = js.Any.fromFunction1(dateToString), primaryActionDisabled = primaryActionDisabled.asInstanceOf[js.Any], primaryActionLabel = primaryActionLabel.asInstanceOf[js.Any], primaryActionOnClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => primaryActionOnClick(t0).runNow()), secondaryActionLabel = secondaryActionLabel.asInstanceOf[js.Any], secondaryActionOnClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => secondaryActionOnClick(t0).runNow()))
      __obj.asInstanceOf[CalendarPanelFooterProps]
    }
    
    extension [Self <: CalendarPanelFooterProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDateToString(value: SelectedDaysType => String): Self = StObject.set(x, "dateToString", js.Any.fromFunction1(value))
      
      inline def setPrimaryActionDisabled(value: Boolean): Self = StObject.set(x, "primaryActionDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionLabel(value: String): Self = StObject.set(x, "primaryActionLabel", value.asInstanceOf[js.Any])
      
      inline def setPrimaryActionOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "primaryActionOnClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setSecondaryActionLabel(value: String): Self = StObject.set(x, "secondaryActionLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryActionOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "secondaryActionOnClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setSelectedDays(value: SelectedDaysType): Self = StObject.set(x, "selectedDays", value.asInstanceOf[js.Any])
      
      inline def setSelectedDaysUndefined: Self = StObject.set(x, "selectedDays", js.undefined)
    }
  }
}
