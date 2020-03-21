package typingsJapgolly.frctlFractal.mod.fractal.core

import typingsJapgolly.frctlFractal.AnonRegister
import typingsJapgolly.frctlFractal.frctlFractalBooleans.`true`
import typingsJapgolly.frctlFractal.mod.Adapter
import typingsJapgolly.frctlFractal.mod.fractal.core.mixins.Collection
import typingsJapgolly.frctlFractal.mod.fractal.core.mixins.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@frctl/fractal", "fractal.core.entities")
@js.native
object entities extends js.Object {
  @js.native
  abstract class Entity ()
    extends typingsJapgolly.frctlFractal.mod.fractal.core.mixins.Entity {
    val isCollection: js.UndefOr[`true`] = js.native
    val isComponent: js.UndefOr[`true`] = js.native
    val isDoc: js.UndefOr[`true`] = js.native
    val isVariant: js.UndefOr[`true`] = js.native
    val status: StatusInfo = js.native
    def getContext(): js.Any = js.native
    def getResolvedContext(): js.Any = js.native
    def hasContext(): js.Promise[Boolean] = js.native
    def setContext(data: js.Any): Unit = js.native
  }
  
  @js.native
  trait EntityCollection[T /* <: Entity */]
    extends typingsJapgolly.frctlFractal.mod.fractal.core.mixins.Entity
       with Collection[T] {
    val entities: this.type = js.native
    /* InferMemberOverrides */
    override def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait EntitySource[T /* <: Entity */, TConfig] extends Source[T, TConfig] {
    def engine[TEngine](): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: String): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: js.Function0[AnonRegister[T, TEngine]]): Adapter[TEngine] = js.native
    def engine[TEngine](adapterFactory: AnonRegister[T, TEngine]): Adapter[TEngine] = js.native
    def entities(): js.Array[T] = js.native
    def getProp(key: String): String | js.Object = js.native
    def statusInfo(handle: String): StatusInfo | Null = js.native
  }
  
}

