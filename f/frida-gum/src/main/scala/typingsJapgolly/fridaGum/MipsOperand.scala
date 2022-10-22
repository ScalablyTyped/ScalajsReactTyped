package typingsJapgolly.fridaGum

import typingsJapgolly.fridaGum.anon.BaseDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.MipsRegOperand
  - typingsJapgolly.fridaGum.MipsImmOperand
  - typingsJapgolly.fridaGum.MipsMemOperand
*/
trait MipsOperand extends StObject
object MipsOperand {
  
  inline def MipsImmOperand(value: Double): typingsJapgolly.fridaGum.MipsImmOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imm")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.MipsImmOperand]
  }
  
  inline def MipsMemOperand(value: BaseDisp): typingsJapgolly.fridaGum.MipsMemOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mem")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.MipsMemOperand]
  }
  
  inline def MipsRegOperand(value: MipsRegister): typingsJapgolly.fridaGum.MipsRegOperand = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reg")
    __obj.asInstanceOf[typingsJapgolly.fridaGum.MipsRegOperand]
  }
}
