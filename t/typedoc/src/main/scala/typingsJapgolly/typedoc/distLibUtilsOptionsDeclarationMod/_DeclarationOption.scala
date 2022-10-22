package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _DeclarationOption extends StObject
object _DeclarationOption {
  
  inline def ArrayDeclarationOption(help: String, name: String, `type`: Array | PathArray | ModuleArray | GlobArray): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption]
  }
  
  inline def BooleanDeclarationOption(help: String, name: String, `type`: Boolean): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption]
  }
  
  inline def MixedDeclarationOption(help: String, name: String, `type`: Mixed): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption]
  }
  
  inline def NumberDeclarationOption(help: String, name: String, `type`: Number): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption]
  }
  
  inline def ObjectDeclarationOption(help: String, name: String, `type`: Object): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption]
  }
  
  inline def StringDeclarationOption(help: String, name: String): typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption]
  }
}
