package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.ConstructorDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  @js.native
  class ConstructorConverter () extends ConverterNodeComponent[ConstructorDeclaration] {
    var addParameterProperty: js.Any = js.native
  }
  
}

