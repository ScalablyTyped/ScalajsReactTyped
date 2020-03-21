package typingsJapgolly.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arangodbGeneralGraphMod {
  type Betweenness = typingsJapgolly.arangodb.arangodbGeneralGraphMod.Eccentricity
  type Closeness = typingsJapgolly.arangodb.arangodbGeneralGraphMod.Eccentricity
  type ClosenessOptions = typingsJapgolly.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type CommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[typingsJapgolly.arangodb.AnonId]]]
  type CountCommonNeighbors = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]]]
  ]
  type CountCommonProperties = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type DiameterOptions = typingsJapgolly.arangodb.arangodbGeneralGraphMod.BetweennessOptions
  type Eccentricity = org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Double]]
  type EccentricityOptions = typingsJapgolly.arangodb.arangodbGeneralGraphMod.ShortestPathOptions
  type Example = (js.Array[js.Object | java.lang.String]) | js.Object | java.lang.String | scala.Null
  type RadiusOptions = typingsJapgolly.arangodb.arangodbGeneralGraphMod.BetweennessOptions
}
