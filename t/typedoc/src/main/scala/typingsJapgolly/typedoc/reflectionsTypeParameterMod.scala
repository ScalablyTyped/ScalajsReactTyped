package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.Reflection
import typingsJapgolly.typedoc.abstractMod.TypeContainer
import typingsJapgolly.typedoc.modelsTypesMod.TypeParameterType
import typingsJapgolly.typedoc.reflectionsDeclarationMod.DeclarationReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/type-parameter", JSImport.Namespace)
@js.native
object reflectionsTypeParameterMod extends js.Object {
  @js.native
  class TypeParameterReflection protected () extends TypeContainer {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: Reflection) = this()
    @JSName("parent")
    var parent_TypeParameterReflection: js.UndefOr[DeclarationReflection] = js.native
  }
  
}

