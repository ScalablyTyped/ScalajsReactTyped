package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.licenseWebpackPlugin.distPackageJsonMod.PackageJson
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackStatsOptions
import typingsJapgolly.licenseWebpackPlugin.distWebpackStatsMod.WebpackStats
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def tap(options: Name, handler: js.Function0[Unit]): Unit
  }
  object `0` {
    
    inline def apply(tap: (Name, js.Function0[Unit]) => Callback): `0` = {
      val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: Name, t1: js.Function0[Unit]) => (tap(t0, t1)).runNow()))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTap(value: (Name, js.Function0[Unit]) => Callback): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: Name, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait `1` extends StObject {
    
    def tap(pluginName: String, handler: js.Function1[/* compilation */ WebpackCompilation, Unit]): Unit
  }
  object `1` {
    
    inline def apply(tap: (String, js.Function1[/* compilation */ WebpackCompilation, Unit]) => Callback): `1` = {
      val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: String, t1: js.Function1[/* compilation */ WebpackCompilation, Unit]) => (tap(t0, t1)).runNow()))
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setTap(value: (String, js.Function1[/* compilation */ WebpackCompilation, Unit]) => Callback): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: String, t1: js.Function1[/* compilation */ WebpackCompilation, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Basename extends StObject {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var chunk: js.UndefOr[Any] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[Any] = js.undefined
    
    var query: js.UndefOr[Any] = js.undefined
  }
  object Basename {
    
    inline def apply(): Basename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Basename]
    }
    
    extension [Self <: Basename](x: Self) {
      
      inline def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setChunk(value: Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
      
      inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setHash(value: Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Compilation extends StObject {
    
    var compilation: `1`
    
    var emit: `1`
    
    var thisCompilation: `1`
  }
  object Compilation {
    
    inline def apply(compilation: `1`, emit: `1`, thisCompilation: `1`): Compilation = {
      val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], thisCompilation = thisCompilation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compilation]
    }
    
    extension [Self <: Compilation](x: Self) {
      
      inline def setCompilation(value: `1`): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
      
      inline def setEmit(value: `1`): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      inline def setThisCompilation(value: `1`): Self = StObject.set(x, "thisCompilation", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescriptionFileData extends StObject {
    
    var descriptionFileData: PackageJson
    
    var descriptionFileRoot: String
  }
  object DescriptionFileData {
    
    inline def apply(descriptionFileData: PackageJson, descriptionFileRoot: String): DescriptionFileData = {
      val __obj = js.Dynamic.literal(descriptionFileData = descriptionFileData.asInstanceOf[js.Any], descriptionFileRoot = descriptionFileRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescriptionFileData]
    }
    
    extension [Self <: DescriptionFileData](x: Self) {
      
      inline def setDescriptionFileData(value: PackageJson): Self = StObject.set(x, "descriptionFileData", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFileRoot(value: String): Self = StObject.set(x, "descriptionFileRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var stage: Double
  }
  object Name {
    
    inline def apply(name: String, stage: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptimizeChunkAssets extends StObject {
    
    var optimizeChunkAssets: Tap
    
    var processAssets: `0`
  }
  object OptimizeChunkAssets {
    
    inline def apply(optimizeChunkAssets: Tap, processAssets: `0`): OptimizeChunkAssets = {
      val __obj = js.Dynamic.literal(optimizeChunkAssets = optimizeChunkAssets.asInstanceOf[js.Any], processAssets = processAssets.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimizeChunkAssets]
    }
    
    extension [Self <: OptimizeChunkAssets](x: Self) {
      
      inline def setOptimizeChunkAssets(value: Tap): Self = StObject.set(x, "optimizeChunkAssets", value.asInstanceOf[js.Any])
      
      inline def setProcessAssets(value: `0`): Self = StObject.set(x, "processAssets", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource extends StObject {
    
    var resource: js.UndefOr[String] = js.undefined
  }
  object Resource {
    
    inline def apply(): Resource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Resource]
    }
    
    extension [Self <: Resource](x: Self) {
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  trait Tap extends StObject {
    
    def tap(pluginName: String, handler: js.Function1[/* chunks */ IterableIterator[WebpackChunk], Unit]): Unit
  }
  object Tap {
    
    inline def apply(tap: (String, js.Function1[/* chunks */ IterableIterator[WebpackChunk], Unit]) => Callback): Tap = {
      val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: String, t1: js.Function1[/* chunks */ IterableIterator[WebpackChunk], Unit]) => (tap(t0, t1)).runNow()))
      __obj.asInstanceOf[Tap]
    }
    
    extension [Self <: Tap](x: Self) {
      
      inline def setTap(value: (String, js.Function1[/* chunks */ IterableIterator[WebpackChunk], Unit]) => Callback): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: String, t1: js.Function1[/* chunks */ IterableIterator[WebpackChunk], Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait ToJson extends StObject {
    
    def toJson(): WebpackStats = js.native
    def toJson(options: WebpackStatsOptions): WebpackStats = js.native
  }
  
  trait Type extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object Type {
    
    inline def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
