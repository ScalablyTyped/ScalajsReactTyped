package typingsJapgolly.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Crypto parameters
/**
  * A base structure of a parameter
  */
trait IParams extends StObject {
  
  /**
    * Type of crypto param. Uses constants CK_PARAMS_*
    */
  var `type`: Double
}
object IParams {
  
  inline def apply(`type`: Double): IParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParams]
  }
  
  extension [Self <: IParams](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
