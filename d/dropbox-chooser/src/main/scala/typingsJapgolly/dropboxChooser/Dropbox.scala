package typingsJapgolly.dropboxChooser

import japgolly.scalajs.react.Callback
import typingsJapgolly.dropboxChooser.dropboxChooserStrings.direct
import typingsJapgolly.dropboxChooser.dropboxChooserStrings.preview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropbox {
  
  trait Chooser extends StObject {
    
    def choose(options: ChooserOptions): Unit
  }
  object Chooser {
    
    inline def apply(choose: ChooserOptions => Callback): Chooser = {
      val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1((t0: ChooserOptions) => choose(t0).runNow()))
      __obj.asInstanceOf[Chooser]
    }
    
    extension [Self <: Chooser](x: Self) {
      
      inline def setChoose(value: ChooserOptions => Callback): Self = StObject.set(x, "choose", js.Any.fromFunction1((t0: ChooserOptions) => value(t0).runNow()))
    }
  }
  
  trait ChooserFile extends StObject {
    
    // Size of the file in bytes.
    var bytes: Double
    
    // URL to a 64x64px icon for the file based on the file's extension.
    var icon: String
    
    // Unique ID for the file, compatible with Dropbox API v2.
    var id: String
    
    // whether or not the file is actually a directory
    var isDir: Boolean
    
    // URL to access the file, which varies depending on the linkType specified when the
    // Chooser was triggered.
    var link: String
    
    // Name of the file.
    var name: String
    
    // A thumbnail URL generated when the user selects images and videos.
    // If the user didn't select an image or video, no thumbnail will be included.
    var thumbnailLink: js.UndefOr[String] = js.undefined
  }
  object ChooserFile {
    
    inline def apply(bytes: Double, icon: String, id: String, isDir: Boolean, link: String, name: String): ChooserFile = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDir = isDir.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooserFile]
    }
    
    extension [Self <: ChooserFile](x: Self) {
      
      inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsDir(value: Boolean): Self = StObject.set(x, "isDir", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setThumbnailLink(value: String): Self = StObject.set(x, "thumbnailLink", value.asInstanceOf[js.Any])
      
      inline def setThumbnailLinkUndefined: Self = StObject.set(x, "thumbnailLink", js.undefined)
    }
  }
  
  // Refer to "Handling the response" section of: https://www.dropbox.com/developers/chooser
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dropboxChooser.dropboxChooserInts.`75`
    - typingsJapgolly.dropboxChooser.dropboxChooserInts.`256`
    - typingsJapgolly.dropboxChooser.dropboxChooserInts.`800`
    - typingsJapgolly.dropboxChooser.dropboxChooserInts.`1280`
    - typingsJapgolly.dropboxChooser.dropboxChooserInts.`2048`
  */
  trait ChooserFileBoundingBox extends StObject
  object ChooserFileBoundingBox {
    
    inline def `1280`: typingsJapgolly.dropboxChooser.dropboxChooserInts.`1280` = 1280.asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserInts.`1280`]
    
    inline def `2048`: typingsJapgolly.dropboxChooser.dropboxChooserInts.`2048` = 2048.asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserInts.`2048`]
    
    inline def `256`: typingsJapgolly.dropboxChooser.dropboxChooserInts.`256` = 256.asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserInts.`256`]
    
    inline def `75`: typingsJapgolly.dropboxChooser.dropboxChooserInts.`75` = 75.asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserInts.`75`]
    
    inline def `800`: typingsJapgolly.dropboxChooser.dropboxChooserInts.`800` = 800.asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserInts.`800`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit
    - typingsJapgolly.dropboxChooser.dropboxChooserStrings.crop
    - typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
  */
  trait ChooserFileMode extends StObject
  object ChooserFileMode {
    
    inline def crop: typingsJapgolly.dropboxChooser.dropboxChooserStrings.crop = "crop".asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserStrings.crop]
    
    inline def fit: typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit = "fit".asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit]
    
    inline def fit_one_and_overflow: typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = "fit_one_and_overflow".asInstanceOf[typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow]
  }
  
  trait ChooserOptions extends StObject {
    
    // called when the user closes the dialog without selecting a file
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    // eg. '.png'
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    // default: false
    var folderselect: js.UndefOr[Boolean] = js.undefined
    
    // default: 'preview'
    var linkType: js.UndefOr[preview | direct] = js.undefined
    
    // default: false
    var multiselect: js.UndefOr[Boolean] = js.undefined
    
    // any positive number
    var sizeLimit: js.UndefOr[Double] = js.undefined
    
    // called when a user selects an item in the Chooser
    def success(files: js.Array[ChooserFile]): Unit
  }
  object ChooserOptions {
    
    inline def apply(success: js.Array[ChooserFile] => Callback): ChooserOptions = {
      val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: js.Array[ChooserFile]) => success(t0).runNow()))
      __obj.asInstanceOf[ChooserOptions]
    }
    
    extension [Self <: ChooserOptions](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFolderselect(value: Boolean): Self = StObject.set(x, "folderselect", value.asInstanceOf[js.Any])
      
      inline def setFolderselectUndefined: Self = StObject.set(x, "folderselect", js.undefined)
      
      inline def setLinkType(value: preview | direct): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      inline def setSizeLimit(value: Double): Self = StObject.set(x, "sizeLimit", value.asInstanceOf[js.Any])
      
      inline def setSizeLimitUndefined: Self = StObject.set(x, "sizeLimit", js.undefined)
      
      inline def setSuccess(value: js.Array[ChooserFile] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: js.Array[ChooserFile]) => value(t0).runNow()))
    }
  }
}
