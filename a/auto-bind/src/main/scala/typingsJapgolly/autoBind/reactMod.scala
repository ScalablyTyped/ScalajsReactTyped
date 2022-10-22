package typingsJapgolly.autoBind

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.autoBind.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("auto-bind/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[SelfType /* <: Component[js.Object, js.Object] */](self: SelfType): SelfType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(self.asInstanceOf[js.Any]).asInstanceOf[SelfType]
  inline def default[SelfType /* <: Component[js.Object, js.Object] */](self: SelfType, options: Options): SelfType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(self.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelfType]
}
