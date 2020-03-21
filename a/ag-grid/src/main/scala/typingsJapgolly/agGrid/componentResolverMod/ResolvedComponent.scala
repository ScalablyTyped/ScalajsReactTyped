package typingsJapgolly.agGrid.componentResolverMod

import typingsJapgolly.agGrid.Anon1
import typingsJapgolly.agGrid.AnonInstantiableB
import typingsJapgolly.agGrid.iComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedComponent[A /* <: IComponent[_] with B */, B] extends js.Object {
  var component: Anon1[A] | AnonInstantiableB[B]
  var dynamicParams: js.Any
  var source: ComponentSource
  var `type`: ComponentType
}

object ResolvedComponent {
  @scala.inline
  def apply[A /* <: IComponent[_] with B */, B](
    component: Anon1[A] | AnonInstantiableB[B],
    dynamicParams: js.Any,
    source: ComponentSource,
    `type`: ComponentType
  ): ResolvedComponent[A, B] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dynamicParams = dynamicParams.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedComponent[A, B]]
  }
}

