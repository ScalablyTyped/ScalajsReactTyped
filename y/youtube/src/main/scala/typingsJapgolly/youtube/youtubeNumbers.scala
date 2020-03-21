package typingsJapgolly.youtube

import typingsJapgolly.youtube.YT.AutoHide
import typingsJapgolly.youtube.YT.AutoPlay
import typingsJapgolly.youtube.YT.ClosedCaptionsLoadPolicy
import typingsJapgolly.youtube.YT.Controls
import typingsJapgolly.youtube.YT.FullscreenButton
import typingsJapgolly.youtube.YT.IvLoadPolicy
import typingsJapgolly.youtube.YT.JsApi
import typingsJapgolly.youtube.YT.KeyboardControls
import typingsJapgolly.youtube.YT.Loop
import typingsJapgolly.youtube.YT.ModestBranding
import typingsJapgolly.youtube.YT.PlayerError
import typingsJapgolly.youtube.YT.PlayerState
import typingsJapgolly.youtube.YT.PlaysInline
import typingsJapgolly.youtube.YT.RelatedVideos
import typingsJapgolly.youtube.YT.ShowInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object youtubeNumbers {
  @js.native
  sealed trait `-1` extends PlayerState
  
  @js.native
  sealed trait `0`
    extends AutoHide
       with AutoPlay
       with ClosedCaptionsLoadPolicy
       with Controls
       with FullscreenButton
       with JsApi
       with KeyboardControls
       with Loop
       with ModestBranding
       with PlayerState
       with PlaysInline
       with RelatedVideos
       with ShowInfo
  
  @js.native
  sealed trait `1`
    extends AutoHide
       with AutoPlay
       with ClosedCaptionsLoadPolicy
       with Controls
       with FullscreenButton
       with IvLoadPolicy
       with JsApi
       with KeyboardControls
       with Loop
       with ModestBranding
       with PlayerState
       with PlaysInline
       with RelatedVideos
       with ShowInfo
  
  @js.native
  sealed trait `100` extends PlayerError
  
  @js.native
  sealed trait `101` extends PlayerError
  
  @js.native
  sealed trait `150` extends PlayerError
  
  @js.native
  sealed trait `2`
    extends AutoHide
       with Controls
       with PlayerError
       with PlayerState
  
  @js.native
  sealed trait `3`
    extends IvLoadPolicy
       with PlayerState
  
  @js.native
  sealed trait `5`
    extends PlayerError
       with PlayerState
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `100`: `100` = 100.asInstanceOf[`100`]
  @scala.inline
  def `101`: `101` = 101.asInstanceOf[`101`]
  @scala.inline
  def `150`: `150` = 150.asInstanceOf[`150`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
}

