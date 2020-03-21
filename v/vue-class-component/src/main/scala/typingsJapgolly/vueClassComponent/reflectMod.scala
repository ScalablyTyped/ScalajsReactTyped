package typingsJapgolly.vueClassComponent

import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import typingsJapgolly.vueClassComponent.declarationsMod.VueClass
import typingsJapgolly.vueClassComponent.vueClassComponentBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue-class-component/lib/reflect", JSImport.Namespace)
@js.native
object reflectMod extends js.Object {
  def copyReflectionMetadata(to: VueConstructor[Vue], from: VueClass[Vue]): Unit = js.native
  def reflectionIsSupported(): `false` | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Reflect.getOwnMetadataKeys */ js.Any) = js.native
}

