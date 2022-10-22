package typingsJapgolly.qrcodeTerminal

import typingsJapgolly.qrcodeTerminal.anon.Small
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalInts.`0`
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalInts.`1`
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalInts.`2`
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalInts.`3`
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalStrings.H
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalStrings.L
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalStrings.M
import typingsJapgolly.qrcodeTerminal.qrcodeTerminalStrings.Q
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qrcode-terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qrcode-terminal", "error")
  @js.native
  val error: `0` | `1` | `2` | `3` = js.native
  
  inline def generate(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generate(input: String, opts: Unit, callback: js.Function1[/* qrcode */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(input: String, opts: Small): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(input: String, opts: Small, callback: js.Function1[/* qrcode */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setErrorLevel(error: L | M | Q | H): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setErrorLevel")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
