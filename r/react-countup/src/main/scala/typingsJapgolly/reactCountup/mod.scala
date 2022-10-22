package typingsJapgolly.reactCountup

import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactCountup.buildCountUpMod.CountUpProps
import typingsJapgolly.reactCountup.buildTypesMod.CountUpApi
import typingsJapgolly.reactCountup.buildUseCountUpMod.useCountUpProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-countup", JSImport.Default)
  @js.native
  val default: FC[CountUpProps] = js.native
  
  inline def useCountUp(props: useCountUpProps): CountUpApi = ^.asInstanceOf[js.Dynamic].applyDynamic("useCountUp")(props.asInstanceOf[js.Any]).asInstanceOf[CountUpApi]
}
