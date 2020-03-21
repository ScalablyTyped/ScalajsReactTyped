package typingsJapgolly.jqueryTools.JQueryTools.overlay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayStatic extends js.Object {
  def addEffect(
    effectName: String,
    effectFn: js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit],
    closeFn: js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]
  ): Unit
}

object OverlayStatic {
  @scala.inline
  def apply(
    addEffect: (String, js.ThisFunction2[/* this */ Overlay, /* position */ CssOptions, /* done */ js.Function0[Unit], Unit], js.ThisFunction1[/* this */ Overlay, /* done */ js.Function0[Unit], Unit]) => Callback
  ): OverlayStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEffect")(js.Any.fromFunction3((t0: java.lang.String, t1: js.ThisFunction2[
  /* this */ typingsJapgolly.jqueryTools.JQueryTools.overlay.Overlay, 
  /* position */ typingsJapgolly.jqueryTools.JQueryTools.overlay.CssOptions, 
  /* done */ js.Function0[scala.Unit], 
  scala.Unit], t2: js.ThisFunction1[
  /* this */ typingsJapgolly.jqueryTools.JQueryTools.overlay.Overlay, 
  /* done */ js.Function0[scala.Unit], 
  scala.Unit]) => addEffect(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OverlayStatic]
  }
}

