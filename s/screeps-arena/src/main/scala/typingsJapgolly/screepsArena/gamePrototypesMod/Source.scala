package typingsJapgolly.screepsArena.gamePrototypesMod

import typingsJapgolly.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source
  extends StObject
     with GameObject {
  
  var energy: Double = js.native
  
  var energyCapacity: Double = js.native
}
object Source {
  
  inline def apply: Constructor[Source] = ^.asInstanceOf[js.Dynamic].selectDynamic("Source").asInstanceOf[Constructor[Source]]
}
