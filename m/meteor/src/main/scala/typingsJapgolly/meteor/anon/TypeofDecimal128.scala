package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.buffer.mod.Buffer
import typingsJapgolly.mongodb.mod.Decimal128
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDecimal128
  extends StObject
     with Instantiable1[/* bytes */ Buffer, Decimal128] {
  
  /**
    * Create a Decimal128 instance from a string representation
    *
    * @param representation - a numeric string representation.
    */
  def fromString(representation: String): typingsJapgolly.bson.mod.Decimal128 = js.native
}
