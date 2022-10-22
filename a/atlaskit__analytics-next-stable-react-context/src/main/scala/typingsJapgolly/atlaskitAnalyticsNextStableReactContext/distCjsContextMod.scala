package typingsJapgolly.atlaskitAnalyticsNextStableReactContext

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.atlaskitAnalyticsNextStableReactContext.distCjsTypesMod.AnalyticsReactContextInterface
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsContextMod extends Shortcut {
  
  @JSImport("@atlaskit/analytics-next-stable-react-context/dist/cjs/context", JSImport.Default)
  @js.native
  val default: Context[AnalyticsReactContextInterface] = js.native
  
  type _To = Context[AnalyticsReactContextInterface]
  
  /* This means you don't have to write `default`, but can instead just say `distCjsContextMod.foo` */
  override def _to: Context[AnalyticsReactContextInterface] = default
}
