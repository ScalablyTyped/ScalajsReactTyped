package typingsJapgolly.openui5

import typingsJapgolly.openui5.anon.Nullable
import typingsJapgolly.openui5.anon.PreserveDecimals
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeDoubleMod {
  
  @JSImport("sap/ui/model/odata/type/Double", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.Double`.
    */
  open class default () extends Double {
    def this(/**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}. In contrast to NumberFormat `groupingEnabled`
      * defaults to `true`.
      */
    oFormatOptions: PreserveDecimals) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}. In contrast to NumberFormat `groupingEnabled`
      * defaults to `true`.
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}. In contrast to NumberFormat `groupingEnabled`
      * defaults to `true`.
      */
    oFormatOptions: PreserveDecimals,
      /**
      * constraints; {@link #validateValue validateValue} throws an error if any constraint is violated
      */
    oConstraints: Nullable
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Double", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Double with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.ODataType.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Double]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Double],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Double.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Double
    extends typingsJapgolly.openui5.sapUiModelOdataTypeOdatatypeMod.default {
    
    def formatValue(
      /**
      * the value to be formatted, which is represented as a number in the model
      */
    vValue: String,
      /**
      * the target type; may be "any", "float", "int", "string", or a type with one of these types as its {@link
      * sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): scala.Double | String = js.native
    /**
      * Formats the given value to the given target type. When formatting to "string", very large or very small
      * values are formatted to the exponential format (e.g. "-3.14 E+15").
      *
      * @returns the formatted output value in the target type; `undefined` or `null` are formatted to `null`
      */
    def formatValue(
      /**
      * the value to be formatted, which is represented as a number in the model
      */
    vValue: scala.Double,
      /**
      * the target type; may be "any", "float", "int", "string", or a type with one of these types as its {@link
      * sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type} for more information.
      */
    sTargetType: String
    ): scala.Double | String = js.native
    
    /**
      * @SINCE 1.29.0
      *
      * Parses the given value, which is expected to be of the given type, to an Edm.Double in `number` representation.
      *
      * @returns the parsed value
      */
    def parseValue(
      /**
      * the value to be parsed; the empty string and `null` are parsed to `null`; note that there is no way to
      * enter `Infinity` or `NaN` values
      */
    vValue: String,
      /**
      * the source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sSourceType: String
    ): scala.Double = js.native
    def parseValue(
      /**
      * the value to be parsed; the empty string and `null` are parsed to `null`; note that there is no way to
      * enter `Infinity` or `NaN` values
      */
    vValue: scala.Double,
      /**
      * the source type (the expected type of `vValue`); may be "float", "int", "string", or a type with one
      * of these types as its {@link sap.ui.base.DataType#getPrimitiveType primitive type}. See {@link sap.ui.model.odata.type}
      * for more information.
      */
    sSourceType: String
    ): scala.Double = js.native
    
    /**
      * @SINCE 1.29.0
      *
      * Validates whether the given value in model representation is valid and meets the defined constraints.
      */
    def validateValue(/**
      * the value to be validated
      */
    fValue: scala.Double): Unit = js.native
  }
}
