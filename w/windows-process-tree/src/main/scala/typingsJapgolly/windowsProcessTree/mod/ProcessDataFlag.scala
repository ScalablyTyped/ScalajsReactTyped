package typingsJapgolly.windowsProcessTree.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProcessDataFlag extends js.Object

@JSImport("windows-process-tree", "ProcessDataFlag")
@js.native
object ProcessDataFlag extends js.Object {
  @js.native
  sealed trait CommandLine extends ProcessDataFlag
  
  @js.native
  sealed trait Memory extends ProcessDataFlag
  
  @js.native
  sealed trait None extends ProcessDataFlag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProcessDataFlag with Double] = js.native
  /* 2 */ @js.native
  object CommandLine extends TopLevel[CommandLine with Double]
  
  /* 1 */ @js.native
  object Memory extends TopLevel[Memory with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

