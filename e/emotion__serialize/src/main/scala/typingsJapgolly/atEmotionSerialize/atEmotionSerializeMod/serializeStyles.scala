package typingsJapgolly.atEmotionSerialize.atEmotionSerializeMod

import typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.RegisteredCache
import typingsJapgolly.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/serialize", "serializeStyles")
@js.native
object serializeStyles extends js.Object {
  def apply[MP](args: js.Array[TemplateStringsArray | Interpolation[MP]], registered: RegisteredCache): SerializedStyles = js.native
  def apply[MP](
    args: js.Array[TemplateStringsArray | Interpolation[MP]],
    registered: RegisteredCache,
    mergedProps: MP
  ): SerializedStyles = js.native
}

