package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.`3rdParty`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyModule
  extends StObject
     with Module {
  
  def init(i18next: i18n): Unit
  
  @JSName("type")
  var type_ThirdPartyModule: `3rdParty`
}
object ThirdPartyModule {
  
  inline def apply(init: i18n => japgolly.scalajs.react.Callback): ThirdPartyModule = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1((t0: i18n) => init(t0).runNow()))
    __obj.updateDynamic("type")("3rdParty")
    __obj.asInstanceOf[ThirdPartyModule]
  }
  
  extension [Self <: ThirdPartyModule](x: Self) {
    
    inline def setInit(value: i18n => japgolly.scalajs.react.Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: i18n) => value(t0).runNow()))
    
    inline def setType(value: `3rdParty`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
