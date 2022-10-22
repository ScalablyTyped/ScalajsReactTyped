package typingsJapgolly.v8ToIstanbul

import typingsJapgolly.jridgewellTraceMapping.distTypesTypesMod.SourceMapInput
import typingsJapgolly.v8ToIstanbul.mod.Sources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OriginalSource
    extends StObject
       with Sources {
    
    var originalSource: String
    
    var source: String
    
    var sourceMap: Sourcemap
  }
  object OriginalSource {
    
    inline def apply(originalSource: String, source: String, sourceMap: Sourcemap): OriginalSource = {
      val __obj = js.Dynamic.literal(originalSource = originalSource.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalSource]
    }
    
    extension [Self <: OriginalSource](x: Self) {
      
      inline def setOriginalSource(value: String): Self = StObject.set(x, "originalSource", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceMap(value: Sourcemap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source
    extends StObject
       with Sources {
    
    var source: String
  }
  object Source {
    
    inline def apply(source: String): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sourcemap extends StObject {
    
    var sourcemap: SourceMapInput
  }
  object Sourcemap {
    
    inline def apply(sourcemap: SourceMapInput): Sourcemap = {
      val __obj = js.Dynamic.literal(sourcemap = sourcemap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sourcemap]
    }
    
    extension [Self <: Sourcemap](x: Self) {
      
      inline def setSourcemap(value: SourceMapInput): Self = StObject.set(x, "sourcemap", value.asInstanceOf[js.Any])
    }
  }
}
