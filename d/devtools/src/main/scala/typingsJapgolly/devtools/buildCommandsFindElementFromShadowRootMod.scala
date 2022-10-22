package typingsJapgolly.devtools

import typingsJapgolly.devtools.anon.ShadowId
import typingsJapgolly.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementFromShadowRootMod {
  
  @JSImport("devtools/build/commands/findElementFromShadowRoot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasShadowIdUsingValue: ShadowId): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasShadowIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
}
