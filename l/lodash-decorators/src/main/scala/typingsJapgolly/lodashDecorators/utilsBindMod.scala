package typingsJapgolly.lodashDecorators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsBindMod {
  
  @JSImport("lodash-decorators/utils/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(fn: js.Function, context: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(fn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Function]
}
