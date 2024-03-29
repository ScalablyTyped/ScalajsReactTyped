package typingsJapgolly.ytSearch

import typingsJapgolly.ytSearch.mod.Options
import typingsJapgolly.ytSearch.mod.PlaylistMetadataOptions
import typingsJapgolly.ytSearch.mod.PlaylistMetadataResult
import typingsJapgolly.ytSearch.mod.SearchResult
import typingsJapgolly.ytSearch.mod.VideoMetadataOptions
import typingsJapgolly.ytSearch.mod.VideoMetadataResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(query: String): js.Promise[SearchResult] = js.native
    def apply(
      query: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: Options): js.Promise[SearchResult] = js.native
    def apply(
      query: Options,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ SearchResult, Unit]
    ): Unit = js.native
    def apply(query: PlaylistMetadataOptions): js.Promise[PlaylistMetadataResult] = js.native
    def apply(
      query: PlaylistMetadataOptions,
      callback: js.Function2[
          /* err */ js.UndefOr[js.Error | String | Null], 
          /* data */ PlaylistMetadataResult, 
          Unit
        ]
    ): Unit = js.native
    def apply(query: VideoMetadataOptions): js.Promise[VideoMetadataResult] = js.native
    def apply(
      query: VideoMetadataOptions,
      callback: js.Function2[/* err */ js.UndefOr[js.Error | String | Null], /* data */ VideoMetadataResult, Unit]
    ): Unit = js.native
  }
}
