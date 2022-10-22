package typingsJapgolly.gulpChanged

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-changed", JSImport.Namespace)
  @js.native
  val ^ : IGulpChanged = js.native
  
  type IComparator = js.Function3[/* stream */ Transform, /* sourceFile */ File, /* destPath */ String, Unit]
  
  type IDestination = js.Function1[/* file */ String | Buffer, String]
  
  @js.native
  trait IGulpChanged extends StObject {
    
    def apply(destination: String): ReadWriteStream = js.native
    def apply(destination: String, options: IOptions): ReadWriteStream = js.native
    def apply(destination: IDestination): ReadWriteStream = js.native
    def apply(destination: IDestination, options: IOptions): ReadWriteStream = js.native
    
    def compareContents(stream: Transform, sourceFile: File, destPath: String): Unit = js.native
    @JSName("compareContents")
    var compareContents_Original: IComparator = js.native
    
    def compareLastModifiedTime(stream: Transform, sourceFile: File, destPath: String): Unit = js.native
    @JSName("compareLastModifiedTime")
    var compareLastModifiedTime_Original: IComparator = js.native
  }
  
  trait IOptions extends StObject {
    
    /**
      * The working directory the folder is relative to.
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Extension of the destination files.
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /**
      * Function that determines whether the source file is different from the destination file.
      * @default changed.compareLastModifiedTime
      */
    var hasChanged: js.UndefOr[IComparator] = js.undefined
    
    /**
      * Function to transform the path to the destination file. Should return the absolute path to the (renamed) destination file.
      */
    var transformPath: js.UndefOr[js.Function1[/* destPath */ String, String]] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setHasChanged(value: (/* stream */ Transform, /* sourceFile */ File, /* destPath */ String) => Callback): Self = StObject.set(x, "hasChanged", js.Any.fromFunction3((t0: /* stream */ Transform, t1: /* sourceFile */ File, t2: /* destPath */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setHasChangedUndefined: Self = StObject.set(x, "hasChanged", js.undefined)
      
      inline def setTransformPath(value: /* destPath */ String => String): Self = StObject.set(x, "transformPath", js.Any.fromFunction1(value))
      
      inline def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
    }
  }
  
  type _To = IGulpChanged
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: IGulpChanged = ^
}
