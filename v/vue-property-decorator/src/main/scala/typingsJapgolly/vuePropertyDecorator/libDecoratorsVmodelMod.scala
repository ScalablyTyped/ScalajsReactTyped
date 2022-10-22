package typingsJapgolly.vuePropertyDecorator

import typingsJapgolly.vueClassComponent.libUtilMod.VueDecorator
import typingsJapgolly.vueRuntimeCore.mod.PropOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsVmodelMod {
  
  @JSImport("vue-property-decorator/lib/decorators/VModel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def VModel(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VModel")().asInstanceOf[VueDecorator]
  inline def VModel(options: PropOptions[Any, Any]): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("VModel")(options.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
}
