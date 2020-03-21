package typingsJapgolly.relayTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object relayMockPayloadGeneratorMod {
  type MockResolver = js.Function2[
    /* context */ typingsJapgolly.relayTestUtils.relayMockPayloadGeneratorMod.MockResolverContext, 
    /* generateId */ js.Function0[scala.Double], 
    js.Any
  ]
  type MockResolvers = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.relayTestUtils.relayMockPayloadGeneratorMod.MockResolver]
}
