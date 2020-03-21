package typingsJapgolly.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerReflectionContainer[TChildren] extends js.Object {
  var children: js.Array[TChildren]
}

object ContainerReflectionContainer {
  @scala.inline
  def apply[TChildren](children: js.Array[TChildren]): ContainerReflectionContainer[TChildren] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerReflectionContainer[TChildren]]
  }
}

