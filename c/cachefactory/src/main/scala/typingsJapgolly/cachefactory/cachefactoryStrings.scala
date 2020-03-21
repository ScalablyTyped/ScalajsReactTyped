package typingsJapgolly.cachefactory

import typingsJapgolly.cachefactory.mod.DeleteOnExpire
import typingsJapgolly.cachefactory.mod.StorageMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cachefactoryStrings {
  @js.native
  sealed trait aggressive extends DeleteOnExpire
  
  @js.native
  sealed trait localStorage extends StorageMode
  
  @js.native
  sealed trait memory extends StorageMode
  
  @js.native
  sealed trait none extends DeleteOnExpire
  
  @js.native
  sealed trait passive extends DeleteOnExpire
  
  @js.native
  sealed trait sessionStorage extends StorageMode
  
  @scala.inline
  def aggressive: aggressive = "aggressive".asInstanceOf[aggressive]
  @scala.inline
  def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  @scala.inline
  def memory: memory = "memory".asInstanceOf[memory]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def passive: passive = "passive".asInstanceOf[passive]
  @scala.inline
  def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}

