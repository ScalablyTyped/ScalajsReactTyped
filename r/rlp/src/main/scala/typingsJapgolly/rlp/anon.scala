package typingsJapgolly.rlp

import typingsJapgolly.rlp.mod.Decoded
import typingsJapgolly.rlp.mod.Input
import typingsJapgolly.rlp.mod.NestedUint8Array
import typingsJapgolly.rlp.rlpBooleans.`false`
import typingsJapgolly.rlp.rlpBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: Input): Decoded = js.native
    def apply(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `true`): Decoded = js.native
  }
}
