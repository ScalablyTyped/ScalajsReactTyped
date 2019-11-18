package typingsJapgolly.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecurityContext extends js.Object

@JSImport("@angular/core", "SecurityContext")
@js.native
object SecurityContext extends js.Object {
  @js.native
  sealed trait HTML extends SecurityContext
  
  @js.native
  sealed trait NONE extends SecurityContext
  
  @js.native
  sealed trait RESOURCE_URL extends SecurityContext
  
  @js.native
  sealed trait SCRIPT extends SecurityContext
  
  @js.native
  sealed trait STYLE extends SecurityContext
  
  @js.native
  sealed trait URL extends SecurityContext
  
  /* 1 */ val HTML: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.HTML with Double = js.native
  /* 0 */ val NONE: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.NONE with Double = js.native
  /* 5 */ val RESOURCE_URL: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.RESOURCE_URL with Double = js.native
  /* 3 */ val SCRIPT: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.SCRIPT with Double = js.native
  /* 2 */ val STYLE: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.STYLE with Double = js.native
  /* 4 */ val URL: typingsJapgolly.atAngularCore.atAngularCoreMod.SecurityContext.URL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SecurityContext with Double] = js.native
}

