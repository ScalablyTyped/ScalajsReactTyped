package typingsJapgolly.openidClient.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.cryptoMod.JsonWebKeyInput
import typingsJapgolly.node.cryptoMod.KeyObject
import typingsJapgolly.node.cryptoMod.PrivateKeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(key: String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: JsonWebKeyInput): KeyObject = js.native
  def apply(key: PrivateKeyInput): KeyObject = js.native
}
