package typingsJapgolly.nextServer

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/head", JSImport.Namespace)
@js.native
object nextServerHeadMod extends js.Object {
  def defaultHead(): js.Array[Element] = js.native
  def defaultHead(inAmpMode: Boolean): js.Array[Element] = js.native
  @js.native
  object default extends js.Object {
    var rewind: js.Function0[js.UndefOr[js.Array[Element]]] = js.native
    /**
      * This component injects elements to `<head>` of your page.
      * To avoid duplicated `tags` in `<head>` you can use the `key` property, which will make sure every tag is only rendered once.
      */
    def apply(hasChildren: AnonChildren): Element = js.native
  }
  
}

