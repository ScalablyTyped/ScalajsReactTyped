package typingsJapgolly.cucumberMessages.mod

import typingsJapgolly.cucumberMessages.distSrcBinaryToMessageStreamMod.default
import typingsJapgolly.protobufjs.mod.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cucumber-messages", "BinaryToMessageStream")
@js.native
open class BinaryToMessageStream[T] protected () extends default[T] {
  def this(decodeDelimited: js.Function1[/* reader */ Reader | js.typedarray.Uint8Array, T]) = this()
}
