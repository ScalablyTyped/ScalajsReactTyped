package typingsJapgolly.puppeteer.mod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteer.mod.^
import typingsJapgolly.std.Capitalize
import typingsJapgolly.std.Lowercase
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_INTERCEPT_RESOLUTION_PRIORITY: /* 0 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_INTERCEPT_RESOLUTION_PRIORITY").asInstanceOf[/* 0 */ Double]

inline def EVALUATION_SCRIPT_URL: /* "pptr://__puppeteer_evaluation_script__" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("EVALUATION_SCRIPT_URL").asInstanceOf[/* "pptr://__puppeteer_evaluation_script__" */ String]

inline def clearCustomQueryHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCustomQueryHandlers")().asInstanceOf[Unit]

inline def connect(options: ConnectOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def createBrowserFetcher(options: BrowserFetcherOptions): BrowserFetcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserFetcher")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserFetcher]

inline def customQueryHandlerNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("customQueryHandlerNames")().asInstanceOf[js.Array[String]]

inline def defaultArgs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")().asInstanceOf[js.Array[String]]
inline def defaultArgs(options: BrowserLaunchArgumentOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultArgs")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def executablePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")().asInstanceOf[String]
inline def executablePath(channel: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("executablePath")(channel.asInstanceOf[js.Any]).asInstanceOf[String]

inline def launch(): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[Browser]]
inline def launch(options: PuppeteerLaunchOptions): js.Promise[Browser] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Browser]]

inline def registerCustomQueryHandler(name: String, handler: CustomQueryHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomQueryHandler")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unregisterCustomQueryHandler(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterCustomQueryHandler")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]

type Awaitable[T] = T | PromiseLike[T]

type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]

type EventType = String | js.Symbol

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.mod.HandleFor[T]
  - typingsJapgolly.puppeteer.mod.JSHandle[T]
  - T
*/
type HandleOr[T] = _HandleOr[T] | T

type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]

