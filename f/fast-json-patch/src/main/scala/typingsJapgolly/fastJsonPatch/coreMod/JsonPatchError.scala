package typingsJapgolly.fastJsonPatch.coreMod

import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.fastJsonPatch.helpersMod.JsonPatchErrorName
import typingsJapgolly.fastJsonPatch.helpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/commonjs/core", "JsonPatchError")
@js.native
object JsonPatchError
  extends TopLevel[
      Instantiable5[
        /* message */ String, 
        /* name */ JsonPatchErrorName, 
        js.UndefOr[/* index */ Double], 
        js.UndefOr[/* operation */ js.Any], 
        js.UndefOr[/* tree */ js.Any], 
        PatchError
      ]
    ]

