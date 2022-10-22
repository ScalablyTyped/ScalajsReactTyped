package typingsJapgolly.ethereumjsRlp

import typingsJapgolly.ethereumjsRlp.ethereumjsRlpBooleans.`false`
import typingsJapgolly.ethereumjsRlp.ethereumjsRlpBooleans.`true`
import typingsJapgolly.ethereumjsRlp.mod.Decoded
import typingsJapgolly.ethereumjsRlp.mod.Input
import typingsJapgolly.ethereumjsRlp.mod.NestedUint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: Input): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `false`): js.typedarray.Uint8Array | NestedUint8Array = js.native
    def apply(input: Input, stream: `true`): Decoded = js.native
  }
}
