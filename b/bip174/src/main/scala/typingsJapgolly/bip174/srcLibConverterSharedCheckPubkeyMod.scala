package typingsJapgolly.bip174

import typingsJapgolly.bip174.srcLibInterfacesMod.KeyValue
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibConverterSharedCheckPubkeyMod {
  
  @JSImport("bip174/src/lib/converter/shared/checkPubkey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeChecker(pubkeyTypes: js.Array[Double]): js.Function1[/* keyVal */ KeyValue, js.UndefOr[Buffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeChecker")(pubkeyTypes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* keyVal */ KeyValue, js.UndefOr[Buffer]]]
}
