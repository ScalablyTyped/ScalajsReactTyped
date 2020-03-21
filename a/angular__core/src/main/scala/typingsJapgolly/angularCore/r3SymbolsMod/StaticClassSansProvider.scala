package typingsJapgolly.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configures the `Injector` to return an instance of `useClass` for a token.
  * Base for `StaticClassProvider` decorator.
  *
  * @publicApi
  */
trait StaticClassSansProvider extends js.Object {
  /**
    * A list of `token`s to be resolved by the injector. The list of values is then
    * used as arguments to the `useClass` constructor.
    */
  var deps: js.Array[_]
  /**
    * An optional class to instantiate for the `token`. By default, the `provide`
    * class is instantiated.
    */
  var useClass: Type[_]
}

object StaticClassSansProvider {
  @scala.inline
  def apply(deps: js.Array[_], useClass: Type[_]): StaticClassSansProvider = {
    val __obj = js.Dynamic.literal(deps = deps.asInstanceOf[js.Any], useClass = useClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticClassSansProvider]
  }
}

