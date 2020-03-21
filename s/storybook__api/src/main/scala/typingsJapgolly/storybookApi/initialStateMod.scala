package typingsJapgolly.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookApi.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/initial-state", JSImport.Namespace)
@js.native
object initialStateMod extends js.Object {
  def default(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param additions because its type Additions is not an array type */ additions: Additions
  ): State = js.native
  type Addition = StringDictionary[js.Any]
  type Additions = js.Array[Addition]
}

