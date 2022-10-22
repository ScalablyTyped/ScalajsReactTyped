package typingsJapgolly.screenshotDesktop

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.screenshotDesktop.anon.Filename
import typingsJapgolly.screenshotDesktop.anon.Format
import typingsJapgolly.screenshotDesktop.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Buffer]]
  inline def apply(options: Filename): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(options: Format): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("screenshot-desktop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(): js.Promise[js.Array[Id]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[Id]]]
  
  inline def listDisplays(): js.Promise[js.Array[Id]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listDisplays")().asInstanceOf[js.Promise[js.Array[Id]]]
  
  type DisplayID = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.bmp
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.emf
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.exif
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpg
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpeg
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.gif
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.png
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.tiff
    - typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.wmf
  */
  trait ImageFormat extends StObject
  object ImageFormat {
    
    inline def bmp: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.bmp = "bmp".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.bmp]
    
    inline def emf: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.emf = "emf".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.emf]
    
    inline def exif: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.exif = "exif".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.exif]
    
    inline def gif: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.gif = "gif".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.gif]
    
    inline def jpeg: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpeg = "jpeg".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpeg]
    
    inline def jpg: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpg = "jpg".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.jpg]
    
    inline def png: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.png = "png".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.png]
    
    inline def tiff: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.tiff = "tiff".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.tiff]
    
    inline def wmf: typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.wmf = "wmf".asInstanceOf[typingsJapgolly.screenshotDesktop.screenshotDesktopStrings.wmf]
  }
}
