package typingsJapgolly.semanticUiEmbed

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ClassNameSettings.Param
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ErrorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ParametersSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ParametersSettings.Impl
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings
import typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedBooleans.`false`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get id`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get sources`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get type`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`get url`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.`has placeholder`
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.auto
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.change
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.destroy
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.hide
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.reset
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.setting
import typingsJapgolly.semanticUiEmbed.semanticUiEmbedStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Embed extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Returns current content id
      */
    def apply(behavior: `get id`): String = js.native
    /**
      * Returns placeholder image url
      */
    def apply(behavior: `get placeholder`): String = js.native
    /**
      * Returns source name
      */
    def apply(behavior: `get sources`): String = js.native
    /**
      * Returns source type
      */
    def apply(behavior: `get type`): String = js.native
    /**
      * Returns URL with all parameters added
      */
    def apply(behavior: `get url`): String = js.native
    /**
      * Returns whether embed content has placeholder
      */
    def apply(behavior: `has placeholder`): Boolean = js.native
    /**
      * Changes iframe to a new content source
      */
    def apply(behavior: change, source: String, id: String, url: String): JQuery = js.native
    /**
      * Destroys instance and removes all events
      */
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides embed content and shows placeholder content
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Removes embed and shows placeholder content if available
      */
    def apply(behavior: reset): JQuery = js.native
    def apply(behavior: setting, value: EmbedSettings): JQuery = js.native
    /**
      * Shows embed content
      */
    def apply(behavior: show): JQuery = js.native
    def apply(settings: EmbedSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-embed.SemanticUI.EmbedSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-embed.SemanticUI.EmbedSettings._Impl[K] */ js.Any = js.native
    
    var settings: EmbedSettings = js.native
  }
  object Embed {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'embed'
          */
        var embed: String
      }
      object Impl {
        
        inline def apply(active: String, embed: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiEmbed.anon.PickImplactivePartialPick
        - typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickIActive
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplembedPartialPickIActive(embed: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickIActive = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickIActive]
        }
      }
    }
    type ClassNameSettings = Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined'
          */
        var method: String
        
        /**
          * @default 'No URL specified'
          */
        var noURL: String
      }
      object Impl {
        
        inline def apply(method: String, noURL: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noURL = noURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setNoURL(value: String): Self = StObject.set(x, "noURL", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiEmbed.anon.PickImplnoURLPartialPickI
        - typingsJapgolly.semanticUiEmbed.anon.PickImplmethodPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplnoURLPartialPickI(noURL: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplnoURLPartialPickI = {
          val __obj = js.Dynamic.literal(noURL = noURL.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplnoURLPartialPickI]
        }
      }
    }
    type ErrorSettings = typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.ErrorSettings.Param
    
    object MetadataSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'icon'
          */
        var icon: String
        
        /**
          * @default 'id'
          */
        var id: String
        
        /**
          * @default 'placeholder'
          */
        var placeholder: String
        
        /**
          * @default 'source'
          */
        var source: String
        
        /**
          * @default 'url'
          */
        var url: String
      }
      object Impl {
        
        inline def apply(icon: String, id: String, placeholder: String, source: String, url: String): Impl = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImplIcon
        - typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickImIcon
        - typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon
        - typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPickIcon
        - typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpliconPartialPickImIcon(icon: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickImIcon = {
          val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickImIcon]
        }
        
        inline def PickImplidPartialPickImplIcon(id: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImplIcon = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImplIcon]
        }
        
        inline def PickImplplaceholderPartiaIcon(placeholder: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIcon]
        }
        
        inline def PickImplsourcePartialPickIcon(source: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPickIcon = {
          val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPickIcon]
        }
        
        inline def PickImplurlPartialPickImpIcon(url: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImpIcon]
        }
      }
    }
    type MetadataSettings = typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.MetadataSettings.Param
    
    object ParametersSettings {
      
      type Impl = StringDictionary[Any]
      
      type Param = Impl
    }
    type ParametersSettings = Impl
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.embed'
          */
        var embed: String
        
        /**
          * @default '.placeholder'
          */
        var placeholder: String
        
        /**
          * @default '.play'
          */
        var play: String
      }
      object Impl {
        
        inline def apply(embed: String, placeholder: String, play: String): typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl]
        }
        
        extension [Self <: typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Impl](x: Self) {
          
          inline def setEmbed(value: String): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setPlay(value: String): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickI
        - typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartia
        - typingsJapgolly.semanticUiEmbed.anon.PickImplplayPartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplembedPartialPickI(embed: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickI = {
          val __obj = js.Dynamic.literal(embed = embed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplembedPartialPickI]
        }
        
        inline def PickImplplaceholderPartia(placeholder: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartia = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartia]
        }
        
        inline def PickImplplayPartialPickIm(play: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplplayPartialPickIm = {
          val __obj = js.Dynamic.literal(play = play.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplplayPartialPickIm]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.SelectorSettings.Param
    
    object TemplatesSettings {
      
      trait Impl extends StObject {
        
        /**
          * returns html for iframe
          */
        def iframe(url: String, parameters: String): String
        
        /**
          * returns html for placeholder element
          */
        def placeholder(image: String, icon: String): String
      }
      object Impl {
        
        inline def apply(iframe: (String, String) => String, placeholder: (String, String) => String): typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl = {
          val __obj = js.Dynamic.literal(iframe = js.Any.fromFunction2(iframe), placeholder = js.Any.fromFunction2(placeholder))
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl]
        }
        
        extension [Self <: typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Impl](x: Self) {
          
          inline def setIframe(value: (String, String) => String): Self = StObject.set(x, "iframe", js.Any.fromFunction2(value))
          
          inline def setPlaceholder(value: (String, String) => String): Self = StObject.set(x, "placeholder", js.Any.fromFunction2(value))
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiEmbed.anon.PickImpliframePartialPick
        - typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImpliframePartialPick(
          iframe: (js.Function2[/* url */ String, /* parameters */ String, String]) & (js.UndefOr[js.Function2[/* url */ String, /* parameters */ String, String]])
        ): typingsJapgolly.semanticUiEmbed.anon.PickImpliframePartialPick = {
          val __obj = js.Dynamic.literal(iframe = iframe.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImpliframePartialPick]
        }
        
        inline def PickImplplaceholderPartiaIframe(
          placeholder: (js.Function2[/* image */ String, /* icon */ String, String]) & (js.UndefOr[js.Function2[/* image */ String, /* icon */ String, String]])
        ): typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe = {
          val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplplaceholderPartiaIframe]
        }
      }
    }
    type TemplatesSettings = typingsJapgolly.semanticUiEmbed.SemanticUI.Embed.TemplatesSettings.Param
  }
  
  object EmbedSettings {
    
    trait Impl extends StObject {
      
      // endregion
      // region Video Settings
      /**
        * Default setting auto will only autoplay content when a placeholder is specified. Setting to true or false will force autoplay.
        *
        * @default 'auto'
        */
      var autoplay: auto | Boolean
      
      /**
        * Whether to show networks branded UI like title cards, or after video calls to action.
        *
        * @default false
        */
      var brandedUI: Boolean
      
      /**
        * Class names used to attach style to state
        */
      var className: ClassNameSettings
      
      /**
        * Specifies a default chrome color with Vimeo or YouTube.
        *
        * @default '#444444'
        */
      var color: String
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether to prefer HD content
        *
        * @default true
        */
      var hd: Boolean
      
      // region Embed Settings
      /**
        * Specifies an icon to use with placeholder content
        *
        * @default false
        */
      var icon: `false` | String
      
      /**
        * Specifies an id value to replace with the {id} value found in templated urls
        *
        * @default false
        */
      var id: `false` | String
      
      /**
        * HTML Data attributes used to store data
        */
      var metadata: MetadataSettings
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      // endregion
      // region Callbacks
      /**
        * Callback when iframe is generated
        */
      def onCreate(url: String): Unit
      
      /**
        * Whenever an iframe contents is shown
        */
      def onDisplay(): Unit
      
      /**
        * Callback when module parameters are determined. Allows you to adjust parameters at run time by returning a new parameters object.
        */
      def onEmbed(parameters: ParametersSettings): ParametersSettings
      
      /**
        * Callback immediately before Embed is removed from DOM
        */
      def onPlaceholderDisplay(): Unit
      
      /**
        * Specify an object containing key/value pairs to add to the iframes GET parameters
        *
        * @default false
        */
      var parameters: `false` | ParametersSettings
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * DOM Selectors used internally
        */
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Specifies a source to use, if no source is provided it will be determined from the domain of a specified url.
        *
        * @default false
        */
      var source: `false` | String
      
      var templates: TemplatesSettings
      
      /**
        * Specifies a url to use for embed
        *
        * @default false
        */
      var url: `false` | String
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        autoplay: auto | Boolean,
        brandedUI: Boolean,
        className: ClassNameSettings,
        color: String,
        debug: Boolean,
        error: ErrorSettings,
        hd: Boolean,
        icon: `false` | String,
        id: `false` | String,
        metadata: MetadataSettings,
        name: String,
        namespace: String,
        onCreate: String => Callback,
        onDisplay: Callback,
        onEmbed: ParametersSettings => ParametersSettings,
        onPlaceholderDisplay: Callback,
        parameters: `false` | ParametersSettings,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        source: `false` | String,
        templates: TemplatesSettings,
        url: `false` | String,
        verbose: Boolean
      ): typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings.Impl = {
        val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], brandedUI = brandedUI.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onCreate = js.Any.fromFunction1((t0: String) => onCreate(t0).runNow()), onDisplay = onDisplay.toJsFn, onEmbed = js.Any.fromFunction1(onEmbed), onPlaceholderDisplay = onPlaceholderDisplay.toJsFn, parameters = parameters.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings.Impl]
      }
      
      extension [Self <: typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings.Impl](x: Self) {
        
        inline def setAutoplay(value: auto | Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
        
        inline def setBrandedUI(value: Boolean): Self = StObject.set(x, "brandedUI", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setHd(value: Boolean): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: `false` | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setId(value: `false` | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnCreate(value: String => Callback): Self = StObject.set(x, "onCreate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setOnDisplay(value: Callback): Self = StObject.set(x, "onDisplay", value.toJsFn)
        
        inline def setOnEmbed(value: ParametersSettings => ParametersSettings): Self = StObject.set(x, "onEmbed", js.Any.fromFunction1(value))
        
        inline def setOnPlaceholderDisplay(value: Callback): Self = StObject.set(x, "onPlaceholderDisplay", value.toJsFn)
        
        inline def setParameters(value: `false` | ParametersSettings): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setSource(value: `false` | String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: `false` | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImp
      - typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickIm
      - typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPick
      - typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImpl
      - typingsJapgolly.semanticUiEmbed.anon.PickImplparametersPartial
      - typingsJapgolly.semanticUiEmbed.anon.PickImplautoplayPartialPi
      - typingsJapgolly.semanticUiEmbed.anon.PickImplcolorPartialPickI
      - typingsJapgolly.semanticUiEmbed.anon.PickImplhdPartialPickImpl
      - typingsJapgolly.semanticUiEmbed.anon.PickImplbrandedUIPartialP
      - typingsJapgolly.semanticUiEmbed.anon.PickImplonCreatePartialPi
      - typingsJapgolly.semanticUiEmbed.anon.PickImplonDisplayPartialP
      - typingsJapgolly.semanticUiEmbed.anon.PickImplonPlaceholderDisp
      - typingsJapgolly.semanticUiEmbed.anon.PickImplonEmbedPartialPic
      - typingsJapgolly.semanticUiEmbed.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiEmbed.anon.PickImplmetadataPartialPi
      - typingsJapgolly.semanticUiEmbed.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiEmbed.anon.PickImpltemplatesPartialP
      - typingsJapgolly.semanticUiEmbed.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiEmbed.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiEmbed.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiEmbed.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiEmbed.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiEmbed.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiEmbed.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplautoplayPartialPi(autoplay: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiEmbed.anon.PickImplautoplayPartialPi = {
        val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplautoplayPartialPi]
      }
      
      inline def PickImplbrandedUIPartialP(brandedUI: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImplbrandedUIPartialP = {
        val __obj = js.Dynamic.literal(brandedUI = brandedUI.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplbrandedUIPartialP]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiEmbed.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcolorPartialPickI(color: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplcolorPartialPickI = {
        val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplcolorPartialPickI]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiEmbed.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplhdPartialPickImpl(hd: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImplhdPartialPickImpl = {
        val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplhdPartialPickImpl]
      }
      
      inline def PickImpliconPartialPickIm(icon: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickIm = {
        val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImpliconPartialPickIm]
      }
      
      inline def PickImplidPartialPickImpl(id: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImpl = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplidPartialPickImpl]
      }
      
      inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiEmbed.anon.PickImplmetadataPartialPi = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplmetadataPartialPi]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiEmbed.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonCreatePartialPi(
        onCreate: (js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]])
      ): typingsJapgolly.semanticUiEmbed.anon.PickImplonCreatePartialPi = {
        val __obj = js.Dynamic.literal(onCreate = onCreate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplonCreatePartialPi]
      }
      
      inline def PickImplonDisplayPartialP(
        onDisplay: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiEmbed.anon.PickImplonDisplayPartialP = {
        val __obj = js.Dynamic.literal(onDisplay = onDisplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplonDisplayPartialP]
      }
      
      inline def PickImplonEmbedPartialPic(
        onEmbed: (js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]) & (js.UndefOr[
              js.ThisFunction1[/* this */ JQuery, /* parameters */ ParametersSettings, ParametersSettings]
            ])
      ): typingsJapgolly.semanticUiEmbed.anon.PickImplonEmbedPartialPic = {
        val __obj = js.Dynamic.literal(onEmbed = onEmbed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplonEmbedPartialPic]
      }
      
      inline def PickImplonPlaceholderDisp(
        onPlaceholderDisplay: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiEmbed.anon.PickImplonPlaceholderDisp = {
        val __obj = js.Dynamic.literal(onPlaceholderDisplay = onPlaceholderDisplay.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplonPlaceholderDisp]
      }
      
      inline def PickImplparametersPartial(parameters: (`false` | ParametersSettings) & (js.UndefOr[`false` | ParametersSettings])): typingsJapgolly.semanticUiEmbed.anon.PickImplparametersPartial = {
        val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplparametersPartial]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiEmbed.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplsourcePartialPick(source: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPick = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplsourcePartialPick]
      }
      
      inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typingsJapgolly.semanticUiEmbed.anon.PickImpltemplatesPartialP = {
        val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImpltemplatesPartialP]
      }
      
      inline def PickImplurlPartialPickImp(url: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImp = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplurlPartialPickImp]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiEmbed.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiEmbed.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/embed.html#/settings}
    */
  type EmbedSettings = typingsJapgolly.semanticUiEmbed.SemanticUI.EmbedSettings.Param
}
