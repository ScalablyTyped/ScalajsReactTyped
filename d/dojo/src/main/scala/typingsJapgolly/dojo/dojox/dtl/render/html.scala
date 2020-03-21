package typingsJapgolly.dojo.dojox.dtl.render

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.dojo.dojox.dtl.DomTemplated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/render/html.html
  *
  *
  */
trait html extends js.Object {
  /**
    *
    * @param attachPoint               Optional
    * @param tpl               Optional
    */
  def Render(attachPoint: HTMLElement, tpl: DomTemplated): Unit
}

object html {
  @scala.inline
  def apply(Render: (HTMLElement, DomTemplated) => Callback): html = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Render")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: typingsJapgolly.dojo.dojox.dtl.DomTemplated) => Render(t0, t1).runNow()))
    __obj.asInstanceOf[html]
  }
}

