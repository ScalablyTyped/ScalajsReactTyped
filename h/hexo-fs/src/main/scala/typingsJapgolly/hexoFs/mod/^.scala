package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var F_OK: js.UndefOr[Double] = js.native
  var R_OK: js.UndefOr[Double] = js.native
  var W_OK: js.UndefOr[Double] = js.native
  var X_OK: js.UndefOr[Double] = js.native
  var access: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* mode */ js.UndefOr[Double], 
      typingsJapgolly.bluebird.mod.^[Unit]
    ]
  ] = js.native
  var accessSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ js.UndefOr[Double], Unit]] = js.native
}

