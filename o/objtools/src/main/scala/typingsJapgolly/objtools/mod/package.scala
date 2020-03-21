package typingsJapgolly.objtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Mask = typingsJapgolly.objtools.mod.MaskObj | js.Array[typingsJapgolly.objtools.mod.MaskObj] | scala.Boolean
  type MaskedOutHook = js.Function1[/* path */ java.lang.String, scala.Unit]
  type MergeCustomizer = js.Function4[
    /* objectValue */ js.Any, 
    /* sourceValue */ js.Any, 
    /* key */ java.lang.String, 
    /* object */ js.Any, 
    js.Any
  ]
  type OnFieldHook = js.Function4[
    /* field */ java.lang.String, 
    /* toVal */ js.Any, 
    /* fromVal */ js.Any, 
    /* parentObj */ typingsJapgolly.std.Record[java.lang.String, js.Any], 
    js.Any
  ]
}
