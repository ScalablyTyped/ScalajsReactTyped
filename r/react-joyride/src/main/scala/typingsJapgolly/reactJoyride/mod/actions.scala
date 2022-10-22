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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait actions extends StObject {
  
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
  
  inline def apply(): actions = {
    val __obj = js.Dynamic.literal(CLOSE = "close", GO = "go", INDEX = "index", INIT = "init", NEXT = "next", PREV = "prev", RESET = "reset", RESTART = "restart", SKIP = "skip", START = "start", STOP = "stop", UPDATE = "update")
    __obj.asInstanceOf[actions]
  }
  
  extension [Self <: actions](x: Self) {
    
    inline def setCLOSE(value: close): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
    
    inline def setGO(value: go): Self = StObject.set(x, "GO", value.asInstanceOf[js.Any])
    
    inline def setINDEX(value: index): Self = StObject.set(x, "INDEX", value.asInstanceOf[js.Any])
    
    inline def setINIT(value: init): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    
    inline def setNEXT(value: next): Self = StObject.set(x, "NEXT", value.asInstanceOf[js.Any])
    
    inline def setPREV(value: prev): Self = StObject.set(x, "PREV", value.asInstanceOf[js.Any])
    
    inline def setRESET(value: reset): Self = StObject.set(x, "RESET", value.asInstanceOf[js.Any])
    
    inline def setRESTART(value: restart): Self = StObject.set(x, "RESTART", value.asInstanceOf[js.Any])
    
    inline def setSKIP(value: skip): Self = StObject.set(x, "SKIP", value.asInstanceOf[js.Any])
    
    inline def setSTART(value: start): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    
    inline def setSTOP(value: stop): Self = StObject.set(x, "STOP", value.asInstanceOf[js.Any])
    
    inline def setUPDATE(value: update): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
