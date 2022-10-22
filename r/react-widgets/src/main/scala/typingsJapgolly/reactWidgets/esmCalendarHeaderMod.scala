package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactWidgets.esmLocalizationMod.Localizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCalendarHeaderMod {
  
  @JSImport("react-widgets/esm/CalendarHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasLocalizerLabelLabelIdOnMoveRightOnMoveTodayOnMoveLeftOnViewChangePrevDisabledTodayDisabledUpDisabledNextDisabledNavigatePrevIconNavigateNextIcon: Props
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasLocalizerLabelLabelIdOnMoveRightOnMoveTodayOnMoveLeftOnViewChangePrevDisabledTodayDisabledUpDisabledNextDisabledNavigatePrevIconNavigateNextIcon.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isRtl: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var localizer: Localizer[Any, Any]
    
    var navigateNextIcon: js.UndefOr[Node] = js.undefined
    
    var navigatePrevIcon: js.UndefOr[Node] = js.undefined
    
    var nextDisabled: Boolean
    
    def onMoveLeft(): Unit
    
    def onMoveRight(): Unit
    
    def onMoveToday(): Unit
    
    def onViewChange(): Unit
    
    var prevDisabled: Boolean
    
    var todayDisabled: Boolean
    
    var upDisabled: Boolean
  }
  object Props {
    
    inline def apply(
      label: String,
      localizer: Localizer[Any, Any],
      nextDisabled: Boolean,
      onMoveLeft: Callback,
      onMoveRight: Callback,
      onMoveToday: Callback,
      onViewChange: Callback,
      prevDisabled: Boolean,
      todayDisabled: Boolean,
      upDisabled: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any], nextDisabled = nextDisabled.asInstanceOf[js.Any], onMoveLeft = onMoveLeft.toJsFn, onMoveRight = onMoveRight.toJsFn, onMoveToday = onMoveToday.toJsFn, onViewChange = onViewChange.toJsFn, prevDisabled = prevDisabled.asInstanceOf[js.Any], todayDisabled = todayDisabled.asInstanceOf[js.Any], upDisabled = upDisabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setIsRtlUndefined: Self = StObject.set(x, "isRtl", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLocalizer(value: Localizer[Any, Any]): Self = StObject.set(x, "localizer", value.asInstanceOf[js.Any])
      
      inline def setNavigateNextIcon(value: VdomNode): Self = StObject.set(x, "navigateNextIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNavigateNextIconNull: Self = StObject.set(x, "navigateNextIcon", null)
      
      inline def setNavigateNextIconUndefined: Self = StObject.set(x, "navigateNextIcon", js.undefined)
      
      inline def setNavigateNextIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "navigateNextIcon", js.Array(value*))
      
      inline def setNavigateNextIconVdomElement(value: VdomElement): Self = StObject.set(x, "navigateNextIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNavigatePrevIcon(value: VdomNode): Self = StObject.set(x, "navigatePrevIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNavigatePrevIconNull: Self = StObject.set(x, "navigatePrevIcon", null)
      
      inline def setNavigatePrevIconUndefined: Self = StObject.set(x, "navigatePrevIcon", js.undefined)
      
      inline def setNavigatePrevIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "navigatePrevIcon", js.Array(value*))
      
      inline def setNavigatePrevIconVdomElement(value: VdomElement): Self = StObject.set(x, "navigatePrevIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNextDisabled(value: Boolean): Self = StObject.set(x, "nextDisabled", value.asInstanceOf[js.Any])
      
      inline def setOnMoveLeft(value: Callback): Self = StObject.set(x, "onMoveLeft", value.toJsFn)
      
      inline def setOnMoveRight(value: Callback): Self = StObject.set(x, "onMoveRight", value.toJsFn)
      
      inline def setOnMoveToday(value: Callback): Self = StObject.set(x, "onMoveToday", value.toJsFn)
      
      inline def setOnViewChange(value: Callback): Self = StObject.set(x, "onViewChange", value.toJsFn)
      
      inline def setPrevDisabled(value: Boolean): Self = StObject.set(x, "prevDisabled", value.asInstanceOf[js.Any])
      
      inline def setTodayDisabled(value: Boolean): Self = StObject.set(x, "todayDisabled", value.asInstanceOf[js.Any])
      
      inline def setUpDisabled(value: Boolean): Self = StObject.set(x, "upDisabled", value.asInstanceOf[js.Any])
    }
  }
}
