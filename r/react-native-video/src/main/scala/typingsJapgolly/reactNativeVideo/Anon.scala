package typingsJapgolly.reactNativeVideo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.auto
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.disabled
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.index
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.landscape
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.language
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.portrait
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.resolution
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.system
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import typingsJapgolly.reactNativeVideo.reactNativeVideoStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bitrate extends StObject {
    
    var bitrate: Double
    
    var codecs: String
    
    var height: Double
    
    var trackId: String
    
    var width: Double
  }
  object Bitrate {
    
    inline def apply(bitrate: Double, codecs: String, height: Double, trackId: String, width: Double): Bitrate = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], codecs = codecs.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], trackId = trackId.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitrate]
    }
    
    extension [Self <: Bitrate](x: Self) {
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setCodecs(value: String): Self = StObject.set(x, "codecs", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setTrackId(value: String): Self = StObject.set(x, "trackId", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BufferForPlaybackAfterRebufferMs extends StObject {
    
    var bufferForPlaybackAfterRebufferMs: js.UndefOr[Double] = js.undefined
    
    var bufferForPlaybackMs: js.UndefOr[Double] = js.undefined
    
    var maxBufferMs: js.UndefOr[Double] = js.undefined
    
    var minBufferMs: js.UndefOr[Double] = js.undefined
  }
  object BufferForPlaybackAfterRebufferMs {
    
    inline def apply(): BufferForPlaybackAfterRebufferMs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferForPlaybackAfterRebufferMs]
    }
    
    extension [Self <: BufferForPlaybackAfterRebufferMs](x: Self) {
      
      inline def setBufferForPlaybackAfterRebufferMs(value: Double): Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", value.asInstanceOf[js.Any])
      
      inline def setBufferForPlaybackAfterRebufferMsUndefined: Self = StObject.set(x, "bufferForPlaybackAfterRebufferMs", js.undefined)
      
      inline def setBufferForPlaybackMs(value: Double): Self = StObject.set(x, "bufferForPlaybackMs", value.asInstanceOf[js.Any])
      
      inline def setBufferForPlaybackMsUndefined: Self = StObject.set(x, "bufferForPlaybackMs", js.undefined)
      
      inline def setMaxBufferMs(value: Double): Self = StObject.set(x, "maxBufferMs", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferMsUndefined: Self = StObject.set(x, "maxBufferMs", js.undefined)
      
      inline def setMinBufferMs(value: Double): Self = StObject.set(x, "minBufferMs", value.asInstanceOf[js.Any])
      
      inline def setMinBufferMsUndefined: Self = StObject.set(x, "minBufferMs", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var orientation: portrait | landscape
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, orientation: portrait | landscape, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var language: String
    
    var title: String
    
    var `type`: String
  }
  object Index {
    
    inline def apply(index: Double, language: String, title: String, `type`: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt
    
    var uri: String
  }
  object Language {
    
    inline def apply(`type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt, uri: String): Language = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: system | disabled | title | language | index
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object Type {
    
    inline def apply(`type`: system | disabled | title | language | index): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: system | disabled | title | language | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Value extends StObject {
    
    var `type`: auto | disabled | resolution | index
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object Value {
    
    inline def apply(`type`: auto | disabled | resolution | index): Value = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setType(value: auto | disabled | resolution | index): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("")
    var _empty: String
    
    var errorString: String
  }
  object _empty {
    
    inline def apply(_empty: String, errorString: String): _empty = {
      val __obj = js.Dynamic.literal(errorString = errorString.asInstanceOf[js.Any])
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[_empty]
    }
    
    extension [Self <: _empty](x: Self) {
      
      inline def setErrorString(value: String): Self = StObject.set(x, "errorString", value.asInstanceOf[js.Any])
      
      inline def set_empty(value: String): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
}
