package typingsJapgolly.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ManifestTransform = js.Function2[
    /* manifestEntries */ js.Array[typingsJapgolly.workboxBuild.typesMod.ManifestEntry], 
    /* compilation */ js.UndefOr[js.Object], 
    js.Promise[typingsJapgolly.workboxBuild.typesMod.ManifestTransformResult]
  ]
}
