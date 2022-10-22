package typingsJapgolly.sshpk.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.sshpk.sshpkStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == ed-compat.js == //
@JSImport("sshpk", "Verifier")
@js.native
open class Verifier protected () extends Writable {
  def this(key: Key, hashAlgo: sha512) = this()
  
  def update(chunk: String): Unit = js.native
  def update(chunk: Buffer): Unit = js.native
  
  def verify(signature: Signature): Boolean = js.native
}
