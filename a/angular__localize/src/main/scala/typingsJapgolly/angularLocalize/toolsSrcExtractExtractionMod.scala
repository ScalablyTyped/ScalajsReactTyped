package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractExtractionMod {
  
  @JSImport("@angular/localize/tools/src/extract/extraction", "MessageExtractor")
  @js.native
  open class MessageExtractor protected () extends StObject {
    def this(fs: ReadonlyFileSystem, logger: Logger, hasBasePathUseSourceMapsLocalizeName: ExtractionOptions) = this()
    
    /* private */ var basePath: Any = js.native
    
    def extractMessages(filename: String): js.Array[ɵParsedMessage] = js.native
    
    /* private */ var fs: Any = js.native
    
    /**
      * Find the original location using source-maps if available.
      *
      * @param sourceFile The generated `sourceFile` that contains the `location`.
      * @param location The location within the generated `sourceFile` that needs mapping.
      *
      * @returns A new location that refers to the original source location mapped from the given
      *     `location` in the generated `sourceFile`.
      */
    /* private */ var getOriginalLocation: Any = js.native
    
    /* private */ var loader: Any = js.native
    
    /* private */ var localizeName: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Update the location of each message to point to the source-mapped original source location, if
      * available.
      */
    /* private */ var updateSourceLocations: Any = js.native
    
    /* private */ var useSourceMaps: Any = js.native
  }
  
  trait ExtractionOptions extends StObject {
    
    var basePath: AbsoluteFsPath
    
    var localizeName: js.UndefOr[String] = js.undefined
    
    var useSourceMaps: js.UndefOr[Boolean] = js.undefined
  }
  object ExtractionOptions {
    
    inline def apply(basePath: AbsoluteFsPath): ExtractionOptions = {
      val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractionOptions]
    }
    
    extension [Self <: ExtractionOptions](x: Self) {
      
      inline def setBasePath(value: AbsoluteFsPath): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setLocalizeName(value: String): Self = StObject.set(x, "localizeName", value.asInstanceOf[js.Any])
      
      inline def setLocalizeNameUndefined: Self = StObject.set(x, "localizeName", js.undefined)
      
      inline def setUseSourceMaps(value: Boolean): Self = StObject.set(x, "useSourceMaps", value.asInstanceOf[js.Any])
      
      inline def setUseSourceMapsUndefined: Self = StObject.set(x, "useSourceMaps", js.undefined)
    }
  }
}
