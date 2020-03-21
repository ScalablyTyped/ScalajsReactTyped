package typingsJapgolly.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ellipticStrings {
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait ed25519 extends js.Object
  
  @js.native
  sealed trait hex extends js.Object
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def ed25519: ed25519 = "ed25519".asInstanceOf[ed25519]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
}

