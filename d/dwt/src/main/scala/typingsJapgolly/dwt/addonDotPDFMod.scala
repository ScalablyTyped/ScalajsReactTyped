package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTConvertMode
import typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonDotPDFMod {
  
  @js.native
  trait PDF extends StObject {
    
    /**
      * Convert the specified PDF file to image(s).
      * @param path The path of the PDF file.
      * @param successCallback A callback function that is executed if the request succeeds.
      * @param failureCallback A callback function that is executed if the request fails.
      * @argument errorCode The error code.
      * @argument errorString The error string.
      */
    def ConvertToImage(
      path: String,
      resolution: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
    ): Unit = js.native
    
    /**
      * Return the convert mode.
      */
    def GetConvertMode(): Double = js.native
    
    /**
      * Return whether the PDF module has been installed.
      */
    def IsModuleInstalled(): Boolean = js.native
    
    /**
      * Detect whether a local PDF file is text based or not.
      * @path Specify the path of the PDF file.
      */
    def IsTextBasedPDF(path: String): Boolean = js.native
    
    def SetConvertMode(mode: Double): Boolean = js.native
    /**
      * Set the convert mode.
      * @param mode Specify the mode.
      */
    def SetConvertMode(mode: EnumDWTConvertMode): Boolean = js.native
    
    /**
      * Set the password for reading encrypted PDF files.
      * @param password Specify the password.
      */
    def SetPassword(password: String): Boolean = js.native
    
    /**
      * Set the resolution for rasterizing.
      * @param resolution Specify the resolution.
      */
    def SetResolution(resolution: Double): Boolean = js.native
    
    /**
      * Set up the PDF writing engine.
      */
    var Write: typingsJapgolly.dwt.addonDotPDFMod.Write = js.native
  }
  
  trait PDFWSetting extends StObject {
    
    /**
      * Specify the author.
      */
    var author: String
    
    /**
      * Specify the compression type.
      */
    var compression: EnumDWTPDFCompressionType | Double
    
    /**
      * Specify the creation date.
      * Note that the argument should start with 'D:' like 'D:20181231'.
      */
    var creationDate: String
    
    /**
      * Specify the creator.
      */
    var creator: String
    
    /**
      * Specify the key words.
      */
    var keyWords: String
    
    /**
      * Specify the modified date.
      * Note that the argument should start with 'D:' like 'D:20181231'.
      */
    var modifiedDate: String
    
    /**
      * Specify the producer.
      */
    var producer: String
    
    /**
      * Specify the quality of the images in the file.
      * The value ranges from 0 to 100.
      * Only valid when the {compression} is 'JPEG' or 'JPEG2000'.
      */
    var quality: Double
    
    /**
      * Specify the subject.
      */
    var subject: String
    
    /**
      * Specify the title.
      */
    var title: String
    
    /**
      * Specify the PDF version. For example, '1.5'.
      */
    var version: String
  }
  object PDFWSetting {
    
    inline def apply(
      author: String,
      compression: EnumDWTPDFCompressionType | Double,
      creationDate: String,
      creator: String,
      keyWords: String,
      modifiedDate: String,
      producer: String,
      quality: Double,
      subject: String,
      title: String,
      version: String
    ): PDFWSetting = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], keyWords = keyWords.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], producer = producer.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDFWSetting]
    }
    
    extension [Self <: PDFWSetting](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCompression(value: EnumDWTPDFCompressionType | Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setKeyWords(value: String): Self = StObject.set(x, "keyWords", value.asInstanceOf[js.Any])
      
      inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Write extends StObject {
    
    /**
      * Set up the PDF writing engine.
      * @param settings Configures how the PDF is generated.
      */
    def Setup(settings: PDFWSetting): Unit
  }
  object Write {
    
    inline def apply(Setup: PDFWSetting => Callback): Write = {
      val __obj = js.Dynamic.literal(Setup = js.Any.fromFunction1((t0: PDFWSetting) => Setup(t0).runNow()))
      __obj.asInstanceOf[Write]
    }
    
    extension [Self <: Write](x: Self) {
      
      inline def setSetup(value: PDFWSetting => Callback): Self = StObject.set(x, "Setup", js.Any.fromFunction1((t0: PDFWSetting) => value(t0).runNow()))
    }
  }
}
