package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.commentsMod.Comment
import typingsJapgolly.typedoc.modelsMod.Reflection
import typingsJapgolly.typedoc.reflectionCategoryMod.ReflectionCategory
import typingsJapgolly.typedoc.reflectionGroupMod.ReflectionGroup
import typingsJapgolly.typedoc.reflectionsMod.ProjectReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", JSImport.Namespace)
@js.native
object pluginsMod extends js.Object {
  @js.native
  class CategoryPlugin ()
    extends typingsJapgolly.typedoc.categoryPluginMod.CategoryPlugin
  
  @js.native
  class CommentPlugin ()
    extends typingsJapgolly.typedoc.commentPluginMod.CommentPlugin
  
  @js.native
  class DecoratorPlugin ()
    extends typingsJapgolly.typedoc.decoratorPluginMod.DecoratorPlugin
  
  @js.native
  class DeepCommentPlugin ()
    extends typingsJapgolly.typedoc.deepCommentPluginMod.DeepCommentPlugin
  
  @js.native
  class DynamicModulePlugin ()
    extends typingsJapgolly.typedoc.dynamicModulePluginMod.DynamicModulePlugin
  
  @js.native
  class GitHubPlugin ()
    extends typingsJapgolly.typedoc.gitHubPluginMod.GitHubPlugin
  
  @js.native
  class GroupPlugin ()
    extends typingsJapgolly.typedoc.groupPluginMod.GroupPlugin
  
  @js.native
  class ImplementsPlugin ()
    extends typingsJapgolly.typedoc.implementsPluginMod.ImplementsPlugin
  
  @js.native
  class PackagePlugin ()
    extends typingsJapgolly.typedoc.packagePluginMod.PackagePlugin
  
  @js.native
  class SourcePlugin ()
    extends typingsJapgolly.typedoc.sourcePluginMod.SourcePlugin
  
  @js.native
  class TypePlugin ()
    extends typingsJapgolly.typedoc.typePluginMod.TypePlugin
  
  /* static members */
  @js.native
  object CategoryPlugin extends js.Object {
    var WEIGHTS: js.Array[String] = js.native
    var defaultCategory: String = js.native
    def getCategory(reflection: Reflection): String = js.native
    def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
    def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
  }
  
  /* static members */
  @js.native
  object CommentPlugin extends js.Object {
    def removeReflection(project: ProjectReflection, reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection): Unit = js.native
    def removeReflection(
      project: ProjectReflection,
      reflection: typingsJapgolly.typedoc.reflectionsMod.Reflection,
      deletedIds: js.Array[Double]
    ): Unit = js.native
    def removeReflections(
      project: ProjectReflection,
      reflections: js.Array[typingsJapgolly.typedoc.reflectionsMod.Reflection]
    ): Unit = js.native
    def removeTags(comment: js.UndefOr[scala.Nothing], tagName: String): Unit = js.native
    def removeTags(comment: Comment, tagName: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object GroupPlugin extends js.Object {
    var WEIGHTS: js.Array[ReflectionKind] = js.native
    var getKindString: js.Any = js.native
    def getKindPlural(kind: ReflectionKind): String = js.native
    def getKindSingular(kind: ReflectionKind): String = js.native
    def getReflectionGroups(reflections: js.Array[typingsJapgolly.typedoc.reflectionsMod.Reflection]): js.Array[ReflectionGroup] = js.native
    def sortCallback(
      a: typingsJapgolly.typedoc.reflectionsMod.Reflection,
      b: typingsJapgolly.typedoc.reflectionsMod.Reflection
    ): Double = js.native
  }
  
}

