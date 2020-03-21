package typingsJapgolly.winrt.Windows.Storage.AccessCache

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessCacheOptions extends js.Object

@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  @js.native
  sealed trait disallowUserInput extends AccessCacheOptions
  
  @js.native
  sealed trait fastLocationsOnly extends AccessCacheOptions
  
  @js.native
  sealed trait none extends AccessCacheOptions
  
  @js.native
  sealed trait suppressAccessTimeUpdate extends AccessCacheOptions
  
  @js.native
  sealed trait useReadOnlyCachedCopy extends AccessCacheOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessCacheOptions with Double] = js.native
  /* 1 */ @js.native
  object disallowUserInput extends TopLevel[disallowUserInput with Double]
  
  /* 2 */ @js.native
  object fastLocationsOnly extends TopLevel[fastLocationsOnly with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 4 */ @js.native
  object suppressAccessTimeUpdate extends TopLevel[suppressAccessTimeUpdate with Double]
  
  /* 3 */ @js.native
  object useReadOnlyCachedCopy extends TopLevel[useReadOnlyCachedCopy with Double]
  
}

