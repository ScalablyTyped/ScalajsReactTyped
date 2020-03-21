package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.bitcoinjsLib.paymentsMod.Stack
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitcoinjs-lib/types/templates/pubkeyhash", JSImport.Namespace)
@js.native
object pubkeyhashMod extends js.Object {
  @js.native
  object input extends js.Object {
    @js.native
    object check extends js.Object {
      var toJSON: js.Function0[String] = js.native
      def apply(script: Stack): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
    }
    
  }
  
  @js.native
  object output extends js.Object {
    @js.native
    object check extends js.Object {
      var toJSON: js.Function0[String] = js.native
      def apply(script: js.Array[Double | Buffer]): Boolean = js.native
      def apply(script: Buffer): Boolean = js.native
    }
    
  }
  
}

