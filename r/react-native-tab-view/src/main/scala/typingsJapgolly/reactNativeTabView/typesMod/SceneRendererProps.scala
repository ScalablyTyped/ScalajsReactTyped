package typingsJapgolly.reactNativeTabView.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneRendererProps extends js.Object {
  var layout: Layout
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  def jumpTo(key: String): Unit
}

object SceneRendererProps {
  @scala.inline
  def apply(
    jumpTo: String => Callback,
    layout: Layout,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  ): SceneRendererProps = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    __obj.asInstanceOf[SceneRendererProps]
  }
}

