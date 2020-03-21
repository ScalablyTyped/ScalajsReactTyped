package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.converterConverterMod.Converter
import typingsJapgolly.typedoc.reflectionGroupMod.ReflectionGroup
import typingsJapgolly.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/GroupPlugin", JSImport.Namespace)
@js.native
object groupPluginMod extends js.Object {
  @js.native
  class GroupPlugin () extends AbstractComponent[Converter] {
    var onEndResolve: js.Any = js.native
    var onResolve: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    var getKindString: js.Any = js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    def getReflectionGroups(reflections: js.Array[Reflection]): js.Array[ReflectionGroup] = js.native
    def sortCallback(a: Reflection, b: Reflection): Double = js.native
  }
  
}

