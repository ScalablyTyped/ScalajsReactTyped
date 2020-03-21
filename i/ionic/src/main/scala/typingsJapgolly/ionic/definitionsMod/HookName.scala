package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.buildColonbefore
  - typingsJapgolly.ionic.ionicStrings.buildColonafter
  - typingsJapgolly.ionic.ionicStrings.serveColonbefore
  - typingsJapgolly.ionic.ionicStrings.serveColonafter
*/
trait HookName extends js.Object

object HookName {
  @scala.inline
  def buildColonafter: typingsJapgolly.ionic.ionicStrings.buildColonafter = this.cast("build:after")
  @scala.inline
  def buildColonbefore: typingsJapgolly.ionic.ionicStrings.buildColonbefore = this.cast("build:before")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def serveColonafter: typingsJapgolly.ionic.ionicStrings.serveColonafter = this.cast("serve:after")
  @scala.inline
  def serveColonbefore: typingsJapgolly.ionic.ionicStrings.serveColonbefore = this.cast("serve:before")
}

