package typingsJapgolly.vuePropertyDecorator

import typingsJapgolly.vueClassComponent.libUtilMod.VueDecorator
import typingsJapgolly.vueRuntimeCore.mod.WatchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDecoratorsWatchMod {
  
  @JSImport("vue-property-decorator/lib/decorators/Watch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Watch(path: String): VueDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(path.asInstanceOf[js.Any]).asInstanceOf[VueDecorator]
  inline def Watch(path: String, options: WatchOptions[Boolean]): VueDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Watch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VueDecorator]
}
