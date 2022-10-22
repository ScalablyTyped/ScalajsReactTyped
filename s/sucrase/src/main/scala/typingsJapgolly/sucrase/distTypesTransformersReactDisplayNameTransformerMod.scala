package typingsJapgolly.sucrase

import typingsJapgolly.sucrase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersReactDisplayNameTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/ReactDisplayNameTransformer", JSImport.Default)
  @js.native
  open class default protected () extends ReactDisplayNameTransformer {
    def this(
      rootTransformer: typingsJapgolly.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: Null,
      options: Options
    ) = this()
    def this(
      rootTransformer: typingsJapgolly.sucrase.distTypesTransformersRootTransformerMod.default,
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      importProcessor: typingsJapgolly.sucrase.distTypesCjsimportprocessorMod.default,
      options: Options
    ) = this()
  }
  
  @js.native
  trait ReactDisplayNameTransformer
    extends typingsJapgolly.sucrase.distTypesTransformersTransformerMod.default {
    
    /**
      * We only want to add a display name when this is a function call containing
      * one argument, which is an object literal without `displayName` as an
      * existing key.
      */
    /* private */ var classNeedsDisplayName: Any = js.native
    
    /* private */ var findDisplayName: Any = js.native
    
    /* private */ var getDisplayNameFromFilename: Any = js.native
    
    val importProcessor: typingsJapgolly.sucrase.distTypesCjsimportprocessorMod.default | Null = js.native
    
    val options: Options = js.native
    
    val rootTransformer: typingsJapgolly.sucrase.distTypesTransformersRootTransformerMod.default = js.native
    
    val tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default = js.native
    
    /**
      * This is called with the token position at the open-paren.
      */
    /* private */ var tryProcessCreateClassCall: Any = js.native
  }
}
