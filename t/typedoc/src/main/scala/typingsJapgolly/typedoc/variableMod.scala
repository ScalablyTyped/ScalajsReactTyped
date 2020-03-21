package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.ObjectLiteralExpression
import typingsJapgolly.typescript.mod.VariableDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/variable", JSImport.Namespace)
@js.native
object variableMod extends js.Object {
  @js.native
  class VariableConverter () extends ConverterNodeComponent[VariableDeclaration] {
    def isSimpleObjectLiteral(objectLiteral: ObjectLiteralExpression): Boolean = js.native
  }
  
}

