package typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewFilterOptions extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewFilterOptions")
@js.native
object ReviewFilterOptions extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewFilterOptions & Double] = js.native
  
  /**
    * Filter out review items with empty review text
    */
  @js.native
  sealed trait FilterEmptyReviews
    extends StObject
       with ReviewFilterOptions
  /* 1 */ val FilterEmptyReviews: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.FilterEmptyReviews & Double = js.native
  
  /**
    * Filter out review items with empty usernames
    */
  @js.native
  sealed trait FilterEmptyUserNames
    extends StObject
       with ReviewFilterOptions
  /* 2 */ val FilterEmptyUserNames: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.FilterEmptyUserNames & Double = js.native
  
  /**
    * No filtering, all reviews are returned (default option)
    */
  @js.native
  sealed trait None
    extends StObject
       with ReviewFilterOptions
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewFilterOptions.None & Double = js.native
}
