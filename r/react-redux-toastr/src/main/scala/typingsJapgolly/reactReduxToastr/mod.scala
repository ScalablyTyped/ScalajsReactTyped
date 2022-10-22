package typingsJapgolly.reactReduxToastr

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactReduxToastr.anon.CancelText
import typingsJapgolly.reactReduxToastr.anon.Id
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReduxToastrProps, js.Object, Any]
  
  @JSImport("react-redux-toastr", "actions")
  @js.native
  val actions: ToastrActionCreators = js.native
  
  @JSImport("react-redux-toastr", "reducer")
  @js.native
  val reducer: Reducer[ToastrState, AnyAction] = js.native
  
  @JSImport("react-redux-toastr", "toastr")
  @js.native
  val toastr: ToastrEmitter = js.native
  
  trait AddToastPayload extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[BasicToastrOptions | LightToastrOptions] = js.undefined
    
    var position: js.UndefOr[positionType] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: toastType
  }
  object AddToastPayload {
    
    inline def apply(`type`: toastType): AddToastPayload = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToastPayload]
    }
    
    extension [Self <: AddToastPayload](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasicToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[(japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]) | Element] = js.undefined
    
    var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var removeOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object BasicToastrOptions {
    
    inline def apply(): BasicToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicToastrOptions]
    }
    
    extension [Self <: BasicToastrOptions](x: Self) {
      
      inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: (japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]) | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGetState(value: /* state */ ToastrState => ToastrState): Self = StObject.set(x, "getState", js.Any.fromFunction1(value))
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setIcon(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnCloseButtonClick(value: Callback): Self = StObject.set(x, "onCloseButtonClick", value.toJsFn)
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHideComplete(value: Callback): Self = StObject.set(x, "onHideComplete", value.toJsFn)
      
      inline def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      inline def setOnShowComplete(value: Callback): Self = StObject.set(x, "onShowComplete", value.toJsFn)
      
      inline def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      inline def setOnToastrClick(value: Callback): Self = StObject.set(x, "onToastrClick", value.toJsFn)
      
      inline def setOnToastrClickUndefined: Self = StObject.set(x, "onToastrClick", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  trait ConfirmToastrCustomOptions extends StObject {
    
    var component: Element
  }
  object ConfirmToastrCustomOptions {
    
    inline def apply(component: VdomElement): ConfirmToastrCustomOptions = {
      val __obj = js.Dynamic.literal(component = component.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmToastrCustomOptions]
    }
    
    extension [Self <: ConfirmToastrCustomOptions](x: Self) {
      
      inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmToastrOptions extends StObject {
    
    var cancelText: js.UndefOr[String] = js.undefined
    
    var disableCancel: js.UndefOr[Boolean] = js.undefined
    
    var okText: js.UndefOr[String] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConfirmToastrOptions {
    
    inline def apply(): ConfirmToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmToastrOptions]
    }
    
    extension [Self <: ConfirmToastrOptions](x: Self) {
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setDisableCancel(value: Boolean): Self = StObject.set(x, "disableCancel", value.asInstanceOf[js.Any])
      
      inline def setDisableCancelUndefined: Self = StObject.set(x, "disableCancel", js.undefined)
      
      inline def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnOk(value: Callback): Self = StObject.set(x, "onOk", value.toJsFn)
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  trait LightToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Element] = js.undefined
    
    var icon: js.UndefOr[iconType | Element] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var removeOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[iconType] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object LightToastrOptions {
    
    inline def apply(): LightToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightToastrOptions]
    }
    
    extension [Self <: LightToastrOptions](x: Self) {
      
      inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setIcon(value: iconType | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnCloseButtonClick(value: Callback): Self = StObject.set(x, "onCloseButtonClick", value.toJsFn)
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHideComplete(value: Callback): Self = StObject.set(x, "onHideComplete", value.toJsFn)
      
      inline def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      inline def setOnShowComplete(value: Callback): Self = StObject.set(x, "onShowComplete", value.toJsFn)
      
      inline def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStatus(value: iconType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  type ReduxToastr = japgolly.scalajs.react.facade.React.Component[ReduxToastrProps & js.Object, js.Object]
  
  trait ReduxToastrProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnToastrClick: js.UndefOr[Boolean] = js.undefined
    
    var confirmOptions: js.UndefOr[CancelText] = js.undefined
    
    var newestOnTop: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    // This is currently not used, waiting for response from the package author to remove
    var position: js.UndefOr[positionType] = js.undefined
    
    var preventDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var toastr: js.UndefOr[ToastrState] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object ReduxToastrProps {
    
    inline def apply(): ReduxToastrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxToastrProps]
    }
    
    extension [Self <: ReduxToastrProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnToastrClick(value: Boolean): Self = StObject.set(x, "closeOnToastrClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnToastrClickUndefined: Self = StObject.set(x, "closeOnToastrClick", js.undefined)
      
      inline def setConfirmOptions(value: CancelText): Self = StObject.set(x, "confirmOptions", value.asInstanceOf[js.Any])
      
      inline def setConfirmOptionsUndefined: Self = StObject.set(x, "confirmOptions", js.undefined)
      
      inline def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
      
      inline def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
      
      inline def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setToastr(value: ToastrState): Self = StObject.set(x, "toastr", value.asInstanceOf[js.Any])
      
      inline def setToastrUndefined: Self = StObject.set(x, "toastr", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  @js.native
  trait ToastrActionCreators extends StObject {
    
    def add(toastr: AddToastPayload): Action[Any] = js.native
    
    def clean(): Action[Any] = js.native
    
    def hideConfirm(): Action[Any] = js.native
    
    def remove(id: String): Action[Any] = js.native
    
    def removeByType(`type`: toastType): Action[Any] = js.native
    
    def showConfirm(confirm: ConfirmToastrCustomOptions): Action[Any] = js.native
    def showConfirm(confirm: ConfirmToastrOptions): Action[Any] = js.native
  }
  
  @js.native
  trait ToastrEmitter extends StObject {
    
    def clean(): Unit = js.native
    
    def confirm(message: String, options: ConfirmToastrOptions): Unit = js.native
    
    def error(title: String, message: String): Unit = js.native
    def error(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def info(title: String, message: String): Unit = js.native
    def info(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def light(title: String, message: String): Unit = js.native
    def light(title: String, message: String, options: LightToastrOptions): Unit = js.native
    
    def message(title: String, message: String): Unit = js.native
    def message(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def removeByType(`type`: String): Unit = js.native
    
    def success(title: String, message: String): Unit = js.native
    def success(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def warning(title: String, message: String): Unit = js.native
    def warning(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  }
  
  trait ToastrState extends StObject {
    
    var confirm: js.UndefOr[Id] = js.undefined
    
    var toastrs: js.Array[Toastr_]
  }
  object ToastrState {
    
    inline def apply(toastrs: js.Array[Toastr_]): ToastrState = {
      val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastrState]
    }
    
    extension [Self <: ToastrState](x: Self) {
      
      inline def setConfirm(value: Id): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setToastrs(value: js.Array[Toastr_]): Self = StObject.set(x, "toastrs", value.asInstanceOf[js.Any])
      
      inline def setToastrsVarargs(value: Toastr_ *): Self = StObject.set(x, "toastrs", js.Array(value*))
    }
  }
  
  trait Toastr_ extends StObject {
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var options: BasicToastrOptions | LightToastrOptions
    
    var position: positionType
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: toastType
  }
  object Toastr_ {
    
    inline def apply(
      id: String,
      options: BasicToastrOptions | LightToastrOptions,
      position: positionType,
      `type`: toastType
    ): Toastr_ = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toastr_]
    }
    
    extension [Self <: Toastr_](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error
  */
  trait iconType extends StObject
  object iconType {
    
    inline def error: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error]
    
    inline def info: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info]
    
    inline def success: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success]
    
    inline def warning: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-left`
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-center`
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-right`
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-left`
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-center`
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-right`
  */
  trait positionType extends StObject
  object positionType {
    
    inline def `bottom-center`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-center` = "bottom-center".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-center`]
    
    inline def `bottom-left`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`bottom-right`]
    
    inline def `top-center`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-center` = "top-center".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-center`]
    
    inline def `top-left`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.light
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.confirm
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.message
  */
  trait toastType extends StObject
  object toastType {
    
    inline def confirm: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.confirm = "confirm".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.confirm]
    
    inline def error: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.error]
    
    inline def info: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.info]
    
    inline def light: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.light = "light".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.light]
    
    inline def message: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.message = "message".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.message]
    
    inline def success: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.success]
    
    inline def warning: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceIn
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceInDown
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeIn
  */
  trait transitionInType extends StObject
  object transitionInType {
    
    inline def bounceIn: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceIn = "bounceIn".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceIn]
    
    inline def bounceInDown: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceInDown = "bounceInDown".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceInDown]
    
    inline def fadeIn: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeIn = "fadeIn".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeIn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOut
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOutUp
    - typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeOut
  */
  trait transitionOutType extends StObject
  object transitionOutType {
    
    inline def bounceOut: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOut = "bounceOut".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOut]
    
    inline def bounceOutUp: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.bounceOutUp]
    
    inline def fadeOut: typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeOut = "fadeOut".asInstanceOf[typingsJapgolly.reactReduxToastr.reactReduxToastrStrings.fadeOut]
  }
}
