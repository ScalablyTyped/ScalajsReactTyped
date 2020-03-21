package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BootstrapSchedulerGroupType extends js.Object

@JSGlobal("DevExpress.AspNetCore.BootstrapSchedulerGroupType")
@js.native
object BootstrapSchedulerGroupType extends js.Object {
  @js.native
  sealed trait Date extends BootstrapSchedulerGroupType
  
  @js.native
  sealed trait None extends BootstrapSchedulerGroupType
  
  @js.native
  sealed trait Resource extends BootstrapSchedulerGroupType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BootstrapSchedulerGroupType with String] = js.native
  /* "Date" */ @js.native
  object Date extends TopLevel[Date with String]
  
  /* "None" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "Resource" */ @js.native
  object Resource extends TopLevel[Resource with String]
  
}

