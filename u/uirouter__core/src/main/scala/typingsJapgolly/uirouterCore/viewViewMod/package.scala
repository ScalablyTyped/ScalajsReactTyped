package typingsJapgolly.uirouterCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object viewViewMod {
  type ViewConfigFactory = js.Function2[
    /* path */ js.Array[typingsJapgolly.uirouterCore.pathNodeMod.PathNode], 
    /* decl */ typingsJapgolly.uirouterCore.stateInterfaceMod.ViewDeclaration, 
    typingsJapgolly.uirouterCore.viewInterfaceMod.ViewConfig | js.Array[typingsJapgolly.uirouterCore.viewInterfaceMod.ViewConfig]
  ]
  type ViewSyncListener = js.Function1[
    /* viewTuples */ js.Array[typingsJapgolly.uirouterCore.viewViewMod.ViewTuple], 
    scala.Unit
  ]
}
