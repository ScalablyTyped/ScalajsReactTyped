package typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple registry that maps `Components` to generated `ComponentFactory` classes
  * that can be used to create instances of components.
  * Use to obtain the factory for a given component type,
  * then use the factory's `create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  * @publicApi
  */
trait ComponentFactoryResolver extends js.Object {
  /**
    * Retrieves the factory object that creates a component of the given type.
    * @param component The component type.
    */
  def resolveComponentFactory[T](component: Type[T]): ComponentFactory[T]
}

object ComponentFactoryResolver {
  @scala.inline
  def apply(resolveComponentFactory: Type[js.Any] => CallbackTo[ComponentFactory[js.Any]]): ComponentFactoryResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolveComponentFactory")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod.Type[js.Any]) => resolveComponentFactory(t0).runNow()))
    __obj.asInstanceOf[ComponentFactoryResolver]
  }
}

