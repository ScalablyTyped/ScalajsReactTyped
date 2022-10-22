package typingsJapgolly.openui5

import typingsJapgolly.openui5.anon.Nullable
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataTypeByteMod {
  
  @JSImport("sap/ui/model/odata/type/Byte", JSImport.Default)
  @js.native
  /**
    * Constructor for a primitive type `Edm.Byte`.
    */
  open class default () extends Byte {
    def this(/**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}
      */
    oFormatOptions: js.Object) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}
      */
    oFormatOptions: js.Object,
      /**
      * constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue} throws an error if any constraint
      * is violated
      */
    oConstraints: Nullable
    ) = this()
    def this(
      /**
      * format options as defined in {@link sap.ui.core.format.NumberFormat}
      */
    oFormatOptions: Unit,
      /**
      * constraints; {@link sap.ui.model.odata.type.Int#validateValue validateValue} throws an error if any constraint
      * is violated
      */
    oConstraints: Nullable
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/type/Byte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.type.Byte with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.odata.type.Int.extend}.
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
    oClassInfo: ClassInfo[T, Byte]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Byte],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.type.Byte.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Byte
    extends typingsJapgolly.openui5.sapUiModelOdataTypeIntMod.default {
    
    /**
      * Returns the type's supported range as object with properties `minimum` and `maximum`.
      *
      * @returns the range
      */
    def getRange(): js.Object = js.native
  }
}
