package typingsJapgolly.maquette

import typingsJapgolly.maquette.interfacesMod.Projector
import typingsJapgolly.maquette.interfacesMod.ProjectorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/projector", JSImport.Namespace)
@js.native
object projectorMod extends js.Object {
  var createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
}