type InterceptResolutionStrategy = InterceptResolutionAction

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.`0`
  - typingsJapgolly.puppeteer.puppeteerStrings.`1`
  - typingsJapgolly.puppeteer.puppeteerStrings.`2`
  - typingsJapgolly.puppeteer.puppeteerStrings.`3`
  - typingsJapgolly.puppeteer.puppeteerStrings.`4`
  - typingsJapgolly.puppeteer.puppeteerStrings.`5`
  - typingsJapgolly.puppeteer.puppeteerStrings.`6`
  - typingsJapgolly.puppeteer.puppeteerStrings.`7`
  - typingsJapgolly.puppeteer.puppeteerStrings.`8`
  - typingsJapgolly.puppeteer.puppeteerStrings.`9`
  - typingsJapgolly.puppeteer.puppeteerStrings.Power
  - typingsJapgolly.puppeteer.puppeteerStrings.Eject
  - typingsJapgolly.puppeteer.puppeteerStrings.Abort
  - typingsJapgolly.puppeteer.puppeteerStrings.Help
  - typingsJapgolly.puppeteer.puppeteerStrings.Backspace
  - typingsJapgolly.puppeteer.puppeteerStrings.Tab
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad5
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadEnter
  - typingsJapgolly.puppeteer.puppeteerStrings.Enter
  - typingsJapgolly.puppeteer.puppeteerStrings.Carriagereturn
  - typingsJapgolly.puppeteer.puppeteerStrings.Linefeed
  - typingsJapgolly.puppeteer.puppeteerStrings.ShiftLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.ShiftRight
  - typingsJapgolly.puppeteer.puppeteerStrings.ControlLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.ControlRight
  - typingsJapgolly.puppeteer.puppeteerStrings.AltLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.AltRight
  - typingsJapgolly.puppeteer.puppeteerStrings.Pause
  - typingsJapgolly.puppeteer.puppeteerStrings.CapsLock
  - typingsJapgolly.puppeteer.puppeteerStrings.Escape
  - typingsJapgolly.puppeteer.puppeteerStrings.Convert
  - typingsJapgolly.puppeteer.puppeteerStrings.NonConvert
  - typingsJapgolly.puppeteer.puppeteerStrings.Space
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad9
  - typingsJapgolly.puppeteer.puppeteerStrings.PageUp
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad3
  - typingsJapgolly.puppeteer.puppeteerStrings.PageDown
  - typingsJapgolly.puppeteer.puppeteerStrings.End
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad1
  - typingsJapgolly.puppeteer.puppeteerStrings.Home
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad7
  - typingsJapgolly.puppeteer.puppeteerStrings.ArrowLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad4
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad8
  - typingsJapgolly.puppeteer.puppeteerStrings.ArrowUp
  - typingsJapgolly.puppeteer.puppeteerStrings.ArrowRight
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad6
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad2
  - typingsJapgolly.puppeteer.puppeteerStrings.ArrowDown
  - typingsJapgolly.puppeteer.puppeteerStrings.Select
  - typingsJapgolly.puppeteer.puppeteerStrings.Open
  - typingsJapgolly.puppeteer.puppeteerStrings.PrintScreen
  - typingsJapgolly.puppeteer.puppeteerStrings.Insert
  - typingsJapgolly.puppeteer.puppeteerStrings.Numpad0
  - typingsJapgolly.puppeteer.puppeteerStrings.Delete
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadDecimal
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit0
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit1
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit2
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit3
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit4
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit5
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit6
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit7
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit8
  - typingsJapgolly.puppeteer.puppeteerStrings.Digit9
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyA
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyB
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyC
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyD
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyE
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyF
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyG
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyH
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyI
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyJ
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyK
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyL
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyM
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyN
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyO
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyP
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyQ
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyR
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyS
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyT
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyU
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyV
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyW
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyX
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyY
  - typingsJapgolly.puppeteer.puppeteerStrings.KeyZ
  - typingsJapgolly.puppeteer.puppeteerStrings.MetaLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.MetaRight
  - typingsJapgolly.puppeteer.puppeteerStrings.ContextMenu
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadMultiply
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadAdd
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadSubtract
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadDivide
  - typingsJapgolly.puppeteer.puppeteerStrings.F1
  - typingsJapgolly.puppeteer.puppeteerStrings.F2
  - typingsJapgolly.puppeteer.puppeteerStrings.F3
  - typingsJapgolly.puppeteer.puppeteerStrings.F4
  - typingsJapgolly.puppeteer.puppeteerStrings.F5
  - typingsJapgolly.puppeteer.puppeteerStrings.F6
  - typingsJapgolly.puppeteer.puppeteerStrings.F7
  - typingsJapgolly.puppeteer.puppeteerStrings.F8
  - typingsJapgolly.puppeteer.puppeteerStrings.F9
  - typingsJapgolly.puppeteer.puppeteerStrings.F10
  - typingsJapgolly.puppeteer.puppeteerStrings.F11
  - typingsJapgolly.puppeteer.puppeteerStrings.F12
  - typingsJapgolly.puppeteer.puppeteerStrings.F13
  - typingsJapgolly.puppeteer.puppeteerStrings.F14
  - typingsJapgolly.puppeteer.puppeteerStrings.F15
  - typingsJapgolly.puppeteer.puppeteerStrings.F16
  - typingsJapgolly.puppeteer.puppeteerStrings.F17
  - typingsJapgolly.puppeteer.puppeteerStrings.F18
  - typingsJapgolly.puppeteer.puppeteerStrings.F19
  - typingsJapgolly.puppeteer.puppeteerStrings.F20
  - typingsJapgolly.puppeteer.puppeteerStrings.F21
  - typingsJapgolly.puppeteer.puppeteerStrings.F22
  - typingsJapgolly.puppeteer.puppeteerStrings.F23
  - typingsJapgolly.puppeteer.puppeteerStrings.F24
  - typingsJapgolly.puppeteer.puppeteerStrings.NumLock
  - typingsJapgolly.puppeteer.puppeteerStrings.ScrollLock
  - typingsJapgolly.puppeteer.puppeteerStrings.AudioVolumeMute
  - typingsJapgolly.puppeteer.puppeteerStrings.AudioVolumeDown
  - typingsJapgolly.puppeteer.puppeteerStrings.AudioVolumeUp
  - typingsJapgolly.puppeteer.puppeteerStrings.MediaTrackNext
  - typingsJapgolly.puppeteer.puppeteerStrings.MediaTrackPrevious
  - typingsJapgolly.puppeteer.puppeteerStrings.MediaStop
  - typingsJapgolly.puppeteer.puppeteerStrings.MediaPlayPause
  - typingsJapgolly.puppeteer.puppeteerStrings.Semicolon
  - typingsJapgolly.puppeteer.puppeteerStrings.Equal
  - typingsJapgolly.puppeteer.puppeteerStrings.NumpadEqual
  - typingsJapgolly.puppeteer.puppeteerStrings.Comma
  - typingsJapgolly.puppeteer.puppeteerStrings.Minus
  - typingsJapgolly.puppeteer.puppeteerStrings.Period
  - typingsJapgolly.puppeteer.puppeteerStrings.Slash
  - typingsJapgolly.puppeteer.puppeteerStrings.Backquote
  - typingsJapgolly.puppeteer.puppeteerStrings.BracketLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.Backslash
  - typingsJapgolly.puppeteer.puppeteerStrings.BracketRight
  - typingsJapgolly.puppeteer.puppeteerStrings.Quote
  - typingsJapgolly.puppeteer.puppeteerStrings.AltGraph
  - typingsJapgolly.puppeteer.puppeteerStrings.Props
  - typingsJapgolly.puppeteer.puppeteerStrings.Cancel
  - typingsJapgolly.puppeteer.puppeteerStrings.Clear
  - typingsJapgolly.puppeteer.puppeteerStrings.Shift
  - typingsJapgolly.puppeteer.puppeteerStrings.Control
  - typingsJapgolly.puppeteer.puppeteerStrings.Alt
  - typingsJapgolly.puppeteer.puppeteerStrings.Accept
  - typingsJapgolly.puppeteer.puppeteerStrings.ModeChange
  - typingsJapgolly.puppeteer.puppeteerStrings.Space
  - typingsJapgolly.puppeteer.puppeteerStrings.Print
  - typingsJapgolly.puppeteer.puppeteerStrings.Execute
  - typingsJapgolly.puppeteer.puppeteerStrings.Null
  - typingsJapgolly.puppeteer.puppeteerStrings.a_
  - typingsJapgolly.puppeteer.puppeteerStrings.b_
  - typingsJapgolly.puppeteer.puppeteerStrings.c_
  - typingsJapgolly.puppeteer.puppeteerStrings.d_
  - typingsJapgolly.puppeteer.puppeteerStrings.e_
  - typingsJapgolly.puppeteer.puppeteerStrings.f_
  - typingsJapgolly.puppeteer.puppeteerStrings.g_
  - typingsJapgolly.puppeteer.puppeteerStrings.h_
  - typingsJapgolly.puppeteer.puppeteerStrings.i_
  - typingsJapgolly.puppeteer.puppeteerStrings.j_
  - typingsJapgolly.puppeteer.puppeteerStrings.k_
  - typingsJapgolly.puppeteer.puppeteerStrings.l_
  - typingsJapgolly.puppeteer.puppeteerStrings.m_
  - typingsJapgolly.puppeteer.puppeteerStrings.n_
  - typingsJapgolly.puppeteer.puppeteerStrings.o_
  - typingsJapgolly.puppeteer.puppeteerStrings.p_
  - typingsJapgolly.puppeteer.puppeteerStrings.q_
  - typingsJapgolly.puppeteer.puppeteerStrings.r_
  - typingsJapgolly.puppeteer.puppeteerStrings.s_
  - typingsJapgolly.puppeteer.puppeteerStrings.t_
  - typingsJapgolly.puppeteer.puppeteerStrings.u_
  - typingsJapgolly.puppeteer.puppeteerStrings.v_
  - typingsJapgolly.puppeteer.puppeteerStrings.w_
  - typingsJapgolly.puppeteer.puppeteerStrings.x_
  - typingsJapgolly.puppeteer.puppeteerStrings.y_
  - typingsJapgolly.puppeteer.puppeteerStrings.z_
  - typingsJapgolly.puppeteer.puppeteerStrings.Meta
  - typingsJapgolly.puppeteer.puppeteerStrings.Asterisk
  - typingsJapgolly.puppeteer.puppeteerStrings.Plussign
  - typingsJapgolly.puppeteer.puppeteerStrings.`-_`
  - typingsJapgolly.puppeteer.puppeteerStrings.Slash
  - typingsJapgolly.puppeteer.puppeteerStrings.Semicolon
  - typingsJapgolly.puppeteer.puppeteerStrings.Equalssign
  - typingsJapgolly.puppeteer.puppeteerStrings.Comma
  - typingsJapgolly.puppeteer.puppeteerStrings.Dot
  - typingsJapgolly.puppeteer.puppeteerStrings.Graveaccent
  - typingsJapgolly.puppeteer.puppeteerStrings.`[`
  - / * \ * / java.lang.String
  - typingsJapgolly.puppeteer.puppeteerStrings.`]`
  - typingsJapgolly.puppeteer.puppeteerStrings.Attn
  - typingsJapgolly.puppeteer.puppeteerStrings.CrSel
  - typingsJapgolly.puppeteer.puppeteerStrings.ExSel
  - typingsJapgolly.puppeteer.puppeteerStrings.EraseEof
  - typingsJapgolly.puppeteer.puppeteerStrings.Play
  - typingsJapgolly.puppeteer.puppeteerStrings.ZoomOut
  - typingsJapgolly.puppeteer.puppeteerStrings.Exclamationmark
  - typingsJapgolly.puppeteer.puppeteerStrings.`@`
  - typingsJapgolly.puppeteer.puppeteerStrings.Numbersign
  - typingsJapgolly.puppeteer.puppeteerStrings.$
  - typingsJapgolly.puppeteer.puppeteerStrings.Percentsign
  - typingsJapgolly.puppeteer.puppeteerStrings.^
  - typingsJapgolly.puppeteer.puppeteerStrings.Ampersand
  - typingsJapgolly.puppeteer.puppeteerStrings.A
  - typingsJapgolly.puppeteer.puppeteerStrings.B
  - typingsJapgolly.puppeteer.puppeteerStrings.C
  - typingsJapgolly.puppeteer.puppeteerStrings.D
  - typingsJapgolly.puppeteer.puppeteerStrings.E
  - typingsJapgolly.puppeteer.puppeteerStrings.F
  - typingsJapgolly.puppeteer.puppeteerStrings.G
  - typingsJapgolly.puppeteer.puppeteerStrings.H
  - typingsJapgolly.puppeteer.puppeteerStrings.I
  - typingsJapgolly.puppeteer.puppeteerStrings.J
  - typingsJapgolly.puppeteer.puppeteerStrings.K
  - typingsJapgolly.puppeteer.puppeteerStrings.L
  - typingsJapgolly.puppeteer.puppeteerStrings.M
  - typingsJapgolly.puppeteer.puppeteerStrings.N
  - typingsJapgolly.puppeteer.puppeteerStrings.O
  - typingsJapgolly.puppeteer.puppeteerStrings.P
  - typingsJapgolly.puppeteer.puppeteerStrings.Q
  - typingsJapgolly.puppeteer.puppeteerStrings.R
  - typingsJapgolly.puppeteer.puppeteerStrings.S
  - typingsJapgolly.puppeteer.puppeteerStrings.T
  - typingsJapgolly.puppeteer.puppeteerStrings.U
  - typingsJapgolly.puppeteer.puppeteerStrings.V
  - typingsJapgolly.puppeteer.puppeteerStrings.W
  - typingsJapgolly.puppeteer.puppeteerStrings.X
  - typingsJapgolly.puppeteer.puppeteerStrings.Y
  - typingsJapgolly.puppeteer.puppeteerStrings.Z
  - typingsJapgolly.puppeteer.puppeteerStrings.Colon
  - typingsJapgolly.puppeteer.puppeteerStrings.Lessthansign
  - typingsJapgolly.puppeteer.puppeteerStrings._underscore
  - typingsJapgolly.puppeteer.puppeteerStrings.Greaterthansign
  - typingsJapgolly.puppeteer.puppeteerStrings.Questionmark
  - typingsJapgolly.puppeteer.puppeteerStrings.Tilde
  - typingsJapgolly.puppeteer.puppeteerStrings.Leftcurlybracket
  - typingsJapgolly.puppeteer.puppeteerStrings.Verticalline
  - typingsJapgolly.puppeteer.puppeteerStrings.Rightcurlybracket
  - typingsJapgolly.puppeteer.puppeteerStrings.Quotationmark
  - typingsJapgolly.puppeteer.puppeteerStrings.SoftLeft
  - typingsJapgolly.puppeteer.puppeteerStrings.SoftRight
  - typingsJapgolly.puppeteer.puppeteerStrings.Camera
  - typingsJapgolly.puppeteer.puppeteerStrings.Call
  - typingsJapgolly.puppeteer.puppeteerStrings.EndCall
  - typingsJapgolly.puppeteer.puppeteerStrings.VolumeDown
  - typingsJapgolly.puppeteer.puppeteerStrings.VolumeUp
*/
type KeyInput = _KeyInput | (/* \ */ String)

type PaperFormat = Uppercase[LowerCasePaperFormat] | Capitalize[LowerCasePaperFormat] | LowerCasePaperFormat

type ResourceType = Lowercase[typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResourceType]

type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
