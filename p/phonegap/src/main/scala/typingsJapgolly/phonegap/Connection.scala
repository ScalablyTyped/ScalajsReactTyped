package typingsJapgolly.phonegap

import typingsJapgolly.phonegap.phonegapStrings.bluetooth
import typingsJapgolly.phonegap.phonegapStrings.cellular
import typingsJapgolly.phonegap.phonegapStrings.ethernet
import typingsJapgolly.phonegap.phonegapStrings.mixed
import typingsJapgolly.phonegap.phonegapStrings.none
import typingsJapgolly.phonegap.phonegapStrings.other
import typingsJapgolly.phonegap.phonegapStrings.unknown
import typingsJapgolly.phonegap.phonegapStrings.wifi
import typingsJapgolly.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends StObject
     with EventTarget {
  
  var CELL_2G: Double = js.native
  
  var CELL_3G: Double = js.native
  
  var CELL_4G: Double = js.native
  
  var ETHERNET: Double = js.native
  
  var NONE: Double = js.native
  
  var UNKNOWN: Double = js.native
  
  var WIFI: Double = js.native
  
  var `type`: bluetooth | cellular | ethernet | mixed | none | other | unknown | wifi = js.native
}
