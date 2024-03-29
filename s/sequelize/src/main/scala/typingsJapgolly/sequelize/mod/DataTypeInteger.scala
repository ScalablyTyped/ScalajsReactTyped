package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeInteger
  extends StObject
     with DataTypeAbstractNumber[DataTypeInteger] {
  
  /**
    * Length of the number field.
    */
  def apply(): DataTypeInteger = js.native
  def apply(length: Double): DataTypeInteger = js.native
  def apply(options: Length): DataTypeInteger = js.native
}
