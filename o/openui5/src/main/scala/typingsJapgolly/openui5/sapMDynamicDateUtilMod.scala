package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDynamicDateUtilMod extends Shortcut {
  
  @JSImport("sap/m/DynamicDateUtil", JSImport.Default)
  @js.native
  val default: DynamicDateUtil = js.native
  
  /**
    * @EXPERIMENTAL (since 1.92)
    *
    * The DynamicDateUtil is a utility class for working with the DynamicDateOption instances.
    */
  trait DynamicDateUtil extends StObject {
    
    /**
      * Adds an option to be reused as a global object.
      */
    def addOption(
      /**
      * The option to be added
      */
    option: typingsJapgolly.openui5.sapMDynamicDateOptionMod.default
    ): Unit
    
    /**
      * Gets all available standard and custom dynamic date option keys.
      *
      * @returns An array of all option keys
      */
    def getAllOptionKeys(): js.Array[String]
    
    /**
      * Gets an option by its key.
      *
      * @returns The option
      */
    def getOption(/**
      * The option key
      */
    sKey: String): typingsJapgolly.openui5.sapMDynamicDateOptionMod.default
    
    /**
      * Gets sorted array of all standard keys.
      *
      * @returns An array of standard option keys
      */
    def getStandardKeys(): js.Array[String]
    
    /**
      * Parses a string to an array of objects in the DynamicDateRange's value format. Uses the provided formatter.
      *
      * @returns An array of value objects in the DynamicDateRange's value format
      */
    def parse(
      /**
      * The string to be parsed
      */
    sValue: String,
      /**
      * A dynamic date formatter
      */
    oFormatter: typingsJapgolly.openui5.sapMDynamicDateFormatMod.default,
      /**
      * array of option names
      */
    aOptionKeys: js.Array[Any]
    ): js.Array[js.Object]
    
    /**
      * Returns a date in machine timezone setting, removing the offset added by the application configuration.
      *
      * @returns A local JS date with removed offset
      */
    def removeTimezoneOffset(/**
      * A local JS date with added offset
      */
    oDate: js.Date): js.Date
    
    /**
      * Calculates a date range from a provided object in the format of the DynamicDateRange's value.
      *
      * @returns An array of two date objects - start and end date
      */
    def toDates(/**
      * The provided value
      */
    oValue: String): js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]
  }
  object DynamicDateUtil {
    
    inline def apply(
      addOption: typingsJapgolly.openui5.sapMDynamicDateOptionMod.default => Callback,
      getAllOptionKeys: CallbackTo[js.Array[String]],
      getOption: String => typingsJapgolly.openui5.sapMDynamicDateOptionMod.default,
      getStandardKeys: CallbackTo[js.Array[String]],
      parse: (String, typingsJapgolly.openui5.sapMDynamicDateFormatMod.default, js.Array[Any]) => js.Array[js.Object],
      removeTimezoneOffset: js.Date => js.Date,
      toDates: String => js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]
    ): DynamicDateUtil = {
      val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1((t0: typingsJapgolly.openui5.sapMDynamicDateOptionMod.default) => addOption(t0).runNow()), getAllOptionKeys = getAllOptionKeys.toJsFn, getOption = js.Any.fromFunction1(getOption), getStandardKeys = getStandardKeys.toJsFn, parse = js.Any.fromFunction3(parse), removeTimezoneOffset = js.Any.fromFunction1(removeTimezoneOffset), toDates = js.Any.fromFunction1(toDates))
      __obj.asInstanceOf[DynamicDateUtil]
    }
    
    extension [Self <: DynamicDateUtil](x: Self) {
      
      inline def setAddOption(value: typingsJapgolly.openui5.sapMDynamicDateOptionMod.default => Callback): Self = StObject.set(x, "addOption", js.Any.fromFunction1((t0: typingsJapgolly.openui5.sapMDynamicDateOptionMod.default) => value(t0).runNow()))
      
      inline def setGetAllOptionKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getAllOptionKeys", value.toJsFn)
      
      inline def setGetOption(value: String => typingsJapgolly.openui5.sapMDynamicDateOptionMod.default): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
      
      inline def setGetStandardKeys(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getStandardKeys", value.toJsFn)
      
      inline def setParse(
        value: (String, typingsJapgolly.openui5.sapMDynamicDateFormatMod.default, js.Array[Any]) => js.Array[js.Object]
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
      
      inline def setRemoveTimezoneOffset(value: js.Date => js.Date): Self = StObject.set(x, "removeTimezoneOffset", js.Any.fromFunction1(value))
      
      inline def setToDates(value: String => js.Array[/* was: sap.ui.core.date.UniversalDate */ Any]): Self = StObject.set(x, "toDates", js.Any.fromFunction1(value))
    }
  }
  
  type _To = DynamicDateUtil
  
  /* This means you don't have to write `default`, but can instead just say `sapMDynamicDateUtilMod.foo` */
  override def _to: DynamicDateUtil = default
}
