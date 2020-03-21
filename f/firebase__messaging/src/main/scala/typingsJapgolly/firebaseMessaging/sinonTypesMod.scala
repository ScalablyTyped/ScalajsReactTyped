package typingsJapgolly.firebaseMessaging

import typingsJapgolly.sinon.mod.SinonSpy
import typingsJapgolly.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/testing/sinon-types", JSImport.Namespace)
@js.native
object sinonTypesMod extends js.Object {
  type Spy[T /* <: js.Function1[/* args */ js.Any, _] */] = SinonSpy
  type Stub[T /* <: js.Function1[/* args */ js.Any, _] */] = SinonStub
}

