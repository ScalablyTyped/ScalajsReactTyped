package typingsJapgolly.orbitUiReactComponents

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcStyleContextMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/StyleContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/StyleContext", "StyleContext")
  @js.native
  val StyleContext: Context[StyleContextType] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/StyleContext", "StyleProvider")
  @js.native
  val StyleProvider: Provider[StyleContextType] = js.native
  
  inline def useStyleContext(): StyleContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleContext")().asInstanceOf[StyleContextType]
  
  inline def useStyleProps(key: String): js.Tuple2[StyleContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStyleProps")(key.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[StyleContextType, Boolean]]
  
  type StyleContextType = Record[String, Any]
}
