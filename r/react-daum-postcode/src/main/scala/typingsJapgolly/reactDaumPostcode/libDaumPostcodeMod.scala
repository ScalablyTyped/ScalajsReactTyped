package typingsJapgolly.reactDaumPostcode

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactDaumPostcode.anon.HasError
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Address
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.PostcodeConstructor
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Search
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Size
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDaumPostcodeMod {
  
  @JSImport("react-daum-postcode/lib/DaumPostcode", JSImport.Default)
  @js.native
  open class default () extends DaumPostcode
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-daum-postcode/lib/DaumPostcode", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-daum-postcode/lib/DaumPostcode", "default.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      inline def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode/lib/DaumPostcode", "default.defaultProps.errorMessage")
      @js.native
      def errorMessage: Element = js.native
      inline def errorMessage_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(x.asInstanceOf[js.Any])
      
      @JSImport("react-daum-postcode/lib/DaumPostcode", "default.defaultProps.scriptUrl")
      @js.native
      def scriptUrl: String = js.native
      inline def scriptUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptUrl")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DaumPostcode extends Component[DaumPostcodeProps, State, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MDaumPostcode(): Unit = js.native
    
    def initiate(Postcode: PostcodeConstructor): Unit = js.native
    
    def onError(e: Any): Unit = js.native
    
    @JSName("state")
    var state_DaumPostcode: HasError = js.native
    
    var wrap: RefHandle[HTMLDivElement] = js.native
  }
  
  /* Inlined parent std.Omit<react-daum-postcode.react-daum-postcode/lib/loadPostcode.PostcodeOptions, 'oncomplete' | 'onresize' | 'onclose' | 'onsearch'> */
  trait DaumPostcodeProps extends StObject {
    
    var alwaysShowEngAddr: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var autoMapping: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingJibun: js.UndefOr[Boolean] = js.undefined
    
    var autoMappingRoad: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultQuery: js.UndefOr[String] = js.undefined
    
    var errorMessage: js.UndefOr[String | Node] = js.undefined
    
    var focusContent: js.UndefOr[Boolean] = js.undefined
    
    var focusInput: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var hideEngBtn: js.UndefOr[Boolean] = js.undefined
    
    var hideMapBtn: js.UndefOr[Boolean] = js.undefined
    
    var maxSuggestItems: js.UndefOr[Double] = js.undefined
    
    var onClose: js.UndefOr[
        js.Function1[/* state */ typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.State, Unit]
      ] = js.undefined
    
    var onComplete: js.UndefOr[js.Function1[/* address */ Address, Unit]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* search */ Search, Unit]] = js.undefined
    
    var pleaseReadGuide: js.UndefOr[Double] = js.undefined
    
    var pleaseReadGuideTimer: js.UndefOr[Double] = js.undefined
    
    var scriptUrl: js.UndefOr[String] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
    
    var showMoreHName: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var submitMode: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var useBannerLink: js.UndefOr[Boolean] = js.undefined
    
    var useSuggest: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object DaumPostcodeProps {
    
    inline def apply(): DaumPostcodeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DaumPostcodeProps]
    }
    
    extension [Self <: DaumPostcodeProps](x: Self) {
      
      inline def setAlwaysShowEngAddr(value: Boolean): Self = StObject.set(x, "alwaysShowEngAddr", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowEngAddrUndefined: Self = StObject.set(x, "alwaysShowEngAddr", js.undefined)
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setAutoMapping(value: Boolean): Self = StObject.set(x, "autoMapping", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibun(value: Boolean): Self = StObject.set(x, "autoMappingJibun", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingJibunUndefined: Self = StObject.set(x, "autoMappingJibun", js.undefined)
      
      inline def setAutoMappingRoad(value: Boolean): Self = StObject.set(x, "autoMappingRoad", value.asInstanceOf[js.Any])
      
      inline def setAutoMappingRoadUndefined: Self = StObject.set(x, "autoMappingRoad", js.undefined)
      
      inline def setAutoMappingUndefined: Self = StObject.set(x, "autoMapping", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultQuery(value: String): Self = StObject.set(x, "defaultQuery", value.asInstanceOf[js.Any])
      
      inline def setDefaultQueryUndefined: Self = StObject.set(x, "defaultQuery", js.undefined)
      
      inline def setErrorMessage(value: String | Node): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "errorMessage", js.Array(value*))
      
      inline def setErrorMessageVdomElement(value: VdomElement): Self = StObject.set(x, "errorMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFocusContent(value: Boolean): Self = StObject.set(x, "focusContent", value.asInstanceOf[js.Any])
      
      inline def setFocusContentUndefined: Self = StObject.set(x, "focusContent", js.undefined)
      
      inline def setFocusInput(value: Boolean): Self = StObject.set(x, "focusInput", value.asInstanceOf[js.Any])
      
      inline def setFocusInputUndefined: Self = StObject.set(x, "focusInput", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideEngBtn(value: Boolean): Self = StObject.set(x, "hideEngBtn", value.asInstanceOf[js.Any])
      
      inline def setHideEngBtnUndefined: Self = StObject.set(x, "hideEngBtn", js.undefined)
      
      inline def setHideMapBtn(value: Boolean): Self = StObject.set(x, "hideMapBtn", value.asInstanceOf[js.Any])
      
      inline def setHideMapBtnUndefined: Self = StObject.set(x, "hideMapBtn", js.undefined)
      
      inline def setMaxSuggestItems(value: Double): Self = StObject.set(x, "maxSuggestItems", value.asInstanceOf[js.Any])
      
      inline def setMaxSuggestItemsUndefined: Self = StObject.set(x, "maxSuggestItems", js.undefined)
      
      inline def setOnClose(value: /* state */ typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.State => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.State) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnComplete(value: /* address */ Address => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: /* address */ Address) => value(t0).runNow()))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnResize(value: /* size */ Size => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction1((t0: /* size */ Size) => value(t0).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnSearch(value: /* search */ Search => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* search */ Search) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setPleaseReadGuide(value: Double): Self = StObject.set(x, "pleaseReadGuide", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimer(value: Double): Self = StObject.set(x, "pleaseReadGuideTimer", value.asInstanceOf[js.Any])
      
      inline def setPleaseReadGuideTimerUndefined: Self = StObject.set(x, "pleaseReadGuideTimer", js.undefined)
      
      inline def setPleaseReadGuideUndefined: Self = StObject.set(x, "pleaseReadGuide", js.undefined)
      
      inline def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
      
      inline def setScriptUrlUndefined: Self = StObject.set(x, "scriptUrl", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
      
      inline def setShowMoreHName(value: Boolean): Self = StObject.set(x, "showMoreHName", value.asInstanceOf[js.Any])
      
      inline def setShowMoreHNameUndefined: Self = StObject.set(x, "showMoreHName", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubmitMode(value: Boolean): Self = StObject.set(x, "submitMode", value.asInstanceOf[js.Any])
      
      inline def setSubmitModeUndefined: Self = StObject.set(x, "submitMode", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setUseBannerLink(value: Boolean): Self = StObject.set(x, "useBannerLink", value.asInstanceOf[js.Any])
      
      inline def setUseBannerLinkUndefined: Self = StObject.set(x, "useBannerLink", js.undefined)
      
      inline def setUseSuggest(value: Boolean): Self = StObject.set(x, "useSuggest", value.asInstanceOf[js.Any])
      
      inline def setUseSuggestUndefined: Self = StObject.set(x, "useSuggest", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var hasError: Boolean
  }
  object State {
    
    inline def apply(hasError: Boolean): State = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
}
