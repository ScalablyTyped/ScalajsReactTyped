package typingsJapgolly.nodeIsbn

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.axios.mod.AxiosRequestConfig
import typingsJapgolly.nodeIsbn.anon.GOOGLE
import typingsJapgolly.nodeIsbn.anon.SmallThumbnail
import typingsJapgolly.nodeIsbn.mod.isbn.Isbn
import typingsJapgolly.nodeIsbn.nodeIsbnStrings.BOOK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("node-isbn", JSImport.Namespace)
  @js.native
  val ^ : Isbn = js.native
  
  type _To = Isbn
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Isbn = ^
  
  object isbn {
    
    trait Book extends StObject {
      
      var authors: js.Array[String]
      
      var categories: js.Array[String]
      
      var description: js.UndefOr[String] = js.undefined
      
      var imageLinks: js.UndefOr[SmallThumbnail] = js.undefined
      
      var industryIdentifiers: js.Array[String]
      
      var infoLink: String
      
      var language: BookLanguage
      
      var pageCount: js.UndefOr[Double] = js.undefined
      
      var previewLink: String
      
      var printType: BOOK
      
      var publishedDate: String
      
      var publisher: String
      
      var title: String
    }
    object Book {
      
      inline def apply(
        authors: js.Array[String],
        categories: js.Array[String],
        industryIdentifiers: js.Array[String],
        infoLink: String,
        language: BookLanguage,
        previewLink: String,
        publishedDate: String,
        publisher: String,
        title: String
      ): Book = {
        val __obj = js.Dynamic.literal(authors = authors.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], industryIdentifiers = industryIdentifiers.asInstanceOf[js.Any], infoLink = infoLink.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], previewLink = previewLink.asInstanceOf[js.Any], printType = "BOOK", publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[Book]
      }
      
      extension [Self <: Book](x: Self) {
        
        inline def setAuthors(value: js.Array[String]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
        
        inline def setAuthorsVarargs(value: String*): Self = StObject.set(x, "authors", js.Array(value*))
        
        inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setImageLinks(value: SmallThumbnail): Self = StObject.set(x, "imageLinks", value.asInstanceOf[js.Any])
        
        inline def setImageLinksUndefined: Self = StObject.set(x, "imageLinks", js.undefined)
        
        inline def setIndustryIdentifiers(value: js.Array[String]): Self = StObject.set(x, "industryIdentifiers", value.asInstanceOf[js.Any])
        
        inline def setIndustryIdentifiersVarargs(value: String*): Self = StObject.set(x, "industryIdentifiers", js.Array(value*))
        
        inline def setInfoLink(value: String): Self = StObject.set(x, "infoLink", value.asInstanceOf[js.Any])
        
        inline def setLanguage(value: BookLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
        
        inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
        
        inline def setPreviewLink(value: String): Self = StObject.set(x, "previewLink", value.asInstanceOf[js.Any])
        
        inline def setPrintType(value: BOOK): Self = StObject.set(x, "printType", value.asInstanceOf[js.Any])
        
        inline def setPublishedDate(value: String): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
        
        inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.en
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.es
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.fr
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.unknown
    */
    trait BookLanguage extends StObject
    object BookLanguage {
      
      inline def en: typingsJapgolly.nodeIsbn.nodeIsbnStrings.en = "en".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.en]
      
      inline def es: typingsJapgolly.nodeIsbn.nodeIsbnStrings.es = "es".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.es]
      
      inline def fr: typingsJapgolly.nodeIsbn.nodeIsbnStrings.fr = "fr".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.fr]
      
      inline def unknown: typingsJapgolly.nodeIsbn.nodeIsbnStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.unknown]
    }
    
    @js.native
    trait Isbn extends StObject {
      
      var PROVIDER_NAMES: GOOGLE = js.native
      
      /**
        * Provider API that gets chained before `resolve`. If this is specified, the
        * `resolve` fn will honor this order.
        *
        * @param providers - Array of providers. Must be one of more from `isbn.PROVIDER_NAMES`
        *
        * @example
        *
        * ```
        * isbn
        *  .provider([isbn.PROVIDER_NAMES.OPENLIBRARY, isbn.PROVIDER_NAMES.GOOGLE])
        *  .resolve(...)
        * ```
        */
      def provider(providers: Providers): this.type = js.native
      
      def resolve(isbn: String): js.Promise[Book] = js.native
      def resolve(isbn: String, callback: ResolveCallback): Unit = js.native
      /**
        * Resolves book info, given an isbn
        * @param isbn
        */
      def resolve(isbn: String, options: AxiosRequestConfig[Any]): Unit = js.native
      def resolve(isbn: String, options: AxiosRequestConfig[Any], callback: ResolveCallback): Unit = js.native
      @JSName("resolve")
      def resolve_Promise(isbn: String, options: AxiosRequestConfig[Any]): js.Promise[Book] = js.native
    }
    
    /* Inlined {  GOOGLE :'google',   OPENLIBRARY :'openlibrary',   WORLDCAT :'worldcat',   ISBNDB :'isbndb'}[keyof {  GOOGLE :'google',   OPENLIBRARY :'openlibrary',   WORLDCAT :'worldcat',   ISBNDB :'isbndb'}] */
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.google
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.openlibrary
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.worldcat
      - typingsJapgolly.nodeIsbn.nodeIsbnStrings.isbndb
    */
    trait Provider extends StObject
    object Provider {
      
      inline def google: typingsJapgolly.nodeIsbn.nodeIsbnStrings.google = "google".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.google]
      
      inline def isbndb: typingsJapgolly.nodeIsbn.nodeIsbnStrings.isbndb = "isbndb".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.isbndb]
      
      inline def openlibrary: typingsJapgolly.nodeIsbn.nodeIsbnStrings.openlibrary = "openlibrary".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.openlibrary]
      
      inline def worldcat: typingsJapgolly.nodeIsbn.nodeIsbnStrings.worldcat = "worldcat".asInstanceOf[typingsJapgolly.nodeIsbn.nodeIsbnStrings.worldcat]
    }
    
    type Providers = js.Array[Provider]
    
    type ResolveCallback = js.Function2[/* error */ js.Error | Null, /* book */ Book, Unit]
  }
}
