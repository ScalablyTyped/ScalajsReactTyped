package typingsJapgolly.unsplashJs

import org.scalajs.dom.Response
import typingsJapgolly.unsplashJs.anon.AppId
import typingsJapgolly.unsplashJs.anon.DownloadLocation_
import typingsJapgolly.unsplashJs.anon.OmitStrictPaginationParam
import typingsJapgolly.unsplashJs.anon.Photos
import typingsJapgolly.unsplashJs.anon.PickPaginationParamspagep
import typingsJapgolly.unsplashJs.anon.ResponseResponse
import typingsJapgolly.unsplashJs.anon.Results
import typingsJapgolly.unsplashJs.anon.ResultsArray
import typingsJapgolly.unsplashJs.anon.ResultsTotal
import typingsJapgolly.unsplashJs.anon.Total
import typingsJapgolly.unsplashJs.anon.Url
import typingsJapgolly.unsplashJs.anon.statsbooleanundefinedOrie
import typingsJapgolly.unsplashJs.distHelpersRequestMod.AdditionalFetchOptions
import typingsJapgolly.unsplashJs.distHelpersRequestMod.CompleteRequestParams
import typingsJapgolly.unsplashJs.distHelpersRequestMod.InitParams
import typingsJapgolly.unsplashJs.distHelpersResponseMod.HandleResponse
import typingsJapgolly.unsplashJs.distMethodsCollectionsMod.CollectionId
import typingsJapgolly.unsplashJs.distMethodsPhotosMod.PhotoId
import typingsJapgolly.unsplashJs.distMethodsPhotosMod.RandomParams
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Full
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Random
import typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Stats
import typingsJapgolly.unsplashJs.distMethodsSearchMod.SearchParams
import typingsJapgolly.unsplashJs.distMethodsSearchMod.SearchPhotosParams
import typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Collections
import typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Users
import typingsJapgolly.unsplashJs.distMethodsTopicsMod.TopicIdOrSlug
import typingsJapgolly.unsplashJs.distMethodsUsersMod.Username
import typingsJapgolly.unsplashJs.distTypesRequestMod.OrientationParam
import typingsJapgolly.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unsplash-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unsplash-js", "Language")
  @js.native
  object Language extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language & String] = js.native
    
    /* "af" */ val Afrikaans: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Afrikaans & String = js.native
    
    /* "sq" */ val Albanian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Albanian & String = js.native
    
    /* "am" */ val Amharic: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Amharic & String = js.native
    
    /* "ar" */ val Arabic: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Arabic & String = js.native
    
    /* "hy" */ val Armenian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Armenian & String = js.native
    
    /* "az" */ val Azerbaijani: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Azerbaijani & String = js.native
    
    /* "eu" */ val Basque: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Basque & String = js.native
    
    /* "be" */ val Belarusian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Belarusian & String = js.native
    
    /* "bn" */ val Bengali: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Bengali & String = js.native
    
    /* "bs" */ val Bosnian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Bosnian & String = js.native
    
    /* "bg" */ val Bulgarian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Bulgarian & String = js.native
    
    /* "ca" */ val Catalan: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Catalan & String = js.native
    
    /* "ceb" */ val Cebuano: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Cebuano & String = js.native
    
    /* "zh" */ val ChineseSimplified: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.ChineseSimplified & String = js.native
    
    /* "zh-TW" */ val ChineseTraditional: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.ChineseTraditional & String = js.native
    
    /* "co" */ val Corsican: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Corsican & String = js.native
    
    /* "hr" */ val Croatian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Croatian & String = js.native
    
    /* "cs" */ val Czech: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Czech & String = js.native
    
    /* "da" */ val Danish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Danish & String = js.native
    
    /* "nl" */ val Dutch: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Dutch & String = js.native
    
    /* "en" */ val English: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.English & String = js.native
    
    /* "eo" */ val Esperanto: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Esperanto & String = js.native
    
    /* "et" */ val Estonian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Estonian & String = js.native
    
    /* "tl" */ val Filipino: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Filipino & String = js.native
    
    /* "fi" */ val Finnish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Finnish & String = js.native
    
    /* "fr" */ val French: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.French & String = js.native
    
    /* "fy" */ val Frisian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Frisian & String = js.native
    
    /* "gl" */ val Galician: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Galician & String = js.native
    
    /* "ka" */ val Georgian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Georgian & String = js.native
    
    /* "de" */ val German: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.German & String = js.native
    
    /* "el" */ val Greek: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Greek & String = js.native
    
    /* "gu" */ val Gujarati: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Gujarati & String = js.native
    
    /* "ht" */ val HaitianCreole: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.HaitianCreole & String = js.native
    
    /* "ha" */ val Hausa: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hausa & String = js.native
    
    /* "haw" */ val Hawaiian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hawaiian & String = js.native
    
    /* "iw" */ val Hebrew: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hebrew & String = js.native
    
    /* "hi" */ val Hindi: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hindi & String = js.native
    
    /* "hmn" */ val Hmong: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hmong & String = js.native
    
    /* "hu" */ val Hungarian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Hungarian & String = js.native
    
    /* "is" */ val Icelandic: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Icelandic & String = js.native
    
    /* "ig" */ val Igbo: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Igbo & String = js.native
    
    /* "id" */ val Indonesian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Indonesian & String = js.native
    
    /* "ga" */ val Irish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Irish & String = js.native
    
    /* "it" */ val Italian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Italian & String = js.native
    
    /* "ja" */ val Japanese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Japanese & String = js.native
    
    /* "jw" */ val Javanese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Javanese & String = js.native
    
    /* "kn" */ val Kannada: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Kannada & String = js.native
    
    /* "kk" */ val Kazakh: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Kazakh & String = js.native
    
    /* "km" */ val Khmer: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Khmer & String = js.native
    
    /* "rw" */ val Kinyarwanda: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Kinyarwanda & String = js.native
    
    /* "ko" */ val Korean: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Korean & String = js.native
    
    /* "ku" */ val Kurdish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Kurdish & String = js.native
    
    /* "ky" */ val Kyrgyz: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Kyrgyz & String = js.native
    
    /* "lo" */ val Lao: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Lao & String = js.native
    
    /* "la" */ val Latin: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Latin & String = js.native
    
    /* "lv" */ val Latvian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Latvian & String = js.native
    
    /* "lt" */ val Lithuanian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Lithuanian & String = js.native
    
    /* "lb" */ val Luxembourgish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Luxembourgish & String = js.native
    
    /* "mk" */ val Macedonian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Macedonian & String = js.native
    
    /* "mg" */ val Malagasy: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Malagasy & String = js.native
    
    /* "ms" */ val Malay: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Malay & String = js.native
    
    /* "ml" */ val Malayalam: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Malayalam & String = js.native
    
    /* "mt" */ val Maltese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Maltese & String = js.native
    
    /* "mi" */ val Maori: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Maori & String = js.native
    
    /* "mr" */ val Marathi: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Marathi & String = js.native
    
    /* "mn" */ val Mongolian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Mongolian & String = js.native
    
    /* "my" */ val Myanmar: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Myanmar & String = js.native
    
    /* "ne" */ val Nepali: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Nepali & String = js.native
    
    /* "no" */ val Norwegian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Norwegian & String = js.native
    
    /* "ny" */ val Nyanja: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Nyanja & String = js.native
    
    /* "or" */ val Oriya: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Oriya & String = js.native
    
    /* "ps" */ val Pashto: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Pashto & String = js.native
    
    /* "fa" */ val Persian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Persian & String = js.native
    
    /* "pl" */ val Polish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Polish & String = js.native
    
    /* "pt" */ val Portuguese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Portuguese & String = js.native
    
    /* "pa" */ val Punjabi: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Punjabi & String = js.native
    
    /* "ro" */ val Romanian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Romanian & String = js.native
    
    /* "ru" */ val Russian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Russian & String = js.native
    
    /* "sm" */ val Samoan: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Samoan & String = js.native
    
    /* "gd" */ val ScotsGaelic: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.ScotsGaelic & String = js.native
    
    /* "sr" */ val Serbian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Serbian & String = js.native
    
    /* "st" */ val Sesotho: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Sesotho & String = js.native
    
    /* "sn" */ val Shona: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Shona & String = js.native
    
    /* "sd" */ val Sindhi: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Sindhi & String = js.native
    
    /* "si" */ val Sinhala: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Sinhala & String = js.native
    
    /* "sk" */ val Slovak: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Slovak & String = js.native
    
    /* "sl" */ val Slovenian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Slovenian & String = js.native
    
    /* "so" */ val Somali: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Somali & String = js.native
    
    /* "es" */ val Spanish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Spanish & String = js.native
    
    /* "su" */ val Sundanese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Sundanese & String = js.native
    
    /* "sw" */ val Swahili: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Swahili & String = js.native
    
    /* "sv" */ val Swedish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Swedish & String = js.native
    
    /* "tg" */ val Tajik: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Tajik & String = js.native
    
    /* "ta" */ val Tamil: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Tamil & String = js.native
    
    /* "tt" */ val Tatar: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Tatar & String = js.native
    
    /* "te" */ val Telugu: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Telugu & String = js.native
    
    /* "th" */ val Thai: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Thai & String = js.native
    
    /* "tr" */ val Turkish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Turkish & String = js.native
    
    /* "tk" */ val Turkmen: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Turkmen & String = js.native
    
    /* "ug" */ val Uighur: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Uighur & String = js.native
    
    /* "uk" */ val Ukrainian: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Ukrainian & String = js.native
    
    /* "ur" */ val Urdu: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Urdu & String = js.native
    
    /* "uz" */ val Uzbek: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Uzbek & String = js.native
    
    /* "vi" */ val Vietnamese: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Vietnamese & String = js.native
    
    /* "cy" */ val Welsh: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Welsh & String = js.native
    
    /* "xh" */ val Xhosa: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Xhosa & String = js.native
    
    /* "yi" */ val Yiddish: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Yiddish & String = js.native
    
    /* "yo" */ val Yoruba: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Yoruba & String = js.native
    
    /* "zu" */ val Zulu: typingsJapgolly.unsplashJs.distMethodsSearchTypesRequestMod.Language.Zulu & String = js.native
  }
  
  @JSImport("unsplash-js", "OrderBy")
  @js.native
  object OrderBy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy & String] = js.native
    
    /* "downloads" */ val DOWNLOADS: typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy.DOWNLOADS & String = js.native
    
    /* "latest" */ val LATEST: typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy.LATEST & String = js.native
    
    /* "oldest" */ val OLDEST: typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy.OLDEST & String = js.native
    
    /* "popular" */ val POPULAR: typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy.POPULAR & String = js.native
    
    /* "views" */ val VIEWS: typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy.VIEWS & String = js.native
  }
  
  inline def createApi(args: InitParams): Photos = ^.asInstanceOf[js.Dynamic].applyDynamic("createApi")(args.asInstanceOf[js.Any]).asInstanceOf[Photos]
  
  object internals {
    
    @JSImport("unsplash-js", "_internals")
    @js.native
    val ^ : js.Any = js.native
    
    object collections {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.collections.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Any] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
        inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.collections.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(
          a: CollectionId & PaginationParams & OrientationParam,
          additionalFetchOptions: AdditionalFetchOptions
        ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Results] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
        inline def handleResponse_=(x: HandleResponse[Results]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getRelated {
        
        @JSImport("unsplash-js", "_internals.collections.getRelated")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: CollectionId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: CollectionId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: CollectionId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.getRelated.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Any] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
        inline def handleResponse_=(x: HandleResponse[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.collections.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PickPaginationParamspagep): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PickPaginationParamspagep, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.collections.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Results] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Results] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Results]]
        inline def handleResponse_=(x: HandleResponse[Results]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object photos {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.photos.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Full]]
        inline def handleResponse_=(x: HandleResponse[Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getRandom {
        
        @JSImport("unsplash-js", "_internals.photos.getRandom")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: RandomParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: RandomParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.getRandom.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Random | js.Array[Random]] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Random | js.Array[Random]] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Random | js.Array[Random]]]
        inline def handleResponse_=(x: HandleResponse[Random | js.Array[Random]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getStats {
        
        @JSImport("unsplash-js", "_internals.photos.getStats")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: PhotoId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: PhotoId): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PhotoId, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.getStats.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Stats] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
        inline def handleResponse_=(x: HandleResponse[Stats]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.photos.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")().asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Unit, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object trackDownload {
        
        @JSImport("unsplash-js", "_internals.photos.trackDownload")
        @js.native
        val ^ : js.Any = js.native
        
        inline def handleRequest(a: DownloadLocation_): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: DownloadLocation_, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.photos.trackDownload.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Url] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Url] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Url]]
        inline def handleResponse_=(x: HandleResponse[Url]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object search {
      
      object getCollections {
        
        @JSImport("unsplash-js", "_internals.search.getCollections")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getCollections.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Collections] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Collections] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Collections]]
        inline def handleResponse_=(x: HandleResponse[Collections]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.search.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchPhotosParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchPhotosParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Photos] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Photos] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Photos]]
        inline def handleResponse_=(x: HandleResponse[typingsJapgolly.unsplashJs.distMethodsSearchTypesResponseMod.Photos]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getUsers {
        
        @JSImport("unsplash-js", "_internals.search.getUsers")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")().asInstanceOf[String]
        inline def getPathname(params: Unit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: SearchParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: SearchParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.search.getUsers.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Users] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Users] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Users]]
        inline def handleResponse_=(x: HandleResponse[Users]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    object topics {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.topics.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: TopicIdOrSlug): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: TopicIdOrSlug, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]]
        inline def handleResponse_=(x: HandleResponse[typingsJapgolly.unsplashJs.distMethodsTopicsTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.topics.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: TopicIdOrSlug & PaginationParams & OrientationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(
          a: TopicIdOrSlug & PaginationParams & OrientationParam,
          additionalFetchOptions: AdditionalFetchOptions
        ): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object list {
        
        @JSImport("unsplash-js", "_internals.topics.list")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: TopicIdOrSlug): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: OmitStrictPaginationParam): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: OmitStrictPaginationParam, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.topics.list.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsTotal] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsTotal] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsTotal]]
        inline def handleResponse_=(x: HandleResponse[ResultsTotal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
    
    inline def trackNonHotLinkedPhotoView(hasAppId: AppId): js.Function1[/* hasPhotoId */ typingsJapgolly.unsplashJs.anon.PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(hasAppId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasPhotoId */ typingsJapgolly.unsplashJs.anon.PhotoId, js.Promise[Response]]]
    
    object users {
      
      object get {
        
        @JSImport("unsplash-js", "_internals.users.get")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: Username): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Username, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.get.handleResponse")
        @js.native
        def handleResponse: HandleResponse[typingsJapgolly.unsplashJs.distMethodsUsersTypesMod.Full] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[typingsJapgolly.unsplashJs.distMethodsUsersTypesMod.Full] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.unsplashJs.distMethodsUsersTypesMod.Full]]
        inline def handleResponse_=(x: HandleResponse[typingsJapgolly.unsplashJs.distMethodsUsersTypesMod.Full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getCollections {
        
        @JSImport("unsplash-js", "_internals.users.getCollections")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getCollections.handleResponse")
        @js.native
        def handleResponse: HandleResponse[ResultsArray] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[ResultsArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsArray]]
        inline def handleResponse_=(x: HandleResponse[ResultsArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getLikes {
        
        @JSImport("unsplash-js", "_internals.users.getLikes")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: OrientationParam & Username & PaginationParams): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: OrientationParam & Username & PaginationParams, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getLikes.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
      
      object getPhotos {
        
        @JSImport("unsplash-js", "_internals.users.getPhotos")
        @js.native
        val ^ : js.Any = js.native
        
        inline def getPathname(params: Username): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathname")(params.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def handleRequest(a: statsbooleanundefinedOrie): CompleteRequestParams = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any]).asInstanceOf[CompleteRequestParams]
        inline def handleRequest(a: statsbooleanundefinedOrie, additionalFetchOptions: AdditionalFetchOptions): CompleteRequestParams = (^.asInstanceOf[js.Dynamic].applyDynamic("handleRequest")(a.asInstanceOf[js.Any], additionalFetchOptions.asInstanceOf[js.Any])).asInstanceOf[CompleteRequestParams]
        
        @JSImport("unsplash-js", "_internals.users.getPhotos.handleResponse")
        @js.native
        def handleResponse: HandleResponse[Total] = js.native
        inline def handleResponse(args: ResponseResponse): js.Promise[Total] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleResponse")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Total]]
        inline def handleResponse_=(x: HandleResponse[Total]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handleResponse")(x.asInstanceOf[js.Any])
      }
    }
  }
}
