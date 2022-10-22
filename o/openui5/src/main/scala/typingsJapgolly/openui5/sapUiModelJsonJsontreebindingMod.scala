package typingsJapgolly.openui5

import typingsJapgolly.openui5.anon.ArrayNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelJsonJsontreebindingMod {
  
  @JSImport("sap/ui/model/json/JSONTreeBinding", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.openui5.sapUiModelClientTreeBindingMod.default {
    /**
      * Creates a new JSONListBinding.
      *
      * This constructor should only be called by subclasses or model implementations, not by application or
      * control code. Such code should use {@link sap.ui.model.json.JSONModel#bindTree JSONModel#bindTree} on
      * the corresponding model instance instead.
      */
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object,
      /**
      * Predefined filters contained in an array
      */
    aFilters: js.Array[typingsJapgolly.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object,
      /**
      * Predefined filters contained in an array
      */
    aFilters: typingsJapgolly.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined filters contained in an array
      */
    aFilters: js.Array[typingsJapgolly.openui5.sapUiModelFilterMod.default]
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined filters contained in an array
      */
    aFilters: typingsJapgolly.openui5.sapUiModelFilterMod.default
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object,
      /**
      * Predefined filters contained in an array
      */
    aFilters: js.Array[typingsJapgolly.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object,
      /**
      * Predefined filters contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: js.Object,
      /**
      * Predefined filters contained in an array
      */
    aFilters: typingsJapgolly.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined filters contained in an array
      */
    aFilters: js.Array[typingsJapgolly.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined filters contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
    def this(
      /**
      * Model instance that this binding is created for and that it belongs to
      */
    oModel: typingsJapgolly.openui5.sapUiModelJsonJsonmodelMod.default,
      /**
      * Path pointing to the tree or array that should be bound
      */
    sPath: String,
      /**
      * Context object for this binding, mandatory when a relative binding path is given
      */
    oContext: Unit,
      /**
      * Predefined filters contained in an array
      */
    aFilters: typingsJapgolly.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: ArrayNames
    ) = this()
  }
  
  type JSONTreeBinding = typingsJapgolly.openui5.sapUiModelClientTreeBindingMod.default
}
