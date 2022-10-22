package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChannelMod.ScaleChannel
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcResolveMod.Resolve
import typingsJapgolly.vegaLite.buildSrcResolveMod.ResolveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileResolveMod {
  
  @JSImport("vega-lite/build/src/compile/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultScaleResolve(channel: ScaleChannel, model: Model): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultScaleResolve")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
  
  inline def parseGuideResolve(resolve: Resolve, channel: ScaleChannel): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGuideResolve")(resolve.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
}
