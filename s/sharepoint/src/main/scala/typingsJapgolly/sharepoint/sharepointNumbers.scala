package typingsJapgolly.sharepoint

import typingsJapgolly.sharepoint.CUI.Alignment
import typingsJapgolly.sharepoint.CUI.RowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sharepointNumbers {
  @js.native
  sealed trait `0` extends Alignment
  
  @js.native
  sealed trait `1` extends Sods
  
  @js.native
  sealed trait `2`
    extends Alignment
       with RowType
       with Sods
  
  @js.native
  sealed trait `3`
    extends RowType
       with Sods
  
  @js.native
  sealed trait `4`
    extends RowType
       with Sods
  
  @js.native
  sealed trait `5` extends Sods
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
}

