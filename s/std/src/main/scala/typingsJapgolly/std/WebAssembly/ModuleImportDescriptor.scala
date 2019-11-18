package typingsJapgolly.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleImportDescriptor extends js.Object {
  var kind: ImportExportKind
  var module: java.lang.String
  var name: java.lang.String
}

object ModuleImportDescriptor {
  @scala.inline
  def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModuleImportDescriptor]
  }
}

