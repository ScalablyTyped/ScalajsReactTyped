package typingsJapgolly.reactJoyride.mod

import typingsJapgolly.reactJoyride.reactJoyrideStrings.close
import typingsJapgolly.reactJoyride.reactJoyrideStrings.go
import typingsJapgolly.reactJoyride.reactJoyrideStrings.index
import typingsJapgolly.reactJoyride.reactJoyrideStrings.init
import typingsJapgolly.reactJoyride.reactJoyrideStrings.next
import typingsJapgolly.reactJoyride.reactJoyrideStrings.prev
import typingsJapgolly.reactJoyride.reactJoyrideStrings.reset
import typingsJapgolly.reactJoyride.reactJoyrideStrings.restart
import typingsJapgolly.reactJoyride.reactJoyrideStrings.skip
import typingsJapgolly.reactJoyride.reactJoyrideStrings.start
import typingsJapgolly.reactJoyride.reactJoyrideStrings.stop
import typingsJapgolly.reactJoyride.reactJoyrideStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait actions extends js.Object {
  var CLOSE: close
  var GO: go
  var INDEX: index
  var INIT: init
  var NEXT: next
  var PREV: prev
  var RESET: reset
  var RESTART: restart
  var SKIP: skip
  var START: start
  var STOP: stop
  var UPDATE: update
}

object actions {
  @scala.inline
  def apply(
    CLOSE: close,
    GO: go,
    INDEX: index,
    INIT: init,
    NEXT: next,
    PREV: prev,
    RESET: reset,
    RESTART: restart,
    SKIP: skip,
    START: start,
    STOP: stop,
    UPDATE: update
  ): actions = {
    val __obj = js.Dynamic.literal(CLOSE = CLOSE.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], INDEX = INDEX.asInstanceOf[js.Any], INIT = INIT.asInstanceOf[js.Any], NEXT = NEXT.asInstanceOf[js.Any], PREV = PREV.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any], RESTART = RESTART.asInstanceOf[js.Any], SKIP = SKIP.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any], STOP = STOP.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[actions]
  }
}

