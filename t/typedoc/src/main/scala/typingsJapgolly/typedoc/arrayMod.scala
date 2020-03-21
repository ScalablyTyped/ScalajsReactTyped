package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeTypeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsMod.Type
import typingsJapgolly.typescript.mod.ArrayTypeNode
import typingsJapgolly.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedoc.componentMod.ComponentHost because Already inherited
  - typingsJapgolly.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsJapgolly.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ArrayConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: ArrayTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: ArrayTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ArrayTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

