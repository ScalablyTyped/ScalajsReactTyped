package typingsJapgolly.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeekDay extends js.Object

@JSImport("@angular/common", "WeekDay")
@js.native
object WeekDay extends js.Object {
  @js.native
  sealed trait Friday extends WeekDay
  
  @js.native
  sealed trait Monday extends WeekDay
  
  @js.native
  sealed trait Saturday extends WeekDay
  
  @js.native
  sealed trait Sunday extends WeekDay
  
  @js.native
  sealed trait Thursday extends WeekDay
  
  @js.native
  sealed trait Tuesday extends WeekDay
  
  @js.native
  sealed trait Wednesday extends WeekDay
  
  /* 5 */ val Friday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Friday with Double = js.native
  /* 1 */ val Monday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Monday with Double = js.native
  /* 6 */ val Saturday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Saturday with Double = js.native
  /* 0 */ val Sunday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Sunday with Double = js.native
  /* 4 */ val Thursday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Thursday with Double = js.native
  /* 2 */ val Tuesday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Tuesday with Double = js.native
  /* 3 */ val Wednesday: typingsJapgolly.atAngularCommon.atAngularCommonMod.WeekDay.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WeekDay with Double] = js.native
}

