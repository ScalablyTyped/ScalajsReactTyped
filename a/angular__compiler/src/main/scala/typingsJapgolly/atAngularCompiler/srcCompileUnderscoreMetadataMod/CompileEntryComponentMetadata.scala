package typingsJapgolly.atAngularCompiler.srcCompileUnderscoreMetadataMod

import typingsJapgolly.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileEntryComponentMetadata extends js.Object {
  var componentFactory: StaticSymbol | js.Object
  var componentType: js.Any
}

object CompileEntryComponentMetadata {
  @scala.inline
  def apply(componentFactory: StaticSymbol | js.Object, componentType: js.Any): CompileEntryComponentMetadata = {
    val __obj = js.Dynamic.literal(componentFactory = componentFactory.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompileEntryComponentMetadata]
  }
}

