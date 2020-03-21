package typingsJapgolly.mockjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type B = scala.Boolean
  // Mockjs.setup()
  // see https://github.com/nuysoft/Mock/wiki/Mock.setup()
  type MockjsSetup = js.Function1[/* settings */ typingsJapgolly.mockjs.mod.MockjsSetupSettings, scala.Unit]
  // Mockjs.toJSONSchema()
  // see https://github.com/nuysoft/Mock/wiki/Mock.toJSONSchema()
  type MockjsToJSONSchema = js.Function1[/* template */ js.Any, typingsJapgolly.mockjs.mod.MockjsToJSONSchemaRs]
  // Mockjs.valid()
  // see https://github.com/nuysoft/Mock/wiki/Mock.valid()
  type MockjsValid = js.Function2[
    /* template */ js.Any, 
    /* data */ js.Any, 
    js.Array[typingsJapgolly.mockjs.mod.MockjsValidRsItem]
  ]
  type N = scala.Double
  type S = java.lang.String
}
