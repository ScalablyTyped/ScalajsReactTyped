package typingsJapgolly.relayTestUtils

import typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyType
import typingsJapgolly.reactRelay.relayHooksHelpersMod.KeyTypeData
import typingsJapgolly.relayTestUtils.relayTestUtilsStrings.Space$fragmentSpreads
import typingsJapgolly.relayTestUtils.relayTestUtilsStrings.Space$fragmentType
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRelayResolverTestUtilsMod {
  
  @JSImport("relay-test-utils/lib/RelayResolverTestUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testResolver[TKey /* <: KeyType[Any] */, Ret](
    resolver: js.Function1[/* arg */ TKey, Ret],
    fragmentData: Omit[KeyTypeData[TKey, Any], Space$fragmentSpreads | Space$fragmentType]
  ): Ret = (^.asInstanceOf[js.Dynamic].applyDynamic("testResolver")(resolver.asInstanceOf[js.Any], fragmentData.asInstanceOf[js.Any])).asInstanceOf[Ret]
}
