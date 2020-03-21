package typingsJapgolly.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationData = typingsJapgolly.victory.mod.AnimationStyle | js.Array[typingsJapgolly.victory.mod.AnimationStyle]
  type AnimationStyle = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  /**
    * Category prop type
    */
  /* Rewritten from type alias, can be one of: 
    - js.Array[java.lang.String]
    - typingsJapgolly.victory.AnonXArray
    - typingsJapgolly.victory.AnonYArray
    - typingsJapgolly.victory.AnonXArrayYArray
  */
  type CategoryPropType = typingsJapgolly.victory.mod._CategoryPropType | js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victory.victoryStrings.greyscale
    - typingsJapgolly.victory.victoryStrings.qualitative
    - typingsJapgolly.victory.victoryStrings.heatmap
    - typingsJapgolly.victory.victoryStrings.warm
    - typingsJapgolly.victory.victoryStrings.cool
    - typingsJapgolly.victory.victoryStrings.red
    - typingsJapgolly.victory.victoryStrings.green
    - typingsJapgolly.victory.victoryStrings.blue
    - js.Array[java.lang.String]
  */
  type ColorScalePropType = typingsJapgolly.victory.mod._ColorScalePropType | js.Array[java.lang.String]
  /**
    * Data getter property type
    */
  type DataGetterPropType = scala.Double | java.lang.String | js.Array[java.lang.String] | (js.Function1[/* data */ js.Any, scala.Double | java.lang.String | js.Array[java.lang.String]])
  /**
    * Domain padding
    */
  type DomainPaddingPropType = scala.Double | typingsJapgolly.victory.Anon0
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victory.mod.DomainTuple
    - typingsJapgolly.victory.AnonXDomainTuple
    - typingsJapgolly.victory.AnonYDomainTuple
  */
  type DomainPropType = typingsJapgolly.victory.mod._DomainPropType | typingsJapgolly.victory.mod.DomainTuple
  /**
    * Data domain type
    */
  type DomainTuple = js.Tuple2[js.Date | scala.Double, js.Date | scala.Double]
  type NumberOrCallback = scala.Double | typingsJapgolly.victory.mod.VictoryNumberCallback
  /**
    * @see https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
    */
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type PaddingProps = scala.Double | typingsJapgolly.victory.mod.BlockProps
  type SliceNumberOrCallback[T, P] = scala.Double | (js.Function1[/* props */ typingsJapgolly.victory.mod.Omit[T, P], scala.Double])
  type StringOrNumberOrCallback = java.lang.String | scala.Double | typingsJapgolly.victory.mod.VictoryStringOrNumberCallback
  type VictoryNumberCallback = js.Function1[/* args */ typingsJapgolly.victory.mod.CallbackArgs, scala.Double]
  type VictoryStringOrNumberCallback = js.Function1[
    /* args */ typingsJapgolly.victory.mod.CallbackArgs, 
    java.lang.String | scala.Double
  ]
}
