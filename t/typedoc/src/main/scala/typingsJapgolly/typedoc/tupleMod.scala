package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeTypeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsTypesMod.TupleType
import typingsJapgolly.typedoc.typesAbstractMod.Type
import typingsJapgolly.typescript.mod.TupleTypeNode
import typingsJapgolly.typescript.mod.TypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/tuple", JSImport.Namespace)
@js.native
object tupleMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedoc.componentMod.ComponentHost because Already inherited
  - typingsJapgolly.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsJapgolly.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class TupleConverter () extends TypeTypeConverter[TypeReference] {
    def convertNode(context: Context, node: TupleTypeNode): js.UndefOr[Type] = js.native
    def convertNode(context: Context, node: TupleTypeNode, `type`: TypeReference): js.UndefOr[Type] = js.native
    @JSName("convertNode")
    def convertNode_TupleType(context: Context, node: TupleTypeNode): TupleType = js.native
    def supportsNode(context: Context, node: TupleTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: TupleTypeNode, `type`: TypeReference): Boolean = js.native
  }
  
}

