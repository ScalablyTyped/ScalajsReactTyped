package typingsJapgolly.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHookPropName extends StObject {
  
  var dataHookPropName: js.UndefOr[String] = js.undefined
}
object DataHookPropName {
  
  inline def apply(): DataHookPropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataHookPropName]
  }
  
  extension [Self <: DataHookPropName](x: Self) {
    
    inline def setDataHookPropName(value: String): Self = StObject.set(x, "dataHookPropName", value.asInstanceOf[js.Any])
    
    inline def setDataHookPropNameUndefined: Self = StObject.set(x, "dataHookPropName", js.undefined)
  }
}
