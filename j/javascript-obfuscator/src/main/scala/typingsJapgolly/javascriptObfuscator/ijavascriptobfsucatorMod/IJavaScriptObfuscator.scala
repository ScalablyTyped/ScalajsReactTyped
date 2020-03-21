package typingsJapgolly.javascriptObfuscator.ijavascriptobfsucatorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.iobfuscatedcodeMod.IObfuscatedCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJavaScriptObfuscator extends js.Object {
  /**
    * @param sourceCode
    * @returns IObfuscatedCode
    */
  def obfuscate(sourceCode: String): IObfuscatedCode
}

object IJavaScriptObfuscator {
  @scala.inline
  def apply(obfuscate: String => CallbackTo[IObfuscatedCode]): IJavaScriptObfuscator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("obfuscate")(js.Any.fromFunction1((t0: java.lang.String) => obfuscate(t0).runNow()))
    __obj.asInstanceOf[IJavaScriptObfuscator]
  }
}

