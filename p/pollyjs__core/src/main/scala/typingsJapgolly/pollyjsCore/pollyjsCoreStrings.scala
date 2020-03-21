package typingsJapgolly.pollyjsCore

import typingsJapgolly.pollyjsCore.mod.ACTION
import typingsJapgolly.pollyjsCore.mod.EXPIRY_STRATEGY
import typingsJapgolly.pollyjsCore.mod.MODE
import typingsJapgolly.pollyjsCore.mod.PollyEvent
import typingsJapgolly.pollyjsCore.mod.RecordingRouteEvent
import typingsJapgolly.pollyjsCore.mod.ResponseRouteEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pollyjsCoreStrings {
  @js.native
  sealed trait beforePersist extends RecordingRouteEvent
  
  @js.native
  sealed trait beforeReplay extends RecordingRouteEvent
  
  @js.native
  sealed trait beforeResponse extends ResponseRouteEvent
  
  @js.native
  sealed trait create extends PollyEvent
  
  @js.native
  sealed trait error extends EXPIRY_STRATEGY
  
  @js.native
  sealed trait intercept extends ACTION
  
  @js.native
  sealed trait passthrough
    extends ACTION
       with MODE
  
  @js.native
  sealed trait record
    extends ACTION
       with EXPIRY_STRATEGY
       with MODE
  
  @js.native
  sealed trait register extends PollyEvent
  
  @js.native
  sealed trait replay
    extends ACTION
       with MODE
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait response extends ResponseRouteEvent
  
  @js.native
  sealed trait stop extends PollyEvent
  
  @js.native
  sealed trait stopped extends MODE
  
  @js.native
  sealed trait warn extends EXPIRY_STRATEGY
  
  @scala.inline
  def beforePersist: beforePersist = "beforePersist".asInstanceOf[beforePersist]
  @scala.inline
  def beforeReplay: beforeReplay = "beforeReplay".asInstanceOf[beforeReplay]
  @scala.inline
  def beforeResponse: beforeResponse = "beforeResponse".asInstanceOf[beforeResponse]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def intercept: intercept = "intercept".asInstanceOf[intercept]
  @scala.inline
  def passthrough: passthrough = "passthrough".asInstanceOf[passthrough]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def replay: replay = "replay".asInstanceOf[replay]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

