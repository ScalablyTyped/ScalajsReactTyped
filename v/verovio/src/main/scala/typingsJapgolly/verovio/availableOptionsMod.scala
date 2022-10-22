package typingsJapgolly.verovio

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.verovio.anon.Name
import typingsJapgolly.verovio.verovioStrings.`stdColonColonstring-list`
import typingsJapgolly.verovio.verovioStrings.array
import typingsJapgolly.verovio.verovioStrings.bool
import typingsJapgolly.verovio.verovioStrings.double
import typingsJapgolly.verovio.verovioStrings.int
import typingsJapgolly.verovio.verovioStrings.stdColonColonstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object availableOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.verovio.availableOptionsMod.JsonOption
    - typingsJapgolly.verovio.availableOptionsMod.IntOption
    - typingsJapgolly.verovio.availableOptionsMod.DoubleOption
    - typingsJapgolly.verovio.availableOptionsMod.StringArrayOption
    - typingsJapgolly.verovio.availableOptionsMod.StringOption
    - typingsJapgolly.verovio.availableOptionsMod.EnumOption
    - typingsJapgolly.verovio.availableOptionsMod.BooleanOption
  */
  trait AnyOption extends StObject
  object AnyOption {
    
    inline def BooleanOption(description: String, title: String, values: Unit): typingsJapgolly.verovio.availableOptionsMod.BooleanOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bool")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.BooleanOption]
    }
    
    inline def DoubleOption(description: String, title: String, values: Unit): typingsJapgolly.verovio.availableOptionsMod.DoubleOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("double")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.DoubleOption]
    }
    
    inline def EnumOption(description: String, title: String, values: js.Array[String]): typingsJapgolly.verovio.availableOptionsMod.EnumOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string-list")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.EnumOption]
    }
    
    inline def IntOption(description: String, title: String, values: Unit): typingsJapgolly.verovio.availableOptionsMod.IntOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("int")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.IntOption]
    }
    
    inline def JsonOption(description: String, title: String, `type`: Unit, values: Unit): typingsJapgolly.verovio.availableOptionsMod.JsonOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.JsonOption]
    }
    
    inline def StringArrayOption(description: String, title: String, values: Unit): typingsJapgolly.verovio.availableOptionsMod.StringArrayOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.StringArrayOption]
    }
    
    inline def StringOption(description: String, title: String, values: Unit): typingsJapgolly.verovio.availableOptionsMod.StringOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string")
      __obj.asInstanceOf[typingsJapgolly.verovio.availableOptionsMod.StringOption]
    }
  }
  
  trait AvailableOptions extends StObject {
    
    var groups: StringDictionary[Name]
  }
  object AvailableOptions {
    
    inline def apply(groups: StringDictionary[Name]): AvailableOptions = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableOptions]
    }
    
    extension [Self <: AvailableOptions](x: Self) {
      
      inline def setGroups(value: StringDictionary[Name]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    }
  }
  
  trait BooleanOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var `type`: bool
    
    var values: Unit
  }
  object BooleanOption {
    
    inline def apply(description: String, title: String, values: Unit): BooleanOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bool")
      __obj.asInstanceOf[BooleanOption]
    }
    
    extension [Self <: BooleanOption](x: Self) {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: bool): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoubleOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: double
    
    var values: Unit
  }
  object DoubleOption {
    
    inline def apply(description: String, title: String, values: Unit): DoubleOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("double")
      __obj.asInstanceOf[DoubleOption]
    }
    
    extension [Self <: DoubleOption](x: Self) {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[String] = js.undefined
    
    var `type`: `stdColonColonstring-list`
    
    var values: js.Array[String]
  }
  object EnumOption {
    
    inline def apply(description: String, title: String, values: js.Array[String]): EnumOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string-list")
      __obj.asInstanceOf[EnumOption]
    }
    
    extension [Self <: EnumOption](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: `stdColonColonstring-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait IntOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: int
    
    var values: Unit
  }
  object IntOption {
    
    inline def apply(description: String, title: String, values: Unit): IntOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("int")
      __obj.asInstanceOf[IntOption]
    }
    
    extension [Self <: IntOption](x: Self) {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: int): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var `type`: Unit
    
    var values: Unit
  }
  object JsonOption {
    
    inline def apply(description: String, title: String, `type`: Unit, values: Unit): JsonOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonOption]
    }
    
    extension [Self <: JsonOption](x: Self) {
      
      inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringArrayOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: array
    
    var values: Unit
  }
  object StringArrayOption {
    
    inline def apply(description: String, title: String, values: Unit): StringArrayOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[StringArrayOption]
    }
    
    extension [Self <: StringArrayOption](x: Self) {
      
      inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[String] = js.undefined
    
    var `type`: stdColonColonstring
    
    var values: Unit
  }
  object StringOption {
    
    inline def apply(description: String, title: String, values: Unit): StringOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string")
      __obj.asInstanceOf[StringOption]
    }
    
    extension [Self <: StringOption](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: stdColonColonstring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerovioOption extends StObject {
    
    var cmdOnly: js.UndefOr[Boolean] = js.undefined
    
    var description: String
    
    var shortOption: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object VerovioOption {
    
    inline def apply(description: String, title: String): VerovioOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerovioOption]
    }
    
    extension [Self <: VerovioOption](x: Self) {
      
      inline def setCmdOnly(value: Boolean): Self = StObject.set(x, "cmdOnly", value.asInstanceOf[js.Any])
      
      inline def setCmdOnlyUndefined: Self = StObject.set(x, "cmdOnly", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setShortOption(value: String): Self = StObject.set(x, "shortOption", value.asInstanceOf[js.Any])
      
      inline def setShortOptionUndefined: Self = StObject.set(x, "shortOption", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
