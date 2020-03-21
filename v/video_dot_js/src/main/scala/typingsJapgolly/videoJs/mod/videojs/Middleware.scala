package typingsJapgolly.videoJs.mod.videojs

import japgolly.scalajs.react.Callback
import typingsJapgolly.videoJs.mod.videojs.Tech.SourceObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Middleware extends js.Object {
  /**
    *
    * @param src
    * @param next
    */
  def setSource(
    src: SourceObject,
    next: js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]
  ): Unit
}

object Middleware {
  @scala.inline
  def apply(
    setSource: (SourceObject, js.Function2[/* err */ js.Any, /* next */ js.Function1[/* src */ SourceObject, Unit], Unit]) => Callback
  ): Middleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setSource")(js.Any.fromFunction2((t0: typingsJapgolly.videoJs.mod.videojs.Tech.SourceObject, t1: js.Function2[
  /* err */ js.Any, 
  /* next */ js.Function1[/* src */ typingsJapgolly.videoJs.mod.videojs.Tech.SourceObject, scala.Unit], 
  scala.Unit]) => setSource(t0, t1).runNow()))
    __obj.asInstanceOf[Middleware]
  }
}

