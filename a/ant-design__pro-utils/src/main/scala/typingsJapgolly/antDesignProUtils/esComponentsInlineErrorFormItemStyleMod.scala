package typingsJapgolly.antDesignProUtils

import typingsJapgolly.antDesignProUtils.esUseStyleMod.ProAliasToken
import typingsJapgolly.antDesignProUtils.esUseStyleMod.UseStyleResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsInlineErrorFormItemStyleMod {
  
  @JSImport("@ant-design/pro-utils/es/components/InlineErrorFormItem/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useStyle(prefixCls: String): UseStyleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyle")(prefixCls.asInstanceOf[js.Any]).asInstanceOf[UseStyleResult]
  
  trait ProToken
    extends StObject
       with ProAliasToken {
    
    var componentCls: String
  }
  object ProToken {
    
    inline def apply(ProAliasToken: ProAliasToken, componentCls: String): ProToken = {
      val __obj = js.Dynamic.literal(componentCls = componentCls.asInstanceOf[js.Any])
      js.Dynamic.global.Object.assign(__obj, ProAliasToken)
      __obj.asInstanceOf[ProToken]
    }
    
    extension [Self <: ProToken](x: Self) {
      
      inline def setComponentCls(value: String): Self = StObject.set(x, "componentCls", value.asInstanceOf[js.Any])
    }
  }
}
