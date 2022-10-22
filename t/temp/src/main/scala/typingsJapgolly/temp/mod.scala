package typingsJapgolly.temp

import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("temp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanup(): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Stats]]
  inline def cleanup(callback: js.Function2[/* err */ Any, /* result */ Stats, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def cleanupSync(): Boolean | Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupSync")().asInstanceOf[Boolean | Stats]
  
  inline def createWriteStream(): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")().asInstanceOf[WriteStream]
  inline def createWriteStream(affixes: String): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(affixes.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  inline def createWriteStream(affixes: AffixOptions): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(affixes.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  
  @JSImport("temp", "dir")
  @js.native
  def dir: String = js.native
  inline def dir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dir")(x.asInstanceOf[js.Any])
  
  inline def mkdir(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")().asInstanceOf[js.Promise[String]]
  inline def mkdir(affixes: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mkdir(affixes: String, callback: js.Function2[/* err */ Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(affixes: Unit, callback: js.Function2[/* err */ Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(affixes: AffixOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mkdir(affixes: AffixOptions, callback: js.Function2[/* err */ Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")().asInstanceOf[String]
  inline def mkdirSync(affixes: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def mkdirSync(affixes: AffixOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def open(): js.Promise[OpenFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[js.Promise[OpenFile]]
  inline def open(affixes: String): js.Promise[OpenFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenFile]]
  inline def open(affixes: String, callback: js.Function2[/* err */ Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(affixes: Unit, callback: js.Function2[/* err */ Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(affixes: AffixOptions): js.Promise[OpenFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenFile]]
  inline def open(affixes: AffixOptions, callback: js.Function2[/* err */ Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openSync(): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")().asInstanceOf[OpenFile]
  inline def openSync(affixes: String): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[OpenFile]
  inline def openSync(affixes: AffixOptions): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[OpenFile]
  
  inline def path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[String]
  inline def path(affixes: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def path(affixes: String, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def path(affixes: Unit, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def path(affixes: AffixOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def path(affixes: AffixOptions, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def track(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")().asInstanceOf[Any]
  inline def track(value: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait AffixOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object AffixOptions {
    
    inline def apply(): AffixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixOptions]
    }
    
    extension [Self <: AffixOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait OpenFile extends StObject {
    
    var fd: Double
    
    var path: String
  }
  object OpenFile {
    
    inline def apply(fd: Double, path: String): OpenFile = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFile]
    }
    
    extension [Self <: OpenFile](x: Self) {
      
      inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var dirs: Double
    
    var files: Double
  }
  object Stats {
    
    inline def apply(dirs: Double, files: Double): Stats = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setDirs(value: Double): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
