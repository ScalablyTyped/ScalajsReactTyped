package typingsJapgolly.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "InterfaceType")
@js.native
open class InterfaceType[P, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], props: P) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typingsJapgolly.ioTs.ioTsStrings.InterfaceType = js.native
  
  val props: P = js.native
}
