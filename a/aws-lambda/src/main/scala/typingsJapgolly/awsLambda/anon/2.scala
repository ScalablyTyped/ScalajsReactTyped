package typingsJapgolly.awsLambda.anon

import typingsJapgolly.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsJapgolly.awsLambda.triggerLexV2Mod.LevV2DialogActionWithoutSlot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with LevV2DialogActionWithoutSlot {
  
  var `type`: ConfirmIntent
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ConfirmIntent")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setType(value: ConfirmIntent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
