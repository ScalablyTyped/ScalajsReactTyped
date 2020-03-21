package typingsJapgolly.miniCreateReactContext.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  var Consumer: ComponentClassP[ConsumerProps[T] with js.Object]
  var Provider: ComponentClassP[ProviderProps[T] with js.Object]
}

object Context {
  @scala.inline
  def apply[T](
    Consumer: ComponentClassP[ConsumerProps[T] with js.Object],
    Provider: ComponentClassP[ProviderProps[T] with js.Object]
  ): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context[T]]
  }
}

