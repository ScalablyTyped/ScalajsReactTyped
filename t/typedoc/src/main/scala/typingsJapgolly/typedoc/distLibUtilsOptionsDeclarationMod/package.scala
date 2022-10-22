package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import typingsJapgolly.std.Record
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(value: Any, option: DeclarationOption, configPath: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[Any]
inline def convert(value: Any, option: DeclarationOption, configPath: String, oldValue: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getDefaultValue(option: DeclarationOption): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultValue")(option.asInstanceOf[js.Any]).asInstanceOf[Any]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.StringDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.NumberDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.BooleanDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.MixedDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ObjectDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.MapDeclarationOption[scala.Any]
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ArrayDeclarationOption
  - typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.FlagsDeclarationOption[typingsJapgolly.std.Record[java.lang.String, scala.Boolean]]
*/
type DeclarationOption = _DeclarationOption | MapDeclarationOption[Any] | (FlagsDeclarationOption[Record[String, Boolean]])
