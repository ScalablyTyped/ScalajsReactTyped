package typingsJapgolly.wavesurferJs

import typingsJapgolly.wavesurferJs.srcUtilMod.Observer
import typingsJapgolly.wavesurferJs.typesXhrMod.XHROptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilFetchMod {
  
  @JSImport("wavesurfer.js/src/util/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: XHROptions): Observer = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Observer]
}
