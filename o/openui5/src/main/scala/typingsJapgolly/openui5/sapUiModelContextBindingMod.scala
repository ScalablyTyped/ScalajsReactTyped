package typingsJapgolly.openui5

import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelContextBindingMod {
  
  @JSImport("sap/ui/model/ContextBinding", JSImport.Default)
  @js.native
  open class default protected () extends ContextBinding {
    /**
      * Constructor for ContextBinding
      */
    def this(
      oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typingsJapgolly.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typingsJapgolly.openui5.sapUiModelContextMod.default,
      mParameters: js.Object
    ) = this()
    def this(
      oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typingsJapgolly.openui5.sapUiModelContextMod.default,
      mParameters: js.Object,
      /**
      * object defining event handlers
      */
    oEvents: js.Object
    ) = this()
    def this(
      oModel: typingsJapgolly.openui5.sapUiModelModelMod.default,
      sPath: String,
      oContext: typingsJapgolly.openui5.sapUiModelContextMod.default,
      mParameters: Unit,
      /**
      * object defining event handlers
      */
    oEvents: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/ContextBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.ContextBinding with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Binding.extend}.
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
    oClassInfo: ClassInfo[T, ContextBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ContextBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.ContextBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ContextBinding
    extends typingsJapgolly.openui5.sapUiModelBindingMod.default {
    
    /**
      * Return the bound context.
      *
      * @returns Context object used by this context binding or `null`
      */
    def getBoundContext(): typingsJapgolly.openui5.sapUiModelContextMod.default | Null = js.native
  }
}
