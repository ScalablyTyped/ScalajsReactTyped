package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.mod.FontResourceValue
import typingsJapgolly.tabris.mod.FontValue
import typingsJapgolly.tabris.mod.NamedResources
import typingsJapgolly.tabris.mod.ResourceDataWithConfig
import typingsJapgolly.tabris.mod.ResourcesConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.FontResources")
@js.native
open class FontResources protected ()
  extends typingsJapgolly.tabris.mod.FontResources {
  /**
    * This is the base class for all font resource dictionaries. Instances can be obtained via the `from`
    * method, or by subclassing. All members of a `FontResources` (or subclass) instance will be of the
    * type `Font`.
    */
  /* protected */ def this(options: ResourcesConstructorOptions[typingsJapgolly.tabris.mod.Font, FontValue]) = this()
}
/* static members */
object FontResources {
  
  @JSGlobal("tabris.FontResources")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a fonts dictionary from the given raw "data" object. The format must match the [Tabris.js
    * fonts JSON schema](${doc:fonts.json}). Entries in the "data" object starting with "$" are considered
    * configuration options and will not become entries in the final fonts dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js fonts JSON schema](${doc:fonts.json}).
    */
  inline def from[Data /* <: ResourceDataWithConfig[FontResourceValue] */](data: Data): NamedResources[typingsJapgolly.tabris.mod.Font, /* keyof Data */ String] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[NamedResources[typingsJapgolly.tabris.mod.Font, /* keyof Data */ String]]
  /**
    * Creates a fonts dictionary from the given raw "data" object. All fonts from the given "base"
    * dictionary are inherited unless overwritten.
    * Entries in the "data" object starting with "$" are considered configuration options and will not
    * become entries in the final fonts dictionary.
    * @param base A plain object or another `FontResources` instance containing values to inherit by the new `FontResources` dictionary.
    * @param data The raw data (plain object) to create the dictionary from. The format must match the [Tabris.js fonts JSON schema](${doc:fonts.json}).
    */
  inline def from[Base /* <: NamedResources[typingsJapgolly.tabris.mod.Font, /* keyof Base */ String] */, Data /* <: ResourceDataWithConfig[FontResourceValue] */](base: Base, data: Data): NamedResources[typingsJapgolly.tabris.mod.Font, /* keyof Base & Data */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(base.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[NamedResources[typingsJapgolly.tabris.mod.Font, /* keyof Base & Data */ String]]
}
