package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.mod.R3TemplateDependencyKind.Directive
import typingsJapgolly.angularCompiler.mod.R3TemplateDependencyKind.NgModule
import typingsJapgolly.angularCompiler.mod.R3TemplateDependencyKind.Pipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.mod.R3DirectiveDependencyMetadata
  - typingsJapgolly.angularCompiler.mod.R3PipeDependencyMetadata
  - typingsJapgolly.angularCompiler.mod.R3NgModuleDependencyMetadata
*/
trait R3TemplateDependencyMetadata extends StObject
object R3TemplateDependencyMetadata {
  
  inline def R3DirectiveDependencyMetadata(
    inputs: js.Array[String],
    isComponent: Boolean,
    kind: Directive,
    outputs: js.Array[String],
    selector: String,
    `type`: Expression
  ): typingsJapgolly.angularCompiler.mod.R3DirectiveDependencyMetadata = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], exportAs = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3DirectiveDependencyMetadata]
  }
  
  inline def R3NgModuleDependencyMetadata(kind: NgModule, `type`: Expression): typingsJapgolly.angularCompiler.mod.R3NgModuleDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3NgModuleDependencyMetadata]
  }
  
  inline def R3PipeDependencyMetadata(kind: Pipe, name: String, `type`: Expression): typingsJapgolly.angularCompiler.mod.R3PipeDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.R3PipeDependencyMetadata]
  }
}
