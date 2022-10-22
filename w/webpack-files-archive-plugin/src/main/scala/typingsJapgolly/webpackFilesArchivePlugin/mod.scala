package typingsJapgolly.webpackFilesArchivePlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-files-archive-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with WebpackFilesArchivePlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.tar
    - typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.zip
  */
  trait Formats extends StObject
  object Formats {
    
    inline def tar: typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.tar = "tar".asInstanceOf[typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.tar]
    
    inline def zip: typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.zip = "zip".asInstanceOf[typingsJapgolly.webpackFilesArchivePlugin.webpackFilesArchivePluginStrings.zip]
  }
  
  trait Options extends StObject {
    
    /**
      * A different extension to use instead of tar.gz or zip (without leading .)
      */
    var ext: js.UndefOr[String] = js.undefined
    
    /**
      * Archive formats to use, can be 'tar' or 'zip'
      */
    var format: Formats | js.Array[Formats]
    
    /**
      *  Directory location of files to be archived.
      */
    var output: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(format: Formats | js.Array[Formats]): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFormat(value: Formats | js.Array[Formats]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatVarargs(value: Formats*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    }
  }
  
  trait WebpackFilesArchivePlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object WebpackFilesArchivePlugin {
    
    inline def apply(apply: Compiler => Callback): WebpackFilesArchivePlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[WebpackFilesArchivePlugin]
    }
    
    extension [Self <: WebpackFilesArchivePlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
}
