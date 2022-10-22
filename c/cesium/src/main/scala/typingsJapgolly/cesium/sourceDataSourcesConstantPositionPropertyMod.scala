package typingsJapgolly.cesium

import typingsJapgolly.cesium.mod.Cartesian3
import typingsJapgolly.cesium.mod.ConstantPositionProperty
import typingsJapgolly.cesium.mod.ReferenceFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesConstantPositionPropertyMod {
  
  @JSImport("cesium/Source/DataSources/ConstantPositionProperty", JSImport.Default)
  @js.native
  open class default () extends ConstantPositionProperty {
    def this(value: Cartesian3) = this()
    def this(value: Unit, referenceFrame: ReferenceFrame) = this()
    def this(value: Cartesian3, referenceFrame: ReferenceFrame) = this()
  }
}
