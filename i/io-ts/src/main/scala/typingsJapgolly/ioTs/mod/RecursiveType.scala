package typingsJapgolly.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "RecursiveType")
@js.native
open class RecursiveType[C /* <: Any_ */, A, O, I] protected () extends Type_[A, O, I] {
  def this(
    name: String,
    is: Is[A],
    validate: Validate[I, A],
    encode: Encode[A, O],
    runDefinition: js.Function0[C]
  ) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typingsJapgolly.ioTs.ioTsStrings.RecursiveType = js.native
  
  def runDefinition(): C = js.native
  
  /**
    * @since 1.0.0
    */
  val `type`: C = js.native
}
