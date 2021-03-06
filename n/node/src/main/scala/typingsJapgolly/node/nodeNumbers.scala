package typingsJapgolly.node

import typingsJapgolly.node.readlineMod.Direction
import typingsJapgolly.node.v8Mod.DoesZapCodeSpaceFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeNumbers {
  @js.native
  sealed trait `-1`
    extends Direction
       with typingsJapgolly.node.ttyMod.Direction
  
  @js.native
  sealed trait `0`
    extends Direction
       with typingsJapgolly.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `1`
    extends Direction
       with typingsJapgolly.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

