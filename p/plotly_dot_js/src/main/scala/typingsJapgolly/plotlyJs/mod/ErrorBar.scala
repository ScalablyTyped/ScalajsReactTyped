package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.constant
import typingsJapgolly.plotlyJs.plotlyJsStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.plotlyJs.anon.typeconstantpercentvaluen
  - typingsJapgolly.plotlyJs.anon.typedataarrayArrayDatumar
*/
trait ErrorBar extends StObject
object ErrorBar {
  
  inline def typeconstantpercentvaluen(`type`: constant | percent, value: Double): typingsJapgolly.plotlyJs.anon.typeconstantpercentvaluen = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.anon.typeconstantpercentvaluen]
  }
  
  inline def typedataarrayArrayDatumar(array: js.Array[Datum]): typingsJapgolly.plotlyJs.anon.typedataarrayArrayDatumar = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[typingsJapgolly.plotlyJs.anon.typedataarrayArrayDatumar]
  }
}
