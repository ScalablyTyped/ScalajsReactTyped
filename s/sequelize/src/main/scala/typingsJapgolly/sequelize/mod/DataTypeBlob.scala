package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.anon.LengthString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeBlob
  extends StObject
     with DataTypeAbstract {
  
  /**
    * Length of the blob field.
    *
    * Available lengths: `tiny`, `medium`, `long`
    */
  def apply(): DataTypeBlob = js.native
  def apply(length: String): DataTypeBlob = js.native
  def apply(options: LengthString): DataTypeBlob = js.native
}
