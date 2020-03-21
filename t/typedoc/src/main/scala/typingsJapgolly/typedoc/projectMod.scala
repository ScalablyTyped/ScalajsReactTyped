package typingsJapgolly.typedoc

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.typedoc.abstractMod.Reflection
import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.containerMod.ContainerReflection
import typingsJapgolly.typedoc.sourcesMod.SourceDirectory
import typingsJapgolly.typedoc.sourcesMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/project", JSImport.Namespace)
@js.native
object projectMod extends js.Object {
  @js.native
  class ProjectReflection protected () extends ContainerReflection {
    def this(name: String) = this()
    var directory: SourceDirectory = js.native
    var files: js.Array[SourceFile] = js.native
    var packageInfo: js.Any = js.native
    var readme: js.UndefOr[String] = js.native
    var reflections: NumberDictionary[Reflection] = js.native
    var symbolMapping: NumberDictionary[Double] = js.native
    def getReflectionsByKind(kind: ReflectionKind): js.Array[Reflection] = js.native
  }
  
}

