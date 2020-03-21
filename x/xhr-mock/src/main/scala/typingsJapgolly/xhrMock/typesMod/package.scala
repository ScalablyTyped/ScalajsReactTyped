package typingsJapgolly.xhrMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Mock = typingsJapgolly.xhrMock.typesMod.MockObject | typingsJapgolly.xhrMock.typesMod.MockFunction
  type MockFunction = js.Function2[
    /* request */ typingsJapgolly.xhrMock.mockRequestMod.default, 
    /* response */ typingsJapgolly.xhrMock.mockResponseMod.default, 
    js.UndefOr[
      typingsJapgolly.xhrMock.mockResponseMod.default | js.Promise[js.UndefOr[typingsJapgolly.xhrMock.mockResponseMod.default]]
    ]
  ]
}
