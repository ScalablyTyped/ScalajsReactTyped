package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataFilterMod {
  
  @JSImport("sap/ui/model/odata/Filter", JSImport.Default)
  @js.native
  open class default protected () extends Filter {
    /**
      * Constructor for Filter
      */
    def this(
      /**
      * the binding path for this filter
      */
    sPath: String,
      /**
      * Array of FilterOperators and their values: [{operator:"GE",value1:"val1"},{operator:"LE",value1:"val1"},{operator:"BT",value1:"val1",value2:"val2"}]
      */
    aValues: js.Array[js.Object]
    ) = this()
    def this(
      /**
      * the binding path for this filter
      */
    sPath: String,
      /**
      * Array of FilterOperators and their values: [{operator:"GE",value1:"val1"},{operator:"LE",value1:"val1"},{operator:"BT",value1:"val1",value2:"val2"}]
      */
    aValues: js.Array[js.Object],
      /**
      * If true the values from aValues will be ANDed; otherwise ORed
      */
    bAND: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/Filter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.Filter with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, Filter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Filter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.Filter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Filter
    extends typingsJapgolly.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Converts the `sap.ui.model.odata.Filter` into a `sap.ui.model.Filter`.
      *
      * @returns a `sap.ui.model.Filter` object
      */
    def convert(): typingsJapgolly.openui5.sapUiModelFilterMod.default = js.native
  }
}
