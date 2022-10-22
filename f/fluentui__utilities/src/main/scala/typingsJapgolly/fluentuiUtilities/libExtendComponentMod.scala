package typingsJapgolly.fluentuiUtilities

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExtendComponentMod {
  
  @JSImport("@fluentui/utilities/lib/extendComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendComponent[T /* <: Component[js.Object, js.Object] */](
    parent: T,
    methods: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]:? T[key]} */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendComponent")(parent.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
