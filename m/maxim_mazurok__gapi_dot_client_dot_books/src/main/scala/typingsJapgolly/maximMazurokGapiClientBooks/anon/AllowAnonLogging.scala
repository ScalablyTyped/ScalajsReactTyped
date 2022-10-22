package typingsJapgolly.maximMazurokGapiClientBooks.anon

import typingsJapgolly.maximMazurokGapiClientBooks.gapi.client.books.Volumeseriesinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowAnonLogging extends StObject {
  
  /** Whether anonymous logging should be allowed. */
  var allowAnonLogging: js.UndefOr[Boolean] = js.undefined
  
  /** The names of the authors and/or editors for this volume. (In LITE projection) */
  var authors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The mean review rating for this volume. (min = 1.0, max = 5.0) */
  var averageRating: js.UndefOr[Double] = js.undefined
  
  /** Canonical URL for a volume. (In LITE projection.) */
  var canonicalVolumeLink: js.UndefOr[String] = js.undefined
  
  /** A list of subject categories, such as "Fiction", "Suspense", etc. */
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the volume has comics content. */
  var comicsContent: js.UndefOr[Boolean] = js.undefined
  
  /** An identifier for the version of the volume content (text & images). (In LITE projection) */
  var contentVersion: js.UndefOr[String] = js.undefined
  
  /** A synopsis of the volume. The text of the description is formatted in HTML and includes simple formatting elements, such as b, i, and br tags. (In LITE projection.) */
  var description: js.UndefOr[String] = js.undefined
  
  /** Physical dimensions of this volume. */
  var dimensions: js.UndefOr[Height] = js.undefined
  
  /** A list of image links for all the sizes that are available. (In LITE projection.) */
  var imageLinks: js.UndefOr[ExtraLarge] = js.undefined
  
  /** Industry standard identifiers for this volume. */
  var industryIdentifiers: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /** URL to view information about this volume on the Google Books site. (In LITE projection) */
  var infoLink: js.UndefOr[String] = js.undefined
  
  /** Best language for this volume (based on content). It is the two-letter ISO 639-1 code such as 'fr', 'en', etc. */
  var language: js.UndefOr[String] = js.undefined
  
  /** The main category to which this volume belongs. It will be the category from the categories list returned below that has the highest weight. */
  var mainCategory: js.UndefOr[String] = js.undefined
  
  var maturityRating: js.UndefOr[String] = js.undefined
  
  /** Total number of pages as per publisher metadata. */
  var pageCount: js.UndefOr[Double] = js.undefined
  
  /** A top-level summary of the panelization info in this volume. */
  var panelizationSummary: js.UndefOr[ContainsEpubBubbles] = js.undefined
  
  /** URL to preview this volume on the Google Books site. */
  var previewLink: js.UndefOr[String] = js.undefined
  
  /** Type of publication of this volume. Possible values are BOOK or MAGAZINE. */
  var printType: js.UndefOr[String] = js.undefined
  
  /** Total number of printed pages in generated pdf representation. */
  var printedPageCount: js.UndefOr[Double] = js.undefined
  
  /** Date of publication. (In LITE projection.) */
  var publishedDate: js.UndefOr[String] = js.undefined
  
  /** Publisher of this volume. (In LITE projection.) */
  var publisher: js.UndefOr[String] = js.undefined
  
  /** The number of review ratings for this volume. */
  var ratingsCount: js.UndefOr[Double] = js.undefined
  
  /** The reading modes available for this volume. */
  var readingModes: js.UndefOr[Image] = js.undefined
  
  /** Total number of sample pages as per publisher metadata. */
  var samplePageCount: js.UndefOr[Double] = js.undefined
  
  var seriesInfo: js.UndefOr[Volumeseriesinfo] = js.undefined
  
  /** Volume subtitle. (In LITE projection.) */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** Volume title. (In LITE projection.) */
  var title: js.UndefOr[String] = js.undefined
}
object AllowAnonLogging {
  
