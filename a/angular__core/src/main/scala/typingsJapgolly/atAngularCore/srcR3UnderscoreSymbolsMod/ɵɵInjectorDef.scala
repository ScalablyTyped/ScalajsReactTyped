package typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵɵInjectorDef[T] extends js.Object {
  var imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]]
  var providers: js.Array[
    Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
  ]
  def factory(): T
}

object ɵɵInjectorDef {
  @scala.inline
  def apply[T](
    factory: CallbackTo[T],
    imports: js.Array[InjectorType[_] | InjectorTypeWithProviders[_]],
    providers: js.Array[
      Type[_] | ValueProvider | ExistingProvider | FactoryProvider | ConstructorProvider | StaticClassProvider | ClassProvider | js.Array[_]
    ]
  ): ɵɵInjectorDef[T] = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(factory.toJsFn)
    __obj.asInstanceOf[ɵɵInjectorDef[T]]
  }
}

