package typingsJapgolly.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UpdateModeEnum extends StObject
@JSImport("chart.js", "UpdateModeEnum")
@js.native
object UpdateModeEnum extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UpdateModeEnum & String] = js.native
  
  @js.native
  sealed trait active
    extends StObject
       with UpdateModeEnum
  /* "active" */ val active: typingsJapgolly.chartJs.mod.UpdateModeEnum.active & String = js.native
  
  @js.native
  sealed trait hide
    extends StObject
       with UpdateModeEnum
  /* "hide" */ val hide: typingsJapgolly.chartJs.mod.UpdateModeEnum.hide & String = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with UpdateModeEnum
  /* "none" */ val none: typingsJapgolly.chartJs.mod.UpdateModeEnum.none & String = js.native
  
  @js.native
  sealed trait normal
    extends StObject
       with UpdateModeEnum
  /* "normal" */ val normal: typingsJapgolly.chartJs.mod.UpdateModeEnum.normal & String = js.native
  
  @js.native
  sealed trait reset
    extends StObject
       with UpdateModeEnum
  /* "reset" */ val reset: typingsJapgolly.chartJs.mod.UpdateModeEnum.reset & String = js.native
  
  @js.native
  sealed trait resize
    extends StObject
       with UpdateModeEnum
  /* "resize" */ val resize: typingsJapgolly.chartJs.mod.UpdateModeEnum.resize & String = js.native
  
  @js.native
  sealed trait show
    extends StObject
       with UpdateModeEnum
  /* "show" */ val show: typingsJapgolly.chartJs.mod.UpdateModeEnum.show & String = js.native
}
