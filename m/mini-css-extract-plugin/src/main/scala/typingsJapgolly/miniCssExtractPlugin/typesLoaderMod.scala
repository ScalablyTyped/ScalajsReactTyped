package typingsJapgolly.miniCssExtractPlugin

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLoaderMod {
  
  @JSImport("mini-css-extract-plugin/types/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  inline def pitch(request: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pitch")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AssetInfo = typingsJapgolly.webpack.mod.AssetInfo
  
  type Chunk = typingsJapgolly.webpack.mod.Chunk
  
  type Compilation = typingsJapgolly.webpack.mod.Compilation
  
  type Compiler = typingsJapgolly.webpack.mod.Compiler
  
  trait Dependency extends StObject {
    
    var content: Buffer
    
    var context: String | Null
    
    var identifier: String
    
    var layer: js.UndefOr[String] = js.undefined
    
    var media: String
    
    var sourceMap: js.UndefOr[Buffer] = js.undefined
    
    var supports: js.UndefOr[String] = js.undefined
  }
  object Dependency {
    
    inline def apply(content: Buffer, identifier: String, media: String): Dependency = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], context = null)
      __obj.asInstanceOf[Dependency]
    }
    
    extension [Self <: Dependency](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setSourceMap(value: Buffer): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
  
  type LoaderOptions = typingsJapgolly.miniCssExtractPlugin.mod.LoaderOptions
  
  type Module = typingsJapgolly.webpack.mod.Module
  
  type NormalModule = typingsJapgolly.webpack.mod.NormalModule
  
  type Schema = typingsJapgolly.schemaUtils.declarationsValidateMod.Schema
  
  type Source = typingsJapgolly.webpack.mod.Source
  
  type TODO = Any
}
