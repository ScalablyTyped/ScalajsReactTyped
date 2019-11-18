package typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Library extends js.Object {
  def add(definitions: IconDefinitionOrPack*): Unit
  def reset(): Unit
}

object Library {
  @scala.inline
  def apply(add: /* repeated */ IconDefinitionOrPack => Callback, reset: Callback): Library = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod.IconDefinitionOrPack) => add(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Library]
  }
}

@JSImport("@fortawesome/fontawesome-svg-core", "library")
@js.native
object library extends TopLevel[Library]

