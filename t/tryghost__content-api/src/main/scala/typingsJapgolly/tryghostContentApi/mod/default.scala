package typingsJapgolly.tryghostContentApi.mod

import typingsJapgolly.tryghostContentApi.anon.Browse
import typingsJapgolly.tryghostContentApi.anon.BrowseBrowseFunction
import typingsJapgolly.tryghostContentApi.anon.BrowseRead
import typingsJapgolly.tryghostContentApi.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@tryghost/content-api", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with GhostAPI {
  def this(options: GhostContentAPIOptions) = this()
  
  /* CompleteClass */
  var authors: Read = js.native
  
  /* CompleteClass */
  var pages: Browse = js.native
  
  /* CompleteClass */
  var posts: Browse = js.native
  
  /* CompleteClass */
  var settings: BrowseBrowseFunction = js.native
  
  /* CompleteClass */
  var tags: BrowseRead = js.native
}
object default {
  
  inline def apply(options: GhostContentAPIOptions): GhostAPI = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[GhostAPI]
  
  @JSImport("@tryghost/content-api", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
}
