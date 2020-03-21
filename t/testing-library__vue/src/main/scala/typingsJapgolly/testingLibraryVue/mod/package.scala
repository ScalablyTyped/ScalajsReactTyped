package typingsJapgolly.testingLibraryVue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConfigurationCallback[V /* <: typingsJapgolly.vue.vueMod.Vue */] = js.Function3[
    /* vue */ V, 
    /* store */ typingsJapgolly.vuex.mod.Store[js.Any], 
    /* router */ typingsJapgolly.vueRouter.mod.default, 
    (typingsJapgolly.std.Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThisTypedMountOptions<V> */ js.Any
    ]) | scala.Unit
  ]
}
