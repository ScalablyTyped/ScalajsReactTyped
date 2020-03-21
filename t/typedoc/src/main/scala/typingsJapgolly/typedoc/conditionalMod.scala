package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.TypeTypeConverter
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.typesAbstractMod.Type
import typingsJapgolly.typescript.mod.ConditionalType
import typingsJapgolly.typescript.mod.ConditionalTypeNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/conditional", JSImport.Namespace)
@js.native
object conditionalMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedoc.componentMod.ComponentHost because Already inherited
  - typingsJapgolly.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsJapgolly.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  class ConditionalConverter () extends TypeTypeConverter[ConditionalType] {
    def convertNode(context: Context, node: ConditionalTypeNode): js.UndefOr[typingsJapgolly.typedoc.modelsTypesMod.ConditionalType] = js.native
    def convertNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): js.UndefOr[Type] = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode): Boolean = js.native
    def supportsNode(context: Context, node: ConditionalTypeNode, `type`: ConditionalType): Boolean = js.native
  }
  
}