  inline def apply(): AllowAnonLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAnonLogging]
  }
  
  extension [Self <: AllowAnonLogging](x: Self) {
    
    inline def setAllowAnonLogging(value: Boolean): Self = StObject.set(x, "allowAnonLogging", value.asInstanceOf[js.Any])
    
    inline def setAllowAnonLoggingUndefined: Self = StObject.set(x, "allowAnonLogging", js.undefined)
    
    inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setAverageRating(value: Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    inline def setAverageRatingUndefined: Self = StObject.set(x, "averageRating", js.undefined)
    
    inline def setCanonicalVolumeLink(value: String): Self = StObject.set(x, "canonicalVolumeLink", value.asInstanceOf[js.Any])
    
    inline def setCanonicalVolumeLinkUndefined: Self = StObject.set(x, "canonicalVolumeLink", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setComicsContent(value: Boolean): Self = StObject.set(x, "comicsContent", value.asInstanceOf[js.Any])
    
    inline def setComicsContentUndefined: Self = StObject.set(x, "comicsContent", js.undefined)
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setContentVersionUndefined: Self = StObject.set(x, "contentVersion", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDimensions(value: Height): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setImageLinks(value: ExtraLarge): Self = StObject.set(x, "imageLinks", value.asInstanceOf[js.Any])
    
    inline def setImageLinksUndefined: Self = StObject.set(x, "imageLinks", js.undefined)
    
    inline def setIndustryIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "industryIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setIndustryIdentifiersUndefined: Self = StObject.set(x, "industryIdentifiers", js.undefined)
    
    inline def setIndustryIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "industryIdentifiers", js.Array(value*))
    
    inline def setInfoLink(value: String): Self = StObject.set(x, "infoLink", value.asInstanceOf[js.Any])
    
    inline def setInfoLinkUndefined: Self = StObject.set(x, "infoLink", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMainCategory(value: String): Self = StObject.set(x, "mainCategory", value.asInstanceOf[js.Any])
    
    inline def setMainCategoryUndefined: Self = StObject.set(x, "mainCategory", js.undefined)
    
    inline def setMaturityRating(value: String): Self = StObject.set(x, "maturityRating", value.asInstanceOf[js.Any])
    
    inline def setMaturityRatingUndefined: Self = StObject.set(x, "maturityRating", js.undefined)
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
    
    inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
    
    inline def setPanelizationSummary(value: ContainsEpubBubbles): Self = StObject.set(x, "panelizationSummary", value.asInstanceOf[js.Any])
    
    inline def setPanelizationSummaryUndefined: Self = StObject.set(x, "panelizationSummary", js.undefined)
    
    inline def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
    
    inline def setPreviewLinkUndefined: Self = StObject.set(x, "previewLink", js.undefined)
    
    inline def setPrintType(value: String): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
    
    inline def setPrintTypeUndefined: Self = StObject.set(x, "printType", js.undefined)
    
    inline def setPrintedPageCount(value: Double): Self = StObject.set(x, "printedPageCount", value.asInstanceOf[js.Any])
    
    inline def setPrintedPageCountUndefined: Self = StObject.set(x, "printedPageCount", js.undefined)
    
    inline def setPublishedDate(value: String): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setPublishedDateUndefined: Self = StObject.set(x, "publishedDate", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRatingsCount(value: Double): Self = StObject.set(x, "ratingsCount", value.asInstanceOf[js.Any])
    
    inline def setRatingsCountUndefined: Self = StObject.set(x, "ratingsCount", js.undefined)
    
    inline def setReadingModes(value: Image): Self = StObject.set(x, "readingModes", value.asInstanceOf[js.Any])
    
    inline def setReadingModesUndefined: Self = StObject.set(x, "readingModes", js.undefined)
    
    inline def setSamplePageCount(value: Double): Self = StObject.set(x, "samplePageCount", value.asInstanceOf[js.Any])
    
    inline def setSamplePageCountUndefined: Self = StObject.set(x, "samplePageCount", js.undefined)
    
    inline def setSeriesInfo(value: Volumeseriesinfo): Self = StObject.set(x, "seriesInfo", value.asInstanceOf[js.Any])
    
    inline def setSeriesInfoUndefined: Self = StObject.set(x, "seriesInfo", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
