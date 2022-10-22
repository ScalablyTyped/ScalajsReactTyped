package typingsJapgolly.wordpressAdmin

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressAdmin.anon.Attachment
import typingsJapgolly.wordpressAdmin.anon.Frame
import typingsJapgolly.wordpressAdmin.anon.FrameOptionsframepost
import typingsJapgolly.wordpressAdmin.anon.Region
import typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.FrameOptions
import typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.MediaFrameSelect
import typingsJapgolly.wordpressAdmin.componentsWpBackboneMod.WpBackbone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Media extends StObject {
    
    def apply(attributes: FrameOptionsframepost): Any = js.native
    def apply(attributes: FrameOptions): MediaFrameSelect = js.native
    
    var View: typingsJapgolly.wordpressAdmin.componentsMediaViewsMod.View = js.native
    
    var controller: Region = js.native
    
    var frames: Record[String, Any] = js.native
    
    var model: Attachment = js.native
    
    var view: Frame = js.native
  }
  
  trait WpAdmin extends StObject {
    
    var Backbone: WpBackbone
    
    def media(attributes: FrameOptionsframepost): Any
    def media(attributes: FrameOptions): MediaFrameSelect
    @JSName("media")
    var media_Original: Media
  }
  object WpAdmin {
    
    inline def apply(Backbone: WpBackbone, media: Media): WpAdmin = {
      val __obj = js.Dynamic.literal(Backbone = Backbone.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[WpAdmin]
    }
    
    extension [Self <: WpAdmin](x: Self) {
      
      inline def setBackbone(value: WpBackbone): Self = StObject.set(x, "Backbone", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Media): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var wp: WpAdmin
    }
    object Window {
      
      inline def apply(wp: WpAdmin): Window = {
        val __obj = js.Dynamic.literal(wp = wp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setWp(value: WpAdmin): Self = StObject.set(x, "wp", value.asInstanceOf[js.Any])
      }
    }
  }
}
