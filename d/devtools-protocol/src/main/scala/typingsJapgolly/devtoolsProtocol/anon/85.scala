package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation.SetDefaultBackgroundColorOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]
  
  var returnType: Unit
}
object `85` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]], returnType: Unit): `85` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`85`]
  }
  
  extension [Self <: `85`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[SetDefaultBackgroundColorOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
