package typingsJapgolly.atAngularCore.atAngularCoreMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.atAngularCore.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "Injector")
@js.native
abstract class Injector () extends js.Object {
  /**
    * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
    * @suppress {duplicate}
    */
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get[T](token: InjectionToken[T]): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T): T = js.native
  def get[T](token: InjectionToken[T], notFoundValue: T, flags: InjectFlags): T = js.native
  /**
    * Retrieves an instance from the injector based on the provided token.
    * @returns The instance from the injector if defined, otherwise the `notFoundValue`.
    * @throws When the `notFoundValue` is `undefined` or `Injector.THROW_IF_NOT_FOUND`.
    */
  def get[T](token: Type[T]): T = js.native
  def get[T](token: Type[T], notFoundValue: T): T = js.native
  def get[T](token: Type[T], notFoundValue: T, flags: InjectFlags): T = js.native
}

@JSImport("@angular/core", "INJECTOR")
@js.native
object INJECTOR extends TopLevel[InjectionToken[Injector]]

/* static members */
@JSImport("@angular/core", "Injector")
@js.native
object Injector extends js.Object {
  var NULL: Injector = js.native
  var THROW_IF_NOT_FOUND: js.Object = js.native
  def create(options: Anon_Name): Injector = js.native
  /**
    * @deprecated from v5 use the new signature Injector.create(options)
    */
  def create(providers: js.Array[StaticProvider]): Injector = js.native
  def create(providers: js.Array[StaticProvider], parent: Injector): Injector = js.native
}

