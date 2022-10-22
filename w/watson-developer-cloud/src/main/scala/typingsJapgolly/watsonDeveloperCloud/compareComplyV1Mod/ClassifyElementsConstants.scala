package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `classifyElements` operation. */
object ClassifyElementsConstants {
  
  @js.native
  sealed trait FileContentType extends StObject
  /** The content type of file. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "ClassifyElementsConstants.FileContentType")
  @js.native
  object FileContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileContentType & String] = js.native
    
    @js.native
    sealed trait APPLICATION_MSWORD
      extends StObject
         with FileContentType
    /* "application/msword" */ val APPLICATION_MSWORD: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_MSWORD & String = js.native
    
    @js.native
    sealed trait APPLICATION_PDF
      extends StObject
         with FileContentType
    /* "application/pdf" */ val APPLICATION_PDF: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_PDF & String = js.native
    
    @js.native
    sealed trait APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT
      extends StObject
         with FileContentType
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT & String = js.native
    
    @js.native
    sealed trait IMAGE_BMP
      extends StObject
         with FileContentType
    /* "image/bmp" */ val IMAGE_BMP: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_BMP & String = js.native
    
    @js.native
    sealed trait IMAGE_GIF
      extends StObject
         with FileContentType
    /* "image/gif" */ val IMAGE_GIF: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_GIF & String = js.native
    
    @js.native
    sealed trait IMAGE_JPEG
      extends StObject
         with FileContentType
    /* "image/jpeg" */ val IMAGE_JPEG: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_JPEG & String = js.native
    
    @js.native
    sealed trait IMAGE_PNG
      extends StObject
         with FileContentType
    /* "image/png" */ val IMAGE_PNG: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_PNG & String = js.native
    
    @js.native
    sealed trait IMAGE_TIFF
      extends StObject
         with FileContentType
    /* "image/tiff" */ val IMAGE_TIFF: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.FileContentType.IMAGE_TIFF & String = js.native
  }
  
  @js.native
  sealed trait Model extends StObject
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @JSImport("watson-developer-cloud/compare-comply/v1", "ClassifyElementsConstants.Model")
  @js.native
  object Model extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model & String] = js.native
    
    @js.native
    sealed trait CONTRACTS
      extends StObject
         with Model
    /* "contracts" */ val CONTRACTS: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.Model.CONTRACTS & String = js.native
    
    @js.native
    sealed trait TABLES
      extends StObject
         with Model
    /* "tables" */ val TABLES: typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod.ClassifyElementsConstants.Model.TABLES & String = js.native
  }
}
