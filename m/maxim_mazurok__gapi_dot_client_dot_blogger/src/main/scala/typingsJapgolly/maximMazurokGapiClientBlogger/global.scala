package typingsJapgolly.maximMazurokGapiClientBlogger

import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.BlogUserInfosResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.BlogsResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.CommentsResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.PageViewsResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.PagesResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.PostUserInfosResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.PostsResource
import typingsJapgolly.maximMazurokGapiClientBlogger.gapi.client.blogger.UsersResource
import typingsJapgolly.maximMazurokGapiClientBlogger.maximMazurokGapiClientBloggerStrings.blogger
import typingsJapgolly.maximMazurokGapiClientBlogger.maximMazurokGapiClientBloggerStrings.v3
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object blogger {
        
        @JSGlobal("gapi.client.blogger.blogUserInfos")
        @js.native
        val blogUserInfos: BlogUserInfosResource = js.native
        
        @JSGlobal("gapi.client.blogger.blogs")
        @js.native
        val blogs: BlogsResource = js.native
        
        @JSGlobal("gapi.client.blogger.comments")
        @js.native
        val comments: CommentsResource = js.native
        
        @JSGlobal("gapi.client.blogger.pageViews")
        @js.native
        val pageViews: PageViewsResource = js.native
        
        @JSGlobal("gapi.client.blogger.pages")
        @js.native
        val pages: PagesResource = js.native
        
        @JSGlobal("gapi.client.blogger.postUserInfos")
        @js.native
        val postUserInfos: PostUserInfosResource = js.native
        
        @JSGlobal("gapi.client.blogger.posts")
        @js.native
        val posts: PostsResource = js.native
        
        @JSGlobal("gapi.client.blogger.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Blogger API v3 */
      inline def load(name: blogger, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: blogger, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
