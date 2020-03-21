package typingsJapgolly.nivoGeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChoroplethEventHandler = js.Function2[
    /* feature */ typingsJapgolly.nivoGeo.mod.ChoroplethBoundFeature, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type ChoroplethProps = typingsJapgolly.nivoGeo.mod.ChoroplethCommonProps
  type ChoroplethTooltip = typingsJapgolly.react.mod.FunctionComponent[typingsJapgolly.nivoGeo.AnonFeatureChoroplethBoundFeature]
  type DatumMatcher = js.Function1[/* repeated */ js.Any, scala.Boolean]
  type FeatureAccessor[F, T] = js.Function1[/* feature */ F, T]
  type GeoMapEventHandler = js.Function2[
    /* feature */ js.Any, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type GeoMapProps = typingsJapgolly.nivoGeo.mod.GeoMapCommonProps
  type GeoMapTooltip = typingsJapgolly.react.mod.FunctionComponent[typingsJapgolly.nivoGeo.AnonFeature]
}
