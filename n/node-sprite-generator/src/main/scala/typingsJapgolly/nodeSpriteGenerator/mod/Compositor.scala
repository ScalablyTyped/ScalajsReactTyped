package typingsJapgolly.nodeSpriteGenerator.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compositor extends js.Object {
  def readImages(
    files: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]
  ): Unit
  def render(
    layout: Layout,
    spritePath: String,
    options: CompositorOption,
    callback: js.Function1[/* error */ js.Error, Unit]
  ): Unit
}

object Compositor {
  @scala.inline
  def apply(
    readImages: (js.Array[String], js.Function2[/* error */ js.Error, /* images */ js.Array[Image], Unit]) => Callback,
    render: (Layout, String, CompositorOption, js.Function1[/* error */ js.Error, Unit]) => Callback
  ): Compositor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readImages")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: js.Function2[
  /* error */ js.Error, 
  /* images */ js.Array[typingsJapgolly.nodeSpriteGenerator.mod.Image], 
  scala.Unit]) => readImages(t0, t1).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction4((t0: typingsJapgolly.nodeSpriteGenerator.mod.Layout, t1: java.lang.String, t2: typingsJapgolly.nodeSpriteGenerator.mod.CompositorOption, t3: js.Function1[/* error */ js.Error, scala.Unit]) => render(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Compositor]
  }
}

