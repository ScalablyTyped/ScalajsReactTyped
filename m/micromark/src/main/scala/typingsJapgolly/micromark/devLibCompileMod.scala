package typingsJapgolly.micromark

import typingsJapgolly.micromarkUtilTypes.mod.Compile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibCompileMod {
  
  @JSImport("micromark/dev/lib/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(): Compile_ = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")().asInstanceOf[Compile_]
  inline def compile(options: typingsJapgolly.micromarkUtilTypes.mod.CompileOptions): Compile_ = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(options.asInstanceOf[js.Any]).asInstanceOf[Compile_]
  
  type CompileContext = typingsJapgolly.micromarkUtilTypes.mod.CompileContext
  
  type CompileData = typingsJapgolly.micromarkUtilTypes.mod.CompileData
  
  type CompileOptions = typingsJapgolly.micromarkUtilTypes.mod.CompileOptions
  
  type Compile_ = Compile
  
  trait Definition extends StObject {
    
    var destination: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Definition {
    
    inline def apply(): Definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Event = typingsJapgolly.micromarkUtilTypes.mod.Event
  
  type Handle = typingsJapgolly.micromarkUtilTypes.mod.Handle
  
  type HtmlExtension = typingsJapgolly.micromarkUtilTypes.mod.HtmlExtension
  
  trait Media extends StObject {
    
    var destination: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelId: js.UndefOr[String] = js.undefined
    
    var referenceId: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Media {
    
    inline def apply(): Media = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Media]
    }
    
    extension [Self <: Media](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
      
      inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NormalizedHtmlExtension = typingsJapgolly.micromarkUtilTypes.mod.NormalizedHtmlExtension
}
