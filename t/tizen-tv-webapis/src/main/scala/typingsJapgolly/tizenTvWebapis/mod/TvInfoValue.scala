package typingsJapgolly.tizenTvWebapis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TvInfoValue extends StObject
@JSImport("tizen-tv-webapis", "TvInfoValue")
@js.native
object TvInfoValue extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TvInfoValue & Double] = js.native
  
  /**
    * Background execution is supported
    *
    * @since 2.3
    */
  @js.native
  sealed trait TV_VIEWER_BG_EXECUTABLE
    extends StObject
       with TvInfoValue
  /* 1 */ val TV_VIEWER_BG_EXECUTABLE: typingsJapgolly.tizenTvWebapis.mod.TvInfoValue.TV_VIEWER_BG_EXECUTABLE & Double = js.native
  
  /**
    * Background execution is not supported
    *
    * @since 2.3
    */
  @js.native
  sealed trait TV_VIEWER_BG_NOT_EXECUTABLE
    extends StObject
       with TvInfoValue
  /* 0 */ val TV_VIEWER_BG_NOT_EXECUTABLE: typingsJapgolly.tizenTvWebapis.mod.TvInfoValue.TV_VIEWER_BG_NOT_EXECUTABLE & Double = js.native
}
