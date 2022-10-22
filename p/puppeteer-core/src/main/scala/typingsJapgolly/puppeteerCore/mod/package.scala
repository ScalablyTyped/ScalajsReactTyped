package typingsJapgolly.puppeteerCore.mod

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import typingsJapgolly.puppeteerCore.mod.^
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
  - typingsJapgolly.puppeteerCore.mod.HandleFor[T]
  - typingsJapgolly.puppeteerCore.mod.JSHandle[T]
  - T
*/
type HandleOr[T] = _HandleOr[T] | T

type Handler[T] = js.Function1[/* event */ js.UndefOr[T], Unit]

type InterceptResolutionStrategy = InterceptResolutionAction

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`0`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`1`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`2`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`3`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`4`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`5`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`6`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`7`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`8`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`9`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Power
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Eject
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Abort
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Help
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Backspace
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Tab
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad5
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadEnter
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Enter
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Carriagereturn
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Linefeed
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ShiftLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ShiftRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ControlLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ControlRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AltLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AltRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Pause
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.CapsLock
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Escape
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Convert
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NonConvert
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Space
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad9
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.PageUp
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad3
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.PageDown
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.End
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad1
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Home
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad7
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ArrowLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad4
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad8
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ArrowUp
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ArrowRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad6
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad2
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ArrowDown
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Select
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Open
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.PrintScreen
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Insert
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numpad0
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Delete
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadDecimal
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit0
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit1
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit2
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit3
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit4
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit5
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit6
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit7
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit8
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Digit9
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyA
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyB
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyC
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyD
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyE
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyF
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyG
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyH
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyI
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyJ
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyK
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyL
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyM
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyN
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyO
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyP
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyQ
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyR
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyS
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyT
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyU
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyV
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyW
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyX
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyY
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.KeyZ
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MetaLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MetaRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ContextMenu
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadMultiply
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadAdd
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadSubtract
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadDivide
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F1
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F2
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F3
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F4
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F5
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F6
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F7
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F8
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F9
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F10
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F11
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F12
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F13
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F14
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F15
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F16
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F17
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F18
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F19
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F20
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F21
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F22
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F23
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F24
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumLock
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ScrollLock
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AudioVolumeMute
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AudioVolumeDown
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AudioVolumeUp
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MediaTrackNext
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MediaTrackPrevious
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MediaStop
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.MediaPlayPause
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Semicolon
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Equal
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.NumpadEqual
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Comma
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Minus
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Period
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Slash
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Backquote
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.BracketLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Backslash
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.BracketRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Quote
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.AltGraph
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Props
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Cancel
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Clear
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Shift
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Control
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Alt
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Accept
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ModeChange
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Space
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Print
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Execute
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Null
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.a_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.b_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.c_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.d_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.e_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.f_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.g_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.h_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.i_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.j_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.k_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.l_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.m_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.n_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.o_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.p_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.q_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.r_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.s_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.t_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.u_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.v_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.w_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.x_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.y_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.z_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Meta
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Asterisk
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Plussign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`-_`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Slash
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Semicolon
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Equalssign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Comma
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Dot
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Graveaccent
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`[`
  - / * \ * / java.lang.String
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`]`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Attn
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.CrSel
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ExSel
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.EraseEof
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Play
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.ZoomOut
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Exclamationmark
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.`@`
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Numbersign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.$
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Percentsign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.^
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Ampersand
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.A
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.B
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.C
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.D
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.E
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.F
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.G
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.H
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.I
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.J
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.K
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.L
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.M
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.N
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.O
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.P
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Q
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.R
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.S
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.T
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.U
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.V
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.W
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.X
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Y
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Z
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Colon
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Lessthansign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings._underscore
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Greaterthansign
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Questionmark
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Tilde
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Leftcurlybracket
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Verticalline
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Rightcurlybracket
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Quotationmark
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.SoftLeft
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.SoftRight
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Camera
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.Call
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.EndCall
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.VolumeDown
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.VolumeUp
*/
type KeyInput = _KeyInput | (/* \ */ String)

type PaperFormat = Uppercase[LowerCasePaperFormat] | Capitalize[LowerCasePaperFormat] | LowerCasePaperFormat

type ResourceType = Lowercase[typingsJapgolly.devtoolsProtocol.mod.Protocol.Network.ResourceType]

type TargetFilterCallback = js.Function1[/* target */ TargetInfo, Boolean]
