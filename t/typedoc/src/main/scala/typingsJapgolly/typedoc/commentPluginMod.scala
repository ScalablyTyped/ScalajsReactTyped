package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.commentsMod.Comment
import typingsJapgolly.typedoc.componentMod.AbstractComponent
import typingsJapgolly.typedoc.converterConverterMod.Converter
import typingsJapgolly.typedoc.reflectionsMod.ProjectReflection
import typingsJapgolly.typedoc.reflectionsMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/CommentPlugin", JSImport.Namespace)
@js.native
object commentPluginMod extends js.Object {
  @js.native
  class CommentPlugin () extends AbstractComponent[Converter] {
    var applyModifiers: js.Any = js.native
    var comments: js.Any = js.native
    var hidden: js.UndefOr[js.Any] = js.native
    var onBegin: js.Any = js.native
    var onBeginResolve: js.Any = js.native
    var onCreateTypeParameter: js.Any = js.native
    var onDeclaration: js.Any = js.native
    var onFunctionImplementation: js.Any = js.native
    var onResolve: js.Any = js.native
    var storeModuleComment: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    def removeReflection(project: ProjectReflection, reflection: Reflection): Unit = js.native
    def removeReflection(project: ProjectReflection, reflection: Reflection, deletedIds: js.Array[Double]): Unit = js.native
    def removeReflections(project: ProjectReflection, reflections: js.Array[Reflection]): Unit = js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
}

