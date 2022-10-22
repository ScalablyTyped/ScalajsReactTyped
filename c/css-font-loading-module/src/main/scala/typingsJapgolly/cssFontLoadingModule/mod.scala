package typingsJapgolly.cssFontLoadingModule

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
import typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loadingdone
import typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loadingerror
import typingsJapgolly.cssFontLoadingModule.mod.global.FontFace
import typingsJapgolly.cssFontLoadingModule.mod.global.FontFaceSet
import typingsJapgolly.cssFontLoadingModule.mod.global.FontFaceSetLoadEvent
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventInit
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("FontFace")
    @js.native
    open class FontFaceCls protected ()
      extends StObject
         with FontFace {
      def this(family: String, source: String) = this()
      def this(family: String, source: BinaryData) = this()
      def this(family: String, source: String, descriptors: FontFaceDescriptors) = this()
      def this(family: String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
      
      /* CompleteClass */
      var display: String = js.native
      
      /* CompleteClass */
      var family: String = js.native
      
      /* CompleteClass */
      var featureSettings: String = js.native
      
      /* CompleteClass */
      override def load(): js.Promise[FontFace] = js.native
      
      /* CompleteClass */
      override val loaded: js.Promise[FontFace] = js.native
      
      /* CompleteClass */
      override val status: FontFaceLoadStatus = js.native
      
      /* CompleteClass */
      var stretch: String = js.native
      
      /* CompleteClass */
      var style: String = js.native
      
      /* CompleteClass */
      var unicodeRange: String = js.native
      
      /* CompleteClass */
      var variant: String = js.native
      
      /* CompleteClass */
      var variationSettings: String = js.native
      
      /* CompleteClass */
      var weight: String = js.native
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("FontFaceSetLoadEvent")
    @js.native
    open class FontFaceSetLoadEventCls protected ()
      extends StObject
         with FontFaceSetLoadEvent {
      def this(`type`: String) = this()
      def this(`type`: String, eventInitDict: FontFaceSetLoadEventInit) = this()
    }
    
    trait Document extends StObject {
      
      var fonts: FontFaceSet
    }
    object Document {
      
      inline def apply(fonts: FontFaceSet): Document = {
        val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
        __obj.asInstanceOf[Document]
      }
      
      extension [Self <: Document](x: Self) {
        
        inline def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      }
    }
    
    trait FontFace extends StObject {
      
      var display: String
      
      var family: String
      
      var featureSettings: String
      
      def load(): js.Promise[FontFace]
      
      val loaded: js.Promise[FontFace]
      
      val status: FontFaceLoadStatus
      
      var stretch: String
      
      var style: String
      
      var unicodeRange: String
      
      var variant: String
      
      var variationSettings: String
      
      var weight: String
    }
    object FontFace {
      
      inline def apply(
        display: String,
        family: String,
        featureSettings: String,
        load: CallbackTo[js.Promise[FontFace]],
        loaded: js.Promise[FontFace],
        status: FontFaceLoadStatus,
        stretch: String,
        style: String,
        unicodeRange: String,
        variant: String,
        variationSettings: String,
        weight: String
      ): FontFace = {
        val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], featureSettings = featureSettings.asInstanceOf[js.Any], load = load.toJsFn, loaded = loaded.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unicodeRange = unicodeRange.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], variationSettings = variationSettings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
        __obj.asInstanceOf[FontFace]
      }
      
      extension [Self <: FontFace](x: Self) {
        
        inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
        
        inline def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
        
        inline def setLoad(value: CallbackTo[js.Promise[FontFace]]): Self = StObject.set(x, "load", value.toJsFn)
        
        inline def setLoaded(value: js.Promise[FontFace]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: FontFaceLoadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
        
        inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
        
        inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
        
        inline def setVariationSettings(value: String): Self = StObject.set(x, "variationSettings", value.asInstanceOf[js.Any])
        
        inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      }
    }
    
    trait FontFaceDescriptors extends StObject {
      
      var display: js.UndefOr[String] = js.undefined
      
      var featureSettings: js.UndefOr[String] = js.undefined
      
      var stretch: js.UndefOr[String] = js.undefined
      
      var style: js.UndefOr[String] = js.undefined
      
      var unicodeRange: js.UndefOr[String] = js.undefined
      
      var variant: js.UndefOr[String] = js.undefined
      
      var weight: js.UndefOr[String] = js.undefined
    }
    object FontFaceDescriptors {
      
      inline def apply(): FontFaceDescriptors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FontFaceDescriptors]
      }
      
      extension [Self <: FontFaceDescriptors](x: Self) {
        
        inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setFeatureSettings(value: String): Self = StObject.set(x, "featureSettings", value.asInstanceOf[js.Any])
        
        inline def setFeatureSettingsUndefined: Self = StObject.set(x, "featureSettings", js.undefined)
        
        inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
        
        inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
        
        inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
        
        inline def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
        
        inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
        
        inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
        
        inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
        
        inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      }
    }
    
    @js.native
    trait FontFaceSet
      extends StObject
         with Set[FontFace]
         with EventTarget {
      
      // EventTarget
      def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any
      ): Unit = js.native
      def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any,
        options: Boolean
      ): Unit = js.native
      def addEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any,
        options: AddEventListenerOptions
      ): Unit = js.native
      
      // return whether all fonts in the fontlist are loaded
      // (does not initiate load if not available)
      def check(font: String): Boolean = js.native
      def check(font: String, text: String): Boolean = js.native
      
      // check and start loads if appropriate
      // and fulfill promise when all loads complete
      def load(font: String): js.Promise[js.Array[FontFace]] = js.native
      def load(font: String, text: String): js.Promise[js.Array[FontFace]] = js.native
      
      // events for when loading state changes
      var onloading: (js.ThisFunction1[/* this */ this.type, /* event */ Event, Any]) | Null = js.native
      
      var onloadingdone: (js.ThisFunction1[/* this */ this.type, /* event */ Event, Any]) | Null = js.native
      
      var onloadingerror: (js.ThisFunction1[/* this */ this.type, /* event */ Event, Any]) | Null = js.native
      
      // async notification that font loading and layout operations are done
      val ready: js.Promise[FontFaceSet] = js.native
      
      def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any
      ): Unit = js.native
      def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any,
        options: EventListenerOptions
      ): Unit = js.native
      def removeEventListener[K /* <: /* keyof css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap */ loading | loadingdone | loadingerror */](
        `type`: K,
        listener: /* import warning: importer.ImportType#apply Failed type conversion: css-font-loading-module.css-font-loading-module.FontFaceSetCallbackMap[K] */ js.Any,
        options: Boolean
      ): Unit = js.native
      
      // loading state, "loading" while one or more fonts loading, "loaded" otherwise
      val status: FontFaceSetLoadStatus = js.native
    }
    
    @js.native
    trait FontFaceSetLoadEvent
      extends StObject
         with typingsJapgolly.std.Event {
      
      val fontfaces: js.Array[FontFace] = js.native
    }
    
    trait WorkerGlobalScope extends StObject {
      
      var fonts: FontFaceSet
    }
    object WorkerGlobalScope {
      
      inline def apply(fonts: FontFaceSet): WorkerGlobalScope = {
        val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
        __obj.asInstanceOf[WorkerGlobalScope]
      }
      
      extension [Self <: WorkerGlobalScope](x: Self) {
        
        inline def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type BinaryData = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.error
  */
  trait FontFaceLoadStatus extends StObject
  object FontFaceLoadStatus {
    
    inline def error: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.error = "error".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.error]
    
    inline def loaded: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = "loaded".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded]
    
    inline def loading: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = "loading".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading]
    
    inline def unloaded: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded = "unloaded".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded]
  }
  
  trait FontFaceSetCallbackMap extends StObject {
    
    def loading(event: FontFaceSetLoadEvent): Any
    
    def loadingdone(event: FontFaceSetLoadEvent): Any
    
    def loadingerror(event: FontFaceSetLoadEvent): Any
  }
  object FontFaceSetCallbackMap {
    
    inline def apply(
      loading: FontFaceSetLoadEvent => Any,
      loadingdone: FontFaceSetLoadEvent => Any,
      loadingerror: FontFaceSetLoadEvent => Any
    ): FontFaceSetCallbackMap = {
      val __obj = js.Dynamic.literal(loading = js.Any.fromFunction1(loading), loadingdone = js.Any.fromFunction1(loadingdone), loadingerror = js.Any.fromFunction1(loadingerror))
      __obj.asInstanceOf[FontFaceSetCallbackMap]
    }
    
    extension [Self <: FontFaceSetCallbackMap](x: Self) {
      
      inline def setLoading(value: FontFaceSetLoadEvent => Any): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      inline def setLoadingdone(value: FontFaceSetLoadEvent => Any): Self = StObject.set(x, "loadingdone", js.Any.fromFunction1(value))
      
      inline def setLoadingerror(value: FontFaceSetLoadEvent => Any): Self = StObject.set(x, "loadingerror", js.Any.fromFunction1(value))
    }
  }
  
  type FontFaceSetCopy = FontFaceSet
  
  trait FontFaceSetLoadEventInit
    extends StObject
       with EventInit {
    
    var fontfaces: js.UndefOr[js.Array[FontFace]] = js.undefined
  }
  object FontFaceSetLoadEventInit {
    
    inline def apply(): FontFaceSetLoadEventInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontFaceSetLoadEventInit]
    }
    
    extension [Self <: FontFaceSetLoadEventInit](x: Self) {
      
      inline def setFontfaces(value: js.Array[FontFace]): Self = StObject.set(x, "fontfaces", value.asInstanceOf[js.Any])
      
      inline def setFontfacesUndefined: Self = StObject.set(x, "fontfaces", js.undefined)
      
      inline def setFontfacesVarargs(value: FontFace*): Self = StObject.set(x, "fontfaces", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
    - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
  */
  trait FontFaceSetLoadStatus extends StObject
  object FontFaceSetLoadStatus {
    
    inline def loaded: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = "loaded".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded]
    
    inline def loading: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = "loading".asInstanceOf[typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading]
  }
}
