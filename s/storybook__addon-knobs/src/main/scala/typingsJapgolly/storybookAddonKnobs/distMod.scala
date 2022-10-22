package typingsJapgolly.storybookAddonKnobs

import typingsJapgolly.std.PropertyKey
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesArrayMod.ArrayTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesButtonMod.ButtonTypeOnClickProp
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesMod.KnobType
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesNumberMod.NumberTypeKnobOptions
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsKnobOptions
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsTypeKnobSingleValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsTypeKnobValue
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesOptionsMod.OptionsTypeOptionsProp
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesRadioMod.RadiosTypeOptionsProp
import typingsJapgolly.storybookAddonKnobs.distComponentsTypesSelectMod.SelectTypeOptionsProp
import typingsJapgolly.storybookAddonKnobs.distTypeDefsMod.Knob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/addon-knobs/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "CHANGE")
  @js.native
  val CHANGE: String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "CLICK")
  @js.native
  val CLICK: String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "RESET")
  @js.native
  val RESET: String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "SET")
  @js.native
  val SET: String = js.native
  
  @JSImport("@storybook/addon-knobs/dist", "SET_OPTIONS")
  @js.native
  val SET_OPTIONS: String = js.native
  
  inline def array(name: String, value: ArrayTypeKnobValue): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def array(name: String, value: ArrayTypeKnobValue, separator: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def array(name: String, value: ArrayTypeKnobValue, separator: String, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def array(name: String, value: ArrayTypeKnobValue, separator: Unit, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def boolean(name: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def boolean(name: String, value: Boolean, groupId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def button(name: String, callback: ButtonTypeOnClickProp): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("button")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def button(name: String, callback: ButtonTypeOnClickProp, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("button")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def color(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def color(name: String, value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def date(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def date(name: String, value: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def date(name: String, value: js.Date, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def date(name: String, value: Unit, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def files(name: String, accept: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def files(name: String, accept: String, value: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def files(name: String, accept: String, value: js.Array[String], groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def files(name: String, accept: String, value: Unit, groupId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("files")(name.asInstanceOf[js.Any], accept.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def knob[T /* <: KnobType */, V](name: String, options: Knob[T]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("knob")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def number(name: String, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def number(name: String, value: Double, options: Unit, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def number(name: String, value: Double, options: NumberTypeKnobOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def number(name: String, value: Double, options: NumberTypeKnobOptions, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def `object`[T](name: String, value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def `object`[T](name: String, value: T, groupId: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("object")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsKnob")(name.asInstanceOf[js.Any], valuesObj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optionsObj.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions,
    groupId: String
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("optionsKnob")(name.asInstanceOf[js.Any], valuesObj.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optionsObj.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def radios(name: String, options: RadiosTypeOptionsProp[Null]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def radios(name: String, options: RadiosTypeOptionsProp[String], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def radios(name: String, options: RadiosTypeOptionsProp[String], value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def radios(name: String, options: RadiosTypeOptionsProp[Null], value: Null, groupId: String): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def radios(name: String, options: RadiosTypeOptionsProp[Unit], value: Unit, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def radios_Unit(name: String, options: RadiosTypeOptionsProp[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("radios")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def select(name: String, options: SelectTypeOptionsProp[Null]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def select(name: String, options: SelectTypeOptionsProp[String], value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def select(name: String, options: SelectTypeOptionsProp[String], value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def select(name: String, options: SelectTypeOptionsProp[js.Array[PropertyKey]], value: js.Array[PropertyKey]): js.Array[PropertyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertyKey]]
  inline def select(
    name: String,
    options: SelectTypeOptionsProp[js.Array[PropertyKey]],
    value: js.Array[PropertyKey],
    groupId: String
  ): js.Array[PropertyKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[js.Array[PropertyKey]]
  inline def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean, groupId: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def select(name: String, options: SelectTypeOptionsProp[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def select(name: String, options: SelectTypeOptionsProp[Double], value: Double, groupId: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def select(name: String, options: SelectTypeOptionsProp[Null], value: Null, groupId: String): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def select(name: String, options: SelectTypeOptionsProp[Unit], value: Unit, groupId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def select[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: unknown} */ js.Any */](name: String, options: SelectTypeOptionsProp[T], value: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def select[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: unknown} */ js.Any */](name: String, options: SelectTypeOptionsProp[T], value: T, groupId: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def select_Unit(name: String, options: SelectTypeOptionsProp[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def text(name: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def text(name: String, value: String, groupId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], groupId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def withKnobs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withKnobs")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
}
