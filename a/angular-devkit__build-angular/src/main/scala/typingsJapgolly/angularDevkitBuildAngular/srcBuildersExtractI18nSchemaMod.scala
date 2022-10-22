package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersExtractI18nSchemaMod {
  
  @js.native
  sealed trait Format extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/extract-i18n/schema", "Format")
  @js.native
  object Format extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Format & String] = js.native
    
    @js.native
    sealed trait Arb
      extends StObject
         with Format
    /* "arb" */ val Arb: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Arb & String = js.native
    
    @js.native
    sealed trait Json
      extends StObject
         with Format
    /* "json" */ val Json: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Json & String = js.native
    
    @js.native
    sealed trait LegacyMigrate
      extends StObject
         with Format
    /* "legacy-migrate" */ val LegacyMigrate: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.LegacyMigrate & String = js.native
    
    @js.native
    sealed trait Xlf
      extends StObject
         with Format
    /* "xlf" */ val Xlf: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xlf & String = js.native
    
    @js.native
    sealed trait Xlf2
      extends StObject
         with Format
    /* "xlf2" */ val Xlf2: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xlf2 & String = js.native
    
    @js.native
    sealed trait Xlif
      extends StObject
         with Format
    /* "xlif" */ val Xlif: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xlif & String = js.native
    
    @js.native
    sealed trait Xliff
      extends StObject
         with Format
    /* "xliff" */ val Xliff: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xliff & String = js.native
    
    @js.native
    sealed trait Xliff2
      extends StObject
         with Format
    /* "xliff2" */ val Xliff2: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xliff2 & String = js.native
    
    @js.native
    sealed trait Xmb
      extends StObject
         with Format
    /* "xmb" */ val Xmb: typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nSchemaMod.Format.Xmb & String = js.native
  }
  
  trait Schema extends StObject {
    
    /**
      * A browser builder target to extract i18n messages in the format of
      * `project:target[:configuration]`. You can also pass in more than one configuration name
      * as a comma-separated list. Example: `project:target:production,staging`.
      */
    var browserTarget: String
    
    /**
      * Output format for the generated file.
      */
    var format: js.UndefOr[Format] = js.undefined
    
    /**
      * Name of the file to output.
      */
    var outFile: js.UndefOr[String] = js.undefined
    
    /**
      * Path where output will be placed.
      */
    var outputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Log progress to the console.
      */
    var progress: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(browserTarget: String): Schema = {
      val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    }
  }
}
