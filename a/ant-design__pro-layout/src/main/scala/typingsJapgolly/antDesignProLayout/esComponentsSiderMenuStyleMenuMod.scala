package typingsJapgolly.antDesignProLayout

import typingsJapgolly.antDesignProUtils.esUseStyleMod.ProAliasToken
import typingsJapgolly.antDesignProUtils.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSiderMenuStyleMenuMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SiderMenu/style/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait ProLayoutBaseMenuToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object ProLayoutBaseMenuToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): ProLayoutBaseMenuToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[ProLayoutBaseMenuToken]
    }
    
    extension [Self <: ProLayoutBaseMenuToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
