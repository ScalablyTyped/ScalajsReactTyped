package typingsJapgolly.reactHooksHelper

import typingsJapgolly.reactHooksHelper.mod.SetForm
import typingsJapgolly.reactHooksHelper.mod.UseStepParams
import typingsJapgolly.reactHooksHelper.mod.UseStepResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactHooksHelper {
    
    @JSGlobal("ReactHooksHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def useForm[T](defaultFormConfig: T): js.Tuple2[T, SetForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForm")(defaultFormConfig.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, SetForm]]
    
    inline def useStep(params: UseStepParams): UseStepResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("useStep")(params.asInstanceOf[js.Any]).asInstanceOf[UseStepResponse]
  }
}
