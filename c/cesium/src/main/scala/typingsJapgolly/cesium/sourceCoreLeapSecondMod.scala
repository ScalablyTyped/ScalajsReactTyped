package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.JulianDate
import typingsJapgolly.cesium.mod.LeapSecond
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreLeapSecondMod {
  
  @JSImport("cesium/Source/Core/LeapSecond", JSImport.Default)
  @js.native
  open class default () extends LeapSecond {
    def this(date: JulianDate) = this()
    def this(date: Unit, offset: Double) = this()
    def this(date: JulianDate, offset: Double) = this()
  }
}
