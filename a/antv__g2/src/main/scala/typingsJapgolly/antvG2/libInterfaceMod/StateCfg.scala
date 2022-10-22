package typingsJapgolly.antvG2.libInterfaceMod

import typingsJapgolly.antvG2.libGeometryElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateCfg extends StObject {
  
  /**
    * @title 状态样式配置。
    */
  var style: js.UndefOr[js.Object | StateStyleCallback] = js.undefined
}
object StateCfg {
  
  inline def apply(): StateCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateCfg]
  }
  
  extension [Self <: StateCfg](x: Self) {
    
    inline def setStyle(value: js.Object | StateStyleCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction1(value: /* element */ default => LooseObject): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
