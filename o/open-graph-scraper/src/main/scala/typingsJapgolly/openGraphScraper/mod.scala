package typingsJapgolly.openGraphScraper

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.streamMod.PassThrough
import typingsJapgolly.openGraphScraper.anon.Error
import typingsJapgolly.openGraphScraper.anon.OpenGraphPropertiesogImag
import typingsJapgolly.openGraphScraper.openGraphScraperBooleans.`false`
import typingsJapgolly.openGraphScraper.openGraphScraperBooleans.`true`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Options): js.Promise[SuccessResult | ErrorResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SuccessResult | ErrorResult]]
  inline def apply(
    options: Options,
    callback: js.Function3[
      /* error */ Boolean, 
      /* results */ SuccessResult | ErrorResult, 
      /* response */ PassThrough, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("open-graph-scraper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CustomMetaTag extends StObject {
    
    var fieldName: String
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var property: String
  }
  object CustomMetaTag {
    
    inline def apply(fieldName: String, property: String): CustomMetaTag = {
      val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomMetaTag]
    }
    
    extension [Self <: CustomMetaTag](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorResult extends StObject {
    
    var error: `true`
    
    var result: Error
  }
  object ErrorResult {
    
    inline def apply(result: Error): ErrorResult = {
      val __obj = js.Dynamic.literal(error = true, result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResult]
    }
    
    extension [Self <: ErrorResult](x: Self) {
      
      inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenGraphImage extends StObject {
    
    var height: String
    
    var `type`: String
    
    var url: String
    
    var width: String
  }
  object OpenGraphImage {
    
    inline def apply(height: String, `type`: String, url: String, width: String): OpenGraphImage = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenGraphImage]
    }
    
    extension [Self <: OpenGraphImage](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenGraphProperties
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[String]] {
    
    var alAndroidAppName: js.UndefOr[String] = js.undefined
    
    var alAndroidClass: js.UndefOr[String] = js.undefined
    
    var alAndroidPackage: js.UndefOr[String] = js.undefined
    
    var alAndroidUrl: js.UndefOr[String] = js.undefined
    
    var alIosAppName: js.UndefOr[String] = js.undefined
    
    var alIosAppStoreId: js.UndefOr[String] = js.undefined
    
    var alIosUrl: js.UndefOr[String] = js.undefined
    
    var alIpadAppName: js.UndefOr[String] = js.undefined
    
    var alIpadAppStoreId: js.UndefOr[String] = js.undefined
    
    var alIpadUrl: js.UndefOr[String] = js.undefined
    
    var alIphoneAppName: js.UndefOr[String] = js.undefined
    
    var alIphoneAppStoreId: js.UndefOr[String] = js.undefined
    
    var alIphoneUrl: js.UndefOr[String] = js.undefined
    
    var alWebShouldFallback: js.UndefOr[String] = js.undefined
    
    var alWebUrl: js.UndefOr[String] = js.undefined
    
    var alWindowsAppId: js.UndefOr[String] = js.undefined
    
    var alWindowsAppName: js.UndefOr[String] = js.undefined
    
    var alWindowsPhoneAppId: js.UndefOr[String] = js.undefined
    
    var alWindowsPhoneAppName: js.UndefOr[String] = js.undefined
    
    var alWindowsPhoneUrl: js.UndefOr[String] = js.undefined
    
    var alWindowsUniversalAppId: js.UndefOr[String] = js.undefined
    
    var alWindowsUniversalAppName: js.UndefOr[String] = js.undefined
    
    var alWindowsUniversalUrl: js.UndefOr[String] = js.undefined
    
    var alWindowsUrl: js.UndefOr[String] = js.undefined
    
    var articleAuthor: js.UndefOr[String] = js.undefined
    
    var articleExpirationTime: js.UndefOr[String] = js.undefined
    
    var articleModifiedTime: js.UndefOr[String] = js.undefined
    
    var articlePublishedTime: js.UndefOr[String] = js.undefined
    
    var articlePublisher: js.UndefOr[String] = js.undefined
    
    var articleSection: js.UndefOr[String] = js.undefined
    
    var articleTag: js.UndefOr[String] = js.undefined
    
    var author: js.UndefOr[String] = js.undefined
    
    var bookAuthor: js.UndefOr[String] = js.undefined
    
    var bookCanonicalName: js.UndefOr[String] = js.undefined
    
    var bookIsbn: js.UndefOr[String] = js.undefined
    
    var bookReleaseDate: js.UndefOr[String] = js.undefined
    
    var bookTag: js.UndefOr[String] = js.undefined
    
    var booksBook: js.UndefOr[String] = js.undefined
    
    var booksRatingScale: js.UndefOr[String] = js.undefined
    
    var booksRatingValue: js.UndefOr[String] = js.undefined
    
    var businessContactDataCountryName: js.UndefOr[String] = js.undefined
    
    var businessContactDataLocality: js.UndefOr[String] = js.undefined
    
    var businessContactDataPostalCode: js.UndefOr[String] = js.undefined
    
    var businessContactDataRegion: js.UndefOr[String] = js.undefined
    
    var businessContactDataStreetAddress: js.UndefOr[String] = js.undefined
    
    var dcContributor: js.UndefOr[String] = js.undefined
    
    var dcCoverage: js.UndefOr[String] = js.undefined
    
    var dcCreator: js.UndefOr[String] = js.undefined
    
    var dcDate: js.UndefOr[String] = js.undefined
    
    var dcDateCreated: js.UndefOr[String] = js.undefined
    
    var dcDateIssued: js.UndefOr[String] = js.undefined
    
    var dcDescription: js.UndefOr[String] = js.undefined
    
    var dcFormatMedia: js.UndefOr[String] = js.undefined
    
    var dcFormatSize: js.UndefOr[String] = js.undefined
    
    var dcIdentifier: js.UndefOr[String] = js.undefined
    
    var dcLanguage: js.UndefOr[String] = js.undefined
    
    var dcPublisher: js.UndefOr[String] = js.undefined
    
    var dcRelation: js.UndefOr[String] = js.undefined
    
    var dcRights: js.UndefOr[String] = js.undefined
    
    var dcSource: js.UndefOr[String] = js.undefined
    
    var dcSubject: js.UndefOr[String] = js.undefined
    
    var dcTitle: js.UndefOr[String] = js.undefined
    
    var dcType: js.UndefOr[String] = js.undefined
    
    var modifiedTime: js.UndefOr[String] = js.undefined
    
    var musicAlbum: js.UndefOr[String] = js.undefined
    
    var musicAlbumDisc: js.UndefOr[String] = js.undefined
    
    var musicAlbumTrack: js.UndefOr[String] = js.undefined
    
    var musicAlbumUrl: js.UndefOr[String] = js.undefined
    
    var musicCreator: js.UndefOr[String] = js.undefined
    
    var musicDuration: js.UndefOr[String] = js.undefined
    
    var musicMusician: js.UndefOr[String] = js.undefined
    
    var musicReleaseDate: js.UndefOr[String] = js.undefined
    
    var musicSong: js.UndefOr[String] = js.undefined
    
    var musicSongDisc: js.UndefOr[String] = js.undefined
    
    var musicSongTrack: js.UndefOr[String] = js.undefined
    
    var musicSongUrl: js.UndefOr[String] = js.undefined
    
    var ogArticleAuthor: js.UndefOr[String] = js.undefined
    
    var ogArticleExpirationTime: js.UndefOr[String] = js.undefined
    
    var ogArticleModifiedTime: js.UndefOr[String] = js.undefined
    
    var ogArticlePublishedTime: js.UndefOr[String] = js.undefined
    
    var ogArticlePublisher: js.UndefOr[String] = js.undefined
    
    var ogArticleSection: js.UndefOr[String] = js.undefined
    
    var ogArticleTag: js.UndefOr[String] = js.undefined
    
    var ogAudio: js.UndefOr[String] = js.undefined
    
    var ogAudioSecureURL: js.UndefOr[String] = js.undefined
    
    var ogAudioType: js.UndefOr[String] = js.undefined
    
    var ogAudioURL: js.UndefOr[String] = js.undefined
    
    var ogAvailability: js.UndefOr[String] = js.undefined
    
    var ogDate: js.UndefOr[String] = js.undefined
    
    var ogDescription: js.UndefOr[String] = js.undefined
    
    var ogDeterminer: js.UndefOr[String] = js.undefined
    
    var ogImage: js.UndefOr[String] = js.undefined
    
    var ogImageHeight: js.UndefOr[String] = js.undefined
    
    var ogImageSecureURL: js.UndefOr[String] = js.undefined
    
    var ogImageType: js.UndefOr[String] = js.undefined
    
    var ogImageURL: js.UndefOr[String] = js.undefined
    
    var ogImageWidth: js.UndefOr[String] = js.undefined
    
    var ogLocale: js.UndefOr[String] = js.undefined
    
    var ogLocaleAlternate: js.UndefOr[String] = js.undefined
    
    var ogLogo: js.UndefOr[String] = js.undefined
    
    var ogPriceAmount: js.UndefOr[String] = js.undefined
    
    var ogPriceCurrency: js.UndefOr[String] = js.undefined
    
    var ogProductAvailability: js.UndefOr[String] = js.undefined
    
    var ogProductCondition: js.UndefOr[String] = js.undefined
    
    var ogProductPriceAmount: js.UndefOr[String] = js.undefined
    
    var ogProductPriceCurrency: js.UndefOr[String] = js.undefined
    
    var ogProductRetailerItemId: js.UndefOr[String] = js.undefined
    
    var ogSiteName: js.UndefOr[String] = js.undefined
    
    var ogTitle: js.UndefOr[String] = js.undefined
    
    var ogType: js.UndefOr[String] = js.undefined
    
    var ogUrl: js.UndefOr[String] = js.undefined
    
    var ogVideo: js.UndefOr[String] = js.undefined
    
    var ogVideoActorId: js.UndefOr[String] = js.undefined
    
    var ogVideoHeight: js.UndefOr[String] = js.undefined
    
    var ogVideoSecureURL: js.UndefOr[String] = js.undefined
    
    var ogVideoType: js.UndefOr[String] = js.undefined
    
    var ogVideoWidth: js.UndefOr[String] = js.undefined
    
    var placeLocationLatitude: js.UndefOr[String] = js.undefined
    
    var placeLocationLongitude: js.UndefOr[String] = js.undefined
    
    var profileFirstName: js.UndefOr[String] = js.undefined
    
    var profileGender: js.UndefOr[String] = js.undefined
    
    var profileLastName: js.UndefOr[String] = js.undefined
    
    var profileUsername: js.UndefOr[String] = js.undefined
    
    var publishedTime: js.UndefOr[String] = js.undefined
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoCountryName: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoEmail: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoLocality: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoPhoneNumber: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoPostalCode: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoRegion: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoStreetAddress: js.UndefOr[String] = js.undefined
    
    var restaurantContactInfoWebsite: js.UndefOr[String] = js.undefined
    
    var restaurantMenu: js.UndefOr[String] = js.undefined
    
    var restaurantRestaurant: js.UndefOr[String] = js.undefined
    
    var restaurantSection: js.UndefOr[String] = js.undefined
    
    var restaurantVariationPriceAmount: js.UndefOr[String] = js.undefined
    
    var restaurantVariationPriceCurrency: js.UndefOr[String] = js.undefined
    
    var twitterAppIdGooglePlay: js.UndefOr[String] = js.undefined
    
    var twitterAppIdiPad: js.UndefOr[String] = js.undefined
    
    var twitterAppIdiPhone: js.UndefOr[String] = js.undefined
    
    var twitterAppNameGooglePlay: js.UndefOr[String] = js.undefined
    
    var twitterAppNameiPad: js.UndefOr[String] = js.undefined
    
    var twitterAppNameiPhone: js.UndefOr[String] = js.undefined
    
    var twitterAppUrlGooglePlay: js.UndefOr[String] = js.undefined
    
    var twitterAppUrliPad: js.UndefOr[String] = js.undefined
    
    var twitterAppUrliPhone: js.UndefOr[String] = js.undefined
    
    var twitterCard: js.UndefOr[String] = js.undefined
    
    var twitterCreator: js.UndefOr[String] = js.undefined
    
    var twitterCreatorId: js.UndefOr[String] = js.undefined
    
    var twitterDescription: js.UndefOr[String] = js.undefined
    
    var twitterImage: js.UndefOr[String] = js.undefined
    
    var twitterImageAlt: js.UndefOr[String] = js.undefined
    
    var twitterImageHeight: js.UndefOr[String] = js.undefined
    
    var twitterImageSrc: js.UndefOr[String] = js.undefined
    
    var twitterImageWidth: js.UndefOr[String] = js.undefined
    
    var twitterPlayer: js.UndefOr[String] = js.undefined
    
    var twitterPlayerHeight: js.UndefOr[String] = js.undefined
    
    var twitterPlayerStream: js.UndefOr[String] = js.undefined
    
    var twitterPlayerStreamContentType: js.UndefOr[String] = js.undefined
    
    var twitterPlayerWidth: js.UndefOr[String] = js.undefined
    
    var twitterSite: js.UndefOr[String] = js.undefined
    
    var twitterSiteId: js.UndefOr[String] = js.undefined
    
    var twitterTitle: js.UndefOr[String] = js.undefined
    
    var twitterUrl: js.UndefOr[String] = js.undefined
    
    var updatedTime: js.UndefOr[String] = js.undefined
  }
  object OpenGraphProperties {
    
    inline def apply(): OpenGraphProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenGraphProperties]
    }
    
    extension [Self <: OpenGraphProperties](x: Self) {
      
      inline def setAlAndroidAppName(value: String): Self = StObject.set(x, "alAndroidAppName", value.asInstanceOf[js.Any])
      
      inline def setAlAndroidAppNameUndefined: Self = StObject.set(x, "alAndroidAppName", js.undefined)
      
      inline def setAlAndroidClass(value: String): Self = StObject.set(x, "alAndroidClass", value.asInstanceOf[js.Any])
      
      inline def setAlAndroidClassUndefined: Self = StObject.set(x, "alAndroidClass", js.undefined)
      
      inline def setAlAndroidPackage(value: String): Self = StObject.set(x, "alAndroidPackage", value.asInstanceOf[js.Any])
      
      inline def setAlAndroidPackageUndefined: Self = StObject.set(x, "alAndroidPackage", js.undefined)
      
      inline def setAlAndroidUrl(value: String): Self = StObject.set(x, "alAndroidUrl", value.asInstanceOf[js.Any])
      
      inline def setAlAndroidUrlUndefined: Self = StObject.set(x, "alAndroidUrl", js.undefined)
      
      inline def setAlIosAppName(value: String): Self = StObject.set(x, "alIosAppName", value.asInstanceOf[js.Any])
      
      inline def setAlIosAppNameUndefined: Self = StObject.set(x, "alIosAppName", js.undefined)
      
      inline def setAlIosAppStoreId(value: String): Self = StObject.set(x, "alIosAppStoreId", value.asInstanceOf[js.Any])
      
      inline def setAlIosAppStoreIdUndefined: Self = StObject.set(x, "alIosAppStoreId", js.undefined)
      
      inline def setAlIosUrl(value: String): Self = StObject.set(x, "alIosUrl", value.asInstanceOf[js.Any])
      
      inline def setAlIosUrlUndefined: Self = StObject.set(x, "alIosUrl", js.undefined)
      
      inline def setAlIpadAppName(value: String): Self = StObject.set(x, "alIpadAppName", value.asInstanceOf[js.Any])
      
      inline def setAlIpadAppNameUndefined: Self = StObject.set(x, "alIpadAppName", js.undefined)
      
      inline def setAlIpadAppStoreId(value: String): Self = StObject.set(x, "alIpadAppStoreId", value.asInstanceOf[js.Any])
      
      inline def setAlIpadAppStoreIdUndefined: Self = StObject.set(x, "alIpadAppStoreId", js.undefined)
      
      inline def setAlIpadUrl(value: String): Self = StObject.set(x, "alIpadUrl", value.asInstanceOf[js.Any])
      
      inline def setAlIpadUrlUndefined: Self = StObject.set(x, "alIpadUrl", js.undefined)
      
      inline def setAlIphoneAppName(value: String): Self = StObject.set(x, "alIphoneAppName", value.asInstanceOf[js.Any])
      
      inline def setAlIphoneAppNameUndefined: Self = StObject.set(x, "alIphoneAppName", js.undefined)
      
      inline def setAlIphoneAppStoreId(value: String): Self = StObject.set(x, "alIphoneAppStoreId", value.asInstanceOf[js.Any])
      
      inline def setAlIphoneAppStoreIdUndefined: Self = StObject.set(x, "alIphoneAppStoreId", js.undefined)
      
      inline def setAlIphoneUrl(value: String): Self = StObject.set(x, "alIphoneUrl", value.asInstanceOf[js.Any])
      
      inline def setAlIphoneUrlUndefined: Self = StObject.set(x, "alIphoneUrl", js.undefined)
      
      inline def setAlWebShouldFallback(value: String): Self = StObject.set(x, "alWebShouldFallback", value.asInstanceOf[js.Any])
      
      inline def setAlWebShouldFallbackUndefined: Self = StObject.set(x, "alWebShouldFallback", js.undefined)
      
      inline def setAlWebUrl(value: String): Self = StObject.set(x, "alWebUrl", value.asInstanceOf[js.Any])
      
      inline def setAlWebUrlUndefined: Self = StObject.set(x, "alWebUrl", js.undefined)
      
      inline def setAlWindowsAppId(value: String): Self = StObject.set(x, "alWindowsAppId", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsAppIdUndefined: Self = StObject.set(x, "alWindowsAppId", js.undefined)
      
      inline def setAlWindowsAppName(value: String): Self = StObject.set(x, "alWindowsAppName", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsAppNameUndefined: Self = StObject.set(x, "alWindowsAppName", js.undefined)
      
      inline def setAlWindowsPhoneAppId(value: String): Self = StObject.set(x, "alWindowsPhoneAppId", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsPhoneAppIdUndefined: Self = StObject.set(x, "alWindowsPhoneAppId", js.undefined)
      
      inline def setAlWindowsPhoneAppName(value: String): Self = StObject.set(x, "alWindowsPhoneAppName", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsPhoneAppNameUndefined: Self = StObject.set(x, "alWindowsPhoneAppName", js.undefined)
      
      inline def setAlWindowsPhoneUrl(value: String): Self = StObject.set(x, "alWindowsPhoneUrl", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsPhoneUrlUndefined: Self = StObject.set(x, "alWindowsPhoneUrl", js.undefined)
      
      inline def setAlWindowsUniversalAppId(value: String): Self = StObject.set(x, "alWindowsUniversalAppId", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsUniversalAppIdUndefined: Self = StObject.set(x, "alWindowsUniversalAppId", js.undefined)
      
      inline def setAlWindowsUniversalAppName(value: String): Self = StObject.set(x, "alWindowsUniversalAppName", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsUniversalAppNameUndefined: Self = StObject.set(x, "alWindowsUniversalAppName", js.undefined)
      
      inline def setAlWindowsUniversalUrl(value: String): Self = StObject.set(x, "alWindowsUniversalUrl", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsUniversalUrlUndefined: Self = StObject.set(x, "alWindowsUniversalUrl", js.undefined)
      
      inline def setAlWindowsUrl(value: String): Self = StObject.set(x, "alWindowsUrl", value.asInstanceOf[js.Any])
      
      inline def setAlWindowsUrlUndefined: Self = StObject.set(x, "alWindowsUrl", js.undefined)
      
      inline def setArticleAuthor(value: String): Self = StObject.set(x, "articleAuthor", value.asInstanceOf[js.Any])
      
      inline def setArticleAuthorUndefined: Self = StObject.set(x, "articleAuthor", js.undefined)
      
      inline def setArticleExpirationTime(value: String): Self = StObject.set(x, "articleExpirationTime", value.asInstanceOf[js.Any])
      
      inline def setArticleExpirationTimeUndefined: Self = StObject.set(x, "articleExpirationTime", js.undefined)
      
      inline def setArticleModifiedTime(value: String): Self = StObject.set(x, "articleModifiedTime", value.asInstanceOf[js.Any])
      
      inline def setArticleModifiedTimeUndefined: Self = StObject.set(x, "articleModifiedTime", js.undefined)
      
      inline def setArticlePublishedTime(value: String): Self = StObject.set(x, "articlePublishedTime", value.asInstanceOf[js.Any])
      
      inline def setArticlePublishedTimeUndefined: Self = StObject.set(x, "articlePublishedTime", js.undefined)
      
      inline def setArticlePublisher(value: String): Self = StObject.set(x, "articlePublisher", value.asInstanceOf[js.Any])
      
      inline def setArticlePublisherUndefined: Self = StObject.set(x, "articlePublisher", js.undefined)
      
      inline def setArticleSection(value: String): Self = StObject.set(x, "articleSection", value.asInstanceOf[js.Any])
      
      inline def setArticleSectionUndefined: Self = StObject.set(x, "articleSection", js.undefined)
      
      inline def setArticleTag(value: String): Self = StObject.set(x, "articleTag", value.asInstanceOf[js.Any])
      
      inline def setArticleTagUndefined: Self = StObject.set(x, "articleTag", js.undefined)
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBookAuthor(value: String): Self = StObject.set(x, "bookAuthor", value.asInstanceOf[js.Any])
      
      inline def setBookAuthorUndefined: Self = StObject.set(x, "bookAuthor", js.undefined)
      
      inline def setBookCanonicalName(value: String): Self = StObject.set(x, "bookCanonicalName", value.asInstanceOf[js.Any])
      
      inline def setBookCanonicalNameUndefined: Self = StObject.set(x, "bookCanonicalName", js.undefined)
      
      inline def setBookIsbn(value: String): Self = StObject.set(x, "bookIsbn", value.asInstanceOf[js.Any])
      
      inline def setBookIsbnUndefined: Self = StObject.set(x, "bookIsbn", js.undefined)
      
      inline def setBookReleaseDate(value: String): Self = StObject.set(x, "bookReleaseDate", value.asInstanceOf[js.Any])
      
      inline def setBookReleaseDateUndefined: Self = StObject.set(x, "bookReleaseDate", js.undefined)
      
      inline def setBookTag(value: String): Self = StObject.set(x, "bookTag", value.asInstanceOf[js.Any])
      
      inline def setBookTagUndefined: Self = StObject.set(x, "bookTag", js.undefined)
      
      inline def setBooksBook(value: String): Self = StObject.set(x, "booksBook", value.asInstanceOf[js.Any])
      
      inline def setBooksBookUndefined: Self = StObject.set(x, "booksBook", js.undefined)
      
      inline def setBooksRatingScale(value: String): Self = StObject.set(x, "booksRatingScale", value.asInstanceOf[js.Any])
      
      inline def setBooksRatingScaleUndefined: Self = StObject.set(x, "booksRatingScale", js.undefined)
      
      inline def setBooksRatingValue(value: String): Self = StObject.set(x, "booksRatingValue", value.asInstanceOf[js.Any])
      
      inline def setBooksRatingValueUndefined: Self = StObject.set(x, "booksRatingValue", js.undefined)
      
      inline def setBusinessContactDataCountryName(value: String): Self = StObject.set(x, "businessContactDataCountryName", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactDataCountryNameUndefined: Self = StObject.set(x, "businessContactDataCountryName", js.undefined)
      
      inline def setBusinessContactDataLocality(value: String): Self = StObject.set(x, "businessContactDataLocality", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactDataLocalityUndefined: Self = StObject.set(x, "businessContactDataLocality", js.undefined)
      
      inline def setBusinessContactDataPostalCode(value: String): Self = StObject.set(x, "businessContactDataPostalCode", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactDataPostalCodeUndefined: Self = StObject.set(x, "businessContactDataPostalCode", js.undefined)
      
      inline def setBusinessContactDataRegion(value: String): Self = StObject.set(x, "businessContactDataRegion", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactDataRegionUndefined: Self = StObject.set(x, "businessContactDataRegion", js.undefined)
      
      inline def setBusinessContactDataStreetAddress(value: String): Self = StObject.set(x, "businessContactDataStreetAddress", value.asInstanceOf[js.Any])
      
      inline def setBusinessContactDataStreetAddressUndefined: Self = StObject.set(x, "businessContactDataStreetAddress", js.undefined)
      
      inline def setDcContributor(value: String): Self = StObject.set(x, "dcContributor", value.asInstanceOf[js.Any])
      
      inline def setDcContributorUndefined: Self = StObject.set(x, "dcContributor", js.undefined)
      
      inline def setDcCoverage(value: String): Self = StObject.set(x, "dcCoverage", value.asInstanceOf[js.Any])
      
      inline def setDcCoverageUndefined: Self = StObject.set(x, "dcCoverage", js.undefined)
      
      inline def setDcCreator(value: String): Self = StObject.set(x, "dcCreator", value.asInstanceOf[js.Any])
      
      inline def setDcCreatorUndefined: Self = StObject.set(x, "dcCreator", js.undefined)
      
      inline def setDcDate(value: String): Self = StObject.set(x, "dcDate", value.asInstanceOf[js.Any])
      
      inline def setDcDateCreated(value: String): Self = StObject.set(x, "dcDateCreated", value.asInstanceOf[js.Any])
      
      inline def setDcDateCreatedUndefined: Self = StObject.set(x, "dcDateCreated", js.undefined)
      
      inline def setDcDateIssued(value: String): Self = StObject.set(x, "dcDateIssued", value.asInstanceOf[js.Any])
      
      inline def setDcDateIssuedUndefined: Self = StObject.set(x, "dcDateIssued", js.undefined)
      
      inline def setDcDateUndefined: Self = StObject.set(x, "dcDate", js.undefined)
      
      inline def setDcDescription(value: String): Self = StObject.set(x, "dcDescription", value.asInstanceOf[js.Any])
      
      inline def setDcDescriptionUndefined: Self = StObject.set(x, "dcDescription", js.undefined)
      
      inline def setDcFormatMedia(value: String): Self = StObject.set(x, "dcFormatMedia", value.asInstanceOf[js.Any])
      
      inline def setDcFormatMediaUndefined: Self = StObject.set(x, "dcFormatMedia", js.undefined)
      
      inline def setDcFormatSize(value: String): Self = StObject.set(x, "dcFormatSize", value.asInstanceOf[js.Any])
      
      inline def setDcFormatSizeUndefined: Self = StObject.set(x, "dcFormatSize", js.undefined)
      
      inline def setDcIdentifier(value: String): Self = StObject.set(x, "dcIdentifier", value.asInstanceOf[js.Any])
      
      inline def setDcIdentifierUndefined: Self = StObject.set(x, "dcIdentifier", js.undefined)
      
      inline def setDcLanguage(value: String): Self = StObject.set(x, "dcLanguage", value.asInstanceOf[js.Any])
      
      inline def setDcLanguageUndefined: Self = StObject.set(x, "dcLanguage", js.undefined)
      
      inline def setDcPublisher(value: String): Self = StObject.set(x, "dcPublisher", value.asInstanceOf[js.Any])
      
      inline def setDcPublisherUndefined: Self = StObject.set(x, "dcPublisher", js.undefined)
      
      inline def setDcRelation(value: String): Self = StObject.set(x, "dcRelation", value.asInstanceOf[js.Any])
      
      inline def setDcRelationUndefined: Self = StObject.set(x, "dcRelation", js.undefined)
      
      inline def setDcRights(value: String): Self = StObject.set(x, "dcRights", value.asInstanceOf[js.Any])
      
      inline def setDcRightsUndefined: Self = StObject.set(x, "dcRights", js.undefined)
      
      inline def setDcSource(value: String): Self = StObject.set(x, "dcSource", value.asInstanceOf[js.Any])
      
      inline def setDcSourceUndefined: Self = StObject.set(x, "dcSource", js.undefined)
      
      inline def setDcSubject(value: String): Self = StObject.set(x, "dcSubject", value.asInstanceOf[js.Any])
      
      inline def setDcSubjectUndefined: Self = StObject.set(x, "dcSubject", js.undefined)
      
      inline def setDcTitle(value: String): Self = StObject.set(x, "dcTitle", value.asInstanceOf[js.Any])
      
      inline def setDcTitleUndefined: Self = StObject.set(x, "dcTitle", js.undefined)
      
      inline def setDcType(value: String): Self = StObject.set(x, "dcType", value.asInstanceOf[js.Any])
      
      inline def setDcTypeUndefined: Self = StObject.set(x, "dcType", js.undefined)
      
      inline def setModifiedTime(value: String): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
      
      inline def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
      
      inline def setMusicAlbum(value: String): Self = StObject.set(x, "musicAlbum", value.asInstanceOf[js.Any])
      
      inline def setMusicAlbumDisc(value: String): Self = StObject.set(x, "musicAlbumDisc", value.asInstanceOf[js.Any])
      
      inline def setMusicAlbumDiscUndefined: Self = StObject.set(x, "musicAlbumDisc", js.undefined)
      
      inline def setMusicAlbumTrack(value: String): Self = StObject.set(x, "musicAlbumTrack", value.asInstanceOf[js.Any])
      
      inline def setMusicAlbumTrackUndefined: Self = StObject.set(x, "musicAlbumTrack", js.undefined)
      
      inline def setMusicAlbumUndefined: Self = StObject.set(x, "musicAlbum", js.undefined)
      
      inline def setMusicAlbumUrl(value: String): Self = StObject.set(x, "musicAlbumUrl", value.asInstanceOf[js.Any])
      
      inline def setMusicAlbumUrlUndefined: Self = StObject.set(x, "musicAlbumUrl", js.undefined)
      
      inline def setMusicCreator(value: String): Self = StObject.set(x, "musicCreator", value.asInstanceOf[js.Any])
      
      inline def setMusicCreatorUndefined: Self = StObject.set(x, "musicCreator", js.undefined)
      
      inline def setMusicDuration(value: String): Self = StObject.set(x, "musicDuration", value.asInstanceOf[js.Any])
      
      inline def setMusicDurationUndefined: Self = StObject.set(x, "musicDuration", js.undefined)
      
      inline def setMusicMusician(value: String): Self = StObject.set(x, "musicMusician", value.asInstanceOf[js.Any])
      
      inline def setMusicMusicianUndefined: Self = StObject.set(x, "musicMusician", js.undefined)
      
      inline def setMusicReleaseDate(value: String): Self = StObject.set(x, "musicReleaseDate", value.asInstanceOf[js.Any])
      
      inline def setMusicReleaseDateUndefined: Self = StObject.set(x, "musicReleaseDate", js.undefined)
      
      inline def setMusicSong(value: String): Self = StObject.set(x, "musicSong", value.asInstanceOf[js.Any])
      
      inline def setMusicSongDisc(value: String): Self = StObject.set(x, "musicSongDisc", value.asInstanceOf[js.Any])
      
      inline def setMusicSongDiscUndefined: Self = StObject.set(x, "musicSongDisc", js.undefined)
      
      inline def setMusicSongTrack(value: String): Self = StObject.set(x, "musicSongTrack", value.asInstanceOf[js.Any])
      
      inline def setMusicSongTrackUndefined: Self = StObject.set(x, "musicSongTrack", js.undefined)
      
      inline def setMusicSongUndefined: Self = StObject.set(x, "musicSong", js.undefined)
      
      inline def setMusicSongUrl(value: String): Self = StObject.set(x, "musicSongUrl", value.asInstanceOf[js.Any])
      
      inline def setMusicSongUrlUndefined: Self = StObject.set(x, "musicSongUrl", js.undefined)
      
      inline def setOgArticleAuthor(value: String): Self = StObject.set(x, "ogArticleAuthor", value.asInstanceOf[js.Any])
      
      inline def setOgArticleAuthorUndefined: Self = StObject.set(x, "ogArticleAuthor", js.undefined)
      
      inline def setOgArticleExpirationTime(value: String): Self = StObject.set(x, "ogArticleExpirationTime", value.asInstanceOf[js.Any])
      
      inline def setOgArticleExpirationTimeUndefined: Self = StObject.set(x, "ogArticleExpirationTime", js.undefined)
      
      inline def setOgArticleModifiedTime(value: String): Self = StObject.set(x, "ogArticleModifiedTime", value.asInstanceOf[js.Any])
      
      inline def setOgArticleModifiedTimeUndefined: Self = StObject.set(x, "ogArticleModifiedTime", js.undefined)
      
      inline def setOgArticlePublishedTime(value: String): Self = StObject.set(x, "ogArticlePublishedTime", value.asInstanceOf[js.Any])
      
      inline def setOgArticlePublishedTimeUndefined: Self = StObject.set(x, "ogArticlePublishedTime", js.undefined)
      
      inline def setOgArticlePublisher(value: String): Self = StObject.set(x, "ogArticlePublisher", value.asInstanceOf[js.Any])
      
      inline def setOgArticlePublisherUndefined: Self = StObject.set(x, "ogArticlePublisher", js.undefined)
      
      inline def setOgArticleSection(value: String): Self = StObject.set(x, "ogArticleSection", value.asInstanceOf[js.Any])
      
      inline def setOgArticleSectionUndefined: Self = StObject.set(x, "ogArticleSection", js.undefined)
      
      inline def setOgArticleTag(value: String): Self = StObject.set(x, "ogArticleTag", value.asInstanceOf[js.Any])
      
      inline def setOgArticleTagUndefined: Self = StObject.set(x, "ogArticleTag", js.undefined)
      
      inline def setOgAudio(value: String): Self = StObject.set(x, "ogAudio", value.asInstanceOf[js.Any])
      
      inline def setOgAudioSecureURL(value: String): Self = StObject.set(x, "ogAudioSecureURL", value.asInstanceOf[js.Any])
      
      inline def setOgAudioSecureURLUndefined: Self = StObject.set(x, "ogAudioSecureURL", js.undefined)
      
      inline def setOgAudioType(value: String): Self = StObject.set(x, "ogAudioType", value.asInstanceOf[js.Any])
      
      inline def setOgAudioTypeUndefined: Self = StObject.set(x, "ogAudioType", js.undefined)
      
      inline def setOgAudioURL(value: String): Self = StObject.set(x, "ogAudioURL", value.asInstanceOf[js.Any])
      
      inline def setOgAudioURLUndefined: Self = StObject.set(x, "ogAudioURL", js.undefined)
      
      inline def setOgAudioUndefined: Self = StObject.set(x, "ogAudio", js.undefined)
      
      inline def setOgAvailability(value: String): Self = StObject.set(x, "ogAvailability", value.asInstanceOf[js.Any])
      
      inline def setOgAvailabilityUndefined: Self = StObject.set(x, "ogAvailability", js.undefined)
      
      inline def setOgDate(value: String): Self = StObject.set(x, "ogDate", value.asInstanceOf[js.Any])
      
      inline def setOgDateUndefined: Self = StObject.set(x, "ogDate", js.undefined)
      
      inline def setOgDescription(value: String): Self = StObject.set(x, "ogDescription", value.asInstanceOf[js.Any])
      
      inline def setOgDescriptionUndefined: Self = StObject.set(x, "ogDescription", js.undefined)
      
      inline def setOgDeterminer(value: String): Self = StObject.set(x, "ogDeterminer", value.asInstanceOf[js.Any])
      
      inline def setOgDeterminerUndefined: Self = StObject.set(x, "ogDeterminer", js.undefined)
      
      inline def setOgImage(value: String): Self = StObject.set(x, "ogImage", value.asInstanceOf[js.Any])
      
      inline def setOgImageHeight(value: String): Self = StObject.set(x, "ogImageHeight", value.asInstanceOf[js.Any])
      
      inline def setOgImageHeightUndefined: Self = StObject.set(x, "ogImageHeight", js.undefined)
      
      inline def setOgImageSecureURL(value: String): Self = StObject.set(x, "ogImageSecureURL", value.asInstanceOf[js.Any])
      
      inline def setOgImageSecureURLUndefined: Self = StObject.set(x, "ogImageSecureURL", js.undefined)
      
      inline def setOgImageType(value: String): Self = StObject.set(x, "ogImageType", value.asInstanceOf[js.Any])
      
      inline def setOgImageTypeUndefined: Self = StObject.set(x, "ogImageType", js.undefined)
      
      inline def setOgImageURL(value: String): Self = StObject.set(x, "ogImageURL", value.asInstanceOf[js.Any])
      
      inline def setOgImageURLUndefined: Self = StObject.set(x, "ogImageURL", js.undefined)
      
      inline def setOgImageUndefined: Self = StObject.set(x, "ogImage", js.undefined)
      
      inline def setOgImageWidth(value: String): Self = StObject.set(x, "ogImageWidth", value.asInstanceOf[js.Any])
      
      inline def setOgImageWidthUndefined: Self = StObject.set(x, "ogImageWidth", js.undefined)
      
      inline def setOgLocale(value: String): Self = StObject.set(x, "ogLocale", value.asInstanceOf[js.Any])
      
      inline def setOgLocaleAlternate(value: String): Self = StObject.set(x, "ogLocaleAlternate", value.asInstanceOf[js.Any])
      
      inline def setOgLocaleAlternateUndefined: Self = StObject.set(x, "ogLocaleAlternate", js.undefined)
      
      inline def setOgLocaleUndefined: Self = StObject.set(x, "ogLocale", js.undefined)
      
      inline def setOgLogo(value: String): Self = StObject.set(x, "ogLogo", value.asInstanceOf[js.Any])
      
      inline def setOgLogoUndefined: Self = StObject.set(x, "ogLogo", js.undefined)
      
      inline def setOgPriceAmount(value: String): Self = StObject.set(x, "ogPriceAmount", value.asInstanceOf[js.Any])
      
      inline def setOgPriceAmountUndefined: Self = StObject.set(x, "ogPriceAmount", js.undefined)
      
      inline def setOgPriceCurrency(value: String): Self = StObject.set(x, "ogPriceCurrency", value.asInstanceOf[js.Any])
      
      inline def setOgPriceCurrencyUndefined: Self = StObject.set(x, "ogPriceCurrency", js.undefined)
      
      inline def setOgProductAvailability(value: String): Self = StObject.set(x, "ogProductAvailability", value.asInstanceOf[js.Any])
      
      inline def setOgProductAvailabilityUndefined: Self = StObject.set(x, "ogProductAvailability", js.undefined)
      
      inline def setOgProductCondition(value: String): Self = StObject.set(x, "ogProductCondition", value.asInstanceOf[js.Any])
      
      inline def setOgProductConditionUndefined: Self = StObject.set(x, "ogProductCondition", js.undefined)
      
      inline def setOgProductPriceAmount(value: String): Self = StObject.set(x, "ogProductPriceAmount", value.asInstanceOf[js.Any])
      
      inline def setOgProductPriceAmountUndefined: Self = StObject.set(x, "ogProductPriceAmount", js.undefined)
      
      inline def setOgProductPriceCurrency(value: String): Self = StObject.set(x, "ogProductPriceCurrency", value.asInstanceOf[js.Any])
      
      inline def setOgProductPriceCurrencyUndefined: Self = StObject.set(x, "ogProductPriceCurrency", js.undefined)
      
      inline def setOgProductRetailerItemId(value: String): Self = StObject.set(x, "ogProductRetailerItemId", value.asInstanceOf[js.Any])
      
      inline def setOgProductRetailerItemIdUndefined: Self = StObject.set(x, "ogProductRetailerItemId", js.undefined)
      
      inline def setOgSiteName(value: String): Self = StObject.set(x, "ogSiteName", value.asInstanceOf[js.Any])
      
      inline def setOgSiteNameUndefined: Self = StObject.set(x, "ogSiteName", js.undefined)
      
      inline def setOgTitle(value: String): Self = StObject.set(x, "ogTitle", value.asInstanceOf[js.Any])
      
      inline def setOgTitleUndefined: Self = StObject.set(x, "ogTitle", js.undefined)
      
      inline def setOgType(value: String): Self = StObject.set(x, "ogType", value.asInstanceOf[js.Any])
      
      inline def setOgTypeUndefined: Self = StObject.set(x, "ogType", js.undefined)
      
      inline def setOgUrl(value: String): Self = StObject.set(x, "ogUrl", value.asInstanceOf[js.Any])
      
      inline def setOgUrlUndefined: Self = StObject.set(x, "ogUrl", js.undefined)
      
      inline def setOgVideo(value: String): Self = StObject.set(x, "ogVideo", value.asInstanceOf[js.Any])
      
      inline def setOgVideoActorId(value: String): Self = StObject.set(x, "ogVideoActorId", value.asInstanceOf[js.Any])
      
      inline def setOgVideoActorIdUndefined: Self = StObject.set(x, "ogVideoActorId", js.undefined)
      
      inline def setOgVideoHeight(value: String): Self = StObject.set(x, "ogVideoHeight", value.asInstanceOf[js.Any])
      
      inline def setOgVideoHeightUndefined: Self = StObject.set(x, "ogVideoHeight", js.undefined)
      
      inline def setOgVideoSecureURL(value: String): Self = StObject.set(x, "ogVideoSecureURL", value.asInstanceOf[js.Any])
      
      inline def setOgVideoSecureURLUndefined: Self = StObject.set(x, "ogVideoSecureURL", js.undefined)
      
      inline def setOgVideoType(value: String): Self = StObject.set(x, "ogVideoType", value.asInstanceOf[js.Any])
      
      inline def setOgVideoTypeUndefined: Self = StObject.set(x, "ogVideoType", js.undefined)
      
      inline def setOgVideoUndefined: Self = StObject.set(x, "ogVideo", js.undefined)
      
      inline def setOgVideoWidth(value: String): Self = StObject.set(x, "ogVideoWidth", value.asInstanceOf[js.Any])
      
      inline def setOgVideoWidthUndefined: Self = StObject.set(x, "ogVideoWidth", js.undefined)
      
      inline def setPlaceLocationLatitude(value: String): Self = StObject.set(x, "placeLocationLatitude", value.asInstanceOf[js.Any])
      
      inline def setPlaceLocationLatitudeUndefined: Self = StObject.set(x, "placeLocationLatitude", js.undefined)
      
      inline def setPlaceLocationLongitude(value: String): Self = StObject.set(x, "placeLocationLongitude", value.asInstanceOf[js.Any])
      
      inline def setPlaceLocationLongitudeUndefined: Self = StObject.set(x, "placeLocationLongitude", js.undefined)
      
      inline def setProfileFirstName(value: String): Self = StObject.set(x, "profileFirstName", value.asInstanceOf[js.Any])
      
      inline def setProfileFirstNameUndefined: Self = StObject.set(x, "profileFirstName", js.undefined)
      
      inline def setProfileGender(value: String): Self = StObject.set(x, "profileGender", value.asInstanceOf[js.Any])
      
      inline def setProfileGenderUndefined: Self = StObject.set(x, "profileGender", js.undefined)
      
      inline def setProfileLastName(value: String): Self = StObject.set(x, "profileLastName", value.asInstanceOf[js.Any])
      
      inline def setProfileLastNameUndefined: Self = StObject.set(x, "profileLastName", js.undefined)
      
      inline def setProfileUsername(value: String): Self = StObject.set(x, "profileUsername", value.asInstanceOf[js.Any])
      
      inline def setProfileUsernameUndefined: Self = StObject.set(x, "profileUsername", js.undefined)
      
      inline def setPublishedTime(value: String): Self = StObject.set(x, "publishedTime", value.asInstanceOf[js.Any])
      
      inline def setPublishedTimeUndefined: Self = StObject.set(x, "publishedTime", js.undefined)
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setRestaurantContactInfoCountryName(value: String): Self = StObject.set(x, "restaurantContactInfoCountryName", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoCountryNameUndefined: Self = StObject.set(x, "restaurantContactInfoCountryName", js.undefined)
      
      inline def setRestaurantContactInfoEmail(value: String): Self = StObject.set(x, "restaurantContactInfoEmail", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoEmailUndefined: Self = StObject.set(x, "restaurantContactInfoEmail", js.undefined)
      
      inline def setRestaurantContactInfoLocality(value: String): Self = StObject.set(x, "restaurantContactInfoLocality", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoLocalityUndefined: Self = StObject.set(x, "restaurantContactInfoLocality", js.undefined)
      
      inline def setRestaurantContactInfoPhoneNumber(value: String): Self = StObject.set(x, "restaurantContactInfoPhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoPhoneNumberUndefined: Self = StObject.set(x, "restaurantContactInfoPhoneNumber", js.undefined)
      
      inline def setRestaurantContactInfoPostalCode(value: String): Self = StObject.set(x, "restaurantContactInfoPostalCode", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoPostalCodeUndefined: Self = StObject.set(x, "restaurantContactInfoPostalCode", js.undefined)
      
      inline def setRestaurantContactInfoRegion(value: String): Self = StObject.set(x, "restaurantContactInfoRegion", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoRegionUndefined: Self = StObject.set(x, "restaurantContactInfoRegion", js.undefined)
      
      inline def setRestaurantContactInfoStreetAddress(value: String): Self = StObject.set(x, "restaurantContactInfoStreetAddress", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoStreetAddressUndefined: Self = StObject.set(x, "restaurantContactInfoStreetAddress", js.undefined)
      
      inline def setRestaurantContactInfoWebsite(value: String): Self = StObject.set(x, "restaurantContactInfoWebsite", value.asInstanceOf[js.Any])
      
      inline def setRestaurantContactInfoWebsiteUndefined: Self = StObject.set(x, "restaurantContactInfoWebsite", js.undefined)
      
      inline def setRestaurantMenu(value: String): Self = StObject.set(x, "restaurantMenu", value.asInstanceOf[js.Any])
      
      inline def setRestaurantMenuUndefined: Self = StObject.set(x, "restaurantMenu", js.undefined)
      
      inline def setRestaurantRestaurant(value: String): Self = StObject.set(x, "restaurantRestaurant", value.asInstanceOf[js.Any])
      
      inline def setRestaurantRestaurantUndefined: Self = StObject.set(x, "restaurantRestaurant", js.undefined)
      
      inline def setRestaurantSection(value: String): Self = StObject.set(x, "restaurantSection", value.asInstanceOf[js.Any])
      
      inline def setRestaurantSectionUndefined: Self = StObject.set(x, "restaurantSection", js.undefined)
      
      inline def setRestaurantVariationPriceAmount(value: String): Self = StObject.set(x, "restaurantVariationPriceAmount", value.asInstanceOf[js.Any])
      
      inline def setRestaurantVariationPriceAmountUndefined: Self = StObject.set(x, "restaurantVariationPriceAmount", js.undefined)
      
      inline def setRestaurantVariationPriceCurrency(value: String): Self = StObject.set(x, "restaurantVariationPriceCurrency", value.asInstanceOf[js.Any])
      
      inline def setRestaurantVariationPriceCurrencyUndefined: Self = StObject.set(x, "restaurantVariationPriceCurrency", js.undefined)
      
      inline def setTwitterAppIdGooglePlay(value: String): Self = StObject.set(x, "twitterAppIdGooglePlay", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppIdGooglePlayUndefined: Self = StObject.set(x, "twitterAppIdGooglePlay", js.undefined)
      
      inline def setTwitterAppIdiPad(value: String): Self = StObject.set(x, "twitterAppIdiPad", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppIdiPadUndefined: Self = StObject.set(x, "twitterAppIdiPad", js.undefined)
      
      inline def setTwitterAppIdiPhone(value: String): Self = StObject.set(x, "twitterAppIdiPhone", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppIdiPhoneUndefined: Self = StObject.set(x, "twitterAppIdiPhone", js.undefined)
      
      inline def setTwitterAppNameGooglePlay(value: String): Self = StObject.set(x, "twitterAppNameGooglePlay", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppNameGooglePlayUndefined: Self = StObject.set(x, "twitterAppNameGooglePlay", js.undefined)
      
      inline def setTwitterAppNameiPad(value: String): Self = StObject.set(x, "twitterAppNameiPad", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppNameiPadUndefined: Self = StObject.set(x, "twitterAppNameiPad", js.undefined)
      
      inline def setTwitterAppNameiPhone(value: String): Self = StObject.set(x, "twitterAppNameiPhone", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppNameiPhoneUndefined: Self = StObject.set(x, "twitterAppNameiPhone", js.undefined)
      
      inline def setTwitterAppUrlGooglePlay(value: String): Self = StObject.set(x, "twitterAppUrlGooglePlay", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppUrlGooglePlayUndefined: Self = StObject.set(x, "twitterAppUrlGooglePlay", js.undefined)
      
      inline def setTwitterAppUrliPad(value: String): Self = StObject.set(x, "twitterAppUrliPad", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppUrliPadUndefined: Self = StObject.set(x, "twitterAppUrliPad", js.undefined)
      
      inline def setTwitterAppUrliPhone(value: String): Self = StObject.set(x, "twitterAppUrliPhone", value.asInstanceOf[js.Any])
      
      inline def setTwitterAppUrliPhoneUndefined: Self = StObject.set(x, "twitterAppUrliPhone", js.undefined)
      
      inline def setTwitterCard(value: String): Self = StObject.set(x, "twitterCard", value.asInstanceOf[js.Any])
      
      inline def setTwitterCardUndefined: Self = StObject.set(x, "twitterCard", js.undefined)
      
      inline def setTwitterCreator(value: String): Self = StObject.set(x, "twitterCreator", value.asInstanceOf[js.Any])
      
      inline def setTwitterCreatorId(value: String): Self = StObject.set(x, "twitterCreatorId", value.asInstanceOf[js.Any])
      
      inline def setTwitterCreatorIdUndefined: Self = StObject.set(x, "twitterCreatorId", js.undefined)
      
      inline def setTwitterCreatorUndefined: Self = StObject.set(x, "twitterCreator", js.undefined)
      
      inline def setTwitterDescription(value: String): Self = StObject.set(x, "twitterDescription", value.asInstanceOf[js.Any])
      
      inline def setTwitterDescriptionUndefined: Self = StObject.set(x, "twitterDescription", js.undefined)
      
      inline def setTwitterImage(value: String): Self = StObject.set(x, "twitterImage", value.asInstanceOf[js.Any])
      
      inline def setTwitterImageAlt(value: String): Self = StObject.set(x, "twitterImageAlt", value.asInstanceOf[js.Any])
      
      inline def setTwitterImageAltUndefined: Self = StObject.set(x, "twitterImageAlt", js.undefined)
      
      inline def setTwitterImageHeight(value: String): Self = StObject.set(x, "twitterImageHeight", value.asInstanceOf[js.Any])
      
      inline def setTwitterImageHeightUndefined: Self = StObject.set(x, "twitterImageHeight", js.undefined)
      
      inline def setTwitterImageSrc(value: String): Self = StObject.set(x, "twitterImageSrc", value.asInstanceOf[js.Any])
      
      inline def setTwitterImageSrcUndefined: Self = StObject.set(x, "twitterImageSrc", js.undefined)
      
      inline def setTwitterImageUndefined: Self = StObject.set(x, "twitterImage", js.undefined)
      
      inline def setTwitterImageWidth(value: String): Self = StObject.set(x, "twitterImageWidth", value.asInstanceOf[js.Any])
      
      inline def setTwitterImageWidthUndefined: Self = StObject.set(x, "twitterImageWidth", js.undefined)
      
      inline def setTwitterPlayer(value: String): Self = StObject.set(x, "twitterPlayer", value.asInstanceOf[js.Any])
      
      inline def setTwitterPlayerHeight(value: String): Self = StObject.set(x, "twitterPlayerHeight", value.asInstanceOf[js.Any])
      
      inline def setTwitterPlayerHeightUndefined: Self = StObject.set(x, "twitterPlayerHeight", js.undefined)
      
      inline def setTwitterPlayerStream(value: String): Self = StObject.set(x, "twitterPlayerStream", value.asInstanceOf[js.Any])
      
      inline def setTwitterPlayerStreamContentType(value: String): Self = StObject.set(x, "twitterPlayerStreamContentType", value.asInstanceOf[js.Any])
      
      inline def setTwitterPlayerStreamContentTypeUndefined: Self = StObject.set(x, "twitterPlayerStreamContentType", js.undefined)
      
      inline def setTwitterPlayerStreamUndefined: Self = StObject.set(x, "twitterPlayerStream", js.undefined)
      
      inline def setTwitterPlayerUndefined: Self = StObject.set(x, "twitterPlayer", js.undefined)
      
      inline def setTwitterPlayerWidth(value: String): Self = StObject.set(x, "twitterPlayerWidth", value.asInstanceOf[js.Any])
      
      inline def setTwitterPlayerWidthUndefined: Self = StObject.set(x, "twitterPlayerWidth", js.undefined)
      
      inline def setTwitterSite(value: String): Self = StObject.set(x, "twitterSite", value.asInstanceOf[js.Any])
      
      inline def setTwitterSiteId(value: String): Self = StObject.set(x, "twitterSiteId", value.asInstanceOf[js.Any])
      
      inline def setTwitterSiteIdUndefined: Self = StObject.set(x, "twitterSiteId", js.undefined)
      
      inline def setTwitterSiteUndefined: Self = StObject.set(x, "twitterSite", js.undefined)
      
      inline def setTwitterTitle(value: String): Self = StObject.set(x, "twitterTitle", value.asInstanceOf[js.Any])
      
      inline def setTwitterTitleUndefined: Self = StObject.set(x, "twitterTitle", js.undefined)
      
      inline def setTwitterUrl(value: String): Self = StObject.set(x, "twitterUrl", value.asInstanceOf[js.Any])
      
      inline def setTwitterUrlUndefined: Self = StObject.set(x, "twitterUrl", js.undefined)
      
      inline def setUpdatedTime(value: String): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
      
      inline def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /** By default, OGS will only send back the first image/video it finds (default: `false`). */
    var allMedia: js.UndefOr[Boolean] = js.undefined
    
    /** Pass in an array of sites you don't want `og`s to run on. */
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Here you can define custom meta tags you want to scrape. */
    var customMetaTags: js.UndefOr[js.Array[CustomMetaTag]] = js.undefined
    
    /** Set the accept-encoding to `gzip/deflate` (default: `true`). */
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting this to `null` might help with running `og`s on non english websites (default: `utf8`).
      * @deprecated
      */
    var encoding: js.UndefOr[String | Null] = js.undefined
    
    /** Defines if redirect responses should be followed automatically (default: `true`). */
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    /** An object containing request headers. Useful for setting the user-agent. */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /** You can pass in an HTML string to run `og`s on it (use without `options.url`). */
    var html: js.UndefOr[String] = js.undefined
    
    /** Max number of redirects `og`s will follow (default: `10`). */
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    /** Fetch other images if no open graph ones are found (default: `true`). */
    var ogImageFallback: js.UndefOr[Boolean] = js.undefined
    
    /** Only fetch open graph info and don't fall back on anything else (default: `false`). */
    var onlyGetOpenGraphInfo: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the peekSize for the request (default: `1024`). */
    var peekSize: js.UndefOr[Double] = js.undefined
    
    /** Number of times `og`s will retry the request (default: `2`). */
    var retry: js.UndefOr[Double] = js.undefined
    
    /** Timeout of the request in ms (default: `2000`). */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /** URL of the site. */
    var url: String
    
    /** Sets the options used by `validator.js` for testing the URL. */
    var urlValidatorSettings: js.UndefOr[URLValidatorSettings] = js.undefined
  }
  object Options {
    
    inline def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllMedia(value: Boolean): Self = StObject.set(x, "allMedia", value.asInstanceOf[js.Any])
      
      inline def setAllMediaUndefined: Self = StObject.set(x, "allMedia", js.undefined)
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
      
      inline def setCustomMetaTags(value: js.Array[CustomMetaTag]): Self = StObject.set(x, "customMetaTags", value.asInstanceOf[js.Any])
      
      inline def setCustomMetaTagsUndefined: Self = StObject.set(x, "customMetaTags", js.undefined)
      
      inline def setCustomMetaTagsVarargs(value: CustomMetaTag*): Self = StObject.set(x, "customMetaTags", js.Array(value*))
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setOgImageFallback(value: Boolean): Self = StObject.set(x, "ogImageFallback", value.asInstanceOf[js.Any])
      
      inline def setOgImageFallbackUndefined: Self = StObject.set(x, "ogImageFallback", js.undefined)
      
      inline def setOnlyGetOpenGraphInfo(value: Boolean): Self = StObject.set(x, "onlyGetOpenGraphInfo", value.asInstanceOf[js.Any])
      
      inline def setOnlyGetOpenGraphInfoUndefined: Self = StObject.set(x, "onlyGetOpenGraphInfo", js.undefined)
      
      inline def setPeekSize(value: Double): Self = StObject.set(x, "peekSize", value.asInstanceOf[js.Any])
      
      inline def setPeekSizeUndefined: Self = StObject.set(x, "peekSize", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlValidatorSettings(value: URLValidatorSettings): Self = StObject.set(x, "urlValidatorSettings", value.asInstanceOf[js.Any])
      
      inline def setUrlValidatorSettingsUndefined: Self = StObject.set(x, "urlValidatorSettings", js.undefined)
    }
  }
  
  trait SuccessResult extends StObject {
    
    var error: `false`
    
    var response: PassThrough
    
    var result: OpenGraphPropertiesogImag
  }
  object SuccessResult {
    
    inline def apply(response: PassThrough, result: OpenGraphPropertiesogImag): SuccessResult = {
      val __obj = js.Dynamic.literal(error = false, response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResult]
    }
    
    extension [Self <: SuccessResult](x: Self) {
      
      inline def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: PassThrough): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResult(value: OpenGraphPropertiesogImag): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLValidatorSettings extends StObject {
    
    /** default is `false`. */
    var allow_protocol_relative_urls: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var allow_underscores: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var disallow_auth: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var host_blacklist: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var host_whitelist: js.UndefOr[Boolean] = js.undefined
    
    /** default is `['http', 'https']`. */
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    /** default is `true`. */
    var require_host: js.UndefOr[Boolean] = js.undefined
    
    /** default is `false`. */
    var require_protocol: js.UndefOr[Boolean] = js.undefined
    
    /** default is `true`. */
    var require_tld: js.UndefOr[Boolean] = js.undefined
    
    /** default is `true`. */
    var require_valid_protocol: js.UndefOr[Boolean] = js.undefined
  }
  object URLValidatorSettings {
    
    inline def apply(): URLValidatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLValidatorSettings]
    }
    
    extension [Self <: URLValidatorSettings](x: Self) {
      
      inline def setAllow_protocol_relative_urls(value: Boolean): Self = StObject.set(x, "allow_protocol_relative_urls", value.asInstanceOf[js.Any])
      
      inline def setAllow_protocol_relative_urlsUndefined: Self = StObject.set(x, "allow_protocol_relative_urls", js.undefined)
      
      inline def setAllow_trailing_dot(value: Boolean): Self = StObject.set(x, "allow_trailing_dot", value.asInstanceOf[js.Any])
      
      inline def setAllow_trailing_dotUndefined: Self = StObject.set(x, "allow_trailing_dot", js.undefined)
      
      inline def setAllow_underscores(value: Boolean): Self = StObject.set(x, "allow_underscores", value.asInstanceOf[js.Any])
      
      inline def setAllow_underscoresUndefined: Self = StObject.set(x, "allow_underscores", js.undefined)
      
      inline def setDisallow_auth(value: Boolean): Self = StObject.set(x, "disallow_auth", value.asInstanceOf[js.Any])
      
      inline def setDisallow_authUndefined: Self = StObject.set(x, "disallow_auth", js.undefined)
      
      inline def setHost_blacklist(value: Boolean): Self = StObject.set(x, "host_blacklist", value.asInstanceOf[js.Any])
      
      inline def setHost_blacklistUndefined: Self = StObject.set(x, "host_blacklist", js.undefined)
      
      inline def setHost_whitelist(value: Boolean): Self = StObject.set(x, "host_whitelist", value.asInstanceOf[js.Any])
      
      inline def setHost_whitelistUndefined: Self = StObject.set(x, "host_whitelist", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setRequire_host(value: Boolean): Self = StObject.set(x, "require_host", value.asInstanceOf[js.Any])
      
      inline def setRequire_hostUndefined: Self = StObject.set(x, "require_host", js.undefined)
      
      inline def setRequire_protocol(value: Boolean): Self = StObject.set(x, "require_protocol", value.asInstanceOf[js.Any])
      
      inline def setRequire_protocolUndefined: Self = StObject.set(x, "require_protocol", js.undefined)
      
      inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
      
      inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
      
      inline def setRequire_valid_protocol(value: Boolean): Self = StObject.set(x, "require_valid_protocol", value.asInstanceOf[js.Any])
      
      inline def setRequire_valid_protocolUndefined: Self = StObject.set(x, "require_valid_protocol", js.undefined)
    }
  }
}
