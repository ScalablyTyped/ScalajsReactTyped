package typingsJapgolly.ahooks.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ahooks.ahooksStrings.advance
import typingsJapgolly.ahooks.ahooksStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeType extends StObject {
  
  def changeType(): Unit
  
  def reset(): Unit
  
  def submit(): Unit
  
  var `type`: simple | advance
}
object ChangeType {
  
  inline def apply(changeType: Callback, reset: Callback, submit: Callback, `type`: simple | advance): ChangeType = {
    val __obj = js.Dynamic.literal(changeType = changeType.toJsFn, reset = reset.toJsFn, submit = submit.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeType]
  }
  
  extension [Self <: ChangeType](x: Self) {
    
    inline def setChangeType(value: Callback): Self = StObject.set(x, "changeType", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "submit", value.toJsFn)
    
    inline def setType(value: simple | advance): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
