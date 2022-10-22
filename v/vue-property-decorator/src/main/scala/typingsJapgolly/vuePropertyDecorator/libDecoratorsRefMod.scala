package typingsJapgolly.vuePropertyDecorator

import typingsJapgolly.vueClassComponent.libUtilMod.VueDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsRefMod {
  
  @JSImport("vue-property-decorator/lib/decorators/Ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Ref(): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ref")().asInstanceOf[VueDecorator]
  inline def Ref(refKey: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Ref")(refKey.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
}
