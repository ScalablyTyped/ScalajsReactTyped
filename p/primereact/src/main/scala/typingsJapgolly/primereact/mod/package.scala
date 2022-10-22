package typingsJapgolly.primereact.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.primereact.anon.BindEvents
import typingsJapgolly.primereact.anon.Emit
import typingsJapgolly.primereact.anon.Locale
import typingsJapgolly.primereact.apiApiMod.APIOptions
import typingsJapgolly.primereact.apiApiMod.PrimeIconsOptions
import typingsJapgolly.primereact.confirmdialogConfirmdialogMod.ConfirmDialogProps
import typingsJapgolly.primereact.confirmdialogConfirmdialogMod.ConfirmDialogReturn
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupProps
import typingsJapgolly.primereact.confirmpopupConfirmpopupMod.ConfirmPopupReturn
import typingsJapgolly.primereact.hooksHooksMod.EventOptions
import typingsJapgolly.primereact.hooksHooksMod.OverlayEventOptions
import typingsJapgolly.primereact.hooksHooksMod.ResizeEventOptions
import typingsJapgolly.primereact.hooksHooksMod.StorageType
import typingsJapgolly.primereact.mod.^
import typingsJapgolly.primereact.overlayserviceOverlayserviceMod.OverlayServiceOptions
import typingsJapgolly.primereact.terminalserviceTerminalserviceMod.TerminalServiceOptions
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.EffectCallback
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: APIOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[APIOptions]

inline def EventBus(): Emit = ^.asInstanceOf[js.Dynamic].applyDynamic("EventBus")().asInstanceOf[Emit]

inline def OverlayService: OverlayServiceOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("OverlayService").asInstanceOf[OverlayServiceOptions]

inline def PrimeIcons: PrimeIconsOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("PrimeIcons").asInstanceOf[PrimeIconsOptions]

inline def TerminalService: TerminalServiceOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("TerminalService").asInstanceOf[TerminalServiceOptions]

inline def UniqueComponentId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueComponentId")().asInstanceOf[String]
inline def UniqueComponentId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UniqueComponentId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]

inline def addLocale(locale: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def classNames(args: Any*): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("classNames")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[String]]

inline def confirmDialog(props: ConfirmDialogProps): ConfirmDialogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmDialog")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmDialogReturn]

inline def confirmPopup(props: ConfirmPopupProps): ConfirmPopupReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("confirmPopup")(props.asInstanceOf[js.Any]).asInstanceOf[ConfirmPopupReturn]

inline def locale(locale: String): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[Locale]

inline def localeOption(key: String, locale: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("localeOption")(key.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def localeOptions(locale: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("localeOptions")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def mask(el: HTMLElement, options: js.Object): BindEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(el.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BindEvents]

inline def updateLocaleOption(key: String, value: Any, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocaleOption")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def updateLocaleOptions(options: js.Object, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocaleOptions")(options.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useEventListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def useInterval(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
inline def useInterval(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def useInterval(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def useInterval(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def useLocalStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useMountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useOverlayListener(options: OverlayEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def useOverlayScrollListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayScrollListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def usePrevious(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def useResizeListener(options: ResizeEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]

inline def useSessionStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSessionStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useStorage[S, K /* <: String */](initialValue: S, key: K, storage: StorageType): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useTimeout(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
inline def useTimeout(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def useTimeout(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
inline def useTimeout(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def useUnmountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
