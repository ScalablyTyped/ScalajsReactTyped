package typingsJapgolly.awsSdkHashStreamNode

import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.Hash
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHashCalculatorMod {
  
  @JSImport("@aws-sdk/hash-stream-node/dist-types/HashCalculator", "HashCalculator")
  @js.native
  open class HashCalculator protected () extends Writable {
    def this(hash: Hash) = this()
    def this(hash: Hash, options: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val hash: Hash = js.native
  }
}
