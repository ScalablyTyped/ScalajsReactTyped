package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeTypeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.modelsTypesMod.IntersectionType
import typingsJapgolly.typedoc.modelsTypesMod.UnionType
import typingsJapgolly.typedoc.typesAbstractMod.Type
import typingsJapgolly.typescript.mod.UnionOrIntersectionType
import typingsJapgolly.typescript.mod.UnionOrIntersectionTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/union-or-intersection", JSImport.Namespace)
@js.native
object unionOrIntersectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedoc.componentMod.ComponentHost because Already inherited
  - typingsJapgolly.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsJapgolly.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class UnionOrIntersectionConverter () extends TypeTypeConverter[UnionOrIntersectionType] {
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode): UnionType | IntersectionType = js.native
    def convertNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: UnionOrIntersectionTypeNode, `type`: UnionOrIntersectionType): Boolean = js.native
  }
  
}

