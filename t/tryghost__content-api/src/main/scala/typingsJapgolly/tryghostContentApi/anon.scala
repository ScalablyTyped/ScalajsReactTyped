package typingsJapgolly.tryghostContentApi

import typingsJapgolly.tryghostContentApi.mod.Author
import typingsJapgolly.tryghostContentApi.mod.Authors
import typingsJapgolly.tryghostContentApi.mod.BrowseFunction
import typingsJapgolly.tryghostContentApi.mod.Nullable
import typingsJapgolly.tryghostContentApi.mod.Params
import typingsJapgolly.tryghostContentApi.mod.PostOrPage
import typingsJapgolly.tryghostContentApi.mod.PostsOrPages
import typingsJapgolly.tryghostContentApi.mod.ReadFunction
import typingsJapgolly.tryghostContentApi.mod.SettingsResponse
import typingsJapgolly.tryghostContentApi.mod.Tag
import typingsJapgolly.tryghostContentApi.mod.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Browse extends StObject {
    
    def browse(): js.Promise[PostsOrPages]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[PostsOrPages]
    def browse(options: Params): js.Promise[PostsOrPages]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostsOrPages]
    @JSName("browse")
    var browse_Original: BrowseFunction[PostsOrPages]
    
    def read(data: Id): js.Promise[PostOrPage]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Id, options: Params): js.Promise[PostOrPage]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Slug): js.Promise[PostOrPage]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[PostOrPage]
    def read(data: Slug, options: Params): js.Promise[PostOrPage]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage]
    @JSName("read")
    var read_Original: ReadFunction[PostOrPage]
  }
  object Browse {
    
    inline def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostsOrPages],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostOrPage]
    ): Browse = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[Browse]
    }
    
    extension [Self <: Browse](x: Self) {
      
      inline def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostsOrPages]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      inline def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[PostOrPage]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait BrowseBrowseFunction extends StObject {
    
    def browse(): js.Promise[SettingsResponse]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[SettingsResponse]
    def browse(options: Params): js.Promise[SettingsResponse]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsResponse]
    @JSName("browse")
    var browse_Original: BrowseFunction[SettingsResponse]
  }
  object BrowseBrowseFunction {
    
    inline def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[SettingsResponse]
    ): BrowseBrowseFunction = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse))
      __obj.asInstanceOf[BrowseBrowseFunction]
    }
    
    extension [Self <: BrowseBrowseFunction](x: Self) {
      
      inline def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[SettingsResponse]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
    }
  }
  
  trait BrowseRead extends StObject {
    
    def browse(): js.Promise[Tags]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[Tags]
    def browse(options: Params): js.Promise[Tags]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Tags]
    @JSName("browse")
    var browse_Original: BrowseFunction[Tags]
    
    def read(data: Id): js.Promise[Tag]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Id, options: Params): js.Promise[Tag]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Slug): js.Promise[Tag]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[Tag]
    def read(data: Slug, options: Params): js.Promise[Tag]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Tag]
    @JSName("read")
    var read_Original: ReadFunction[Tag]
  }
  object BrowseRead {
    
    inline def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tags],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tag]
    ): BrowseRead = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[BrowseRead]
    }
    
    extension [Self <: BrowseRead](x: Self) {
      
      inline def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tags]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      inline def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Tag]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait ErrorType extends StObject {
    
    var errorType: String
    
    var message: String
  }
  object ErrorType {
    
    inline def apply(errorType: String, message: String): ErrorType = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorType]
    }
    
    extension [Self <: ErrorType](x: Self) {
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Nullable[String]
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal(id = null)
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Nullable[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var url: String
  }
  object Label {
    
    inline def apply(label: String, url: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pagination extends StObject {
    
    var pagination: typingsJapgolly.tryghostContentApi.mod.Pagination
  }
  object Pagination {
    
    inline def apply(pagination: typingsJapgolly.tryghostContentApi.mod.Pagination): Pagination = {
      val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination]
    }
    
    extension [Self <: Pagination](x: Self) {
      
      inline def setPagination(value: typingsJapgolly.tryghostContentApi.mod.Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  trait Posts extends StObject {
    
    var posts: Double
  }
  object Posts {
    
    inline def apply(posts: Double): Posts = {
      val __obj = js.Dynamic.literal(posts = posts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Posts]
    }
    
    extension [Self <: Posts](x: Self) {
      
      inline def setPosts(value: Double): Self = StObject.set(x, "posts", value.asInstanceOf[js.Any])
    }
  }
  
  trait Read extends StObject {
    
    def browse(): js.Promise[Authors]
    def browse(options: Unit, memberToken: Nullable[String]): js.Promise[Authors]
    def browse(options: Params): js.Promise[Authors]
    def browse(options: Params, memberToken: Nullable[String]): js.Promise[Authors]
    @JSName("browse")
    var browse_Original: BrowseFunction[Authors]
    
    def read(data: Id): js.Promise[Author]
    def read(data: Id, options: Unit, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Id, options: Params): js.Promise[Author]
    def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Slug): js.Promise[Author]
    def read(data: Slug, options: Unit, memberToken: Nullable[String]): js.Promise[Author]
    def read(data: Slug, options: Params): js.Promise[Author]
    def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Author]
    @JSName("read")
    var read_Original: ReadFunction[Author]
  }
  object Read {
    
    inline def apply(
      browse: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Authors],
      read: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Author]
    ): Read = {
      val __obj = js.Dynamic.literal(browse = js.Any.fromFunction2(browse), read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[Read]
    }
    
    extension [Self <: Read](x: Self) {
      
      inline def setBrowse(
        value: (/* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Authors]
      ): Self = StObject.set(x, "browse", js.Any.fromFunction2(value))
      
      inline def setRead(
        value: (/* data */ Id | Slug, /* options */ js.UndefOr[Params], /* memberToken */ js.UndefOr[Nullable[String]]) => js.Promise[Author]
      ): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait Slug extends StObject {
    
    var slug: Nullable[String]
  }
  object Slug {
    
    inline def apply(): Slug = {
      val __obj = js.Dynamic.literal(slug = null)
      __obj.asInstanceOf[Slug]
    }
    
    extension [Self <: Slug](x: Self) {
      
      inline def setSlug(value: Nullable[String]): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugNull: Self = StObject.set(x, "slug", null)
    }
  }
}
