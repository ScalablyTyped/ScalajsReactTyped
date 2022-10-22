package typingsJapgolly.electron.global.Electron

import typingsJapgolly.electron.Electron.Common.Clipboard
import typingsJapgolly.electron.Electron.Common.CrashReporter
import typingsJapgolly.electron.Electron.Common.Shell
import typingsJapgolly.electron.Electron.CreateFromBitmapOptions
import typingsJapgolly.electron.Electron.CreateFromBufferOptions
import typingsJapgolly.electron.Electron.Size
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  @JSGlobal("Electron.Common.clipboard")
  @js.native
  val clipboard: Clipboard = js.native
  
  @JSGlobal("Electron.Common.crashReporter")
  @js.native
  val crashReporter: CrashReporter = js.native
  
  /* was `typeof NativeImage` */
  @JSGlobal("Electron.Common.nativeImage")
  @js.native
  open class nativeImage ()
    extends StObject
       with typingsJapgolly.electron.Electron.NativeImage_
  /* was `typeof NativeImage` */
  object nativeImage {
    
    @JSGlobal("Electron.Common.nativeImage")
    @js.native
    val ^ : js.Any = js.native
    
    // Docs: https://electronjs.org/docs/api/native-image
    /**
      * Creates an empty `NativeImage` instance.
      */
    /* static member */
    inline def createEmpty(): typingsJapgolly.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
      * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
      */
    /* static member */
    inline def createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): typingsJapgolly.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBitmap")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
      * JPEG first.
      */
    /* static member */
    inline def createFromBuffer(buffer: Buffer): typingsJapgolly.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    inline def createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions): typingsJapgolly.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from `dataURL`.
      */
    /* static member */
    inline def createFromDataURL(dataURL: String): typingsJapgolly.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDataURL")(dataURL.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from the NSImage that maps to the given
      * image name. See `System Icons` for a list of possible values.
      *
      * The `hslShift` is applied to the image with the following rules:
      *
      * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
      * and 360 on the hue color wheel (red).
      * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
      * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
      * saturate the image.
      * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
      * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
      * leave unchanged. 1 = full lightness (make all pixels white).
      *
      * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
      * 0]` will make the image completely black.
      *
      * In some cases, the `NSImageName` doesn't match its string representation; one
      * example of this is `NSFolderImageName`, whose string representation would
      * actually be `NSFolder`. Therefore, you'll need to determine the correct string
      * representation for your image before passing it in. This can be done with the
      * following:
      *
      * `echo -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME);
      * }' | clang -otest -x objective-c -framework Cocoa - && ./test`
      *
      * where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
      *
      * @platform darwin
      */
    /* static member */
    inline def createFromNamedImage(imageName: String): typingsJapgolly.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    inline def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typingsJapgolly.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any], hslShift.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * Creates a new `NativeImage` instance from a file located at `path`. This method
      * returns an empty image if the `path` does not exist, cannot be read, or is not a
      * valid image.
      */
    /* static member */
    inline def createFromPath(path: String): typingsJapgolly.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.electron.Electron.NativeImage_]
    
    /**
      * fulfilled with the file's thumbnail preview image, which is a NativeImage.
      *
      * @platform darwin,win32
      */
    /* static member */
    inline def createThumbnailFromPath(path: String, maxSize: Size): js.Promise[typingsJapgolly.electron.Electron.NativeImage_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createThumbnailFromPath")(path.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.electron.Electron.NativeImage_]]
  }
  
  @JSGlobal("Electron.Common.shell")
  @js.native
  val shell: Shell = js.native
}
