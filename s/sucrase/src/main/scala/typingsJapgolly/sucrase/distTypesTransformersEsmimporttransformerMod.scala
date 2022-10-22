package typingsJapgolly.sucrase

import typingsJapgolly.sucrase.distTypesHelperManagerMod.HelperManager
import typingsJapgolly.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersEsmimporttransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/ESMImportTransformer", JSImport.Default)
  @js.native
  open class default protected () extends ESMImportTransformer {
    def this(
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default,
      helperManager: HelperManager,
      reactHotLoaderTransformer: Null,
      isTypeScriptTransformEnabled: Boolean,
      options: Options
    ) = this()
    def this(
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default,
      helperManager: HelperManager,
      reactHotLoaderTransformer: typingsJapgolly.sucrase.distTypesTransformersReactHotLoaderTransformerMod.default,
      isTypeScriptTransformEnabled: Boolean,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ESMImportTransformer
    extends typingsJapgolly.sucrase.distTypesTransformersTransformerMod.default {
    
    /* private */ var declarationInfo: Any = js.native
    
    val helperManager: HelperManager = js.native
    
    /* private */ var injectCreateRequireForImportRequire: Any = js.native
    
    /* private */ var isTypeName: Any = js.native
    
    val isTypeScriptTransformEnabled: Boolean = js.native
    
    val nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default = js.native
    
    /* private */ var nonTypeIdentifiers: Any = js.native
    
    /* private */ var processExportDefault: Any = js.native
    
    /* private */ var processImport: Any = js.native
    
    /* private */ var processImportEquals: Any = js.native
    
    /**
      * In TypeScript, we need to remove named exports that were never declared or only declared as a
      * type.
      */
    /* private */ var processNamedExports: Any = js.native
    
    val reactHotLoaderTransformer: typingsJapgolly.sucrase.distTypesTransformersReactHotLoaderTransformerMod.default | Null = js.native
    
    /**
      * Remove type bindings from this import, leaving the rest of the import intact.
      *
      * Return true if this import was ONLY types, and thus is eligible for removal. This will bail out
      * of the replacement operation, so we can return early here.
      */
    /* private */ var removeImportTypeBindings: Any = js.native
    
    /**
      * ESM elides all imports with the rule that we only elide if we see that it's
      * a type and never see it as a value. This is in contrast to CJS, which
      * elides imports that are completely unknown.
      */
    /* private */ var shouldElideExportedName: Any = js.native
    
    val tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
