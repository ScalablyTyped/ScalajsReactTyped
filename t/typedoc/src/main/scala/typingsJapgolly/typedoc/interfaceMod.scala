package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.componentsMod.ConverterNodeComponent
import typingsJapgolly.typescript.mod.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/nodes/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  @js.native
  class InterfaceConverter () extends ConverterNodeComponent[InterfaceDeclaration]
  
}

