package typingsJapgolly.typedoc

import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.typedoc.abstractMod.Reflection
import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.componentMod.ComponentOptions
import typingsJapgolly.typedoc.contextMod.Context
import typingsJapgolly.typedoc.converterConverterMod.Converter
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SyntaxKind
import typingsJapgolly.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  abstract class ConverterComponent () extends AbstractComponent[Converter]
  
  @js.native
  abstract class ConverterNodeComponent[T /* <: Node */] () extends AbstractComponent[Converter] {
    var supports: js.Array[SyntaxKind] = js.native
    def convert(context: Context, node: T): js.UndefOr[Reflection] = js.native
  }
  
  @js.native
  abstract class ConverterTypeComponent () extends AbstractComponent[Converter] {
    var priority: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.typedoc.componentMod.ComponentHost because Already inherited
  - typingsJapgolly.typedoc.utilsEventsMod.EventDispatcher because Already inherited
  - typingsJapgolly.typedoc.componentMod.AbstractComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.ConverterTypeComponent because Already inherited
  - typingsJapgolly.typedoc.componentsMod.TypeNodeConverter because var conflicts: _componentOptions, _componentOwner, _events, _listeners, _listeningTo, _savedListenId, application, componentName, internalOn, priority. Inlined supportsNode, supportsNode, convertNode, convertNode */ @js.native
  trait TypeConverter[T /* <: Type */, N /* <: Node */] extends TypeTypeConverter[T] {
    def convertNode(context: Context, node: N): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeNodeConverter[T /* <: Type */, N /* <: Node */] extends ConverterTypeComponent {
    def convertNode(context: Context, node: N): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def convertNode(context: Context, node: N, `type`: T): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def supportsNode(context: Context, node: N): Boolean = js.native
    def supportsNode(context: Context, node: N, `type`: T): Boolean = js.native
  }
  
  @js.native
  trait TypeTypeConverter[T /* <: Type */] extends ConverterTypeComponent {
    def convertType(context: Context, `type`: T): js.UndefOr[typingsJapgolly.typedoc.typesAbstractMod.Type] = js.native
    def supportsType(context: Context, `type`: T): Boolean = js.native
  }
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
}

