package typingsJapgolly.sequelize.mod

import typingsJapgolly.sequelize.anon.Decimals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataTypeDouble
  extends StObject
     with DataTypeAbstractNumber[DataTypeDouble] {
  
  /**
    * Length of the number field and decimals of the real
    */
  def apply(): DataTypeDouble = js.native
  def apply(length: Double): DataTypeDouble = js.native
  def apply(length: Double, decimals: Double): DataTypeDouble = js.native
  def apply(options: Decimals): DataTypeDouble = js.native
}
