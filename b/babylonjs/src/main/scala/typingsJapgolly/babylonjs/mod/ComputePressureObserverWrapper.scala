package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.miscComputePressureMod.IComputePressureData
import typingsJapgolly.babylonjs.miscComputePressureMod.IComputePressureThresholds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ComputePressureObserverWrapper")
@js.native
open class ComputePressureObserverWrapper protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.ComputePressureObserverWrapper {
  /**
    * A compute pressure observer will call this callback, whenever these thresholds are met.
    * @param callback The callback that is called whenever thresholds are met.
    * @param thresholds An object containing the thresholds used to decide what value to to return for each update property (average of start and end of a threshold boundary).
    */
  def this(
    callback: js.Function1[/* update */ IComputePressureData, Unit],
    thresholds: IComputePressureThresholds
  ) = this()
}
